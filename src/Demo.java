public class Demo {

	public static void main(String[] args) {
		new Demo().run();
	}

	private void run() {
		var queue = new NumbersQueue<Integer>(new IntegerSummarizer());

		queue.put(1);
		queue.put(1);
		queue.put(1);

		System.out.println(queue.sum()); // 3
	}

}
