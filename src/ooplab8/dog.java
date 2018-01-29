package ooplab8;
//dog is seb-class
//Pet is super-class

public class dog extends Pet{
    public dog(String name, String hairColor, String gender, String age) {
        super(name, hairColor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box BoX !!!");
    }
}//dog
