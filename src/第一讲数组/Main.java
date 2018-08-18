package 第一讲数组;

public class Main {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		
		myArray.insert(12);
		myArray.insert(20);
		myArray.insert(30);
		myArray.insert(10);
		
		System.err.println(myArray.search(30)+".........");
		System.err.println(myArray.get(3));
		System.out.println(myArray.binarysearch(30));
		
		
		myArray.display();
		
	}
	
}
