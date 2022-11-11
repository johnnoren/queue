import java.util.List;

public interface NumberSummarizer<T extends Number> {

	T sum(List<T> numbers);

}
