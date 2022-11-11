import java.util.ArrayList;
import java.util.List;

public class NumbersQueue<T extends Number> implements Queue<T> {

	private final List<T> list = new ArrayList<>();
	private final NumberSummarizer<T> numberSummarizer;

	public NumbersQueue(NumberSummarizer<T> numberSummarizer) {
		this.numberSummarizer = numberSummarizer;
	}

	@Override
	public void put(T object) {
		list.add(object);
	}

	@Override
	public T take() {
		return list.get(0);
	}

	@Override
	public int size() {
		return list.size();
	}

	public T sum() {
		return numberSummarizer.sum(list);
	}

}
