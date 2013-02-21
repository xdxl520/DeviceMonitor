package com.run.dm.jetty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.ContextHandler;

import com.run.dm.main.SystemUtils;
import com.run.xdxl.common.utils.CU;

/**
 * http请求总控制器 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-5 下午4:23:44 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-5 下午4:23:44 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class MainContextHandler extends ContextHandler {

	private static Log log = LogFactory.getLog(MainContextHandler.class);

	@Override
	public void doHandle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		baseRequest.setHandled(true);
		target = target.toLowerCase();

		if(target.startsWith(CU.getValue("SimpleQueryPath", "/query.do"))) {
			QueryAction.execute(baseRequest, request, response);
		}else if(target.startsWith(CU.getValue("CommandQueryPath", "/command"))) {
			CommandAction.execute(target, baseRequest, request, response);
		}else {
			log.warn("请求的URL地址不正确!");
			SystemUtils.getErrorResponse(response, HttpServletResponse.SC_NOT_ACCEPTABLE, 1002);
		}

	}

}
