package agenda.domain;

import agenda.domain.models.Contact;

public class AddContactUseCase {

    private ContactRepository contactRepository;
    public AddContactUseCase(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void execute(Contact contact){
        contactRepository.save(contact);
    }
}
