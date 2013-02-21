package com.run.dm.sigar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.NfsFileSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

import com.run.dm.device.FileDeviceSystem;

/**
 * 文件系统状态获取类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-6 下午4:57:07 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-6 下午4:57:07 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */

public class FileDeviceSystemMonitor extends BaseMonitor implements Monitor {

	private static Log log = LogFactory.getLog(FileDeviceSystemMonitor.class);

	public String getStatus() {
		return ObjectToJSONString(FileDeviceSystem.class, getFileDeviceSystem());
	}

	public static FileDeviceSystem getFileDeviceEntity(FileSystem fs) throws SigarException {
		long used, avail, total, pct;

		FileDeviceSystem fileDeviceSystem = new FileDeviceSystem();
		try {
			FileSystemUsage usage;
			if(fs instanceof NfsFileSystem) {
				NfsFileSystem nfs = (NfsFileSystem) fs;
				if(!nfs.ping()) {
					log.error(nfs.getUnreachableMessage());
					return null;
				}
			}
			usage = sigar.getFileSystemUsage(fs.getDirName());

			used = usage.getTotal() - usage.getFree();
			avail = usage.getAvail();
			total = usage.getTotal();

			pct = (long) (usage.getUsePercent() * 100);

		}catch(SigarException e) {
			log.warn("通过sigar的API获取文件系统信息时出错：" + e.toString());
			used = avail = total = pct = 0;
		}

		String usePct;
		if(pct == 0) {
			usePct = "-";
		}else {
			usePct = pct + "%";
		}

		fileDeviceSystem.setDeviceName(fs.getDevName());
		fileDeviceSystem.setSize(Sigar.formatSize(total * 1024));
		fileDeviceSystem.setAvail(Sigar.formatSize(avail * 1024));
		fileDeviceSystem.setUsed(Sigar.formatSize(used * 1024));
		fileDeviceSystem.setUsePercent(usePct);
		fileDeviceSystem.setMountedOn(fs.getDirName());
		fileDeviceSystem.setTypeName(fs.getTypeName());
		fileDeviceSystem.setSysTypeName(fs.getSysTypeName());

		return fileDeviceSystem;
	}

	public static FileDeviceSystem[] getFileDeviceSystem() {

		FileDeviceSystem[] fileDeviceSystemArray = new FileDeviceSystem[0];
		try {

			FileSystem[] fileSystemArray = sigar.getFileSystemList();
			fileDeviceSystemArray = new FileDeviceSystem[fileSystemArray.length];
			for(int i = 0; i < fileSystemArray.length; i++) {
				fileDeviceSystemArray[i] = getFileDeviceEntity(fileSystemArray[i]);
			}

		}catch(SigarException e) {
			log.error("通过sigar的API获取文件系统信息时出错：" + e.toString());
		}

		return fileDeviceSystemArray;
	}

}
