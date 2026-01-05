package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String first_name = "Debasish";
        String last_name = "Sahoo";

        System.out.println(first_name+last_name+a+b);
        // JVM- goes left to right -> first do concate then see integer but concate the a and b in second case also- DebasishSahoo1020

        // Lets see if reversed below

        System.out.println(a+b+first_name+last_name);
        // jvm perform first arthimatic operation then concate - 30DebasishSahoo

        System.out.println(first_name + last_name + (a + b));
        // output-DebasishSahoo30 - in bracket first it will do the arthima operation

        // BODMAS - Bracket of Div, mul, add, sub
        // 3 scenarios can be seen here
        // First of all, whenever it sees strings,it will do concatenation, and rest for the next
        // When it sees integers first, it will do mathematical operation nd second time also it will do concatenation for string
        // 3rd scenario first perform arhitm if its in bracket following bodmas but concatn string first then print the arthemat output
    }
}
