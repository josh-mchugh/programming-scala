//Traits in Scala allow you to mix in crosscutting concerns, and you can use them to create highly extensible code with low ceremony. Rather than creating a hierarchy of classes and interfaces, you can put your essential code to quick use.
abstract class Check {
  def check() : String = "Checked Application Details..."
}

trait CreditCheck extends Check {
  override def check(): String = "Checked Credit..." + super.check()
}

trait EmploymentCheck extends Check {
  override def check(): String = "Checked Employment..." + super.check()
}

trait CriminalRecordCheck extends Check {
  override def check(): String = "Check Criminal Records..." + super.check()
}

val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck

println(apartmentApplication.check())

val employmentApplication = new Check with CriminalRecordCheck with EmploymentCheck

println(employmentApplication.check())
