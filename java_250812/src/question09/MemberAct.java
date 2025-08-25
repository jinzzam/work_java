package question09;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberAct {
	public static void main(String[] args) {
		Map<Integer, List<String>>
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=======헬스 클럽 회원 관리 프로그램======");
			System.out.println("1. 회원 정보관리 | 2. 프로그램 종료");
			System.out.println("======================================");
			System.out.print("메뉴를 선택하세요>>>");
			int firstChoice = sc.nextInt();
			if(firstChoice == 2) {
				break;
			}else {
				System.out.println("=======일반 회원 정보 관리======");
				System.out.println("11. 일반회원 정보입력 | 22. 일반회원 정보삭제 | "
						+ "33. 일반회원 정보확인 | 0.이전단계");
				System.out.println("======================================");
				System.out.print("메뉴를 선택하세요>>>");
				
			}
		}
		
		
		sc.close();
	}
}
