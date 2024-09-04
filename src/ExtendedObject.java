public class ExtendedObject<T> extends GenericObject<T> {
    public ExtendedObject(T data) {
        super(data);
    }

    @Override
    public void performOperation() {
        System.out.println("Performing operation on data: " + data);
    }

    public static void performOperation(Object o) {
        System.out.println("Performing operation on data: " + o);

    }
}