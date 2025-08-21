package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");	//append() : 문자열을 연결(추가되는 걸로 수정됨)
		System.out.println(sb);		//This is pencil
		
		//insert() : 문자열 삽입
		sb.insert(7, " my");
		System.out.println(sb);		//This is my pencil

		sb.replace(8, 10, "your");
		System.out.println(sb);		//This is your pencil
		
		sb.delete(8, 13);
		System.out.println(sb);		//This is pencil
		
		sb.setLength(4);	//문자열 길이 수정
		System.out.println(sb);		//This
		
	}
}
