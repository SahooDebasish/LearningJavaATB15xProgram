package ex_07_Increment_Decrement_Op;

public class Lab_074_Advance_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // Divide and rule---
        // A -> a++ -> A = 10, a = 11
        // +
        // B -> a -> 11
        // A+B -> 10 + 11
        //  Exp and Result Table - ERT Table
        // Line No | a  | Expression (Print)
        // 5       | 10 | NA
        // 6       | 11 | 21
    }
}
