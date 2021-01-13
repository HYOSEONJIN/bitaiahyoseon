package com.aia.self.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aia.self.domain.Member;
import com.aia.self.domain.MemberReg;
import com.aia.self.member.dao.MemberDao;

@Service
public class MemberRegService {

	MemberDao dao;

	@Autowired
	SqlSessionTemplate template;

	public int insertMember(MemberReg memberReg, HttpServletRequest request) {

		int result = 0;

		System.out.println("서비스의의 meberreg : " + memberReg);

		String uploadPath = "/uploadphoto";
		String saveDir = request.getSession().getServletContext().getRealPath(uploadPath);
		String newfileName = memberReg.getUserid() + System.currentTimeMillis();
		File newFile = new File(saveDir, newfileName);

		try {
			Member member = memberReg.toMember();

			memberReg.getUserphoto().transferTo(newFile);
			member.setUserphoto(newfileName);
			dao = template.getMapper(MemberDao.class);

			result = dao.insertMember(member);

		} catch (Exception e) {
			e.printStackTrace();

			if (newFile.exists()) {
				newFile.delete();
			}
		}

		return result;
	}

}
