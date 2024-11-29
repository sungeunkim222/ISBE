import java.util.Date;

class Member {
	String name;
	String nickname;
	public Member() {
		
		
	}
}
public class UnderstandDI {

	public static void main(String[] args) {
		Date date = new Date(); // 강한 결합 : 직접 생성(41)
		System.out.println(date);
		

	}
	
	public static void getDate(Date d) {
		Date date = d; // 약한 결합 : 생성된 것을 주입 받음 - 의존 주입 (Dependency Injection)
		System.out.println(date);
	}

}
//실행 f11, ctrl + f11