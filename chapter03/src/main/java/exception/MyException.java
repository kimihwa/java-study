package exception;

public class MyException extends Exception {
	private static final long serialVersionUTD = 1L;
	
	public MyException() {
		super("MyException Ocuurs");
	}
		
		public MyException(String msg) {
		super(msg);
		}

}
