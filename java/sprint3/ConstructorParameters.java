package sprint3;

import java.time.Year;

public class ConstructorParameters {
    int modelYear;
    String modelName;

    ConstructorParameters(int year,String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {

        ConstructorParameters   obj = new ConstructorParameters( 2022, "Toyota");
        System.out.println(obj.modelYear+" "+ obj.modelName);


    }

}
