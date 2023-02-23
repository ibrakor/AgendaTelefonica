package agenda.presentation;

import agenda.data.ContactDataRepository;
import agenda.domain.AddContactUseCase;
import agenda.domain.ContactRepository;
import agenda.domain.GetContactsUseCase;
import agenda.domain.models.Contact;

import java.util.List;

public class TerminalView {

    public  void init(){
        Contact contact = new Contact();
        contact.setId(18);
        contact.setName("Ibra");
        contact.setSurname("Korsan");
        contact.setEmail("brahim@brahim.com");
        contact.setPhoneNumber("123456879");


        ContactRepository contactRepository = new ContactDataRepository();
        AddContactUseCase addContactUseCase = new AddContactUseCase(contactRepository);
        //addContactUseCase.execute(contact);

        GetContactsUseCase getContactsUseCase = new GetContactsUseCase(contactRepository);
        List<Contact> contactList = getContactsUseCase.execute();
        System.out.println(contactList.size());
    }
}
