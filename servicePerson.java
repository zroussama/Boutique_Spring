import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> personList = new ArrayList<>();
    public PersonService(){}
    
    public void addPerson(Person person) {
        personList.add(person);
    }
    
    public List<Person> getAllPerson() {
        return personList;
    }
    
    public Person getPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    
    public void updatePerson(Person updatedPerson) {
        for (Person person : personList) {
            if (person.getId().equals(updatedPerson.getId())) {
                personList.remove(person);
                personList.add(updatedPerson);
                break;
            }
        }
    }
    
    public void deletePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                personList.remove(person);
                break;
            }
        }
    }
}
