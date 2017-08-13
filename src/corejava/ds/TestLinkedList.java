package corejava.ds;

import java.awt.image.RescaleOp;

public class TestLinkedList {

	class Node{
		Node link;
		Object val;
	}
	
	Node head;
	Node firstnode;//using for queue
	
	public TestLinkedList(){
		head = new Node();
		head.link = null;
		
		firstnode = head;
	}
	
	public void insertNode(Object val){
		Node node = new Node();
		node.link = head;
		node.val = val;
		head = node;
	}
	
	public void Print(){
		Node lastnode = new Node();
		lastnode = head;
		while(lastnode.val != null){
			System.out.println(lastnode.val);
			lastnode = lastnode.link;
		}
	}
	
	//stack methods
	public void push(Object val){
		insertNode(val);
	}
	
	public Object pop(){
		Object res = head.val;
		head = head.link;
		return res;
	}
	
	//queue methods
	public void enqueue(Object val){
		Node node = new Node();
		head.val = val;
		head.link = node;
		head = node;
	}
	
	public Object dequeue(){
		
		Object res = firstnode.val;
		firstnode = firstnode.link;
		return res;
		
	}
	
	
}
