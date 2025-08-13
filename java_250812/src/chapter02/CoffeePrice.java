package chapter02;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 * */
public class CoffeePrice {
	public static void main(String[] args) {
		System.out.print("무슨 커피 드릴까요 ?");
		Scanner sc = new Scanner(System.in);
		String order = sc.next();
//		커피 가격 변수 선언
		int price = 0;

		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;

		default:
			System.out.println("메뉴에 없습니다!");
			break;
		}

		if (price != 0) {
			System.out.println(order + "는 " + price + "원 입니다.");
		}
		sc.close();
	}
}
