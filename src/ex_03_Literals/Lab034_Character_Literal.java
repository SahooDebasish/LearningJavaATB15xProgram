package ex_03_Literals;

public class Lab034_Character_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+ ----all are char literal
        // char c2 = "A"; --"" is not a literal, it's String (bunch of character)
        char c3 = 'B';
        System.out.println(c3);
        char c9 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space is also a character

        // Escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("DebasishSahoo");
        System.out.println("Debasish"+new_line+"Sahoo");
        // System.out.println("Debasish/nSahoo");   not /n, should be \n
        System.out.println("Debasish\nSahoo");
        System.out.println("Debasish"+tab_line+"Sahoo");
        System.out.println("Debasish"+back_space+"Sahoo");
        System.out.println("-----");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
        char c10 = 'A';
        //characters are integral no. // ASCII dec value (limited numbers) - A -> 65


        char ruppes = '₹';
        System.out.println(ruppes);


        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

    }
}
