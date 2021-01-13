package com.aia.op.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberRegRequest;

@Service
public class MemberRegService {
	
	//private memb
	
	// 파일 업로드, 데이터베이스 저장
	public int memberReg(
			MemberRegRequest regRequest,
			HttpServletRequest request
			) {
		
		// 파일 저장할 웹 경로
		String uploadPath = "/fileupload/member";
		// 시스템의 실제 경로
		String saveDirPath = request.getSession().getServletContext().getRealPath(uploadPath);
		// 새로운 파일 이름
		String newfileName = regRequest.getUserid()+System.currentTimeMillis();
		
		
		File newFile = new File(saveDirPath, newfileName);
		
		try {
			/*파일저장*/
			regRequest.getUserPhoto().transferTo(newFile);
			Member member = regRequest.toMember();
			member.setMemberphoto(newfileName);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

}
