package GomGame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public abstract class GameObject { //충돌기능 메소드(곰과 물고기가 같은 위치에 충돌)
	 //┌ gettet,setter 추가해주기
	protected int distance; // 이동거리
	protected int x , y; // 현재 위치(좌표)
	
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	
	protected abstract void move();
	protected abstract char getShape();	
}