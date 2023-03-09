package groupstudy;

public class StaticVariables {
    static int j=11;
    double c=8.9;

    public static void main(String[] args) {
        //static variables can call directly in main method
        System.out.println(j);
        //for Nonstatic variables we have to create object.
        StaticVariables group =new StaticVariables();
        group.c=8.9;
        System.out.println("c:"+group.c);








    }
}
