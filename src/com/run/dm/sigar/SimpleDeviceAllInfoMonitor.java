package com.run.dm.sigar;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.util.ajax.JSON;

import com.run.dm.device.CPU;
import com.run.dm.device.Memory;
import com.run.dm.device.SimpleDeviceAllInfo;
import com.run.dm.device.SystemInfo;

/**
 * 简单的常用设备状态获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class SimpleDeviceAllInfoMonitor extends BaseMonitor implements Monitor {

	@SuppressWarnings("unused")
	private static Log log = LogFactory.getLog(SimpleDeviceAllInfoMonitor.class);

	public String getStatus() {
		String strJson = ObjectToJSONString(SimpleDeviceAllInfo.class, getSimpleDeviceAllInfo());

		@SuppressWarnings("rawtypes")
		Map jsonMap = (Map) JSON.parse(strJson);

		jsonMap.remove("fileSystemArray");
		jsonMap.remove("networkInterfaceArray");

		strJson = JSON.toString(jsonMap);

		StringBuffer sb = new StringBuffer(strJson);
		sb.insert(sb.length() - 1, ",fileSystemArray:" + new FileDeviceSystemMonitor().getStatus());
		sb.insert(sb.length() - 1, ",networkInterfaceArray:" + new NetworkInterfaceMonitor().getStatus());

		return sb.toString();
	}

	public SimpleDeviceAllInfo getSimpleDeviceAllInfo() {

		SimpleDeviceAllInfo sdai = new SimpleDeviceAllInfo();

		SystemInfo systemInfo = SystemInfoMonitor.getSystemInfo();

		sdai.setOsDescription(systemInfo.getOsDescription());
		sdai.setOsDataModel(systemInfo.getOsDataModel());
		sdai.setOsArch(systemInfo.getOsArch());

		CPU cpuInfo = CPUMonitor.getCPU();

		sdai.setCpuVendor(cpuInfo.getVendor());
		sdai.setCpuModel(cpuInfo.getModel());
		sdai.setCpuMhz(cpuInfo.getMhz());
		sdai.setCpuCount(cpuInfo.getTotalCPUs());
		sdai.setCpuCombined(cpuInfo.getCombined());

		Memory memory = MemoryMonitor.getMemory();

		sdai.setTotalMem(memory.getTotalMem());
		sdai.setUsedMem(memory.getUsedMem());
		sdai.setTotalSwap(memory.getTotalSwap());
		sdai.setUsedSwap(memory.getUsedSwap());
		sdai.setUsedBuffersCache(memory.getUsedBuffersCache());

		// sdai.setFileSystemArray(FileDeviceSystemMonitor.getFileDeviceSystem());
		// sdai.setNetworkInterfaceArray(NetworkInterfaceMonitor.getNetworkInterface());

		return sdai;
	}

}
