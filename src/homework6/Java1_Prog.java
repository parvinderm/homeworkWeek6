package homework6;

//Declare Instance and static Variables
//Declare Instance Method
//Declare static Method
//Calling :-Instance and Static variables  to Instance  and static method
//Declare Main Method
//Calling :-Instance and static method to Main method


public class Java1_Prog {

    int a = 35; //Declared Instance Variable
    double e = 23.25;  //Declared Instance Variable
    static int b = 30;  //Declared static Variable
    static String name = "Sonia";  //Declared static Variable

    public void m3()  //Declared Instance Method
    {
        System.out.println(a);  //Called Instance Variable to Instance Method Directly
        System.out.println(e);   //Called Instance Variable to Instance Method Directly
        System.out.println(Java1_Prog.b);  //Called static variable using Class name
        System.out.println(Java1_Prog.name);  //Called static variable using Class name

    }
    static public void m4()  //Declared Static Method
    {
        Java1_Prog s = new Java1_Prog();
        System.out.println(s.a);  // Called Instance Variable to static method by using object name
        System.out.println(s.e);  //Called Instance Variable to static method by using object name
        System.out.println(b);   //Called static Variable to static method Directly
        System.out.println(name);  //Called static Variable to static method Directly
    }

    public static void main(String[] args) {   //Main Method or Pre Defined method
        Java1_Prog f = new Java1_Prog();
        f.m3();  //Called Instance method to Static method using object name
        m4();   //Called static method to main method directly
    }





}
