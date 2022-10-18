package interclass;

public class Tank extends GroundUnit implements Repairable {

	Tank(int hp) {
		super(hp);
		hitPoint = Max_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}