package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class StackAccessNode extends ExpressionNode
{
    public final ExpressionNode stack;

    public StackAccessNode (Span span, Object array, Object index) {
        super(span);
        this.stack = Util.cast(array, ExpressionNode.class);
    }

    @Override public String contents() {
        return String.format("%s", stack.contents());
    }
}
