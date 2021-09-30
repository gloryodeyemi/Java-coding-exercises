
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts on mobile phone.");
        System.out.println("\t 2 - To add a contact to the mobile phone");
        System.out.println("\t 3 - To update an existing contact on mobile phone.");
        System.out.println("\t 4 - To remove a contact from mobile phone.");
        System.out.println("\t 5 - To search for a contact on mobile phone.");
        System.out.println("\t 6 - To shut down.");
    }

    public static void addContact(){
        System.out.print("Please enter the contact name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String number = scanner.nextLine();
        Contacts contact = new Contacts(name, number);
        mobilePhone.addContacts(contact);
    }

    public static void updateContact() {
        System.out.print("Enter the existing contact name: ");
        String contactName = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(contactName);
        System.out.print("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = new Contacts(newName, newNumber);
        mobilePhone.modifyContacts(oldContact, newContact);
    }

    public static void removeContact() {
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(contactName);
        if (oldContact == null){
            System.out.println("Contact not found!");
        } else {
            mobilePhone.removeContacts(oldContact);
        }
    }

    public static void searchContact(){
        System.out.print("Enter contact name to search for: ");
        String name = scanner.nextLine();
        if (mobilePhone.queryContact(name) == null){
            System.out.println(name + " not found in contact list!");
        } else {
            Contacts foundContact = mobilePhone.queryContact(name);
            System.out.println("Found " + name + " -> " + foundContact.getPhoneNumber() + " in the contact list!");
        }
    }
}
