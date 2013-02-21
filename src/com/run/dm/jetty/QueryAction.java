package com.run.dm.jetty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Request;

import com.run.dm.main.SystemUtils;
import com.run.xdxl.common.utils.StringUtils;

/**
 * query.do 请求处理类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-5 下午5:56:26 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-5 下午5:56:26 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class QueryAction {

	private static Log log = LogFactory.getLog(QueryAction.class);

	public static void execute(Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		int queryCode = StringUtils.toInt(request.getParameter("id"), -10000000);

		if(queryCode == 0) {
			// 测试
			SystemUtils.getErrorResponse(response, HttpServletResponse.SC_OK, 1);
			log.debug("测试系统是否正常运行");
		}else if(queryCode == -10000000) {
			// 无法获取http请求的参数
			SystemUtils.getErrorResponse(response, HttpServletResponse.SC_NOT_ACCEPTABLE, 1001);
			log.debug("无法获取http请求的参数");
		}else if(queryCode >= 1 && queryCode <= 6) {
			SystemUtils.getJSONResponse(QueryBusiness.execute(queryCode), response);
			log.debug("查询编号为 " + queryCode);
		}else {
			// 请求参数本系统不支持
			SystemUtils.getErrorResponse(response, HttpServletResponse.SC_NOT_ACCEPTABLE, 1003);
			log.debug("请求参数本系统不支持");
		}

	}

}
