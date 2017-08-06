package corejava.ds;

public class MainClass {

	public static void main(String[] args) {
		stackUsingArrays();
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

}
