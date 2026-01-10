package ex_07_Increment_Decrement_Op;

public class Lab_076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // divide
        // A- ++a -> 11, a -> 11
        // +
        // B- ++a -> 12
        // A + B -> 23
        // Exp and Result Table - ERT Table
        // Line No | a | A | B
        // 5       | 10 | NA | NA
        // 6       | NA | 11 | 12 - Print -23
        // 7       | 12 -- Print
    }
}
