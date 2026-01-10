package Task;

public class dec_26_Incre_Decre_02 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ * ++a;
        System.out.println(b);
        // divide
        // A--> a++ --> 3  a --> 4
        // B--> ++a --> 5  a --> 5
    }
}
