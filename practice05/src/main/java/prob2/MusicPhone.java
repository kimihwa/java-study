package prob2;

public class MusicPhone extends Phone{

	@Override
	public void execute(String function) {
		if(function.equals("음악")) {
			playMusic();
			return;
		}
		super.execute(function);
	}

	// 오버라이딩 해야 하므로 private이 아닌 protected로 표현
	protected void playMusic() {
		System.out.println("MP3 플레이어에서 음악재생");
		
	}

}
