## Question

Create an sbt project which will contain both java and scala code. Inside java, create two classes as follows -
    a. first one, 'calculator' class containing 4 methods, add, substract, multiply and divide. (Ensure to handle all types of cases).
    b. second class, 'storage' class, which just contains an array used to store elements. This class will contains several methods as well i.e. addElement, removeElement, removeAll, checkIfContains.

In Scala, implement the followings -
    a. Create a class exposing all the methods of 'calculator' class.
    b. Create a trait containing the methods defition only and create a new class extending the traits and these override methods will call the 'storage' class methos to perform operations.
    
    
    
## Project Description
    
    
## java folder

    This Java class defines a calculator with four methods: add, subtract, multiply, and divide. Here's what each method does:

    add(int a, int b) adds two integers a and b, and returns their sum. If the result exceeds the maximum value of int, it returns Integer.MAX_VALUE.
    subtract(int a, int b) subtracts integer b from integer a, and returns the difference. If the result is less than the minimum value of int, it returns Integer.MIN_VALUE.
    multiply(int a, int b) multiplies two integers a and b, and returns their product. If the result exceeds the maximum value of int, it returns Integer.MAX_VALUE.
    divide(int a, int b) divides integer a by integer b, and returns the result as a double. If b is zero, it throws an IllegalArgumentException with message "Cannot divide by zero". If an IllegalArgumentException is thrown, it returns Double.NaN.

## Scala folder

     This is a Scala code that defines a CalculatorWrapper class that wraps around the Calculator class methods and a StorageWrapper trait that wraps around the Storage class methods.

     Here's what each part of the code does:

    The CalculatorWrapper class defines four methods that call the corresponding methods of the Calculator class, add, subtract, multiply, and divide, the last of which includes exception handling using Try, Success, and Failure.
    The StorageWrapper trait defines four methods that represent common storage operations: addElement, removeElement, removeAll, and checkIfContains.
    The StorageWrapperImpl class implements the StorageWrapper trait by wrapping around a Storage object and adding exception handling using Try, Success, and Failure. It overrides the four methods defined in the StorageWrapper trait and handles any exceptions that might be thrown by the corresponding methods of the Storage class.
    
