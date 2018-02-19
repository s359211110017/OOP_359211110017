package ooplab9;

public class CarApp {

    public static void main(String[] args) {
        Engine e = new Engine("1800 cc", "V-Tec V4");
        Car c = new Car("Honda", "City", "black", e);

        System.out.println(c.toString());

    }
}