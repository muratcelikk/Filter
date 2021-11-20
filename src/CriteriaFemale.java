import java.util.ArrayList;
import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
