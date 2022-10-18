package interclass;

public class SCV extends GroundUnit implements Repairable {

	SCV(int hp) {
		super(hp);
		hitPoint = Max_HP;
	}//  ������                  ����� (������ �ʴ� ����� ��ȭ �����ֱ� ���� ������ �������ش�.)

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
			System.out.println(u.toString()+"�� ���� �Ϸ�");
		}
		
	}

	@Override
	public String toString() {
		return "SCV";
	}
}
