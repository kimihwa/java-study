package prob01;

public class Printer {

//	public void println(int i) {
//		System.out.println(i);
//	}
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//	public void println(double d) {
//		System.out.println(d);
//	}
//	public void println(String s) {
//		System.out.println(s);
//	}
	
//	public <T> void println(T t) {
//			System.out.println(t);
//		}
	
	// 제네릭 타입 매개변수 <T> 를 통해 어떤 타입이든 사용될 수 있음
	// 가변인자 T... ts -> 0개 이상의 T타입 인자 전달할 수 있음(배열로 처리) 
	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}
	
	public int sum(int... nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}
	
}
