import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> personList);
}
