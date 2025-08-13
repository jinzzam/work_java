package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
//		print : 엔터 적용 안 됨
//		백슬래시t: 탭만큼 띄움
//		백슬래시n: 엔터(줄바꿈)
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호이름직업");
		System.out.println();	// 엔터
//		Syntax error on token "개발자", invalid AssignmentOperator
//		System.out.print("우리는 "개발자"입니다.");
		System.out.print("우리는 \"개발자\"입니다.");
		System.out.print("봄여름가을겨울");
		System.out.print("봄\\여름\\가을\\겨울");
	}
}
