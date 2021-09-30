import java.util.ArrayList;

public class MobilePhone{

    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContactList() {
        return contactList;
    }

    public void addContacts(Contacts contact){
        if (contactList.contains(contact.getName())){
            System.out.println("Contact already exists!");
        } else {
            contactList.add(contact);
            System.out.println("Contact added!");
        }
    }

    public void printContacts(){
        System.out.println("You have " + contactList.size() + " contacts on your mobile phone: ");
        for (Contacts c : contactList){
            int i = contactList.indexOf(c);
            System.out.println(i+1 + ". Name: " + c.getName() + "\n   Phone number: " + c.getPhoneNumber());
        }
    }

    public void modifyContacts(Contacts currentContact, Contacts newContact){
        int position = findContacts(currentContact);
        if (position < 0) {
            System.out.println(currentContact.getName() + " was not found.");
        } else if (findContacts(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update not successful.");
        } else {
            contactList.set(position, newContact);
            System.out.println("Contact " + contactList.get(position).getName() + " has been modified.");
        }
    }

    public void removeContacts(Contacts contact){
        int position = findContacts(contact);
        if (position < 0) {
            System.out.println(contact.getName() + " was not found.");
        } else {
            contactList.remove(position);
            System.out.println(contact.getName() + " has been removed from your contact list.");
        }
    }

    private int findContacts(Contacts searchContact){
        return contactList.indexOf(searchContact);
    }

    private int findContacts(String contactName){
        for (int i = 0; i<contactList.size(); i++){
            Contacts contact = contactList.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public Contacts queryContact(String name) {
        int position = findContacts(name);
        if (position < 0){
            return null;
        }
        return contactList.get(position);
    }
}
