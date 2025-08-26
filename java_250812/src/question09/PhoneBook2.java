package question09;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook2 {

	private Scanner sc;
	private Phone[] pArray; // 객체 배열

	public PhoneBook2() {
		sc = new Scanner(System.in);
	}

	void read() {
		System.out.print("인원수>>");
		int n = sc.nextInt();
		pArray = new Phone[n];

		for (int i = 0; i < pArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}

	String search(String name) {
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name)) {
				return pArray[i].getTel();
			}
		}
		return null;
	}

	void run() {
		read();
		while (true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			if (name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if (tel == null) {
				System.out.println(name + "이(가) 없습니다.");
			} else {
				System.out.println(name + "의 번호는 " + tel + "입니다.");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		new PhoneBook2().run();
	}
}
