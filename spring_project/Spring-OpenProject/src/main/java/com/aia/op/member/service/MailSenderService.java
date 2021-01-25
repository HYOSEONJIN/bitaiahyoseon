package com.aia.op.member.service;

import java.io.UnsupportedEncodingException;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.aia.op.member.domain.Member;

@Service
public class MailSenderService {
	
	@Autowired
	private JavaMailSender sender;

	public int send(Member member){
		
		int result = 1;
		MimeMessage message = sender.createMimeMessage();
		
		try {
			// 메일제목
			message.setSubject("[안내] 메일인증 코드발송 ", "utf-8");
			
			// 메일내용 html
			String html = "<h1>회원가입을 축하합니다 :</h1>";
			html += "<h3>인증을 위해 아래 링크를 클릭해주세요!</h3>";
			html += "<a href=\"http://localhost:8080/op/member/verify?idx="+member.getIdx()+"&code="+member.getCode()+"\">인증하기</a>";
			
			// message
			message.setText(html, "utf-8", "html");
			
			// from 설정
			message.setFrom(new InternetAddress("hyoseonjinbit@gmail.com"));
			
			// to 설정
			message.addRecipient(RecipientType.TO, new InternetAddress(member.getMemberid(), member.getMembername()+" 님", "UTF-8"));
			
			
			// 메일 발송
			sender.send(message);
			
		} catch (MessagingException e) {

			result = 0;
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			result = 0;
			e.printStackTrace();
		}
		

		
		return result;
	}
}
