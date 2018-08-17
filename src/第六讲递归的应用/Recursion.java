package 第六讲递归的应用;

public class Recursion {

	public static void main(String[] args) {
		teset1(1);
		
		
	}
	
	public static void test() {
		System.out.println("Hello,World");
		test();
	}
	
	public static void teset1(int n) {
		if(n == 100) {
			return;
		}
		System.out.print(n+" ");
		teset1(n+1);
		
	}
	
	
}
