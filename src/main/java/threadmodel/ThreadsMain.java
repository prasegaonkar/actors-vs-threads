package threadmodel;

public class ThreadsMain {
	public static void main(String[] args) throws Exception {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			Thread th = new Thread(new ButtonTask(i + 1));
			th.start();
			threads[i] = th;
		}
		for (int i = 0; i < 5; i++) {
			threads[i].join();
		}
	}
}
