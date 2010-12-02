package org.libreSubsEngine.testUtils;

import org.libreSubsEngine.subtitleRepository.repository.PartialSHA1;

public class PioneerFileInfo {
	
	public static final PartialSHA1 videoID = new PartialSHA1("12345");
	public static final String content = "pioneer srt content";
	public static final String language = "pt_BR";
	public static final String path = "/12/"+videoID+"."+language;

}
