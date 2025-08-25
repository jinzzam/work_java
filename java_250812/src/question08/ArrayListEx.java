package question08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		int index = 0, max = 0;

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			list.add(i, name);
			if (name.length() > max) {
				max = name.length();
				index = i;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("가장 긴 이름은 : " + list.get(index));
		sc.close();
	}
}
