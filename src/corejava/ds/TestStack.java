package corejava.ds;

public class TestStack {

	Object[] stack = new Object[5];
	int cursor = 0;
	
	public void push(Object obj){
		if(cursor >= stack.length){
			System.out.println("Array is full");
			return;
		}
		stack[cursor] = obj;
		cursor++;
	}
	
	public Object pop(){
		if(cursor-1 <= -1){
			return "No more elements in array";
			
		}
		Object obj = stack[cursor-1];
		stack[cursor-1] = null;
		cursor--;
		return obj;
	}
}

