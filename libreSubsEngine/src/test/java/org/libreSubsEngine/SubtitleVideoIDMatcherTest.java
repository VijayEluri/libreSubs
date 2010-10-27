package org.libreSubsEngine;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.libreSubsEngine.subtitleRepository.repository.SubtitlesRepository;
import org.libreSubsEngine.testUtils.MockVideoFileInfo;
import org.libreSubsEngine.testUtils.TempRepositoryCreator;

public class SubtitleVideoIDMatcherTest {

	private static TempRepositoryCreator tempRepositoryCreator;

	@Before
	public void setup() throws IOException{
		tempRepositoryCreator = new TempRepositoryCreator();
	}
	
	@Test
	public void addSubAndRetrieve() throws IOException {
		final SubtitlesRepository subtitlesBase = new SubtitlesRepository(tempRepositoryCreator);
		subtitlesBase.addSubtitle(MockVideoFileInfo.videoID, MockVideoFileInfo.language, MockVideoFileInfo.content);
		final String subtitleFromVideoIDOrNull = subtitlesBase.getSubtitleContentsFromVideoIDAndLanguageOrNull(MockVideoFileInfo.language,
				MockVideoFileInfo.videoID);
		Assert.assertEquals(MockVideoFileInfo.content, subtitleFromVideoIDOrNull);
	}

}