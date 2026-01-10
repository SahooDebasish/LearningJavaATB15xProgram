package ex_07_Increment_Decrement_Op;

public class Lab_075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // divide
        // A- a++ -> 10, a -> 11
        // +
        // B- ++a -> 12
        // A + B ->
        // Exp and Result Table - ERT Table
        // Line No | a | A | B
        // 5       | 10 | NA | NA
        // 6       | NA | 10 | 12 - Print -22
        // 7       | 12 -- Print
    }
}
