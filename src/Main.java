import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a StorageUnit to hold ExtendedObjects containing Strings
        StorageUnit<ExtendedObject<String>> stringStorage = new StorageUnit<>();

        // Create some ExtendedObjects with String data
        ExtendedObject<String> helloObject = new ExtendedObject<>("Hello");
        ExtendedObject<String> worldObject = new ExtendedObject<>("World");

        // Add the ExtendedObjects to the StorageUnit
        stringStorage.addItem(helloObject);
        stringStorage.addItem(worldObject);

        // Perform the operation on each ExtendedObject in the StorageUnit
        stringStorage.performActionOnEachItem(ExtendedObject::performOperation);

        // Create a GenericStorageUnit to hold any type of object
        GenericStorageUnit<Object> genericStorage = new GenericStorageUnit<>();

        // Add various objects to the GenericStorageUnit
        genericStorage.add("A String");
        genericStorage.add(123); // An Integer
        genericStorage.add(new Date()); // A Date object

        // Iterate over the GenericStorageUnit and print each item's type
        genericStorage.forEach(item -> System.out.println("Item Type: " + item.getClass().getSimpleName()));
    }
}