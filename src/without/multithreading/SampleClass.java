package without.multithreading;

public class SampleClass {

    public static void main(String[] args) {

       System.out.println("Part1 - printing numbers in Ascending Order 1-10 ");
       for(int i=1; i<=10; i++) {
           System.out.println("i is : " + i);
       }

        System.out.println("Part2 - printing numbers in Descending Order 10-1");
        for(int j=10; j>=1; j--) {
            System.out.println("j is : " + j);
        }

    }
}
