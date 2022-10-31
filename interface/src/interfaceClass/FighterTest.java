package interfaceClass;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable aa = f;
		
		
		if(f instanceof Unit/*클래스명 or 인터페이스명*/) {
			System.out.println("Unit은 조상 클래스이다.");
		}
		
		if(f instanceof Fighterable) {
			System.out.println("Fighterable은 조상 클래스이다.");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable은 조상 클래스이다.");
		}
	}

}