import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question12 extends FileNotFoundException {
    public static void main(String[] args) {
        try{
            File file=new File("src/questions.txt");

            Scanner sc=new Scanner(file);
            Map<String,Integer> frequency=new HashMap<>();
            while(sc.hasNext()){
                String word=sc.next().toLowerCase();
                if(frequency.containsKey(word)){
                    frequency.put(word,frequency.get(word)+1);
                }
                else{
                    frequency.put(word,1);
                }
            }

            for(String word: frequency.keySet()){
                System.out.println(word+" occured "+frequency.get(word)+" times in the questions file");
            }
        }
        catch(Exception ex){
            System.out.println("Exception occured: "+ex);
        }

    }
}
