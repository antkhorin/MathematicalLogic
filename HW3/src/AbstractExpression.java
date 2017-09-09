import java.util.Map;

public abstract class AbstractExpression {
    public AbstractExpression expression1;

    public AbstractExpression expression2;

    public abstract String toString();

    public abstract char getType();

    public abstract boolean evaluate(Map<String, Boolean> map);
}