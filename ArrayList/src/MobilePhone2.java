import java.util.ArrayList;

public class MobilePhone2 {
    private String myNumber;
    private ArrayList<Contact2> contactList;

    public MobilePhone2(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact2>();
    }

    public boolean addContacts(Contact2 contact) {
        if (findContacts(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        contactList.add(contact);
        System.out.println("Contact added!");
        return true;
    }

    public void printContacts() {
        System.out.println("You have " + this.contactList.size() + " contacts on your mobile phone: ");
//        for (int i=0; i < contactList.size(); i++){
//            System.out.println(i+1 + ". " + contactList.get(i));
//        }
        for (Contact2 c : contactList) {
            int i = contactList.indexOf(c);
            System.out.println(i + 1 + ". Name: " + c.getName() + "\n   Phone number: " + c.getPhoneNumber());
        }
    }

    // Method to modify/update contact
    public boolean modifyContacts(Contact2 currentContact, Contact2 newContact) {
        int position = findContacts(currentContact);
        if (position >= 0) {
            this.contactList.set(position, newContact);
            System.out.println(currentContact.getName() + " was replaced with " + newContact.getName());
            return true;
        } else {
            System.out.println(currentContact.getName() + " was not found.");
            return false;
        }
    }

    //  Method to remove contact
    public boolean removeContacts(Contact2 contact) {
        int position = findContacts(contact);
        if (position >= 0) {
            this.contactList.remove(position);
            System.out.println(contact.getName() + " has been removed from your contact list.");
            return true;
        }
        System.out.println(contact.getName() + " was not found.");
        return false;
    }

    // Methods to find contact
    private int findContacts(Contact2 searchContact) {
        return this.contactList.indexOf(searchContact);
    }

    private int findContacts(String contactName){
        for (int i=0; i<this.contactList.size(); i++){
            Contact2 contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact2 searchContact) {
        int position = findContacts(searchContact);
        if (position >= 0) {
            return searchContact.getName();
        }
        return null;
    }

    public Contact2 queryContact(String name) {
        int position = findContacts(name);
        if (position >= 0){
            return this.contactList.get(position);
        }
        return null;
    }
}
