package homework6;
/*Write a Java programme using the following steps.*/

//Declare Instance method
//Calling :- Instance Variable to Instance method
//Declare main method or predefined method
//Calling Instance method to main method


public class Instance_Variable {
    int a = 20;  //Declared Instance Variable
    double d = 20.10; //Declared Instance Variable
    String name = "Sonia"; //Declared Instance Variable

    void m1(){  //Declare Instance method

        System.out.println(a);
        System.out.println(d);
        System.out.println(name);

    }

    public static void main(String[] args) {  //Main method or Predefined method

        Instance_Variable x = new Instance_Variable();
        x.m1();   //Calling Instance Method to main method using object name

    }



}
