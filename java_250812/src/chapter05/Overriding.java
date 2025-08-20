package chapter05;

class Weapon{
	protected int fire() {	//스타크래프트 : 파이어벳
		return 1;	//기본 공격력 : 1
	}
}
class Cannon extends Weapon{	//스타크래프트 : 시즈탱크
	protected int fire() {
		return 10;	//탱크 공격력 : 10
	}
}

public class Overriding {
	public static void main(String[] args) {
//		Weapon weapon = new Weapon();
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire()); //1
		Weapon weapon2;
		weapon2 = new Cannon();	//upcasting
		System.out.println("대포 무기의 살상 능력은 " + weapon2.fire()); //10 (동적 바인딩)
	}
}
