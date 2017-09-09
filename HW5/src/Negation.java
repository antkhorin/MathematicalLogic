public class Negation extends AbstractExpression {

	public Negation(AbstractExpression... expressions) {
		super(expressions);
	}
	
	public String toString () {
		if (expressions[0].getType() == 'd' || expressions[0].getType() == 'c' || expressions[0].getType() == 'i') {
			return "!(" + expressions[0].toString() + ")";
		} else {
			return "!" + expressions[0].toString();
		}

	}

	public char getType() {
		return 'n';
	}
}