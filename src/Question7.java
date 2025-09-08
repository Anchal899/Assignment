import java.util.LinkedList;
import java.util.*;

public class Question7 {
    private static Queue<Integer> queue;
    public Question7() {
        queue = new LinkedList<>();
    }
    public void enqueue(int number){
        queue.offer(number);

    }

    public void dequeue(){
        if(queue.isEmpty()){
            System.out.println("Nothing to remove");
        }
        queue.poll();


    }
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println(queue);
    }

    public int peekElement(){
        return queue.peek();
    }

    public static void main(String[] args) {
        Question7 myQueue = new Question7();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.display();

        System.out.println("Peek: " + myQueue.peekElement());

        myQueue.dequeue();
        myQueue.display();




    }
}
