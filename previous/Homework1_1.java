package previous;

public class Homework1_1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        byte z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11;
        z1 = (byte)(~a); // 00101010 = 11010101 (-43)
        System.out.println(z1);
        z2 = (byte)(~b); // 00001111 = 11110000 (-16)
        System.out.println(z2);
        z3 = (byte)(a & b); // 00101010 & 00001111 = 00001010 (10)
        System.out.println(z3);
        z4 = (byte)(a | b); // 00101010 | 00001111 = 00101111 (47)
        System.out.println(z4);
        z5 = (byte)(a ^ b); // 00101010 ^ 00001111 = 00100101 (37)
        System.out.println(z5);
        z6 = (byte) (a >> 3); // 00101010 = 00000101 (5)
        System.out.println(z6);
        z7 = (byte)(b >> 3); // 00001111 = 00000001 (1)
        System.out.println(z7);
        z8 = (byte)(a >>> 3); // 00101010 = 00000101 (5)
        System.out.println(z8);
        z9 = (byte)(b >>> 3); // 00001111 = 00000001 (1)
        System.out.println(z9);
        z10 = (byte)(a << 3); // 00101010 = 01010000 (80)
        System.out.println(z10);
        z11 = (byte)(b << 3); // 00001111 = 01111000 (120)
        System.out.println(z11);
        System.out.println("---------------------");
        a = -42;
        b = -15;
        z1 = (byte)(~a); // 11010110 = 00101001 (41)
        System.out.println(z1);
        z2 = (byte)(~b); // ‭11110001‬ = 00001110 (14)
        System.out.println(z2);
        z3 = (byte)(a & b); // 11010110 & ‭11110001 = 11010000 (-48)
        System.out.println(z3);
        z4 = (byte)(a | b); // 11010110 | ‭11110001 = 11110111 (-9)
        System.out.println(z4);
        z5 = (byte)(a ^ b); // 11010110 ^ ‭11110001 = 00100111 (39)
        System.out.println(z5);
        z6 = (byte)(a >> 3); // 11010110 = 11111010 (-6)
        System.out.println(z6);
        z7 = (byte)(b >> 3); // ‭11110001 = 111‭11110 (-2)
        System.out.println(z7);
        z8 = (byte)(a >>> 3); // 11010110 = 00011010 (26) !!! не совпадает значение с выводом Idea (-6)
        System.out.println(z8);
        z9 = (byte)(b >>> 3); // ‭11110001 = 000‭11110 (30) !!! не совпадает значение с выводом Idea (-2)
        System.out.println(z9);
        z10 = (byte)(a << 3); // 11010110 = 10110000 (-80)
        System.out.println(z10);
        z11 = (byte)(b << 3); // ‭11110001 = 10001000 (-120)
        System.out.println(z11);
        //операции с присваиванием (  &=   |=   ^=   >>=   <<=   >>>=  ) выполняются аналогичным образом,
        //а результат записывается в переменную, например:
        //a &= b - это то же самое, что a = a & b.

    }

}
