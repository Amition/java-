package 第一讲数组;

public class MyArray {

	private long[] arr;
	
	private int element;
	
	public MyArray() {
		arr = new long[50];
	}
	
	public MyArray(int maxsize) {
		arr = new long[maxsize];
	}
	
	/**
	 * 添加数据
	 * */
	
	public void insert(long value) {
		
//		
//		arr[elements] = value;
//		elements++;
		
		//按大小的添加数据
		int i ;
		for ( i = 0; i < element; i++) { 
			if(arr[i] > value) {
				break;
			}
		}
		
		for (int j = element; j>i; j--) {
			arr[j] = arr[j-1];
		}
		arr[i] = value;
		element++;
	}
	
	/**
	 * 显示数据
	 * 
	 * */
	
	public void display() {
		System.out.print("[");
		
		for (int i = 0; i < element; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("]");
	}
	
	/**
	 * 查看数据
	 * */
	
	public int search(long value) {
		int i;
		for(i = 0; i < element; i++) {
			if(value == arr[i]) {
				break;
			}
		}
		
		if(i == element) {
			return -1;
		} else {
			return i;
		}
		
	}
	
	/**
	 * 二分查找数据
	 * */
	
	public int binarysearch(int value) {
		int moddle = 0;
		int low = 0;
		int pow = element;
		
			while (true) {
				moddle = (pow + low)/2;
				if(arr[moddle] == value) {
					return moddle;
				}else if(low > pow) {
					return -1;
				}else {
					if(arr[moddle] > value) {
						pow = moddle -1;
					}else {
						low = moddle +1;
					}
				}
			}
		
	}
	
	/**
	 * 查找数据，根据索引来查
	 */
	
	public long get(int index) {
		
		if(index >= element || index <0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
		
		return arr[index];
		
		}
		
	}
	

	/**
	 * 删除数据
	 */
	public void delete(int index) {
		if(index >= element || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			for (int i = index; i < element; i++) {
				arr[index] = arr[index + 1];
			}
			element--;
		}
		
	}
	
	/**
	 * 更新数据
	 */
		
	public void change(int index, int newvlaue) {
		if(index >= element || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			arr[index] = newvlaue; 
		}
	}
	
}
