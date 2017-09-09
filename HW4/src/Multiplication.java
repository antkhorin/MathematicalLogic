public class Multiplication extends AbstractExpression {

    public Multiplication(AbstractExpression... expressions) {
        super(expressions);
    }

    public String toString() {
        String s;
        if (expressions[0].getType() == 'a') {
            s = "(" + expressions[0].toString() + ")*";
        } else {
            s = expressions[0].toString() + "*";
        }
        if (expressions[1].getType() == 'f' || expressions[1].getType() == 's') {
            s += expressions[1].toString();
        } else {
            s += "(" + expressions[1].toString() + ")";
        }
        return s;
    }

    public char getType() {
        return 'm';
    }
}