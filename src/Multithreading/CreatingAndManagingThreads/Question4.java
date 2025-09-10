package Multithreading.CreatingAndManagingThreads;


class NewThread implements Runnable{
    @Override
    public void run() {

        try{
            System.out.println("Name: "+Thread.currentThread().getName()+" and priority is "+Thread.currentThread().getPriority());

            for(int counter=0;counter<1000;counter++){
                System.out.println("Counter of "+Thread.currentThread().getName()+" becomes "+counter);
            }
            System.out.println("Thread finished → Name: "
                    + Thread.currentThread().getName()
                    + " | Priority: " + Thread.currentThread().getPriority());
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


public class Question4 {
    public static void main(String[] args) {
        Thread t1=new Thread(new NewThread());
        Thread t2=new Thread(new NewThread());
        Thread t3=new Thread(new NewThread());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
//   4. Thread Priority: Create three threads with different priorities
//   (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY).
//   Each thread should print its name and priority,
//   then run a loop that increments a counter a large number of times.
//   Observe the order in which the threads execute and how their priorities
//   affect their execution.
