import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone2 mobilePhone2 = new MobilePhone2("0902 100 3355");

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone2.printContacts();
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
        System.out.println("\t 6 - To shutdown.");
    }

    public static void addContact(){
        System.out.print("Please enter the contact name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String number = scanner.nextLine();
        Contact2 contact = Contact2.createContact(name, number);
        mobilePhone2.addContacts(contact);
    }

    public static void updateContact() {
        System.out.print("Enter the existing contact name: ");
        String contactName = scanner.nextLine();
        Contact2 existingContactRecord = mobilePhone2.queryContact(contactName);
        if (existingContactRecord == null){
            System.out.println("Contact not found!");
        }else {
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newNumber = scanner.nextLine();
            Contact2 newContact = Contact2.createContact(newName, newNumber);
            mobilePhone2.modifyContacts(existingContactRecord, newContact);
        }
    }

    public static void removeContact() {
        System.out.print("Enter the existing contact name: ");
        String contactName = scanner.nextLine();
        Contact2 existingContactRecord = mobilePhone2.queryContact(contactName);
        if (existingContactRecord == null){
            System.out.println("Contact not found!");
        }else {
            mobilePhone2.removeContacts(existingContactRecord);
        }
    }

    public static void searchContact() {
        System.out.print("Enter the existing contact name: ");
        String contactName = scanner.nextLine();
        Contact2 existingContactRecord = mobilePhone2.queryContact(contactName);
        if (existingContactRecord == null){
            System.out.println("Contact not found!");
        }else {
            System.out.println("Name: " + existingContactRecord.getName() + "\nPhone number: " + existingContactRecord.getPhoneNumber());
        }
    }


}
