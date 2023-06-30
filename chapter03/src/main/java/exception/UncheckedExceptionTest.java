package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		// Unchecked Exception은 예외처리 없이 발생해야 한다
		// 왜? 예외를 보고 수정해야 하는 예외라기 보다는 로직 에러에 가깝기 때문이다
		// ArrayIndexOutOfBoundsException
		// ArithmeticException
		// NullPointException
		
		int[] a = {1, 2, 3, 4, 5};
		
//		try {
			for(int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}

	}

}
