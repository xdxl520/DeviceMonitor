package com.run.dm.jetty;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Request;
import org.hyperic.sigar.cmd.Runner;

import com.run.dm.main.SystemUtils;

/**
 * command 请求处理类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-5 下午5:59:33 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-5 下午5:59:33 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class CommandAction {

	private static Log log = LogFactory.getLog(CommandAction.class);

	public static void execute(String target, Request baseRequest, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

		if(target.length() > 9) {
			target = target.substring(9);
			if(target.contains("//")) {
				target = target.replace("//", "\\");
			}

			String[] commands = target.split(" ");

			log.debug("execute command: " + target);

			// 转换sigar控制台输出流到html页面中。
			PrintStream oldSysout = System.out;
			PrintStream oldSyserr = System.err;
			ByteArrayOutputStream bos = SystemUtils.getConsoleStream();
			try {
				Runner.main(commands);
				SystemUtils.resetConsoleStream(oldSysout, oldSyserr);
			}catch(Exception e) {
				SystemUtils.resetConsoleStream(oldSysout, oldSyserr);
				log.error("调用sigar出错：" + e.toString());
			}

			SystemUtils.getHtmlResponse(response, bos.toString());
			log.debug("http响应结束！");
		}else {
			log.debug("URL中无法提取执行命令！");
			SystemUtils.getErrorResponse(response, HttpServletResponse.SC_NOT_ACCEPTABLE, 1001);
		}
	}

}
