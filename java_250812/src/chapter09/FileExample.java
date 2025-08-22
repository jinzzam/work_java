package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("c:/aaa");
		File dir = new File("c:/aaa/bbb");
		File file1 = new File("c:/aaa/file1.txt");
		File file2 = new File("c:/aaa/file2.txt");
		File file3 = new File("c:/aaa/file3.txt");
		
//		dir.mkdir();	//디렉토리 만들기
		dir.mkdirs();	//하위 디렉토리까지 같이 만들기
		file1.createNewFile();	//파일 만들기
		file2.createNewFile();	//파일 만들기
		file3.createNewFile();	//파일 만들기
		
		File test = new File("c:/aaa"); //디렉토리 정보를 가지고 test 객체를 생성
		File[] contents = test.listFiles();	//디렉토리 정보를 가지고 온다. (하위 디렉토리들 + 파일들)
		System.out.println("     날짜        시간         형태           크기          이름");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
//			1755850490980 : 1970년 1월 1일 기준으로 오늘까지의 ms로 계산된 값(long type)
//			System.out.print(contents[i].lastModified());
//			System.out.print(new Date(contents[i].lastModified()));
			System.out.print(sdf.format(new Date(contents[i].lastModified())));
			if (contents[i].isDirectory()) {	//디렉토리면
				System.out.println("\t   <DIR>\t\t\t"+contents[i].getName()); 	//디렉토리나 파일 이름
			} else {
				System.out.println("\t\t\t  " +contents[i].length()+"\t\t"+ contents[i].getName()); 	//디렉토리나 파일 이름
			}
		}
	}
	
}
