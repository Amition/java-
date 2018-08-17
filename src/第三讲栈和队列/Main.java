package 第三讲栈和队列;

public class Main {

		public static void main(String[] args) {
			MyStack myStack = new MyStack(4);
			myStack.push(23);
			myStack.push(10);
			myStack.push(15);
			myStack.push(66);
			
			System.out.println(myStack.isEmpty());
			System.out.println(myStack.isFull());
			
			System.out.println(myStack.peek());
			System.out.println(myStack.peek());
			
			while(!myStack.isEmpty()) {
				System.out.print(myStack.pop() + ",");
			}
			
			System.out.println(myStack.isEmpty());
			System.out.println(myStack.isFull());
		}
	
}
