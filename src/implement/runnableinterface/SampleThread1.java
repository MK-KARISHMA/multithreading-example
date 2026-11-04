package implement.runnableinterface;

public class SampleThread1 implements Runnable {

    public SampleThread1() {
        Thread thread1 = new Thread(this, "SampleThread1");
        thread1.start();
    }
    @Override
    public void run() {
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
