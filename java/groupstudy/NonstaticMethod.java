package groupstudy;

public class NonstaticMethod {
    void group(){
        System.out.println("children");

    }

    public static void main(String[] args) {
        NonstaticMethod group = new NonstaticMethod();
        group.group();
    }
}
