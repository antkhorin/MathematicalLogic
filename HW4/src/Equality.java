public class Equality extends AbstractExpression {

    public Equality(AbstractExpression... expressions) {
        super(expressions);
    }

    public String toString() {
        return expressions[0].toString() + "=" + expressions[1].toString();
    }

    public char getType() {
        return '=';
    }
}