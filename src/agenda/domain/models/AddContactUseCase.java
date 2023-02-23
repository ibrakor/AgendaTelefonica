package agenda.domain.models;

public class AddContactUseCase {

    private ContactRepository contactRepository;
    public AddContactUseCase(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void execute(Contact contact){
        contactRepository.save(contact);
    }
}
