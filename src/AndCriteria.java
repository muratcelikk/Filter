import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
