package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        int my_age = 21;
        String result = my_age > 18 ? (my_age > 25 ? "You can drink": "You can't drink") : "No you can't go to GOA";
        System.out.println(result);
    }
}
