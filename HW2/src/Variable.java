public class Variable extends AbstractExpression {
	private String name;
	
	public Variable(String name) {
		this.name = name;
	}
		
	public String toString() {
		return name;
	}

	public char getType() {
		return 'v';
	}
}