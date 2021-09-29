import java.util.ArrayList;

public class MobilePhone{

    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();
//    private Contacts contacts;

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
//        for (int i=0; i < contactList.size(); i++){
//            System.out.println(i+1 + ". " + contactList.get(i));
//        }
        for (Contacts c : contactList){
            int i = contactList.indexOf(c);
            System.out.println(i+1 + ". Name: " + c.getName() + "\n   Phone number: " + c.getPhoneNumber());
        }
    }

    public void modifyContacts(Contacts currentContact, Contacts newContact){
        int position = findContacts(currentContact);
        if (position >= 0) {
            modifyContacts(position, newContact);
        }
    }

    private void modifyContacts(int position, Contacts newContact){
        if (contactList.contains(newContact.getName())){
            System.out.println("Contact already exists!");
        } else {
            contactList.set(position, newContact);
            System.out.println("Contact " + contactList.get(position + 1) + " has been modified.");
        }
    }

    public void removeContacts(Contacts contact){
        int position = findContacts(contact);
        if (position >= 0) {
            removeContacts(position);
            System.out.println(contact + " has been removed from your contact list.");
        }
    }
    private void removeContacts(int position) {
        contactList.remove(position);
    }

    private int findContacts(Contacts searchContact){
        return contactList.indexOf(searchContact);
    }

    public boolean onFile(Contacts searchContact){
        int position = findContacts(searchContact);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
