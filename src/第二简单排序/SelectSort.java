package 第二简单排序;

public class SelectSort {

	public static void Sort(long[] arr) {
		
		int k = 0;
		long tem = 0;
		for (int i = 0; i < arr.length-1; i++) {
			k=i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j] <arr[k]) {
					k = j;
				}
			}
			
			tem = arr[i];
			arr[i] = arr[k];
			arr[k] = tem;
			
		}
		
	}
	
}
