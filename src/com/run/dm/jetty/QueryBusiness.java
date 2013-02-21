package com.run.dm.jetty;

import com.run.dm.sigar.CPUMonitor;
import com.run.dm.sigar.FileDeviceSystemMonitor;
import com.run.dm.sigar.MemoryMonitor;
import com.run.dm.sigar.Monitor;
import com.run.dm.sigar.NetworkInterfaceMonitor;
import com.run.dm.sigar.SimpleDeviceAllInfoMonitor;
import com.run.dm.sigar.SystemInfoMonitor;

/**
 * 根据指定ID来查询设备相应的状态信息 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:30:09 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:30:09 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class QueryBusiness {

	public static String execute(int intQueryCode) {
		String strRet = "";
		Monitor monitor = null;
		switch(intQueryCode) {
		case 1:// system info
			monitor = new SystemInfoMonitor();
			break;
		case 2:// cpu
			monitor = new CPUMonitor();
			break;
		case 3:// memory
			monitor = new MemoryMonitor();
			break;
		case 4:// file system
			monitor = new FileDeviceSystemMonitor();
			break;
		case 5:// network Interface
			monitor = new NetworkInterfaceMonitor();
			break;
		case 6:// simple all info
			monitor = new SimpleDeviceAllInfoMonitor();
		}

		if(monitor != null) {
			strRet = monitor.getStatus();
		}

		return strRet;
	}

}
