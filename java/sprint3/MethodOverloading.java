package sprint3;

public class MethodOverloading {

    static int mymain(int x,int y){
        return x+y;
    }
    static double mymain(double x,double y){
        return x+y;

    }

    public static void main(String[] args) {
        int total =mymain(14,52);
        System.out.println(total);
        double result =mymain(12.5,20.6);
        System.out.println(result);

    }

}
