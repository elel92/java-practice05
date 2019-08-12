package prob5;

public class MyStack<T> {
	private int top = -1;
	private int size;
	private String[] buffer;

	public MyStack(int size) {
		buffer = new String[size];
		this.size = size;
	}
	
	public void push(String input_s) {
		if(top+1 == size) {
			String[] n_b = new String[size+1];
			
			for(int i = 0; i < buffer.length; i++) {
				n_b[i] = buffer[i];
			}
			
			n_b[++top] = input_s;
			buffer = n_b;
			size = buffer.length;
		} else {
			buffer[++top] = input_s;
		}
	}
	
	public String pop() throws MyStackException {
		if(top == -1) {
			return "Prob5.MyStackException: stack is empty";
		}
		
		String s = buffer[top];
		buffer[top--] = null;
		return s;
	}

	public boolean isEmpty() {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}
}