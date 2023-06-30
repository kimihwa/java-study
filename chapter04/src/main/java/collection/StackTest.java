package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("world");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		System.out.println("=======");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		// 비어 있는 경우, pop()을 호출하면 예외가 발생한다
		// stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
	}

}
