package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = "+student.finalGrade());
        System.out.println(student.approved());


        sc.close();
    }
}
