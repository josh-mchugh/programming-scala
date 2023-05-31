//In this example of a Java class, it follows the the bean convention of exposing its properties. It has two properties, and corresponding getter methods. It also has a method to manipulate the miles property. It also has a constructor which intitializes the final field year.
public class Car {
    private final int year;
    private int miles;

    public Car(int yearOfMake) {
        year = yearOfMake;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }
}
