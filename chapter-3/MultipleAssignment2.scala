//Scala will not allow you to assign fewer or more variables to your tuple or assigned values. It will be caught at compile time.
def getPersonInfo(primaryKey: Int) = {
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
}

val (firstName, lastName) = getPersonInfo(1)
