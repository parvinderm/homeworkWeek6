package homework6;
/*Write a Java program to print the area and perimeter of a rectangle.*/

public class Print_Area_Perimeter { //Declare the Class
    public static void main(String[] args) {  //Main Method or Predefined Method
          //Primitive datatype
        float width = 5.5f;      //Declare Local Variable
        float height = 8.5f;     //Declare Local Variable
        float area = width * height;
        float perimeter = 2 * (width +height);
       //Concatenation to add two strings
        System.out.println("Area of rectangle is :"+width*height);
        System.out.println("Perimeter of rectangle is :"+2*(width+height));



    }
}
