package prob02;

public class Book {
	private int bookNo; // 번호
	private String title; // 제목
	private String author; // 작가
	private int stateCode; // 1:재고있음 0:대여중
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int isStateRent() {
		return stateCode;
	}


	public void setStateRent(int stateRent) {
		this.stateCode = stateRent;
	}


	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여됐습니다.");
	}
	
	public void print() {
		System.out.println("책 제목:" + title + ", 작가:" + author + ", 대여유무:" + (stateCode == 1 ? "재고있음" : "대여 중"));
	}
}
