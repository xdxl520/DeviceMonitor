package com.run.dm.device;

/**
 * 简单的常用设备状态集合描述类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午5:18:54 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午5:18:54 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class SimpleDeviceAllInfo {

	private String osDescription;

	private String osArch;

	private String osDataModel;

	private String cpuVendor;

	private String cpuModel;

	private String cpuMhz;

	private String cpuCombined;

	private int cpuCount;

	private long totalMem;

	private long usedMem;

	private long totalSwap;

	private long usedSwap;

	private long usedBuffersCache;

	private FileDeviceSystem[] fileSystemArray;

	private NetworkInterface[] networkInterfaceArray;

	/**
	 * 获取变量[osDescription]的方法
	 */
	public String getOsDescription() {
		return osDescription;
	}

	/**
	 * 设定变量[osDescription]的方法
	 * 
	 * @param osDescription
	 *            将参数[osDescription]赋给变量[osDescription]
	 */
	public void setOsDescription(String osDescription) {
		this.osDescription = osDescription;
	}

	/**
	 * 获取变量[osArch]的方法
	 */
	public String getOsArch() {
		return osArch;
	}

	/**
	 * 设定变量[osArch]的方法
	 * 
	 * @param osArch
	 *            将参数[osArch]赋给变量[osArch]
	 */
	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}

	/**
	 * 获取变量[osDataModel]的方法
	 */
	public String getOsDataModel() {
		return osDataModel;
	}

	/**
	 * 设定变量[osDataModel]的方法
	 * 
	 * @param osDataModel
	 *            将参数[osDataModel]赋给变量[osDataModel]
	 */
	public void setOsDataModel(String osDataModel) {
		this.osDataModel = osDataModel;
	}

	/**
	 * 获取变量[cpuVendor]的方法
	 */
	public String getCpuVendor() {
		return cpuVendor;
	}

	/**
	 * 设定变量[cpuVendor]的方法
	 * 
	 * @param cpuVendor
	 *            将参数[cpuVendor]赋给变量[cpuVendor]
	 */
	public void setCpuVendor(String cpuVendor) {
		this.cpuVendor = cpuVendor;
	}

	/**
	 * 获取变量[cpuModel]的方法
	 */
	public String getCpuModel() {
		return cpuModel;
	}

	/**
	 * 设定变量[cpuModel]的方法
	 * 
	 * @param cpuModel
	 *            将参数[cpuModel]赋给变量[cpuModel]
	 */
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	/**
	 * 获取变量[cpuMhz]的方法
	 */
	public String getCpuMhz() {
		return cpuMhz;
	}

	/**
	 * 设定变量[cpuMhz]的方法
	 * 
	 * @param cpuMhz
	 *            将参数[cpuMhz]赋给变量[cpuMhz]
	 */
	public void setCpuMhz(String cpuMhz) {
		this.cpuMhz = cpuMhz;
	}

	/**
	 * 获取变量[cpuCombined]的方法
	 */
	public String getCpuCombined() {
		return cpuCombined;
	}

	/**
	 * 设定变量[cpuCombined]的方法
	 * 
	 * @param cpuCombined
	 *            将参数[cpuCombined]赋给变量[cpuCombined]
	 */
	public void setCpuCombined(String cpuCombined) {
		this.cpuCombined = cpuCombined;
	}

	/**
	 * 获取变量[cpuCount]的方法
	 */
	public int getCpuCount() {
		return cpuCount;
	}

	/**
	 * 设定变量[cpuCount]的方法
	 * 
	 * @param cpuCount
	 *            将参数[cpuCount]赋给变量[cpuCount]
	 */
	public void setCpuCount(int cpuCount) {
		this.cpuCount = cpuCount;
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
	 * 获取变量[fileSystemArray]的方法
	 */
	public FileDeviceSystem[] getFileSystemArray() {
		return fileSystemArray;
	}

	/**
	 * 设定变量[fileSystemArray]的方法
	 * 
	 * @param fileSystemArray
	 *            将参数[fileSystemArray]赋给变量[fileSystemArray]
	 */
	public void setFileSystemArray(FileDeviceSystem[] fileSystemArray) {
		this.fileSystemArray = fileSystemArray;
	}

	/**
	 * 获取变量[networkInterfaceArray]的方法
	 */
	public NetworkInterface[] getNetworkInterfaceArray() {
		return networkInterfaceArray;
	}

	/**
	 * 设定变量[networkInterfaceArray]的方法
	 * 
	 * @param networkInterfaceArray
	 *            将参数[networkInterfaceArray]赋给变量[networkInterfaceArray]
	 */
	public void setNetworkInterfaceArray(NetworkInterface[] networkInterfaceArray) {
		this.networkInterfaceArray = networkInterfaceArray;
	}

}
