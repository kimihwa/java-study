package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			String s = String.valueOf(i);
			
			int length = s.length();
			int clap = 0;
			
			for(int j = 0; j < length; j++) {
				char c = s.charAt(j);
				if(c == '3' || c == '6' || c=='9') {
					clap++;
				}
			}
			
			if (clap == 0) {
				continue;
			} else {
				System.out.print(s + " ");
				for(int k = 0; k < clap; k++) {
					System.out.print("짝");
				}
			}
			System.out.println();
		}

	}
}
