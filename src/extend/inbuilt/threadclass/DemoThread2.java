package extend.inbuilt.threadclass;

public class DemoThread2 extends Thread{

    public DemoThread2(){
        start();
    }

    public void run(){
        try {
            System.out.println("Part2 - printing numbers in Descending Order 10-1");
            for(int j=10; j>=1; j--) {
                System.out.println("j is : " + j);
                Thread.sleep(1);
            }
        }  catch (Exception e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
    }
}
