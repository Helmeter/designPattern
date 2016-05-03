package builder.defalutDemo;
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {

		builder.buildPart();
	}
}