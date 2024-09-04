public abstract class GenericObject<T> {
    protected T data;

    public GenericObject(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public abstract void performOperation();
}