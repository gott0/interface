package GomGame;

import java.util.Scanner;

public class Bear extends GameObject {

	private Scanner sc;
	
	public Bear(int distance, int x, int y) {
		super(distance, x, y);
		sc = new Scanner(System.in);
	}

	@Override
	public void move() { // 곰의 이동
		System.out.println("왼쪽(a), 오른쪽(d), 위(w), 아래(s) >> ");
		char c;
		c= sc.next().charAt(0);
		if(c == 'a') {
			x--;
			if(x < 0)
				x = 0;
		}else if(c == 'd') {
			x++;
			if(x >= Game.MAX_X) //Game.MAX_X = 스태틱변수
				x = Game.MAX_X - 1;
		}else if(c == 'w') {
			y--;
			if(y < 0)
				y = 0;
		}else if(c == 's') {
			y++;
			if(y >= Game.MAX_Y)
				y = Game.MAX_Y - 1;
		}
	}

	@Override
	public char getShape() { // 곰의 모양		
		return 'B';
	}

}