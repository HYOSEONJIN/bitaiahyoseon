package com.aia.op.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberEditRequest;

@Service
public class MemberEditService {

	private MemberDao dao;

	@Autowired
	SqlSessionTemplate template;

	public Member getMember(int idx) {
		dao = template.getMapper(MemberDao.class);
		return dao.selectMemberByIdx(idx);
	}

	/* request 경로처리를 위해받음 */
	public int editMember(MemberEditRequest editRequest,
			HttpServletRequest request) {

		
		
		
		int result = 0;
		// 파일 저장할 웹 경로
		String uploadPath = "/fileupload/member";
		// 시스템의 실제 경로
		String saveDirPath = request.getSession().getServletContext().getRealPath(uploadPath);
		String newfileName = null;
		File newFile = null;

		// 1. 파일처리 : 새로운 파일이 존재하면
		if (!editRequest.getUserPhoto().isEmpty()) {
			// 새로운 파일 이름
			newfileName = editRequest.getUserid() + System.currentTimeMillis();
			newFile = new File(saveDirPath, newfileName);

			// 저장
			try {
				editRequest.getUserPhoto().transferTo(newFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		Member member = editRequest.getToMember();
		// 수정할 파일 이름 설정
		if (newfileName == null) {
			member.setMemberphoto(editRequest.getOldPhoto());
		} else {
			member.setMemberphoto(newfileName);
		}

		try {
			// 2. DB : update

			dao = template.getMapper(MemberDao.class);
			result = dao.updateMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			if (newFile !=null && newFile.exists()) {
				newFile.delete();
			}
		}

	// 새로운 파일 생겻으면 구파일 삭제
		if (newFile != null && !editRequest.getOldPhoto().equals("default.png")) {
			new File(saveDirPath,editRequest.getOldPhoto()).delete();			
			
		}
		
		return result;
	}

}
