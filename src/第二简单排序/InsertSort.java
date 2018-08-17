package 第二简单排序;

public class InsertSort {

		public static void Sort(long[] arr) {
			long tem = 0;
			for (int i = 1; i < arr.length; i++) {
				tem = arr[i];
				
				int j = i;
				while (j > 0 && arr[j] >= tem) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = tem;
				
			}
		}
	
}
