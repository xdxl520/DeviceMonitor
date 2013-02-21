package com.run.dm.sigar;

import org.hyperic.sigar.Sigar;

/**
 * 监视器的交口类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-7 下午3:17:54 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-7 下午3:17:54 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public interface Monitor {
	
	public static Sigar sigar= new Sigar();

	public String getStatus();

}
