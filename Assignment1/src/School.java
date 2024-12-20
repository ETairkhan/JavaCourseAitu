import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void sortBySurname() {
        for (int i = 0; i < members.size() - 1; i++) {
            for (int j = 0; j < members.size() - i - 1; j++) {
                if (members.get(j).getSurname().compareTo(members.get(j + 1).getSurname()) > 0) {

                    Person temp = members.get(j);
                    members.set(j, members.get(j + 1));
                    members.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "School Members:\n";
        for (Person member : members) {
            result += member.toString() + "\n";
        }
        return result;
    }
}
