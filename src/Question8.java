import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter the size of ArrayList: ");
        int size=sc.nextInt();
        while(size-->0){
            al.add(sc.next());
        }
        System.out.println("ArrayList: ");
        Set<String> set=new HashSet<>();
        for(String name:al) {
            System.out.println(name);
            set.add(name);
        }
        System.out.println("After removing duplicates");
        System.out.println(set);


    }
}
