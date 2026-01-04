package ex_04_Operators;

public class Lab038_Operator_Unary {
    public static void main(String[] args) {
        int a = +20;
        int a2 = 30; //by default, it is positive.
        int a1 = -10;
        int result = a+a1;
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}
