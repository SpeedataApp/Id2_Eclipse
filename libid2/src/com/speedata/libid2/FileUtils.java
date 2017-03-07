package com.speedata.libid2;

import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * 功能描述:文件流
 */
class FileUtils {

	private static final String TAG = "Reginer";

	private static final String FILE_PATH = "/system/speedata.config";

	/**
	 * 读取文本文件中的内容 .
	 *
	 * @return 文件内容
	 */
	static String readTxtFile() {
		String content = "";
		File file = new File(FILE_PATH);

		try {
			InputStream inputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line;
			// 分行读取
			while ((line = bufferedReader.readLine()) != null) {
				content += line + "\n";
			}
			inputStream.close();
		} catch (java.io.FileNotFoundException e) {
			Log.d(TAG, "readTxtFile: The File doesn't not exist.");
		} catch (IOException e) {
			Log.d(TAG, "readTxtFile: " + e.toString());
		}

		return content;
	}

	/**
	 * .
	 *
	 * @return 文件是否存在
	 */
	static boolean fileExists() {
		File file = new File(FILE_PATH);
		return file.exists();
	}
}
