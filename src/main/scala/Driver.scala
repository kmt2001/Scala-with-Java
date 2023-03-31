import calculator._
import calculatorWrapper.{CalculatorWrapper, StorageWrapperImpl}

object Driver {
  def main(args: Array[String]): Unit = {
    val calculator = new CalculatorWrapper()
    val storage = new StorageWrapperImpl(new Storage(10))

    // Use the calculator
    println(calculator.add(1, 2)) // Output: 3
    println(calculator.subtract(5, 3)) // Output: 2
    println(calculator.multiply(2, 4)) // Output: 8
    println(calculator.divide(10, 3)) // Output: 3.3333333333333335

    // Use the storage
    storage.addElement("apple")
    storage.addElement("banana")
    println(storage.checkIfContains("apple")) // Output: true
    println(storage.checkIfContains("orange")) // Output: false
    storage.removeElement("apple")
    println(storage.checkIfContains("apple")) // Output: false
    storage.removeAll()
    println(storage.checkIfContains("banana")) // Output: false
  }
}
