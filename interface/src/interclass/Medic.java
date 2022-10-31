package interclass;

public class Medic extends GroundUnit implements RepairableM {

	Medic(int hp) {
		super(hp);
		hitPoint = Max_HP;
	}
	
	void repair(RepairableM m) { // Medic, Marine
		if (m instanceof GroundUnit) {
			GroundUnit g = (GroundUnit) m;
			while(g.hitPoint != g.Max_HP) {
				g.hitPoint++;
			}
			System.out.println(g.toString()+"의 치료 완료");
		}
		
	}

	@Override
	public String toString() {
		return "Medic";
	}
}
