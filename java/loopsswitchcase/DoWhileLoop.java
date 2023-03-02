package loopsswitchcase;

public class DoWhileLoop {
    public static void main(String[] args) {
        // print 10 even number
        int i=0;
       do {
           System.out.println(i);
           i+=2;

    }while(i<=20);

       //print 10 odd number
        int h=1;
        do {
            System.out.println(h);
            h+=2;
        } while (h<=20);

        // print table of 6
        int j=1;
        do {
            System.out.println("6 *" +j+"=" + 6*j);
            j++;
        } while (j<=10);







    }
}
