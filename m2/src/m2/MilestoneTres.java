package m2;

public class MilestoneTres {

	public static void main(String[] args) throws InterruptedException {
		
		int hour = 0;
		int minutes = 0;
		int seconds = 0;
		
		while(true) {
			if(hour<10) {
				System.out.print("0");
			}
			System.out.print(hour + ":");
			if(minutes<10) {
				System.out.print("0");
			}
			System.out.print(minutes + ":");
			if(seconds<10) {
				System.out.print("0");
			}
			System.out.println(seconds);
			seconds++;
			
			if (seconds == 60) {
				seconds = 0;
				minutes++;
				if(minutes == 60) {
					minutes = 0;
					hour++;
					if(hour == 24) {
						hour = 0;
					}
				}
			}
			Thread.sleep(1000);
		}

	}
}
