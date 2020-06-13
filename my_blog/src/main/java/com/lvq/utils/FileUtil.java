package com.lvq.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	private static final String DIR_UPLOAD = "uploads";
	public static String upload(MultipartFile multilFile, HttpServletRequest request) throws IllegalStateException, IOException {
		String webPath = request.getServletContext().getRealPath("");
		String dirParh = webPath + DIR_UPLOAD;
		if(!new File(dirParh).exists()) {
			new File(dirParh).mkdir();
		}
		String fileName = multilFile.getOriginalFilename(); //lấy tên file
		String pathFile = dirParh + File.separator + multilFile.getOriginalFilename();
		multilFile.transferTo(new File(pathFile));
		System.out.println(pathFile);
		return fileName;
	}
}
