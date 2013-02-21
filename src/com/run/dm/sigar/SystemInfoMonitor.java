package com.run.dm.sigar;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;

import com.run.dm.device.SystemInfo;

/**
 * 系统信息获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class SystemInfoMonitor extends BaseMonitor implements Monitor {

	private static Log log = LogFactory.getLog(SystemInfoMonitor.class);

	public String getStatus() {
		return ObjectToJSONString(SystemInfo.class, getSystemInfo());
	}

	private static String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		}catch(UnknownHostException e) {
			log.warn("无法获得主机名称！");
			return "unknown";
		}
	}

	public static SystemInfo getSystemInfo() {

		SystemInfo systemInfo = new SystemInfo();

		OperatingSystem sys = OperatingSystem.getInstance();

		systemInfo.setOsName(sys.getName());
		systemInfo.setOsDescription(sys.getDescription());
		systemInfo.setOsArch(sys.getArch());
		systemInfo.setOsVendor(sys.getVendor());
		systemInfo.setOsVendorVersion(sys.getVendorVersion());
		systemInfo.setOsPatchLevel(sys.getPatchLevel());
		systemInfo.setOsVersion(sys.getVersion());
		systemInfo.setOsDataModel(sys.getDataModel());

		systemInfo.setJavaVmVendor(System.getProperty("java.vm.vendor"));
		systemInfo.setJavaVmVersion(System.getProperty("java.vm.version"));
		systemInfo.setJavaHome(System.getProperty("java.home"));
		systemInfo.setCurrentUser(System.getProperty("user.name"));

		systemInfo.setSigarVersion(Sigar.VERSION_STRING);

		systemInfo.setHostName(getHostName());

		return systemInfo;
	}

}
