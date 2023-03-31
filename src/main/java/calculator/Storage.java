package calculator;

public class Storage {
    private final Object[] elements;

    // Constructor to initialize the storage with a given size
    public Storage(int size) {
        this.elements = new Object[size];
    }

    // Method to add an element to the storage
    public void addElement(Object element) {
        // Iterate over the array to find the first null element
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == null) {
                // If a null element is found, add the new element and return
                elements[index] = element;
                return;
            }
        }
        // If no null elements are found, throw a StorageFullException
        throw new StorageFullException("Storage is full");
    }

    // Method to remove an element from the storage
    public void removeElement(Object element) {
        // Iterate over the array to find the element to remove
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] != null && elements[index].equals(element)) {
                // If the element is found, remove it and return
                elements[index] = null;
                return;
            }
        }
        // If the element is not found, throw an ElementNotFoundException
        throw new ElementNotFoundException("Element not found in storage");
    }

    // Method to remove all elements from the storage
    public void removeAll() {
        for (int index = 0; index < elements.length; index++) {
            elements[index] = null;
        }
    }

    // Method to check if the storage contains a given element
    public boolean checkIfContains(Object element) {
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] != null && elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }
}

// Custom exception classes for handling errors related to storage operations

// Exception thrown when the storage is full and a new element cannot be added
class StorageFullException extends RuntimeException {
    public StorageFullException(String message) {
        super(message);
    }
}

// Exception thrown when an element is not found in the storage and cannot be removed
class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
