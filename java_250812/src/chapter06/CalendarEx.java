package chapter06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH)+1;	//컴퓨터는 달을 0~12 로 인식
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(msg + ":" + year+"-"+month+"-"+day+" ");
//		System.out.print(dayOfWeek); //일:1, 월:2, 화:3 ~
//		System.out.println(Calendar.FRIDAY);
		
		switch (dayOfWeek) {
		case Calendar.SUNDAY:System.out.print("일요일");break;
		case Calendar.MONDAY:System.out.print("월요일");break;
		case Calendar.TUESDAY:System.out.print("화요일");break;
		case Calendar.WEDNESDAY:System.out.print("수요일");break;
		case Calendar.THURSDAY:System.out.print("목요일");break;
		case Calendar.FRIDAY:System.out.print("금요일");break;
		case Calendar.SATURDAY:System.out.print("토요일");break;
		default:break;
		}
		
		System.out.print("("+hourOfDay+")"); //24시간 기준
		if (ampm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		/*현재:2025-8-21 목요일(16)오후 4시 42분 51초 233밀리초*/
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+milisecond+"밀리초");
	}

	public static void main(String[] args) {
//		Abstract class 는 new 연산자로 객체생성 불가
//		new Calendar();
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);

		/*
		 * 처음 데이트한 날은 :2016-12-25 일요일(20)오후 8시 30분 0초 0밀리초
		 * */
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();//날짜, 시간 정보를 삭제
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
