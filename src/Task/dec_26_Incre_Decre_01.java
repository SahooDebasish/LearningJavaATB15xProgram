package Task;

public class dec_26_Incre_Decre_01 {
    public static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);
        // Divide:
        // A --> a++ -->  10, a--> 11
        // B--> a++ -->  11, a--> 12
        // C--> a++ -->  12, a--> 13
        // a--> A+B+C --> 33
        // line no| A | B | C
        // 6      |  | NA
        //
    }
}
