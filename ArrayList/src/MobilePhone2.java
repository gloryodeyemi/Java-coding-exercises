import java.util.ArrayList;

public class MobilePhone2 {
    private String myNumber;
    private ArrayList<Contact2> myContacts;

    public MobilePhone2(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact2>();
    }

    public boolean addNewContact(Contact2 contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added!");
        return true;
    }

    public void printContact() {
        System.out.println("You have " + this.myContacts.size() + " contacts on your mobile phone: ");
        for (int i=0; i < myContacts.size(); i++){
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
//        for (Contact2 c : myContacts) {
//            int i = myContacts.indexOf(c);
//            System.out.println("Contact List:");
//            System.out.println(i + 1 + ". " + c.getName() + " -> " + c.getPhoneNumber());
//        }
    }

    // Method to modify/update contact
    public boolean updateContact(Contact2 currentContact, Contact2 newContact) {
        int position = findContact(currentContact);
        if (position < 0) {
            System.out.println(currentContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update not successful.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(currentContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    //  Method to remove contact
    public boolean removeContact(Contact2 contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " has been removed from your contact list.");
        return true;
    }

    // Methods to find contact
    private int findContact(Contact2 searchContact) {
        return this.myContacts.indexOf(searchContact);
    }

    private int findContact(String contactName){
        for (int i = 0; i<this.myContacts.size(); i++){
            Contact2 contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact2 searchContact) {
        int position = findContact(searchContact);
        if (position < 0) {
            return null;
        }
        return searchContact.getName();
    }

    public Contact2 queryContact(String name) {
        int position = findContact(name);
        if (position < 0){
            return null;
        }
        return this.myContacts.get(position);
    }
}
