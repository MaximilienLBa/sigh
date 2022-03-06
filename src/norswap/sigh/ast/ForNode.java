package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class ForNode extends StatementNode {
    public final ExpressionNode condition;
    public final StatementNode body;
    public final ExpressionNode init;
    public final ExpressionNode update;

    public ForNode (Span span, Object init,Object condition,Object update, Object body) {
        super(span);
        this.init = Util.cast(init,ExpressionNode.class);
        this.condition = Util.cast(condition, ExpressionNode.class);
        this.update = Util.cast(condition, ExpressionNode.class);
        this.body = Util.cast(body, StatementNode.class);
    }

    @Override public String contents ()
    {
        String candidate = String.format("for %s | %s | %s ...",init.contents(),condition.contents(),update.contents());

        return candidate.length() <= contentsBudget()
            ? candidate
            : "for (? | ? | ?) ...";
    }
}
