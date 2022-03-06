package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class StackLiteralNode extends ExpressionNode
{
    public final List<ExpressionNode> components;

    @SuppressWarnings("unchecked")
    public StackLiteralNode (Span span, Object components) {
        super(span);
        this.components = Util.cast(components, List.class);
    }

    @Override public String contents ()
    {
        //@TODO
        return null;
    }
}
