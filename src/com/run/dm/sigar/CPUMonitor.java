package com.run.dm.sigar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarException;

import com.run.dm.device.CPU;

/**
 * CPU状态获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class CPUMonitor extends BaseMonitor implements Monitor {

	private static Log log = LogFactory.getLog(CPUMonitor.class);

	public String getStatus() {
		return ObjectToJSONString(CPU.class, getCPU());
	}

	public static CPU getCPU() {

		CPU cpu = new CPU();
		try {

			CpuInfo cpuInfo = sigar.getCpuInfoList()[0];

			cpu.setVendor(cpuInfo.getVendor());
			cpu.setModel(cpuInfo.getModel());
			cpu.setMhz(cpuInfo.getMhz() + "MHz");
			cpu.setTotalCPUs(cpuInfo.getTotalCores());

			CpuPerc cpuPerc = sigar.getCpuPerc();

			cpu.setCombined(CpuPerc.format(cpuPerc.getCombined()));
			cpu.setIdleTime(CpuPerc.format(cpuPerc.getIdle()));
			cpu.setIrqTime(CpuPerc.format(cpuPerc.getIrq()));
			cpu.setNiceTime(CpuPerc.format(cpuPerc.getNice()));
			cpu.setSysTime(CpuPerc.format(cpuPerc.getSys()));
			cpu.setUserTime(CpuPerc.format(cpuPerc.getUser()));
			cpu.setWaitTime(CpuPerc.format(cpuPerc.getWait()));

		}catch(SigarException e) {
			log.error("通过sigar的API获取系统CPU信息时出错：" + e.toString());
		}

		return cpu;
	}

}
