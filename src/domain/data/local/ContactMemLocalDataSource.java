package domain.data.local;
import domain.models.Contact;

import java.util.Map;
import java.util.TreeMap;

public class ContactMemLocalDataSource {

    private static ContactFileLocalDataSource instance = null;
    private Map<Integer, Contact> storage = new TreeMap<>();

    private  ContactMemLocalDataSource(){

    }

    public static  ContactFileLocalDataSource getInstance(){
        if (instance == null){
            instance = new ContactMemLocalDataSource();
        }
    }
}

