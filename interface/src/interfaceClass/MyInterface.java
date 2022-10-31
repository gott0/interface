package interfaceClass;

public interface MyInterface {
	//인터페이스(이름'~~able'보통 이렇게 만듦 -규칙?)
	//1. 생성이 불가하다.
	//2. 클래스 처럼 멤버를 정의 할수 없다.
	//3. 두가지 형식의 멤버만 정의 할수 있다.(추상메소드, final 상수, 디폴트 메소드)
	//   -- 멤버의 제한자는 생략가능하다.
	//4. 반드시 클래스에 상속해야한다.
	//5. 자식클래스는 추상메소드를 오버라이딩 해야한다.
	//6. 인터페이스간 상속도 가능한다.
	//7. 다중 상속이 가능하다.
	//8. *클래스와 동일하게 다형성을 적용할수 있다.
	
//	public static final int MAX = 100; // public static final ┐
//	public abstract void method();     // public abstract     ┘ (생략가능)
//	     |
//	     V 
	int MAX = 100;
	void method();
}