package chapter03;

/*
 * 열거형 이용(+values() 메소드 이용)
 * foreach 이용
 * */
public class ForeachEx {
//		열거형: inner class(내부 클래스) 형태
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	};

	public static void main(String[] args) {
		int[] n= {1, 2, 3, 4, 5};
		String[] names = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for (int k :n) {
			System.out.println(k + " ");
			sum += k;
		} 
		System.out.println("합은 " + sum);
		
		for(String s : names) {
			System.out.println(s + " ");
		}
		System.out.println();
			
		for (Week day : Week.values()) {
//			열거형 값을 String 타입으로 받을 수 없음
//			String str = day;	//오류
			Week str = day;
			System.out.println(day + " ");
			System.out.println(str + "요일 ");
		}
		System.out.println();
	}
}

