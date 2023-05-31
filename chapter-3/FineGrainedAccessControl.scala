//Scala gives far greater flexibility and also fine-grained control over setting access visibility. You can specify additional parameters for private and protected modifiers. Scala allows you to defind nested packages.
package society {

  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive) {
        println(another.workDetails)
        println(another.secrets) //ERROR
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: professional.Executive) {
        println(person.friends)
        println(person.workDetails)
      }
    }
  }
}
