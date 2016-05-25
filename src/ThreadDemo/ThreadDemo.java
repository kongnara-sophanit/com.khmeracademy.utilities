package ThreadDemo;

public class ThreadDemo extends Thread{
	private String txt = "";
	public String setText(String s) {
		return txt = s;
	}
	public void run() {
		ShringShow(txt);
	}
	public void ShringShow(String s){
		for (int i = 0; i < s.length(); i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(s.charAt(i));
		}
		
	}
}
