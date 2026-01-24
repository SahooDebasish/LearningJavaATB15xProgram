package ex_09_Switch;

public class Lab_094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
// for above jdk 13 only
        // > function not applied on this multiple cases
        //new syntax can add multiple cases or conditions for same outut in one
    }
}
