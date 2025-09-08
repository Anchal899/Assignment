import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> emails=new HashSet<>();
        System.out.println("Enter the size of Set: ");
        int size=sc.nextInt();
        while(size-->0){
            emails.add(sc.nextLine());
        }
        for(String name:emails) System.out.println(name);
    }
}
