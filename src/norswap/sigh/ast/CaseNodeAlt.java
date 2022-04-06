package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class CaseNodeAlt extends StatementNode {

    public final TypeNode type;
    public final String name;
    public final StatementNode statement;

    public CaseNodeAlt (Span span, Object type, Object name, Object statement){
        super(span);
        this.type = Util.cast(type, TypeNode.class);
        this.name = Util.cast(name, String.class);
        this.statement = Util.cast(statement, StatementNode.class);
    }

    @Override public String contents ()
    {
        //return String.format("case %s of %s -> %s",type,name,statement);
        return null;
    }
}
