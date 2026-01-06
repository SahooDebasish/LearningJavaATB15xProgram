package ex_05_TypeCasting;

public class Lab061_Extra_Examples_Char {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // widening

        int num = 45;
       // char letter = num; // Not possible
        char letter = (char) num; // widening- explicit
    }
}
