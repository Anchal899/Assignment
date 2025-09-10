package Multithreading.CreatingAndManagingThreads;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable thread finished.");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finished.");
    }
}
public class Question1 extends Thread{
    public static void main(String[] args) {
        Thread myRunnable=new Thread(new MyRunnable());
        MyThread myThread=new MyThread();

        myRunnable.start();
        myThread.start();


    }
}

