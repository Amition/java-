package 第二简单排序;

public class Main {
	
	public static void main(String[] args) {
		long arr[] = new long[4]; 
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 5;
		arr[3] = -10;
		arr[3] = -15;
		
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num+ " ");
		}
		System.out.println("]");
		System.out.println();
		
		InsertSort.Sort(arr);
		
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num+ " ");
		}
		System.out.println("]");
		System.out.println();
		
		
		
	}
	
}
