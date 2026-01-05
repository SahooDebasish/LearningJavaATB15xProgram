package ex_04_Operators;

public class Lab041_Operator_Logical {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a); // ! means not or reverse

        boolean b = true;
        System.out.println(!!b); // !! 2 times reverse

        boolean c = true || false;
        System.out.println(c);  // Or operator- True, false- true based on table

       boolean d = true && false;
        System.out.println(d);  // and operator- follow table- true false - false


    }
}
