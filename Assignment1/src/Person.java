public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected boolean gender; // true = Male, false = Female

    public Person(String name, String surname, int age, boolean gender) {
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
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";
    }
}
