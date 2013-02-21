package com.run.dm.device;

/**
 * 网络接口的描述类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午5:16:16 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午5:16:16 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class NetworkInterface {

	private String interfaceName;

	private String deviceName;

	private String type;

	private String hwaddr;

	private String ipaddr;

	private String broadcast;

	private String netMask;

	private long mtu;

	private long metric;

	/**
	 * 获取变量[interfaceName]的方法
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * 设定变量[interfaceName]的方法
	 * 
	 * @param interfaceName
	 *            将参数[interfaceName]赋给变量[interfaceName]
	 */
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

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
	 * 获取变量[type]的方法
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设定变量[type]的方法
	 * 
	 * @param type
	 *            将参数[type]赋给变量[type]
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取变量[hwaddr]的方法
	 */
	public String getHwaddr() {
		return hwaddr;
	}

	/**
	 * 设定变量[hwaddr]的方法
	 * 
	 * @param hwaddr
	 *            将参数[hwaddr]赋给变量[hwaddr]
	 */
	public void setHwaddr(String hwaddr) {
		this.hwaddr = hwaddr;
	}

	/**
	 * 获取变量[ipaddr]的方法
	 */
	public String getIpaddr() {
		return ipaddr;
	}

	/**
	 * 设定变量[ipaddr]的方法
	 * 
	 * @param ipaddr
	 *            将参数[ipaddr]赋给变量[ipaddr]
	 */
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	/**
	 * 获取变量[broadcast]的方法
	 */
	public String getBroadcast() {
		return broadcast;
	}

	/**
	 * 设定变量[broadcast]的方法
	 * 
	 * @param broadcast
	 *            将参数[broadcast]赋给变量[broadcast]
	 */
	public void setBroadcast(String broadcast) {
		this.broadcast = broadcast;
	}

	/**
	 * 获取变量[netMask]的方法
	 */
	public String getNetMask() {
		return netMask;
	}

	/**
	 * 设定变量[netMask]的方法
	 * 
	 * @param netMask
	 *            将参数[netMask]赋给变量[netMask]
	 */
	public void setNetMask(String netMask) {
		this.netMask = netMask;
	}

	/**
	 * 获取变量[mtu]的方法
	 */
	public long getMtu() {
		return mtu;
	}

	/**
	 * 设定变量[mtu]的方法
	 * 
	 * @param mtu
	 *            将参数[mtu]赋给变量[mtu]
	 */
	public void setMtu(long mtu) {
		this.mtu = mtu;
	}

	/**
	 * 获取变量[metric]的方法
	 */
	public long getMetric() {
		return metric;
	}

	/**
	 * 设定变量[metric]的方法
	 * 
	 * @param metric
	 *            将参数[metric]赋给变量[metric]
	 */
	public void setMetric(long metric) {
		this.metric = metric;
	}

}
