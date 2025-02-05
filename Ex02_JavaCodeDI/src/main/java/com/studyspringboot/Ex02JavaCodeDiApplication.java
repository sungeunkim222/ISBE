package com.studyspringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.studyspringboot.bean.Config;
import com.studyspringboot.bean.Member;
import com.studyspringboot.bean.Printer;

//@SpringBootApplication // 자동으로 설정이 이루어지고 컴포넌트가 등록됨.
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1.IoC 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); // 객체 지향 프로그램에서 전형적으로 사용되는, '자식 객체를 부모 객체에 대입할 수 있다'라는 디자인 패턴이 적용된 모습

        // 2.Member Bean 가져오기
        Member member1 = (Member)context.getBean("member1");
        member1.print();
    
        // 3.Member Bean 가져오기
        Member member2 = context.getBean("hello", Member.class);
        member2.print();
    
        // 4.PrinterB Bean 가져오기 
        Printer printer = context.getBean("printerB", Printer.class);
        member1.setPrinter(printer);
        member1.print();
        
	}

}
