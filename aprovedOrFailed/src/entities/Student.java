package entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade() {
        return grade1+grade2+grade3;
    }

    public String approved() {
        if (finalGrade() >= 60.00) {
            return "PASS";
        } else {
            return "FAILED\nMISSING "+(60-finalGrade())+" POINTS";
        }
    }
}
