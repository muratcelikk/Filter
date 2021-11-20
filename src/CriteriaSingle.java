import java.util.ArrayList;
import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) { //Kod hatam: .getMaritalStatus() yerine .getGender() yazmış olmak
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
