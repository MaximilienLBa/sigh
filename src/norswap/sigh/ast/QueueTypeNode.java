package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class QueueTypeNode extends TypeNode
{
    public final TypeNode componentType;

    public QueueTypeNode (Span span, Object componentType) {
        super(span);
        this.componentType = Util.cast(componentType, TypeNode.class);
    }

    @Override public String contents() {
        return "Queue<" + componentType.contents() + ">";
    }
}
