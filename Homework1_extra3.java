public class Homework1_extra3 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, z;
        // даны параметры длины и ширины домов 1 (a и b), 2 (c и d) и земельного участка (e и f)
        // необходимо определить, поместятся ли оба дома на участке, если стороны домов параллельны
        // сторонам участка
        a = 10;
        b = 8;
        c = 7;
        d = 5;
        e = 18;
        f = 8;
        z = 0;
        int sq1, sq2, sqE;
        sq1 = a * b;
        sq2 = c * d;
        sqE = e * f;
        if (sqE > (sq1 + sq2))
            if (((a+c)<e) || ((a+c)<f))
                if (b > d)
                    if ((b < e) || (b < f))
                        z += 1;
                    else if ((d < e) || (d < f))
                        z += 1;
            else if (((b+d)<e) || ((b+d)<f))
                if (a > c)
                    if ((a < e) || (a < f))
                        z += 1;
                    else if ((c < e) || (c < f))
                        z += 1;
            else if (((a+d)<e) || ((a+d)<f))
                if (b > c)
                     if ((b < e) || (b < f))
                         z += 1;
                     else if ((c < e) || (c < f))
                          z += 1;
            else if (((b+c)<e) || ((b+c)<f))
                        if (a > d)
                            if ((a < e) || (a < f))
                                z += 1;
                            else if ((d < e) || (d < f))
                                z += 1;
        if (z > 0)
            System.out.println("Дома поместятся на участке.");
        else
            System.out.println("Дома не поместятся.");
    }
}
