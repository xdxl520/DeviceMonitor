package com.run.dm.sigar;

import org.eclipse.jetty.util.ajax.JSON;
import org.eclipse.jetty.util.ajax.JSONPojoConvertor;

/**
 * 获取设备状态的基类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午5:50:31 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午5:50:31 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public abstract class BaseMonitor {

	protected abstract String getStatus();

	public static String ObjectToJSONString(Class<?> pojoClass, Object obj) {
		JSON json = new JSON();
		JSONPojoConvertor jsonPojoConvertor = new JSONPojoConvertor(pojoClass, false);
		json.addConvertor(pojoClass, jsonPojoConvertor);

		return json.toJSON(obj);
	}

}
