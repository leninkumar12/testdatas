package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {

	}
	public static FileReaderManager getInstance() {
FileReaderManager fr=new FileReaderManager();
return fr;
	}
	public ConfigurationReader getCrInstance() throws IOException {
ConfigurationReader cr=new ConfigurationReader();
return cr;
	}
}

