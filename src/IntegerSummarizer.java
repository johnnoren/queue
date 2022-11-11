import java.util.List;

class IntegerSummarizer implements NumberSummarizer<Integer> {

	@Override
	public Integer sum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, Integer::sum);
	}

}
