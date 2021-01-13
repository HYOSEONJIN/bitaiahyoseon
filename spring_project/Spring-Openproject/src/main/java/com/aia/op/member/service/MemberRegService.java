package com.aia.op.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberRegRequest;

@Service
public class MemberRegService {
	
	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
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
		int result = 0;
		try {
			/*파일저장*/
			regRequest.getUserPhoto().transferTo(newFile);
			Member member = regRequest.toMember();
			member.setMemberphoto(newfileName);
			
			// db입력
			dao = template.getMapper(MemberDao.class);
			result = dao.insertMember(member);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			
			// 현재 저장된 파일이 있다면 > 삭제
			if(newFile.exists()) {
				newFile.delete();
			}
		}
		
		
		return result;
	}

}
