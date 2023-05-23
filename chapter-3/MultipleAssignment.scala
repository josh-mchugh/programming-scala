//Scala supports tuples and multiple assignments. A tuple is an immutable object sequence created as comma-seperated values.
def getPersonInfo(primaryKey: Int) = {
  ("Venkat", "Subramaniam",  "venkats@agiledeveloper.com")
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println("First Name is " + firstName)
println("Last Name is " + lastName)
println("Email Address is " + emailAddress)
