package sprint3;

public class StaticMethodParameters {
    // create static methodParameters
    void group(String name,int year){
        System.out.println(name+""+year);

    }

    public static void main(String[] args) {
        StaticMethodParameters sir =new StaticMethodParameters();
        sir.group("jaymini",2023);

    }


}
