package chapter01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// !(not)
		// ! ture => false
		// ! false => true
		System.out.println(!(3 != 2)); //false
		
		// &&(and, 논리곱)
		// true && false => false
		// flase && true => false
		// flase && false => false
		// true && true => true
		System.out.println(3 > 2 && 3 > 4); //false
		
		// ||(or, 논리합)
		// true || false => true
		// flase || true => true
		// flase || false => false
		// true || true => true
		System.out.println(3 != 2 || -1 > 0); //true
		
		// ^(xor, 배타적 논리합)
		// true ^ false => true
		// flase ^ true => true
		// flase ^ false => false
		// true ^ true => false		
		System.out.println(3 != 2 ^ -1 > 0); //true

	}

}
