package question09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicApp {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("사랑", "love");
		map.put("아기", "baby");
		map.put("돈", "money");
		map.put("미래", "future");
		map.put("희망", "hope");

		String key;

		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글단어? ");
			key = sc.next();
			if (key.equals("그만"))
				break;
			String value = map.get(key);
			if (value != null) {
				System.out.println(key + "은(는) " + value);
			} else {
				System.out.println(key + "은(는) 저의 사전에 없습니다.");
			}
		}
		sc.close();
	}
}
