package 第六讲递归的应用;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(getNumberByRecursion(2));
		
	}
	
	public static int getNumber(int n) {
		int total = 0;
		while (n > 0) {
			total = total + n;
			n--;
		}
		
		return total;
		
	}
	
	public static int getNumberByRecursion(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getNumberByRecursion(n - 1);
		}
		
		
		
	}
		
}
