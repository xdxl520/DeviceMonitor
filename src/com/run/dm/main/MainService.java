package com.run.dm.main;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.xml.XmlConfiguration;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarLoader;
import org.xml.sax.SAXException;

import com.run.xdxl.common.utils.CU;

/**
 * 整个程序的启动类 <br />
 * <br />
 * 创建人：dianping <br />
 * 创建时间：2012-11-1 上午11:33:54 <br />
 * 修改人：dianping <br />
 * 修改时间：2012-11-1 上午11:33:54 <br />
 * 修改备注：创建 <br />
 * 
 * @version 0.1
 */
public class MainService {

	private static Log log = LogFactory.getLog(MainService.class);

	/**
	 * 类启动方法
	 * 
	 * @param args
	 *            启动参数
	 */
	public static void main(String[] args) {

		// 检查sigar需要的库是否存在
		try {
			Sigar.load();
		}catch(SigarException e1) {
			String sigarNativeLibraryName = SigarLoader.getNativeLibraryName();
			String javaLibraryPath = "";
			for(String path : System.getProperty("java.library.path").split(System.getProperty("path.separator", ";"))) {
				javaLibraryPath = javaLibraryPath + path + "\n";
			}
			log.error("[java.library.path] 中不存在sigar所依赖的库文件: " + sigarNativeLibraryName + " ,请将其复制到以下任一目录中：\n"
					+ javaLibraryPath);

			System.exit(-1);
		}

		try {
			CU.loadConfig();

			Resource jettyConfig = Resource.newResource(new File(System.getProperty("user.dir") + "/jetty-config.xml"));
			XmlConfiguration configuration = new XmlConfiguration(jettyConfig.getInputStream());
			Server server = (Server) configuration.configure(new Server());

			server.start();
			server.join();

		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(SAXException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
