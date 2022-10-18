package GomGame;

public class Fish extends GameObject {

	public Fish(int distance, int x, int y) {
		super(distance, x, y);
	}

	@Override
	protected void move() { // 물고기의 이동
		int n = (int)(Math.random()*5);// 0,1,2,3,4
		if(n == 0) {
			x += distance;
		}else if(n == 1) {
			x -= distance;
		}
		
		if(x < 0)
			x = 0;
		if(x >= Game.MAX_X)
			x = Game.MAX_X - 1;
		
		n = (int)(Math.random()*5);// 0,1,2,3,4
		if(n == 0) {
			y += distance;
		}else if(n == 1) {
			y -= distance;
		}
		
		if(y < 0)
			y = 0;
		if(y >= Game.MAX_Y)
			y = Game.MAX_Y - 1;
	}

	@Override
	protected char getShape() { //물고기 모양
		return '@';
	}

}