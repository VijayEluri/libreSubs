package org.libreSubsApplet.dropFile;

import java.io.File;
import java.util.List;

public interface DropFileListener {
	
	public void droppedFiles(List<File> files);

}
