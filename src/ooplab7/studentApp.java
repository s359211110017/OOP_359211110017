package ooplab7;

import java.util.Scanner;

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
    showData(s2);


    student s3 = new student();
    s3 = InputData(s3);

    }//main

    private static student InputData(student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student in");
        System.out.println("Enter student ID");
        s.setId(scanner.nextLine());
        System.out.print("Enter student name: ");
        s.setname(scanner.nextLine());
        System.out.print("Enter student major: ");
        s.setmajor(scanner.nextLine());
        System.out.print("Enter student group: ");
        s.setgroup(scanner.nextLine());
        return s;

    }//inputData

    private static void showData(student s) {
        System.out.println("student info: ");
        System.out.println("Id: "+s.getId());
        System.out.println("Name: "+s.getname());
        System.out.println("Major: "+s.getmajor());
        System.out.println("Group: "+s.getgroup());
    }
}//class
