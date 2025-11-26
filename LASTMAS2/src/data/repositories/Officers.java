package data.repositories;
import data.models.Officer;
import java.util.ArrayList;
import java.util.List;


public class Officers implements OfficerRepository {

    private List<Officer> officers = new ArrayList<>();
    private int countOfficers = 0;

    @Override
    public Officer save(Officer officer) {
        if (officer.getId() != 0) return officer;
        officer.setId(generateId());
        officers.add(officer);
        return officer;
    }

    private int generateId() {
        return ++countOfficers;
    }

    @Override
    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) return officer;
        }
        return null;
    }

    @Override
    public List<Officer> findAll() {
        return officers;
    }

    @Override
    public void deleteById(int id) {
        Officer toRemove = null;
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                toRemove = officer;
                break;
            }
        }
        if (toRemove != null) officers.remove(toRemove);
    }

    @Override
    public void deleteAll() {
        officers.clear();
    }

    @Override
    public void delete(Officer officer) {
        officers.remove(officer);
    }

    @Override
    public long count() {
        return officers.size();
    }
}
