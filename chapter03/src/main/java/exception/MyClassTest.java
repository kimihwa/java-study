package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			MyClass myclass = new MyClass();
			myclass.danger();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
