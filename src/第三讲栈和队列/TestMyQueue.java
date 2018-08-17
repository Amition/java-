package 第三讲栈和队列;

public class TestMyQueue {

		public static void main(String[] args) {
			MyQueue myQueue = new MyQueue(4);
			myQueue.insert(25);
			myQueue.insert(53);
			myQueue.insert(88);
			myQueue.insert(66);
			
			System.out.println(myQueue.isFull());
			System.out.println(myQueue.isEmpty());
			
			System.out.println(myQueue.peek());
			System.out.println(myQueue.peek());
			
			while (!myQueue.isEmpty()) {
				System.out.print(myQueue.remove() + " ");
			}
			System.out.println();
			
			

			myQueue.insert(23);
			myQueue.insert(45);
			myQueue.insert(13);
			myQueue.insert(1);
			
			while (!myQueue.isEmpty()) {
				System.out.print(myQueue.remove() + " ");
			}
			
			System.out.println(myQueue.isFull());
			System.out.println(myQueue.isEmpty());
			
		}
	
}
