package member.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import member.dao.Dao;
import member.service.MemberInfoService;
import member.service.MemberRegService;

public class MemberMain2 {

	public static void main(String[] args) {

		
		//1. Spring 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx5.xml");
		
		

		Dao dao1 = ctx.getBean("memberDao", Dao.class);
		Dao dao2 = ctx.getBean("memberDao", Dao.class);
		
		// 아무 처리도 하지않으면 기본적으로 싱글톤이다.
		System.out.println("dao1참조변수 == dao2참조변수 ? " +(dao1==dao2));
		
		//2. MemberRegService 객체가 필요
		MemberRegService regService1 = ctx.getBean("memberRegService", MemberRegService.class);
		MemberRegService regService2 = ctx.getBean("memberRegService", MemberRegService.class);
		
		// 프로포타입이므로 false
		System.out.println("regService1==regService2 ? " + (regService1==regService2));
		
		
		//4. MemberinfoService 객체가 필요
		MemberInfoService infoService1= ctx.getBean("memberInfoService", MemberInfoService.class);
		MemberInfoService infoService2= ctx.getBean("memberInfoService", MemberInfoService.class);
		// 싱글톤타입이므로 true > 둘의참조변수가같다
		System.out.println("infoService1==infoService2 ? " + (infoService1==infoService2));
		
		
	}

}
