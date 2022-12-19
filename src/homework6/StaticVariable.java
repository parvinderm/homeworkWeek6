package homework6;
/*Write a Java programme using the following steps.*/

//Calling :-static variable to static method
//Calling :-static method to main method
//Calling static method to main method

public class StaticVariable {

    static String name = "Rita";  //Declared Static variable
    static int a = 25;  //Declared static variable

    static void  m2 (){   //Declared static method
        System.out.println(name);  //Called static variable to static method directly
        System.out.println(a);    //Called static variable to static method directly

    }

    public static void main(String[] args) {    //Main Method

        m2(); //Called Static method to Static method Directly
    }


}
