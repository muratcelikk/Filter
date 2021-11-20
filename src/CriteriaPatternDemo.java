import java.util.ArrayList;
import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(personList));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(personList));

        System.out.println("\nSingleAndMales: ");
        printPersons(singleMale.meetCriteria(personList));

        System.out.println("\nsingleOrFemales: ");
        printPersons(singleOrFemale.meetCriteria(personList));
    }

    public static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person : [ Name:" + person.getName() + " " + "Gender:" + person.getGender() + " " + "Married:" + person.getMaritalStatus() + " ]");
        }
    }
}
