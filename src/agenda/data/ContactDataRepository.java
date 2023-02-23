package agenda.data;

import agenda.data.local.ContactFileLocalDataSource;
import agenda.data.local.ContactMemLocalDataSource;
import agenda.domain.models.Contact;
import agenda.domain.ContactRepository;

import java.util.List;

public class ContactDataRepository implements ContactRepository {

    private ContactMemLocalDataSource localDataSource = ContactMemLocalDataSource.getInstance();
    @Override
    public void save(Contact contact) {
        localDataSource.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return localDataSource.findAll();
    }
}
