package prob05;

public class MyBase extends Base {
	
	// return문을 사용해서 메소드 중복 실행을 방지함
	@Override
	public void service(String state) {
		if("오후".equals(state)) {
			afternoon();
			return;
		}
		super.service(state);
	}

	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}
	
	public void afternoon( ) {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	
}
