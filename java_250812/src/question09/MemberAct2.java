package question09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberAct2 {
	static List<String> memberInfoList = new ArrayList<>();
	static Map<Integer, List<String>> memberMap = new HashMap<Integer, List<String>>();
	static Scanner sc = new Scanner(System.in);

	static int startProgram() {
		System.out.println("=======헬스 클럽 회원 관리 프로그램======");
		System.out.println("1. 회원 정보관리 | 2. 프로그램 종료");
		System.out.println("======================================");
		System.out.print("메뉴를 선택하세요>>>");
		int res = sc.nextInt();
		return res;
	}

	static int memberInfoManagement() {
		System.out.println("=======일반 회원 정보 관리======");
		System.out.println("11. 일반회원 정보입력 | 22. 일반회원 정보삭제 | " + "33. 일반회원 정보확인 | 0.이전단계");
		System.out.println("======================================");
		System.out.print("메뉴를 선택하세요>>>");
		int res = sc.nextInt();
		return res;
	}

	static void insert() {
		System.out.print("가입할 회원 수를 입력하세요 >>");
		int members = sc.nextInt();
		int memberNumber = memberMap.size();
		for (int i = 0; i < members; i++) {
			System.out.println("회원 정보를 입력하세요.");
			System.out.print("회원 아이디 : ");
			String id = sc.next();
			MemberAct2.memberInfoList.add(id);
			System.out.print("회원 이름 : ");
			String name = sc.next();
			MemberAct2.memberInfoList.add(name);
			System.out.print("회원 지역 : ");
			String local = sc.next();
			MemberAct2.memberInfoList.add(local);
			MemberAct2.memberMap.put(memberNumber+1, memberInfoList);
			memberNumber += 1;
		}
	}

	static void delete() {
		System.out.println("삭제할 회원번호를 입력하세요.");
		int memberNo = sc.nextInt();
		for (Map.Entry<Integer, List<String>> entry : memberMap.entrySet()) {
			Integer key = entry.getKey();
			List<String> val = entry.getValue();
			if (key == memberNo) {
				System.out.println("회원 번호 : " + key);
				System.out.println("회원 아이디 : " + val.get(0));
				System.out.println("회원 이름: " + val.get(1));
				System.out.println("회원 지역 : " + val.get(2));
				memberMap.remove(key);
			} else {
				System.out.println("회원번호가 존재하지 않습니다.");
			}
		}
	}

	static void veiw() {
		System.out.println("등록된 회원 수는 " + memberMap.size() + "입니다.");
		for (Map.Entry<Integer, List<String>> entry : memberMap.entrySet()) {
			Integer key = entry.getKey();
			List<String> val = entry.getValue();
			System.out.println("회원 번호 : " + key);
			System.out.println("회원 아이디 : " + val.get(0));
			System.out.println("회원 이름: " + val.get(1));
			System.out.println("회원 지역 : " + val.get(2));
		}

	}

	public static void main(String[] args) {

		while (startProgram() == 1) {
			int secondChoice = memberInfoManagement();
			switch (secondChoice) {
			case 11:
				insert();
				break;
			case 22:
				delete();
				veiw();
				break;
			case 33:
				veiw();
				break;
			case 0:
				memberInfoManagement();
			}
		}
		sc.close();
	}
}
