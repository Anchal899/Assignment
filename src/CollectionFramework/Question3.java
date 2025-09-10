package CollectionFramework;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,Integer> countries=new HashMap();
        System.out.println("Enter the size of Map: ");
        int size=input.nextInt();
        while(size-->0){
            System.out.println("Enter the country name: ");
            String country=input.next();
            System.out.println("Now, enter the country code: ");
            int code=input.nextInt();
            countries.put(country,code);
        }
        for(String country:countries.keySet()) System.out.println(country+" has the country code "+countries.get(country));
    }
}
