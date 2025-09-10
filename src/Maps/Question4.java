package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question4 {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        Map<Integer,Integer> treeMap=new TreeMap<>();

        try{
            try{
                hashMap.put(null,1);
                hashMap.put(null,2);
                hashMap.put(null,3);
                hashMap.put(null,4);
                System.out.println("null values added in HashMap successfully");

            }catch(Exception ex){
                System.out.println("Exception occured in HashMap: "+ex);
            }
            try{
                treeMap.put(null,1);
                treeMap.put(null,2);
                treeMap.put(null,3);
                treeMap.put(null,4);

                System.out.println("null values added in TreeMap successfully");


            }catch(Exception ex){
                System.out.println("Exception occured in TreeMap: "+ex);
            }

        }catch(Exception ex){
            System.out.println("Exception occured: "+ex);
        }
    }
}

// 4. Null Handling: Experiment with inserting null keys
// and values into HashMap and TreeMap. Observe the behavior and exceptions that occur.
