package java8.functionalinterface.impl;

public class ThreadImpl {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread());
				System.out.println("childThread");
			}
		};
		Thread t = new Thread(r);
		t.setName("qsp");
		t.start();
		Runnable r2=()->{
			for(int i=0;i<10;i++) {
				System.out.println("childThread2");
				System.out.println(i);
			}
		};
		Thread t2 = new Thread(r2);
		t2.setName("jsp");
		t2.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
	

}
