package interclass;

public class Marine extends GroundUnit implements RepairableM {

	Marine(int hp) {
		super(hp);
	}

	@Override
	public String toString() {
		return "Marine";
	}
}
