package string_test.src;

public class EqualsTest {
	
	public static void main(String[] args) {
		String a = "Test Java";
		String b = new String("Test Java");
		String c = "Test Java";
		String d = "Java Test";
		if(a == b) {
			System.out.println("a==bによる比較は真");
		}else {
			System.out.println("a==bによる比較は偽");
		}
		if(a == c) {
			System.out.println("a==cによる比較は真");
		}else {
			System.out.println("a==cによる比較は偽");
		}
		if(a == d) {
			System.out.println("a==dによる比較は真");
		}else {
			System.out.println("a==dによる比較は偽");
		}
		
		if(a.equals(b)) {
			System.out.println("a.equals(b)による比較は真");
		}else {
			System.out.println("a.equals(b)による比較は偽");
		}
		if(a.equals(c)) {
			System.out.println("a.equals(c)による比較は真");
		}else {
			System.out.println("a.equals(c)による比較は偽");
		}
		if(a.equals(d)) {
			System.out.println("a.equals(d)による比較は真");
		}else {
			System.out.println("a.equals(d)による比較は偽");
		}
	}
	
}
