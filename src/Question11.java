import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Random random=new Random();
        int size=1000000;


        System.out.println("Time take by HashSet:");
        long start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            hashSet.add(random.nextInt());
        }
        long end=System.currentTimeMillis();
        System.out.println("To add the integers: "+(end-start));

        start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            hashSet.remove(index);
        }
        end=System.currentTimeMillis();
        System.out.println("To remove the integers: "+(end-start));

        start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            hashSet.contains(index);
        }
        end=System.currentTimeMillis();
        System.out.println("To check the integers: "+(end-start));

        System.out.println();
        System.out.println("Time take by TreeSet:");

        start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            treeSet.add(random.nextInt());
        }
        end=System.currentTimeMillis();
        System.out.println("To add the integers: "+(end-start));

        start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            treeSet.remove(index);
        }
        end=System.currentTimeMillis();
        System.out.println("To remove the integers: "+(end-start));

        start=System.currentTimeMillis();
        for(int index=0;index<size;index++){
            treeSet.contains(index);
        }
        end=System.currentTimeMillis();
        System.out.println("To check the integers: "+(end-start));

    }
}
