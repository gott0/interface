package GomGame;

public class Game {

	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;

	private char[][] map = new char[MAX_Y][MAX_X]; // 행 : 0~9 , 열 : 0~19
	private GameObject[] m = new GameObject[2];
	int state; // 0: 게임 중 , 1: 게임 끝

	{
		System.out.println("====================");
		System.out.println("=    GAME START    =");
		System.out.println("====================");
	}

	public Game() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = '-';
			}
		}

		m[0] = new Bear(1, 0, 0);
		m[1] = new Fish(2, 5, 5);
		int state = 0;

	}

	public void run() {
		System.out.println("Bear의 Fish 먹기 게임을 시작합니다.**");
		
		update(); // 'B'와 @'를 x,y를 이용해서 배열에 넣어주는 역할
		draw(); // 배열의 값을 출력하는 역할

		       // ┌ !true = false = 충돌이 안 됬을 경우 위의 두 메소드를 반복시킨다.
		while (!doesEnd()) {
			clear();

			for (int i = 0; i < m.length; i++) {
				m[i].move(); // i가 0이되면 베어의 무브실행, 1이되면 피쉬의 무브실행
			}

			update();
			draw();
		}
		
		System.out.println("====================");
		System.out.println("=    GAME   OVER   =");
		System.out.println("====================");
		
	}

	private void update() {
		for (int i = m.length - 1; i >= 0; i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
//	      map[m[0].getY()][m[0].getX()] = m[0].getShape();
//	      map[m[1].getY()][m[1].getX()] = m[1].getShape();
	}

	private void clear() {
		for (int i = 0; i < m.length; i++) {
			map[m[i].getY()][m[i].getX()] = '-';   
			
		}
	}
	
	private void draw() {
		System.out.println();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

	private boolean doesEnd() { //충돌 됬을 때
		if (m[0].collide(m[1])) {
			return true;
		} else {
			return false;
		}

	}
}