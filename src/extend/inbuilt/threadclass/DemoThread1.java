package extend.inbuilt.threadclass;

public class DemoThread1  extends Thread{

    public DemoThread1(){
        start();  // it will start or initialize the thread.
    }

    @Override
    public void run(){
       try {
           System.out.println("Part1 - printing numbers in Ascending Order 1-10 ");
           for(int i=1; i<=10; i++) {
               System.out.println("i is : " + i);
               Thread.sleep(1);
           }
       } catch (Exception e) {
           System.out.println("Exception Occured : " + e.getMessage());
       }
    }
}
