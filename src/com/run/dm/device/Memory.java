package com.run.dm.device;

/**
 * 内存信息的描述类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午5:05:56 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午5:05:56 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class Memory {

	private long ram;

	private long totalMem;

	private long usedMem;

	private long freeMem;

	private long totalSwap;

	private long usedSwap;

	private long freeSwap;

	private long usedBuffersCache;

	private long freeBuffersCache;

	/**
	 * 获取变量[ram]的方法
	 */
	public long getRam() {
		return ram;
	}

	/**
	 * 设定变量[ram]的方法
	 * 
	 * @param ram
	 *            将参数[ram]赋给变量[ram]
	 */
	public void setRam(long ram) {
		this.ram = ram;
	}

	/**
	 * 获取变量[totalMem]的方法
	 */
	public long getTotalMem() {
		return totalMem;
	}

	/**
	 * 设定变量[totalMem]的方法
	 * 
	 * @param totalMem
	 *            将参数[totalMem]赋给变量[totalMem]
	 */
	public void setTotalMem(long totalMem) {
		this.totalMem = totalMem;
	}

	/**
	 * 获取变量[usedMem]的方法
	 */
	public long getUsedMem() {
		return usedMem;
	}

	/**
	 * 设定变量[usedMem]的方法
	 * 
	 * @param usedMem
	 *            将参数[usedMem]赋给变量[usedMem]
	 */
	public void setUsedMem(long usedMem) {
		this.usedMem = usedMem;
	}

	/**
	 * 获取变量[freeMem]的方法
	 */
	public long getFreeMem() {
		return freeMem;
	}

	/**
	 * 设定变量[freeMem]的方法
	 * 
	 * @param freeMem
	 *            将参数[freeMem]赋给变量[freeMem]
	 */
	public void setFreeMem(long freeMem) {
		this.freeMem = freeMem;
	}

	/**
	 * 获取变量[totalSwap]的方法
	 */
	public long getTotalSwap() {
		return totalSwap;
	}

	/**
	 * 设定变量[totalSwap]的方法
	 * 
	 * @param totalSwap
	 *            将参数[totalSwap]赋给变量[totalSwap]
	 */
	public void setTotalSwap(long totalSwap) {
		this.totalSwap = totalSwap;
	}

	/**
	 * 获取变量[usedSwap]的方法
	 */
	public long getUsedSwap() {
		return usedSwap;
	}

	/**
	 * 设定变量[usedSwap]的方法
	 * 
	 * @param usedSwap
	 *            将参数[usedSwap]赋给变量[usedSwap]
	 */
	public void setUsedSwap(long usedSwap) {
		this.usedSwap = usedSwap;
	}

	/**
	 * 获取变量[freeSwap]的方法
	 */
	public long getFreeSwap() {
		return freeSwap;
	}

	/**
	 * 设定变量[freeSwap]的方法
	 * 
	 * @param freeSwap
	 *            将参数[freeSwap]赋给变量[freeSwap]
	 */
	public void setFreeSwap(long freeSwap) {
		this.freeSwap = freeSwap;
	}

	/**
	 * 获取变量[usedBuffersCache]的方法
	 */
	public long getUsedBuffersCache() {
		return usedBuffersCache;
	}

	/**
	 * 设定变量[usedBuffersCache]的方法
	 * 
	 * @param usedBuffersCache
	 *            将参数[usedBuffersCache]赋给变量[usedBuffersCache]
	 */
	public void setUsedBuffersCache(long usedBuffersCache) {
		this.usedBuffersCache = usedBuffersCache;
	}

	/**
	 * 获取变量[freeBuffersCache]的方法
	 */
	public long getFreeBuffersCache() {
		return freeBuffersCache;
	}

	/**
	 * 设定变量[freeBuffersCache]的方法
	 * 
	 * @param freeBuffersCache
	 *            将参数[freeBuffersCache]赋给变量[freeBuffersCache]
	 */
	public void setFreeBuffersCache(long freeBuffersCache) {
		this.freeBuffersCache = freeBuffersCache;
	}

}
