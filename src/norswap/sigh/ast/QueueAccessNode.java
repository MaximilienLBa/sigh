package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class QueueAccessNode extends ExpressionNode
{
    public final ExpressionNode queue;

    public QueueAccessNode (Span span, Object array, Object index) {
        super(span);
        this.queue = Util.cast(array, ExpressionNode.class);
    }

    @Override public String contents() {
        return String.format("%s", queue.contents());
    }
}
