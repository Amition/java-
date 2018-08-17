package 第五讲双端链表和双向链表;

public class TestDoubleLinkList {

	
	
		public static void main(String[] args) {
			
			DoubleLinkList dl = new DoubleLinkList();
			dl.insertLast(45);
			dl.insertLast(56);
			dl.insertLast(90);
			dl.display();
			
			
			while(!dl.isEmpty()) {
				dl.deleteFirst();
				dl.display();
			}
			
		}

	
}
