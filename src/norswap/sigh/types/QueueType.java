package norswap.sigh.types;

public final class QueueType extends Type {
    public final Type componentType;

    public QueueType (Type componentType) {
        this.componentType = componentType;
    }

    @Override public String name() {
        return "Queue<" + componentType.toString() + ">";
    }

    @Override public boolean equals (Object o) {
        return this == o || o instanceof QueueType && componentType.equals(o);
    }

    @Override public int hashCode () {
        return componentType.hashCode();
    }
}
