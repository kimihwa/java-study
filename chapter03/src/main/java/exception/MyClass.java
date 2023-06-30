package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws MyException{
		System.out.println("some code1");

		if(1-1 == 0) {
			throw new MyException();
		}
		System.out.println("some code2");
	}

}

