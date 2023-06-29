package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private boolean stateRent; // true: 대여중, false: 재고있음
	
	public void rent() {
		stateRent = true;
	}
	
	public void print() {
		
	}

}
