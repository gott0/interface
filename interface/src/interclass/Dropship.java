package interclass;

public class Dropship extends AirUnit implements Repairable {

	Dropship(int hp) {
		super(hp);
		hitPoint = Max_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}

}