package GomGame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public abstract class GameObject { //�浹��� �޼ҵ�(���� ����Ⱑ ���� ��ġ�� �浹)
	 //�� gettet,setter �߰����ֱ�
	protected int distance; // �̵��Ÿ�
	protected int x , y; // ���� ��ġ(��ǥ)
	
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