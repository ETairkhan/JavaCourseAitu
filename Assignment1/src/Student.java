import java.util.ArrayList;

public class Student extends Person {
    private static int idCounter = 1; // Static counter for student IDs
    private int studentID;
    private ArrayList<Integer> grades;


    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade: " + grade);
        }
    }

    private double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        return (double) total / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + " GPA: " + calculateGPA() +"." ;
    }
}
