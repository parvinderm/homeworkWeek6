package homework6;
/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

public class Celsius {    //Declared the Class
    public static void main(String[] args){   //Main Method Or Predefined Method
        float Fahrenheit,Celsius;
         Fahrenheit = 86;   //

         Celsius = ((Fahrenheit-32)*5)/9;  //Fahrenheit to Celsius conversion formula

        System.out.println("Temperarture in degree Celsius is : "+Celsius);



    }
}
