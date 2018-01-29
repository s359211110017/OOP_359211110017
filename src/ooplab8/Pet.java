package ooplab8;

public class Pet {
    private String name;
    private String hairColor;
    private String gender;
    private String age;
    public  void makeNoise(){}
//    constructor


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Pet(String name, String hairColor, String gender, String age) {
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
        this.age = age;
    }
    //getter and setter method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
