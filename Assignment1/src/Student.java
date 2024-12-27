import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade: " + grade);
        }
    }

        public double calculateGPA() {
            if (grades.isEmpty()) return 0.0;
            double total = 0;
            int count = 0;
            for (double grade : grades) {
                if (grade >= 95 && grade <= 100) {
                    total += 4;
                }
                if (grade >= 90 && grade <= 94) {
                    total += 3.67;
                }
                if (grade >= 85 && grade <= 89) {
                    total += 3.33;
                }
                if (grade >= 80 && grade <= 84) {
                    total += 3;
                }
                if (grade >= 75 && grade <= 79) {
                    total +=2.67;
                }
                if (grade >= 70 && grade <= 74) {
                    total +=2.33;
                }
                if (grade >= 65 && grade <= 69) {
                    total +=2;
                }
                if (grade >= 60 && grade <= 64) {
                    total +=1.67;
                }
                if (grade >= 55 && grade <= 59) {
                    total +=1.33;
                }
                if (grade >= 50 && grade <= 54) {
                    total +=1;
                }
                if (grade >= 0 && grade <= 49) {
                    total +=0;
                }
                count++;
            }
            total = total / count;

            return total;

        }


    @Override
    public String toString() {
        return super.toString() + " GPA: " +calculateGPA()+ "." ;
    }


}