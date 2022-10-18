package interclass;

public class UnitTest {

	public static void main(String[] args) {
		
		Tank t = new Tank(150);
		Dropship d = new Dropship(125);
		SCV scv = new SCV(40);
		
		Marine mr = new Marine(40);
		Medic m = new Medic(60);
		
		scv.repair(t);
		scv.repair(d);		
		//scv.repair(mr);
		
		m.repair(mr);
	}

}