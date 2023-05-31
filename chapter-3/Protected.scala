//In Scala, protected makes the decorated members visible to the class and its derived classes only. Other classes that belong to the package cannot access these members. Furthermore, the derived class can access the protected members only on its own type.
package automobiles

class Vehicle {
  protected def checkEngine() {}
}

class Car extends Vehicle {
  def start() { checkEngine() /*OK*/ }
  def tow(car: Car) {
    car.checkEngine() //OK
  }
  def tow(vehicle: Vehicle) {
    vehicle.checkEngine() //ERROR
  }
}

class GasStation {
  def fillGas(vehicle: Vehicle) {
    vehicle.checkEngine() //ERROR
  }
}
