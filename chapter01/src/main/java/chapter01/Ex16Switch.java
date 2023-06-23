package chapter01;

public class Ex16Switch {

	public static void main(String[] args) {
		char grade = 'A';
		
//		if(grade == 'A') {
//			System.out.println("참 잘했어요");
//		} else if(grade == 'B') {
//			System.out.println("잘했어요");
//		} else if(grade == 'C') {
//			System.out.println("노력하세요");
//		} else if(grade == 'D') {
//			System.out.println("좀 더 노력하세요");
//		} else if(grade == 'F') {
//			System.out.println("다음 학기에 만나요");
//		} else {
//			System.out.println("잘못된 학점입니다.");
//		}
		
		switch(grade) {
		case 'A' : {
			System.out.println("참 잘했어요");
			break;
		}
		case 'B' : {
			System.out.println("잘했어요");
			break;
		}
		case 'C' : {
			System.out.println("노력하세요");
			break;
		}
		case 'D' : {
			System.out.println("좀 더 노력하세요");
			break;
		}
		case 'F' : {
			System.out.println("다음 학기에 만나요");
			break;
		}
		default : {
			System.out.println("잘못된 학점입니다.");
			break;
		}
		}
	}
}
