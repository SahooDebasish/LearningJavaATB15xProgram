package ex_02_Variables_DataTypes;

import java.util.Arrays;

public class Lab024_printF {
    public static void main(String[] args) {
        // System.out.println("it will add a new line");
        // System.out.print("it will not add a new line");
        System.out.printf("This is normal text");
        System.out.printf("No new line");

        int a = 10;
       // System.out.println("value of a is ->"+a);
        // System.out.print("value of a is ->"+a);
        System.out.printf("Value of a is %d",a);
        // %d -> int, byte, long, short - data type
        //%s -> String
        //%f -> float, double
        //%b -> boolean

        int aa = 100;
        int bb = 121;
        System.out.printf("when you multiply aabb- basically formatting output-result is = %d * %d", aa, bb);

    }
}
