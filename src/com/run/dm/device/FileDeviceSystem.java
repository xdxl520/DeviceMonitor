package com.run.dm.device;

/**
 * 文件系统的描述类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午5:12:54 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午5:12:54 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class FileDeviceSystem {

	private String deviceName;

	private String size;

	private String used;

	private String avail;

	private String usePercent;

	private String mountedOn;

	private String sysTypeName;

	private String typeName;

	/**
	 * 获取变量[deviceName]的方法
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * 设定变量[deviceName]的方法
	 * 
	 * @param deviceName
	 *            将参数[deviceName]赋给变量[deviceName]
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * 获取变量[size]的方法
	 */
	public String getSize() {
		return size;
	}

	/**
	 * 设定变量[size]的方法
	 * 
	 * @param size
	 *            将参数[size]赋给变量[size]
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * 获取变量[used]的方法
	 */
	public String getUsed() {
		return used;
	}

	/**
	 * 设定变量[used]的方法
	 * 
	 * @param used
	 *            将参数[used]赋给变量[used]
	 */
	public void setUsed(String used) {
		this.used = used;
	}

	/**
	 * 获取变量[avail]的方法
	 */
	public String getAvail() {
		return avail;
	}

	/**
	 * 设定变量[avail]的方法
	 * 
	 * @param avail
	 *            将参数[avail]赋给变量[avail]
	 */
	public void setAvail(String avail) {
		this.avail = avail;
	}

	/**
	 * 获取变量[usePercent]的方法
	 */
	public String getUsePercent() {
		return usePercent;
	}

	/**
	 * 设定变量[usePercent]的方法
	 * 
	 * @param usePercent
	 *            将参数[usePercent]赋给变量[usePercent]
	 */
	public void setUsePercent(String usePercent) {
		this.usePercent = usePercent;
	}

	/**
	 * 获取变量[mountedOn]的方法
	 */
	public String getMountedOn() {
		return mountedOn;
	}

	/**
	 * 设定变量[mountedOn]的方法
	 * 
	 * @param mountedOn
	 *            将参数[mountedOn]赋给变量[mountedOn]
	 */
	public void setMountedOn(String mountedOn) {
		this.mountedOn = mountedOn;
	}

	/**
	 * 获取变量[sysTypeName]的方法
	 */
	public String getSysTypeName() {
		return sysTypeName;
	}

	/**
	 * 设定变量[sysTypeName]的方法
	 * 
	 * @param sysTypeName
	 *            将参数[sysTypeName]赋给变量[sysTypeName]
	 */
	public void setSysTypeName(String sysTypeName) {
		this.sysTypeName = sysTypeName;
	}

	/**
	 * 获取变量[typeName]的方法
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * 设定变量[typeName]的方法
	 * 
	 * @param typeName
	 *            将参数[typeName]赋给变量[typeName]
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
