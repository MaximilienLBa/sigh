package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class ForNode extends StatementNode{

    public final VarDeclarationNode declarationNode;
    public final ExpressionNode condition;
    public final StatementNode body;
    public final AssignmentNode termination;


    public ForNode (Span span, Object declarationNode, Object condition, Object body, Object termination) {
        super(span);
        this.declarationNode = Util.cast(declarationNode, VarDeclarationNode.class);
        this.condition = Util.cast(condition, ExpressionNode.class);
        this.body = Util.cast(body, StatementNode.class);
        this.termination = Util.cast(termination,AssignmentNode.class);

    }

    @Override public String contents ()
    {
        String candidate = String.format("for %s | %s ...",declarationNode.contents(), condition.contents());

        return candidate.length() <= contentsBudget()
            ? candidate
            : "for (?) ...";
    }
}
