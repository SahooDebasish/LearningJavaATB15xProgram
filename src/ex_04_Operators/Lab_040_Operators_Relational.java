package ex_04_Operators;

public class Lab_040_Operators_Relational {
    public static void main(String[] args) {

        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30 , gives always give result in boolean
        System.out.println(c);

        int age_deb = 33;
        int age_debasish = 34;

        boolean result = age_debasish >= age_deb;
        System.out.println(result);
    }
}