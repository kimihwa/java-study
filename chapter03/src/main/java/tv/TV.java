package tv;

public class TV {
	private int channel; // 1 - 255
	private int volume; // 0 - 100
	private boolean power; 
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void volume() {
		
	}

	public void power(boolean on) {
		if(on) {
			power = on;
		} else {
			power = on;
		}
	}
	
	public void volume(int volume) {
		if(volume < 0 || volume > 100) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}
	
	public void channel(int channel) {
		if(channel < 0 || channel > 255) {
			channel = 1;
		} else {
			this.channel = channel;
		}
	}
	
	public void volume(boolean up) {
		if(up) {
			if(volume >= 100) {
				volume = 0; 
			} else {
				volume += 1;
				}
		} else {
			if(volume <= 0) {
			volume = 0;
			} else {
				volume -= 1;
			}
		}
	}
	
	public void channel(boolean up) {
		if(up) {
			if(channel >= 255) {
				channel = 0; 
			} else {
				channel += 1;
				}
		} else {
			if(channel <= 0) {
				channel = 0;
			} else {
				channel -= 1;
			}
		}
	}
	
	public void status() {
		System.out.println(
				"TV[POWER=" + (power ? "on" : "off") + 
				", channel=" + channel + 
				", volume=" + volume + "]");
	}
	
}
