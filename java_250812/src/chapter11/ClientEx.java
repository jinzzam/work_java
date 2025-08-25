package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null; // 클라이언트 소켓 선언
		BufferedReader in = null; // 입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; // 출력 : 서버에서 보내는 데이터
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("연결을 기다리고 있습니다.");
			// 소켓 객체로 데이터를 주고 받음
			socket = new Socket("localhost", 7777);
			// 입력 : 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 출력 : 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine(); // 서버에서 보내는 메시지
				if (outputMessage.equals("bye")) { // 클라이언트의 메시지가 bye일 때
					out.write(outputMessage + "\n");
					break;
				}
				out.write(outputMessage + "\n"); // 서버로 메시지 보내기
				out.flush(); // 비정상적인 종료일 때 메시지 재전송
				String inputMessage = in.readLine(); // 한 행의 문자열을 읽는다.
				System.out.println("서버 : " + inputMessage); // 서버에서 온 메시지
			}
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 시 시스템에서 자동으로 출력되는 메시지
		} finally {
			try {
				// 자원 반납 (예외 발생까지 고려)
				sc.close();
				socket.close();
				// 만든 역순으로 닫기
			} catch (Exception e2) { // 서버와 클라이언트 간에 입출력 시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
