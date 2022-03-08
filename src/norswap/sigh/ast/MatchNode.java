package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class MatchNode extends StatementNode {
    public final ExpressionNode condition;
    public final StatementNode Statement;

    public MatchNode (Span span, Object condition, Object Statement) {
        super(span);
        this.condition = Util.cast(condition, ExpressionNode.class);
        this.Statement = Util.cast(Statement, StatementNode.class);
    }

    @Override public String contents ()
    {
        String candidate = String.format("case %s of ...", condition.contents());

        return candidate.length() <= contentsBudget()
            ? candidate
            : "case (?) of ...";
    }
}
