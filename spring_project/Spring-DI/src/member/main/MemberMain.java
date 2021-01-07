package member.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import member.service.MemberInfoService;
import member.service.MemberRegService;

public class MemberMain {

	public static void main(String[] args) {

		
		//1. Spring 컨테이너 생성
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx4.xml");
		
		//2. MemberRegService 객체가 필요
		MemberRegService regService = ctx.getBean("memberRegService", MemberRegService.class);

		//3. MemberRegService 프로세스 메서드 실행
		regService.process();
		
		//4. MemberinfoService 객체가 필요
		MemberInfoService infoService = ctx.getBean("memberInfoService", MemberInfoService.class);
		
		//5. MemberInfoService 프로세스 메서드 실행
		infoService.process();
	}

}
