package sprint3;

import groupstudy.NonstaticMethod;

public class NonStatic {
    void method(){
        //Declare a variable
        int i=45;
        System.out.println(i);


    }

    public static void main(String[] args) {
        //create an object
        NonStatic main= new NonStatic();
        main.method();

        }
    }

