package com.run.dm.main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 系统工具类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 上午11:15:46 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 上午11:15:46 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class SystemUtils {

	private static Log log = LogFactory.getLog(SystemUtils.class);

	public static String wrappedByHtml(String content) {
		StringBuffer sb = new StringBuffer(10);
		sb.append("<!DOCTYPE html>\n");
		sb.append("<html>\n");
		sb.append("<head>\n");
		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
		sb.append("<title>\n");
		sb.append("设备状态\n");
		sb.append("</title>\n");
		sb.append("</head>\n");
		sb.append("<bofy>\n<pre>\n");
		sb.append(content);
		sb.append("\n</pre>\n</bofy>\n");
		sb.append("</html>");
		return sb.toString();
	}

	public static String getErrorCodeJSON(int intCode) {
		StringBuffer sb = new StringBuffer(10);
		sb.append("{\"code\":");
		sb.append(intCode);
		sb.append("}");
		return sb.toString();
	}

	public static void getErrorResponse(HttpServletResponse response,int responseStatus, int intCode) {
		response.setContentType("application/json;charset=utf-8");
		response.setStatus(responseStatus);
		try {
			response.getWriter().write(getErrorCodeJSON(intCode));
		}catch(IOException e) {
			log.error("返回HTTP响应时出错：" + e.toString());
		}
	}

	public static void getHtmlResponse(HttpServletResponse response, String strContent) {
		response.setContentType("text/html;charset=UTF-8");
		response.setStatus(HttpServletResponse.SC_OK);

		try {
			response.getWriter().write(wrappedByHtml(strContent));
		}catch(IOException e) {
			log.error("返回HTTP响应时出错：" + e.toString());
		}
	}

	public static ByteArrayOutputStream getConsoleStream() {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));
		System.setErr(new PrintStream(bos));

		return bos;
	}
	
	public static void resetConsoleStream(PrintStream oldSysout,PrintStream oldSyserr) {
		System.setOut(oldSysout);
		System.setErr(oldSyserr);
	}
	
	public static void getJSONResponse(String strJSON,HttpServletResponse response) throws IOException{
		response.setContentType("application/json;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().write(strJSON);
	}

}
