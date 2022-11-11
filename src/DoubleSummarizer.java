import java.util.List;

class DoubleSummarizer implements NumberSummarizer<Double> {

	@Override
	public Double sum(List<Double> numbers) {
		return numbers.stream()
				.reduce(0.0, Double::sum);
	}

}
