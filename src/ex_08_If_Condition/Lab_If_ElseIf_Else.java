package ex_08_If_Condition;
import java.util.Scanner;

public class Lab_If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();
       // int age = 34;
        if (age > 34){
            System.out.println("age > 34");
        }
        else if (age < 34){
            System.out.println("age < 34");
        }
        else{
            System.out.println("age == 34");
        }
        scanner.close();
    }
}
