package ooplab7;

public class studentApp {
    public static void main(String[] args) {
    //create object as student
    student s1 = new student();
    s1.setId("111111111111");
    s1.setname("Boy Saiyai");
    s1.setmajor("Information System");
    s1.setgroup("IS221");

    student s2 = new student("222222222222","Gril Saiyai","Maketing","MK221");
    showData(s1);


    }//main

    private static void showData(student s1) {
        System.out.println("student info: ");
        System.out.println("Id: "+s1.getId());
        System.out.println("Name: "+s1.getname());
        System.out.println("Major: "+s1.getmajor());
        System.out.println("Group: "+s1.getgroup());





    }
}//class
