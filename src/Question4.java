import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> books=new TreeSet<>();

        System.out.println("Enter the number of books you want to add: ");
        int size=sc.nextInt();
        while(size-->0){
            System.out.println("Enter the book name: ");
            String book=sc.next();

            books.add(book);
        }
        for(String book:books) System.out.println(book+" has been added to the library catalog ");

    }
}
