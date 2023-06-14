//Scala will not allow for a collection with of type to accept an array of it's derived or super type. Scala will compain to try and protect this action from happening. With special syntax 'T <: Pet'. The 'T' in the sytax represents the class is derived from Pet. This additional syntax tells Scala to allow a collect typed derived from 'Pet'. Additional syntax can allow for collections to be of a supertype. The syntax follows the same concept but is formatted as such: '[S, D >: S]'. 'D' is the supertype of the Source 'S'.
class Pet(val name: String) {
  override def toString(): String = name
}

class Dog(override val name: String) extends Pet(name)

def workWithPets[T <: Pet](pets: Array[T]) = println("Playing with pets: " + pets.mkString(", "))

val dogs = Array(new Dog("Rover"), new Dog("Comet"))

workWithPets(dogs)

def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = {}

val pets = new Array[Pet](10)
copyPets(dogs, pets)
