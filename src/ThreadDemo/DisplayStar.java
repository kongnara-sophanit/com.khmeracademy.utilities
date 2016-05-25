package ThreadDemo;

public class DisplayStar extends Thread{
	private char sign = ' ';
	public void setSign(char sign) {
		this.sign = sign;
	}
	public void run() {
		drawStar(20, sign);
	}
	public void drawStar(int num, char sign) {
		for (int i = 0; i < num; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(sign);
		}
	}
}
