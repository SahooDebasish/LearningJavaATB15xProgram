package ex_06_Ternary_Operator;

public class Lab065_TO_Interview_Max_Two {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int max = (x > y) ? x : y;
        int min = (x > y) ? y : x;
        System.out.println(max);
        System.out.println(min);
    }
}
