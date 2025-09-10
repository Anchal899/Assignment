package Multithreading.CreatingAndManagingThreads;

class myNewThread implements Runnable{
    @Override
    public void run() {

        try{

            while(!Thread.currentThread().isInterrupted())
            System.out.println("The thread is still running");
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        Thread t1=new Thread(new myNewThread());
        t1.start();
        try{
            // Let the worker run for 5 seconds (main thread sleeps)
            Thread.sleep(5000);

            t1.interrupt();
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
// 3. Thread Interrupt: Create a thread that continuously prints
// a message until it is interrupted. In the main thread, start the thread,
// let it run for 5 seconds, interrupt it, and then wait for it to terminate using join().