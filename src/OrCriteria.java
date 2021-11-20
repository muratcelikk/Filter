import java.util.List;

/**
 * @Author Murat Çelik on Kas, 2021
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> firstCriteriaItem = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItem = otherCriteria.meetCriteria(personList);

        for (Person person : otherCriteriaItem) {
            if (!firstCriteriaItem.contains(person)) { //otherCriteriaItem, firstCriteriaItem içerisinde harf olarak varsa(hello-hel veya l) true, yoksa false döner. //contains->içerir->true|false
                firstCriteriaItem.add(person);
            }
        }
        return firstCriteriaItem;
    }
}
