package homework6;
/*Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output*/

public class Two_Numbers {  //Declared the Class
    public static void main(String[] args) {   //Main Method or PreDefined Method
        int dec = 5;
       //Converting to binary and representing it in a string
        String bin =  Integer.toBinaryString(dec);
        System.out.println(bin);


    }
}
