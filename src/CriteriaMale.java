import java.util.ArrayList;
import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) { //equalsIgnoreCase: Eşit olanlar büyük-küçük harf ayrımı yapılmaksızın.  case sensitive  özelliğini kaldırır.
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
