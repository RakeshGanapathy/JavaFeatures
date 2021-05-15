package java8.functionalinterface.impl;

public class Candidate {
	public void participate(Performing perf) {
		perf.perform();
	}

	public static void main(String[] args) {
		Candidate ref = new Candidate();
		// passing the method as parameter
			ref.participate(()->{
				System.out.println("cooking implementation");
			});
			ref.participate(()->{
				System.out.println("fighting competition");
			});
	}
}
