package corejava.ds;

public class MainClass {

	public static void main(String[] args) {
		//stackUsingArrays();
		//queueUsingArrays();
		//linkedlist();
		
		//stackUsingLinkedList();
		queueUsingLinkedList();
		}
	
	public static void queueUsingLinkedList(){
		TestLinkedList ll = new TestLinkedList();
		ll.enqueue(12);
		ll.enqueue(22);
		ll.enqueue(23);
		
		System.out.println(ll.dequeue());
		System.out.println(ll.dequeue());
	}
	
	public static void stackUsingLinkedList(){
		TestLinkedList ll = new TestLinkedList();
		ll.push(12);
		ll.push(22);
		ll.push(23);
		
		System.out.println(ll.pop());
		System.out.println(ll.pop());
	}
	
	public static void linkedlist(){
		TestLinkedList ll = new TestLinkedList();
		ll.insertNode(12);
		ll.insertNode(22);
		ll.insertNode(23);
		
		ll.Print();
	}
	
	public static void stackUsingArrays(){
		TestStack st = new TestStack();
		st.push("test11");
		st.push(12);
		st.push("test22");
		st.push(15);
		st.push("test23");
		st.push("sdf"); //array is full

		for(int i = 0;i< 6; i++){
				System.out.println(st.pop());//error msg when no elements.	
		}
	}
	
	public static void queueUsingArrays(){
		TestQueue q = new TestQueue();
		q.enqueue("test111");
		q.enqueue(12);
		q.enqueue("test222");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
