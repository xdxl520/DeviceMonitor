package com.run.dm.device;

/**
 * CPU状态描述类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class CPU {

	private String vendor;

	private String model;

	private String mhz;

	private int totalCPUs;

	private String userTime;

	private String sysTime;

	private String idleTime;

	private String waitTime;

	private String niceTime;

	private String combined;

	private String irqTime;

	/**
	 * 获取变量[vendor]的方法
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * 设定变量[vendor]的方法
	 * 
	 * @param vendor
	 *            将参数[vendor]赋给变量[vendor]
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * 获取变量[model]的方法
	 */
	public String getModel() {
		return model;
	}

	/**
	 * 设定变量[model]的方法
	 * 
	 * @param model
	 *            将参数[model]赋给变量[model]
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * 获取变量[mhz]的方法
	 */
	public String getMhz() {
		return mhz;
	}

	/**
	 * 设定变量[mhz]的方法
	 * 
	 * @param mhz
	 *            将参数[mhz]赋给变量[mhz]
	 */
	public void setMhz(String mhz) {
		this.mhz = mhz;
	}

	/**
	 * 获取变量[totalCPUs]的方法
	 */
	public int getTotalCPUs() {
		return totalCPUs;
	}

	/**
	 * 设定变量[totalCPUs]的方法
	 * 
	 * @param totalCPUs
	 *            将参数[totalCPUs]赋给变量[totalCPUs]
	 */
	public void setTotalCPUs(int totalCPUs) {
		this.totalCPUs = totalCPUs;
	}

	/**
	 * 获取变量[userTime]的方法
	 */
	public String getUserTime() {
		return userTime;
	}

	/**
	 * 设定变量[userTime]的方法
	 * 
	 * @param userTime
	 *            将参数[userTime]赋给变量[userTime]
	 */
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}

	/**
	 * 获取变量[sysTime]的方法
	 */
	public String getSysTime() {
		return sysTime;
	}

	/**
	 * 设定变量[sysTime]的方法
	 * 
	 * @param sysTime
	 *            将参数[sysTime]赋给变量[sysTime]
	 */
	public void setSysTime(String sysTime) {
		this.sysTime = sysTime;
	}

	/**
	 * 获取变量[idleTime]的方法
	 */
	public String getIdleTime() {
		return idleTime;
	}

	/**
	 * 设定变量[idleTime]的方法
	 * 
	 * @param idleTime
	 *            将参数[idleTime]赋给变量[idleTime]
	 */
	public void setIdleTime(String idleTime) {
		this.idleTime = idleTime;
	}

	/**
	 * 获取变量[waitTime]的方法
	 */
	public String getWaitTime() {
		return waitTime;
	}

	/**
	 * 设定变量[waitTime]的方法
	 * 
	 * @param waitTime
	 *            将参数[waitTime]赋给变量[waitTime]
	 */
	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}

	/**
	 * 获取变量[niceTime]的方法
	 */
	public String getNiceTime() {
		return niceTime;
	}

	/**
	 * 设定变量[niceTime]的方法
	 * 
	 * @param niceTime
	 *            将参数[niceTime]赋给变量[niceTime]
	 */
	public void setNiceTime(String niceTime) {
		this.niceTime = niceTime;
	}

	/**
	 * 获取变量[combined]的方法
	 */
	public String getCombined() {
		return combined;
	}

	/**
	 * 设定变量[combined]的方法
	 * 
	 * @param combined
	 *            将参数[combined]赋给变量[combined]
	 */
	public void setCombined(String combined) {
		this.combined = combined;
	}

	/**
	 * 获取变量[irqTime]的方法
	 */
	public String getIrqTime() {
		return irqTime;
	}

	/**
	 * 设定变量[irqTime]的方法
	 * 
	 * @param irqTime
	 *            将参数[irqTime]赋给变量[irqTime]
	 */
	public void setIrqTime(String irqTime) {
		this.irqTime = irqTime;
	}

}
