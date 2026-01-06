package ex_05_TypeCasting;

public class Lab061_Typecasting_Used {
    public static void main(String[] args) {
        int salary = 100;
        float NSR_Tax = 18.45f;
        //int total = salary+ NSR_Tax; // Narrowing - Implicit
       // int total = salary + (int)NSR_Tax; // Narrowing - explicit
        // System.out.println(total); // output- 118, we loose .45
// explicit will be in ()
        float total = salary+ NSR_Tax; // widening - Implicit
       //  float total1 = (float) salary+ NSR_Tax; // widening - explicit
        // allowed but not required- explici
        System.out.println(total);
    }
}
