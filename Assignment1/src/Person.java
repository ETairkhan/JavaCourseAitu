public class Person {
    private static int idCounter = 1;
    private int studentID;
    protected String name;
    protected String surname;
    protected int age;
    protected boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.studentID = idCounter++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + " with ID: " + studentID + ".";
    }
}
