package 第五讲双端链表和双向链表;

public class TestFirstLastLinkList {
	
		public static void main(String[] args) {
			FirstLastLinkList f1 = new FirstLastLinkList();
			
//			f1.insertFirst(34);
//			f1.insertFirst(56);
//			f1.insertFirst(70);
//			f1.insertFirst(67);
//			f1.display();
//			
//			System.out.println();
			
			f1.insertLast(56);
			f1.insertLast(90);
			f1.insertLast(12);
			f1.display();
			
			f1.deleteFirst();
			f1.display();
			
		}
}
