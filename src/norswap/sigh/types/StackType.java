package norswap.sigh.types;

public final class StackType extends Type {
    public final Type componentType;

    public StackType (Type componentType) {
        this.componentType = componentType;
    }

    @Override public String name() {
        return "Stack<" + componentType.toString() + ">";
    }

    @Override public boolean equals (Object o) {
        return this == o || o instanceof StackType && componentType.equals(o);
    }

    @Override public int hashCode () {
        return componentType.hashCode();
    }
}