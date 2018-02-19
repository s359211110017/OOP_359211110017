package ooplab9;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("Bow", "2354",
                new Address("87/1","Suratthani","80160"),
                new Job("IT", "65000"));

        System.out.println(person.toString());

        person.getJob().setSalary("30000");

        System.out.println(person.toString());
    }

}
