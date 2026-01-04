package ex_02_Variables_DataTypes;

public class Lab022_Numerics_data_types {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 'A';
        char c1 = '@';
        char c2 = '_';
        // int phone = '9847463601'; - not possible due to overflow because integer can store only 2,3,4,6,7,8,9
        long phone = 9847463601l;
        long phone01 = 9847463601L; // l 0r L (special character) in the end is used for long
        float f = 3.14f;
        float f1 = 3.14F; // f 0r F (special character) in the end is used for float
        double d = 3.142353736; // nothing required
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(phone);
        System.out.println(phone01);
        System.out.println(d);


    }
}
