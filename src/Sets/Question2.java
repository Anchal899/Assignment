package Sets;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("anchal");
        al.add("khushi");
        al.add("kritika");
        al.add("kritika");
        al.add("sanya");
        al.add("aanchal");
        Set<String> set=new TreeSet<>();
        for(String name:al) {
            System.out.println(name);
            set.add(name);
        }
        System.out.println("After removing duplicates and sorting the names");
        System.out.println(set);


    }
}
