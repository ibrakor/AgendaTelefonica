package agenda.data.local;
import agenda.domain.models.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ContactMemLocalDataSource {

    private static ContactMemLocalDataSource instance = null;
    private Map<Integer, Contact> storage = new TreeMap<>();

    private  ContactMemLocalDataSource(){

    }

    public void save(Contact contact) {
        storage.put(contact.getId(), contact);
    }

    public Contact findById(Integer contactId) {

        return storage.get(contactId);
    }

    public List<Contact> findAll() {
        return new ArrayList<>(storage.values());
    }


    public static  ContactMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new ContactMemLocalDataSource();
        }
        return instance;
    }
}

