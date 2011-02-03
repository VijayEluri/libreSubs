package org.installer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.SiteAdresses;
import org.subtitleDownloadLogic.utils.IOUtils;

public class WindowsInstaller implements Installer{

	private static final String PROGRAM_FILES_DIR = System.getenv("programfiles");
	private static final  File libresubsDir = new File(PROGRAM_FILES_DIR+"\\Libresubs");
	private static final  File libresubsfile = new File(libresubsDir,"subFinder.jar");
	
	@Override
	public void install() throws IOException {
		final URL url = new URL(SiteAdresses.getAppleturl());
		final URLConnection conn = url.openConnection();
		IOUtils.inputStreamToFile(conn.getInputStream(),libresubsfile);
		Runtime.getRuntime().exec("REG ADD HKEY_CLASSES_ROOT\\*\\shell\\Sincronizar legenda\\java -jar "+libresubsfile.getAbsolutePath()+" %*");
	}

	public static boolean isUsingWindows() {
		final String os = System.getProperty("os.name").toLowerCase();
		return os.indexOf( "win" ) >= 0;
	}
	
	public static boolean isInstalledOnWindows() {
		return libresubsDir.exists();
	}

}
