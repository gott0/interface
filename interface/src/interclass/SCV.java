package interclass;

public class SCV extends GroundUnit implements Repairable {

	SCV(int hp) {
		super(hp);
		hitPoint = Max_HP;
	}//  └변수                  └상수 (변하지 않는 상수를 변화 시켜주기 위해 변수를 지정해준다.)

//	void repair(Tank t) {
//
//	}
//
//	void repair(Dropship d) {
//
//	}

	void repair(Repairable r) { // SCV, Tank, Dropship
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while(u.hitPoint != u.Max_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리 완료");
		}
		
	}

	@Override
	public String toString() {
		return "SCV";
	}
}
