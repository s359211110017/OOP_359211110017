package ooplab8;
//Application for Pet cat and dog

public class PetApp {
    public static void main(String[] args) {
        dog dog = new dog("Bow","whigth","Female","2");
        System.out.println(dog.toString());

        cat cat = new cat("vawa","whigth","Female","3");
        System.out.println(cat.getClass()+" "+cat.toString());
        dog.makeNoise();
        cat.makeNoise();
    }


}
