import java.util.Map;

public class Negation extends AbstractExpression {

	public Negation(AbstractExpression expression1) {
		this.expression1 = expression1;
	}

	public String toString () {
		if (expression1.getType() == 'v' || expression1.getType() == 'n') {
			return "!" + expression1.toString();
		} else {
			return "!(" + expression1.toString() + ")";
		}
	}

	public char getType() {
		return 'n';
	}

	public boolean evaluate(Map<String, Boolean> map) {
		return !expression1.evaluate(map);
	}
}