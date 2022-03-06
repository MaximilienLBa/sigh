package norswap.sigh.ast;

public enum BinaryOperator
{
    MULTIPLY("*"),
    DIVIDE("/"),
    REMAINDER("%"),
    ADD("+"),
    SUBTRACT("-"),
    EQUALITY("=="),
    NOT_EQUALS("!="),
    GREATER(">"),
    LOWER("<"),
    GREATER_EQUAL(">="),
    LOWER_EQUAL("<="),
    POWER("^"),
    AND("AND"),
    OR("OR"),
    XOR("XOR"),
    NAND("NAND"),
    NOR("NOR");


    public final String string;

    BinaryOperator (String string) {
        this.string = string;
    }
}
