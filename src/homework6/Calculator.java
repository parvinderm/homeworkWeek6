package homework6;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.*/

public class Calculator {    //Declare Class
    public static void main(String[] args) {    //Main method
        Calculator t = new Calculator();     //Create an Object
        subtraction(10,20);   //Called static method Directly
        t.Division(10,5);     //Called Instance method using object name
        addition(10,20);     //Called static method directly
        t.multiplication(10,20); //Called instance method using object



    }
       //No return type with parameters
    public static void subtraction(int a,int b ){          //Declare static method

        //Concatenation to add two
        System.out.println("Subtraction is"+(a-b));

    }
    //No return type with parameters
    public static void addition(int a,int b){      //Declare Static Method
        // Concatenation to add two strings
        System.out.println("Addition is"+(a+b));

    }
      //No return type with parameter
    public void Division(int a,int b){     //Declare Instance Method

        System.out.println(a/b);
    }
      //No return type with parameters
    public void multiplication(int a, int b){    //Declare Instance Method

        //Concatenation to add two Strings
        System.out.println("Multiplication is "+(a*b));
    }





}
