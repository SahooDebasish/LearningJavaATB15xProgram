package ex_05_TypeCasting;

public class Lab060_Typecasting {
    public static void main(String[] args) {
        long phone = 987463526l;
      //  short s = phone; // Narrowing - implicit - is never allowed
        short s1 = (short)phone; // Narrowing - Explicit
    }
}
