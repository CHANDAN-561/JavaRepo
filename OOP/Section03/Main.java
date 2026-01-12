package OOP.Section03;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // For Contact class
        Contact[] contactList = {
                new Contact("Chandan Sahu", "+91 8457017914", "05/05/2005"),
                new Contact("Aman Acharya", "+91 7655908398", "12/08/2005"),
                new Contact("Shibani Sahu", "+91 8117350428", "14/12/1982"),
                new Contact("Harry osborn", "+91 9938373508", "25/07/1990")
        };

        Contact copyContact1 = new Contact(contactList[0]);
        Contact copyContact2 = new Contact(contactList[1]);

        for (Contact contact : contactList) {
            System.out.println("\n" + contact);
        }

        contactList[2].setBirthDate("21/03/1985");
        System.out.println("\n" + contactList[2]);

        // For ContactManager Class
        Contact[] contacts = {
                new Contact("Alice", "+91 1234567890", "01/01/1990"),
                new Contact("Bob", "+91 2345678901", "02/02/1992")
        };
        ContactManager contactManager = new ContactManager(contacts);

        // Test the getContact method
        Contact retrievedContact = contactManager.getContact(0);
        System.out.println("\n\n" + retrievedContact);

        // Test the setContact method
        Contact newContact = new Contact("Charlie", "+91 3456789012", "03/03/1994");
        contactManager.setContact(newContact, 0);

        // Verify that the contact was updated
        retrievedContact = contactManager.getContact(0);
        System.out.println("\n" + retrievedContact);

        // For ContactData() method
        ContactManager newContactManager = new ContactManager(contactData());
        displayContact(newContactManager);
        System.out.println("\nYou have " + contactData().length + " contacts in your AddressBook.");

        System.out.print("If you wish to edit the details of any contact, type 'continue': ");
        String choice = scan.next();

        //looped edit contact block
        while (choice.equals("continue")) {
            System.out.print("\nEnter the index you want to change the contact of: ");
            int index = scan.nextInt() - 1;
            //scan.nextInt();                         //this is to clear the input buffer...
            System.out.println("\nYou are changing the details of the following contact...");
            System.out.println(newContactManager.getContact(index));

            System.out.print("\nType 'yes' if you want to edit this contact?: ");
            if (scan.next().equals("yes")) {
                newContactManager.setContact(updateContactDetails(), index);
            }

            System.out.println("\nDetails has been updated...");
            System.out.println("\nHave a look...\n");
            System.out.println(newContactManager.getContact(index));
            System.out.print("If you wish to edit any other contact, type 'continue': ");
            choice = scan.next();
        }

        System.out.print("\nType 'yes' if you want to see your address book: ");
        if (scan.next().equals("yes")) {
            displayContact(newContactManager);
        }

        scan.close();
    }
    public static Contact updateContactDetails() {
        scan.nextLine();
        System.out.print("\nEnter new Name: ");
        String name = scan.nextLine();
        System.out.print("\nEnter new Phone Number:" );
        String phoneNumber = scan.nextLine();
        System.out.print("\nEnter new BirthDate (dd/MM/yyyy): ");
        String birthDate = scan.nextLine();
        return new Contact (name, phoneNumber, birthDate);
    }

    public static Contact[] contactData() {
        return new Contact[] {
                new Contact("John Doe", "+91 5551234567", "01/01/1985"),
                new Contact("Jane Smith", "+91 5559876543", "14/02/1990"),
                new Contact("Alice Johnson", "+91 5553456789", "30/03/1975"),
                new Contact("Bob Brown", "+91 5555678910", "25/12/2000"),
                new Contact("Charlie Davis", "+91 5551112222", "04/07/1983"),
                new Contact("Diana White", "+91 5553334444", "18/11/1997"),
                new Contact("Ethan Green", "+91 5555556666", "22/05/1988"),
                new Contact("Fiona Black", "+91 " + "5557778888", "31/10/2002")
        };
    }

    public static void displayContact(ContactManager passedContactManagerObject) {
        for (int i = 0; i < contactData().length; i++) {
            System.out.println(passedContactManagerObject.getContact(i));
            System.out.println("\n");
        }
    }
}
