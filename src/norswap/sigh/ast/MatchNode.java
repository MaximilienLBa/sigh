package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public final class MatchNode extends StatementNode {

    public final String name;
    public final List<CaseNodeAlt> cases;
    public final StatementNode defaultStatement;

    public MatchNode (Span span, Object name, Object cases, Object defaultStatement){
        super(span);
        this.name = Util.cast(name, String.class);
        this.cases = Util.cast(cases,List.class);
        this.defaultStatement = defaultStatement == null
            ? null : Util.cast(defaultStatement, StatementNode.class);
    }

    @Override public String contents ()
    {
        String candidate = String.format("case %s of ...", condition.contents());

        return candidate.length() <= contentsBudget()
            ? candidate
            : "case (?) of ...";
    }
}
