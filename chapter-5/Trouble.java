//The code will compile successfully but have a run time error. The ability to send a collection of subclass instances to a collection of base class is called convariance. The ability to send a collection of superlass instance to a collection of subclass is called contravariance.
class Fruit {}
class Banana extends Fruit {}
class Apple extends Fruit {}

public class Trouble {
    public static void main(String[] args) {
        Banana[] basketOfBanana = new Banana[2];
        basketOfBanana[0] = new Banana();

        Object[] basketOfFruits = basketOfBanana; //Trouble
        basketOfFruits[1] = new Apple();

        for(Banana banana : basketOfBanana) {
            System.out.println(banana);
        }
    }
}
