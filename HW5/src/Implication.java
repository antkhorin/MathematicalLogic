public class Implication extends AbstractExpression {

	public Implication(AbstractExpression... expressions) {
		super(expressions);
	}

	public String toString() {
		if (expressions[0].getType() == 'i') {
			return "(" + expressions[0].toString() + ")->" + expressions[1].toString();
		} else {
			return expressions[0].toString() + "->" + expressions[1].toString();
		}
	}

	public char getType() {
		return 'i';
	}

}