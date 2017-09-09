public abstract class AbstractExpression {
    public AbstractExpression[] expressions;

    public AbstractExpression(AbstractExpression... expressions) {
        this.expressions = expressions;
    }

    public abstract String toString();

    public abstract char getType();
}