package ch13_thread.sec02;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		// ¶ò 5¹ø ¿¬¼Ó Ãâ·Â
				for(int i=0;i<5;i++) {
					System.out.println("¶ò");
						try {Thread.sleep(500);}catch(Exception e) {}


	}

}
}