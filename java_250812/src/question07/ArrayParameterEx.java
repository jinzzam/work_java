package question07;

public class ArrayParameterEx {
	public void printStringArray(String[] s) {
		String a = null;
		for (int i = 0; i < s.length; i++) {
			a.concat(s[i]);
		}
		System.out.println(a);
	}
	public String replaceBe(String[] s) {
		String a = s.toString();
		if(a.contains("be")) {
			a.replace("be", "eat");
		}
		a.toCharArray();
		return a;
	}
	
	
	public static void main(String[] args) {
		String[] str = {"to be or not to be"};
		ArrayParameterEx array = new ArrayParameterEx();
		String a = array.replaceBe(str);
//		array.printStringArray(a.);
	}
}
