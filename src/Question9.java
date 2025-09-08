import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
