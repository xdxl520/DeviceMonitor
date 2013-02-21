package com.run.dm.sigar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.SigarException;

import com.run.dm.device.NetworkInterface;

/**
 * 网络接口状态获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class NetworkInterfaceMonitor extends BaseMonitor implements Monitor {

	private static Log log = LogFactory.getLog(NetworkInterfaceMonitor.class);

	public String getStatus() {
		return ObjectToJSONString(NetworkInterface.class, getNetworkInterface());
	}

	public static NetworkInterface getNetworkInterfaceEntity(String netInterfaceName) throws SigarException {
		NetworkInterface networkInterface = new NetworkInterface();

		NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(netInterfaceName);

		networkInterface.setHwaddr(ifconfig.getHwaddr());
		networkInterface.setInterfaceName(ifconfig.getName());
		networkInterface.setDeviceName(ifconfig.getDescription());
		networkInterface.setType(ifconfig.getType());
		networkInterface.setBroadcast(ifconfig.getBroadcast());
		networkInterface.setIpaddr(ifconfig.getAddress());
		networkInterface.setMetric(ifconfig.getMetric());
		networkInterface.setMtu(ifconfig.getMtu());
		networkInterface.setNetMask(ifconfig.getNetmask());

		return networkInterface;
	}

	public static NetworkInterface[] getNetworkInterface() {

		NetworkInterface[] networkInterfaceArray = new NetworkInterface[0];
		try {

			String[] netInterfaceNames = sigar.getNetInterfaceList();
			networkInterfaceArray = new NetworkInterface[netInterfaceNames.length];
			for(int i = 0; i < netInterfaceNames.length; i++) {
				networkInterfaceArray[i] = getNetworkInterfaceEntity(netInterfaceNames[i]);
			}

		}catch(SigarException e) {
			log.error("通过sigar的API获取网络接口信息时出错：" + e.toString());
		}

		return networkInterfaceArray;
	}

}
