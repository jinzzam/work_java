package question08;


class Student{
	String name, number, Department;

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getDepartment() {
		return Department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "이름=" + name + "\n학번=" + number + "\n소속학과=" + Department ;
	}
	
}


public class StudentDriver {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("갑돌");
		student1.setNumber("100");
		student1.setDepartment("컴퓨터공학과");
		student2.setName("갑순");
		student2.setNumber("200");
		student2.setDepartment("건축학과");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
		
		student2.setDepartment("수학과");
		System.out.println(student2.toString());

	}
}
