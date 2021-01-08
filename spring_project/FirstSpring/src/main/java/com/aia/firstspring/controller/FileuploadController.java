package com.aia.firstspring.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aia.firstspring.domain.ReportUploadRequest;

@Controller
public class FileuploadController {

	final String uri = "/uploadfile";

	@RequestMapping("/upload/uploadForm")
	public String uploadForm() {
		return "upload/uploadForm";
	}

	
	
	@RequestMapping("/upload/upload1")
	public String upload1(
			@RequestParam("sn") String sn,
			@RequestParam("report") MultipartFile report, 
			Model model,
			HttpServletRequest request) throws IllegalStateException, IOException {

		System.out.println(report.getOriginalFilename());

		model.addAttribute("sno", sn);
		model.addAttribute("reportFile", report.getOriginalFilename());
		
		// 파일의 저장
		report.transferTo(getFile(request, uri, report.getOriginalFilename()));

		return "upload/uploadComplete";
	}

	
	
	
	
	@RequestMapping("/upload/upload2")
	public String upload2(MultipartHttpServletRequest request, Model model) throws IllegalStateException, IOException {

		String sn = request.getParameter("sn");
		MultipartFile report = request.getFile("report");

		System.out.println(report.getOriginalFilename());

		model.addAttribute("sno", sn);
		model.addAttribute("reportFile", report.getOriginalFilename());
		
		// 파일 저장
		report.transferTo(getFile(request, uri, report.getOriginalFilename()));

		return "upload/uploadComplete";
	}
	
	
	

	@RequestMapping("/upload/upload3")
	public String upload3(
			ReportUploadRequest uploadrequest,
			Model model,
			HttpServletRequest request) throws IllegalStateException, IOException {

		System.out.println(uploadrequest.getReport().getOriginalFilename());

		model.addAttribute("sno", uploadrequest.getSn());
		model.addAttribute("reportFile", uploadrequest.getReport().getOriginalFilename());
		
		// getReport = 멀티파트파일
		uploadrequest.getReport().transferTo(getFile(request, uri,uploadrequest.getReport().getOriginalFilename())); 

		return "upload/uploadComplete";
	}


	
	
	
	/*
	  private String getRealpath(HttpServletRequest request, String uri) { return
	  request.getSession().getServletContext().getRealPath(uri); }
	 */

	
	// File 객체를 생성해서 반환
	private File getFile(HttpServletRequest request, String uri, String fileName) {
		String rpath = request.getSession().getServletContext().getRealPath(uri);
		File newFile = new File(rpath, fileName);
		return newFile;
	}
}
