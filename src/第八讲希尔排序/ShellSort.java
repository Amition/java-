package 第八讲希尔排序;

/**
 * @author Ambition
 *
 *排序方法
 */
public class ShellSort {
	
		public static void sort(long[] arr) {
			//初始化一个间隔
			int h = 1;
			//计算最大值
			while (h < arr.length / 3) {
				h = h * 3 + 1;
			}
			
			while (h > 0) {
				long tmp = 0;
				for (int i = h; i < arr.length; i++) {
					tmp = arr[i];
					int j = i;
					while (j > h -1 && arr[j - h] >= tmp) {
						arr[j] = arr[j -h];
						j -= h;
					}
					arr[j] = tmp;
					
				}
				h = (h - 1) / 3;
			}
			
		}

}
