package com.studyspringboot.bean;
//임포트 자동 불러오기 : Ctrl + Shift + O
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정으로 사용됨을 의미
public class Config {
	// 빈(@bean) : Spring이 IoC 방식으로 관리하는 객체
	// 빈 팩토리(BeanFactory) : 스프링의 IoC를 담당하는 핵심 컨테이너
	// 어플리케이션 컨텍스트(ApplicationContext) : 빈 팩토리를 확장한 IoC컨테이너
	
	@Bean
	public Member member1() {
		// Setter Injection (Setter 메서드를 이용한 의존성 주입)
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNickname("도사");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello") // 이름을 주면 해당 클래스를 빈으로 등록할 때 입력한 이름으로 빈의 이름을 변경할 수 있다.
	public Member member2() { 
		// Constructor Injection (생성자를 이용한 의존성 주입)
		return new Member("전우치", "도사", new PrinterA());
	}
	
	@Bean //별도의 이름을 지정하지 않으면 메서드 이름이 이름으로 등록된다.
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}
//71페이지