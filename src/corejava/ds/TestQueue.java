package corejava.ds;

public class TestQueue {
	
	private int frontIndex = 0;
	private int rearIndex = 0;
	Object[] queue = new Object[5];
	
	public void enqueue(Object val){
		queue[frontIndex] = val;
		frontIndex++;
	}
	
	public Object dequeue(){
		Object res = queue[rearIndex];
		queue[rearIndex] = null;
		rearIndex++;
		return res;
 	}
}
