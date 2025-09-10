package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter the size of ArrayList: ");
        int size=input.nextInt();
        while(size-->0){
            al.add(input.next());
        }
        for(String name:al) System.out.println(name);
    }
}
