package chapter03;

public class Person {
	private String name;
	
	public Person() {
		System.out.println("Person() called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
