package homework6;
/*Write a Java program to swap two variables.*/

public class Swap_Two {
    public static void main(String[] args) {
        int x, y, temp;
         x = 30;
         y = 50;

        System.out.println("Before swapping :x ,y ="+x+","+ + y);
        temp = x;
        x = y;
        y = temp ;
        System.out.println("After swapping :x ,y  ="+x+","+ + y);

    }
}
