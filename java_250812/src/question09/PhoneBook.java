package question09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String nameKey = sc.next();
			String phoneValue = sc.next();
			phoneBook.put(nameKey, phoneValue);
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름>>");
			String key = sc.next();
			if (key.equals("그만"))
				break;
			String number = phoneBook.get(key);
			if (number == null) {
				System.out.println(key + "이(가) 없습니다.");
			} else {
				System.out.println(key + "의 번호는 " + number + "입니다.");
			}
		}
		sc.close();
	}
}
