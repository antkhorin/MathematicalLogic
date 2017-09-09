import java.util.Stack;

public class Node {
    AbstractExpression element;
	AbstractExpression conjunct;
	AbstractExpression disjunct;
	AbstractExpression expression;
	Stack<AbstractExpression> stack;
	int n;
    Node prev;

    public Node(Node prev) {
        element = null;
		conjunct = null;
		disjunct = null;
		expression = null;
		this.prev = prev;
		stack = new Stack<>();
		n = 0;
    }
}
