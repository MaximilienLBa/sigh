package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class ForNode extends StatementNode{
    public final ExpressionNode condition;
    public final StatementNode body;

    public ForNode (Span span, Object condition, Object body) {
        super(span);
        this.condition = Util.cast(condition, ExpressionNode.class);
        this.body = Util.cast(body, StatementNode.class);
    }

    @Override public String contents ()
    {
        String candidate = String.format("for %s ...", condition.contents());

        return candidate.length() <= contentsBudget()
            ? candidate
            : "for (?) ...";
    }
}
