package com.example.demo.vo;

import org.springframework.web.multipart.MultipartFile;

public class FileVO {
	private String name;
	private String fileName; // 저장할 파일
	//private String fileOriName; // 실제파일
	private MultipartFile fileOriName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public MultipartFile getFileOriName() {
		return fileOriName;
	}
	public void setFileOriName(MultipartFile fileOriName) {
		this.fileOriName = fileOriName;
	}
}
