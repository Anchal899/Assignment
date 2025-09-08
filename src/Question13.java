import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question13 {
    public static Map<String,Long> contacts= new TreeMap<>();
    public static void addToMap(String name, Long number) {
        contacts.put(name, number);
        System.out.println("Contact added.");
    }

    public static void removeFromMap(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void search(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + " -> " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Enter number: ");
                    Long numberAdd = sc.nextLong();
                    addToMap(nameAdd, numberAdd);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameRemove = sc.nextLine();
                    removeFromMap(nameRemove);
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String nameSearch = sc.nextLine();
                    search(nameSearch);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }



}
//2. Sorted Contact List: Create a contact list application that
// stores names and phone numbers in a TreeMap. Allow the user
// to add, remove, and search for contacts.
// The list should always be sorted alphabetically by name.
