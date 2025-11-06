package co2_scena;

class Person {
    public void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {
    String studentID = "S12345";

    public void showStudentID() {
        System.out.println("Student ID: " + studentID);
    }
}
class GraduateStudent extends Student {
    public void submitThesis() {
        System.out.println("Graduate student thesis submitted!");
    }
}
public class AcademicSystem {
	public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent();
        grad.displayInfo();     // from Person
        grad.showStudentID();   // from Student
        grad.submitThesis();    // own method
    }
}
