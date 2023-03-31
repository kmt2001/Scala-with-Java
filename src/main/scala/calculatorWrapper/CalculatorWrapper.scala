// Import required classes
package calculatorWrapper
import calculator.{Calculator, Storage}
import scala.util.{Try, Success, Failure}

// Wraps Calculator class methods
class CalculatorWrapper {
  // Method to add two numbers
  def add(a: Int, b: Int): Int = Calculator.add(a, b)

  // Method to subtract two numbers
  def subtract(a: Int, b: Int): Int = Calculator.subtract(a, b)

  // Method to multiply two numbers
  def multiply(a: Int, b: Int): Int = Calculator.multiply(a, b)

  // Method to divide two numbers with exception handling
  def divide(a: Int, b: Int): Double = {
    Try(Calculator.divide(a, b)) match {
      case Success(result) => result
      case Failure(exception) => {
        println(s"Error: ${exception.getMessage}")
        Double.NaN
      }
    }
  }
}

// Trait to wrap Storage class methods
trait StorageWrapper {
  // Method to add an element to storage
  def addElement(element: Any): Unit

  // Method to remove an element from storage
  def removeElement(element: Any): Unit

  // Method to remove all elements from storage
  def removeAll(): Unit

  // Method to check if an element exists in storage
  def checkIfContains(element: Any): Boolean
}

// Implementation of StorageWrapper trait
class StorageWrapperImpl(storage: Storage) extends StorageWrapper {
  // Method to add an element to storage with exception handling
  override def addElement(element: Any): Unit = {
    Try(storage.addElement(element)) match {
      case Failure(exception) => {
        println(s"Error: ${exception.getMessage}")
      }
      case _ => ()
    }
  }

  // Method to remove an element from storage with exception handling
  override def removeElement(element: Any): Unit = {
    Try(storage.removeElement(element)) match {
      case Failure(exception) => {
        println(s"Error: ${exception.getMessage}")
      }
      case _ => ()
    }
  }

  // Method to remove all elements from storage with exception handling
  override def removeAll(): Unit = {
    Try(storage.removeAll()) match {
      case Failure(exception) => {
        println(s"Error: ${exception.getMessage}")
      }
      case _ => ()
    }
  }

  // Method to check if an element exists in storage with exception handling
  override def checkIfContains(element: Any): Boolean = {
    Try(storage.checkIfContains(element)) match {
      case Success(result) => result
      case Failure(exception) => {
        println(s"Error: ${exception.getMessage}")
        false
      }
    }
  }
}
