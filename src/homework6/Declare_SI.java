package homework6;
/*Write a Java programme using the following steps.*/

//Calling :-Instance Variable to Instance Method
//Calling :-static variables to Instance method
//Calling :-Static Variable to static method
//Calling :-Static Variable to Instance Method
//Calling :-Instance Method to Main method
//Calling :-static Method to Main method

public class Declare_SI {
    int a = 25; //Declared Instance variable
    static String name = "Sonia";  //Declared static variable

     public void n1(){  //Declared Instance method
         System.out.println(a);   //Called Instance Variable Directly
         System.out.println(Declare_SI.name);   //Called Static Variable using Class name

    }

     public static void n2(){  //Declared Static method
         Declare_SI t = new Declare_SI();   //Create an Object
         System.out.println(t.a);  //Called Instance Variable to static method using object name
         System.out.println(Declare_SI.name);   //Called static variable to static method Class name
         System.out.println(name); //Called static variable to static method directly

     }

    public static void main(String[] args) {   //Main Method or Predefined method
         Declare_SI t = new Declare_SI();       //Create an Object
        t.n1();  //Called Instance Method to Main Method using object name
        n2();    //Called static method to Main Method Directly


    }




}
