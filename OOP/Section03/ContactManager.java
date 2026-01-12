package OOP.Section03;

public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        // deep copy
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    // getters
    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }

    // setters
    public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }
}