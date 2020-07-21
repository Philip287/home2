package Homework5.innerclasses;

public abstract class Identifier<T> {

    protected T id;

    public Identifier(T id) {
        this.id = id;
    }

    public String getMobileReadableString() {
        return "Identifier: " + id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "id='" + id + '\'' +
                '}';
    }
}
