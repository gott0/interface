package abstractClass;

public abstract class AbstractC {//'abstract' 보통 접근제한자 뒤에 붙인다. 실질적으로 순서는 상관없다.(개발자들 규칙)
	
	//추상클래스
	//1.abstract제한을 붙여서 클래스를 선언한다.
	//2.일반 클래스와 동일하게 멤버를 정의한다.
	//3.추상메소드를 정의한다.(선언부만 존재)
	//4.생성이 불가하다.
	//5.반드시 자식 클래스에 상속해야 된다.(상속을 위한 클래스)
	//6.자식 클래스는 반드시 추상메소드를 오버라이딩 해야한다.

	int x;
	
	AbstractC(){
		
	}
	
	void method() {
		
	}
	
	abstract void abstractMethod(); // 추상 메소드 : 1.필수기능, 2.오버라이딩 (강제구현)
}
