package GomGame;

import java.util.Scanner;

public class Bear extends GameObject {

	private Scanner sc;
	
	public Bear(int distance, int x, int y) {
		super(distance, x, y);
		sc = new Scanner(System.in);
	}

	@Override
	public void move() { // ���� �̵�
		System.out.println("����(a), ������(d), ��(w), �Ʒ�(s) >> ");
		char c;
		c= sc.next().charAt(0);
		if(c == 'a') {
			x--;
			if(x < 0)
				x = 0;
		}else if(c == 'd') {
			x++;
			if(x >= Game.MAX_X) //Game.MAX_X = ����ƽ����
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
	public char getShape() { // ���� ���		
		return 'B';
	}

}