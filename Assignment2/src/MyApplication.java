import java.util.ArrayList;
import java.util.Comparator;

public class MyApplication {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Developer", 50000.0);

        // Create students
        Student stu1 = new Student("Ringo", "Starr", 2.5);
        Student stu2 = new Student("Paul", "McCartney", 3.9);

        // Add all to an ArrayList
        ArrayList<Payable> payable = new ArrayList<>();
        payable.add(emp1);
        payable.add(emp2);
        payable.add(stu1);
        payable.add(stu2);

        // Sort the list using a Comparator
        payable.sort(Comparator.comparingDouble(Payable::getPaymentAmount));

        // Print the data
        printData(payable);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            if (payable instanceof Employee) {
                Employee emp = (Employee) payable;
                System.out.println(emp + " earns " + emp.getPaymentAmount() + " tenge");
            } else if (payable instanceof Student) {
                Student stu = (Student) payable;
                System.out.println(stu + " earns " + stu.getPaymentAmount() + " tenge");
            }
        }
    }
}
