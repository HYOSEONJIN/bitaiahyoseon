package member.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import member.service.MemberInfoService2;
import member.service.MemberRegService2;

public class MemberMain3 {

	public static void main(String[] args) {

		
		//1. Spring 컨테이너 생성
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx8.xml");
		
		//2. MemberRegService 객체가 필요
		MemberRegService2 regService = ctx.getBean("memberRegService", MemberRegService2.class);

		//3. MemberRegService 프로세스 메서드 실행
		regService.process();
		
		//4. MemberinfoService 객체가 필요
		MemberInfoService2 infoService = ctx.getBean("memberInfoService", MemberInfoService2.class);
		
		//5. MemberInfoService 프로세스 메서드 실행
		infoService.process();
	}

}
