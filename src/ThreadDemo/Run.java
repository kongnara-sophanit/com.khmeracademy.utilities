package ThreadDemo;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo th = new ThreadDemo();
		ThreadDemo thr = new ThreadDemo();
		DisplayStar ss = new DisplayStar();
		DisplayStar dd = new DisplayStar();
		
		th.setText("Wellcome to \n");
		thr.setText("I am Mr. Robot\n");
		ss.setSign('>');
		dd.setSign('*');
		
		th.start();
		th.join();
		thr.start();
		thr.join();
		ss.start();
		ss.join();
		
		System.out.print("\nDownload");
		dd.start();
		dd.join();
		System.out.println(" Complete !");
		

	}

}
