package ex_09_Switch;

public class Lab_096_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
// break missing in default and keep default in first