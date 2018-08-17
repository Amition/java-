package 第六讲递归的应用;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(getNumber(10));
	}
	
	
	public static int getNumber(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2){
			return 1;
		}else {
			return getNumber(n - 1) + getNumber(n - 2);
		}
	}
}
