package com.run.dm.sigar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;

import com.run.dm.device.Memory;

/**
 * 内存状态获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class MemoryMonitor extends BaseMonitor implements Monitor {

	private static Log log = LogFactory.getLog(MemoryMonitor.class);

	public String getStatus() {
		return ObjectToJSONString(Memory.class, getMemory());
	}

	public static Memory getMemory() {

		Memory memory = new Memory();
		try {

			Mem mem = sigar.getMem();

			memory.setRam(mem.getRam());
			memory.setTotalMem(mem.getTotal());
			memory.setUsedMem(mem.getUsed());
			memory.setFreeMem(mem.getFree());
			memory.setFreeBuffersCache(mem.getActualFree());
			memory.setUsedBuffersCache(mem.getActualUsed());

			Swap swap = sigar.getSwap();

			memory.setFreeSwap(swap.getFree());
			memory.setUsedSwap(swap.getUsed());
			memory.setTotalSwap(swap.getTotal());

		}catch(SigarException e) {
			log.error("通过sigar的API获取系统内存信息时出错：" + e.toString());
		}

		return memory;
	}

}
