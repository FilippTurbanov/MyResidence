import java.util.Scanner;

public class Homework3_extra8 {
    public static void main(String[] args) {
        // На прямоугольной декартовой системе координат на плоскости заданы три точки с соответствующими координатами
        // в виде пары значений (x,y). Определить, являются ли данные точки вершинами треугольника. И если да, то
        // дополнительно определить, является ли данный треугольник прямоугольным.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты первой точки: ");
        double x1 = in.nextInt();
        double y1 = in.nextInt();
        System.out.print("Введите координаты второй точки: ");
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        System.out.print("Введите координаты третьей точки: ");
        double x3 = in.nextInt();
        double y3 = in.nextInt();
        double side1, side2, side3;
        // Расстояние между двумя точками равно квадратному корню из суммы квадратов разностей координат по каждой оси.
        side1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        side2 = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
        side3 = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        // Треугольник можно построить при условии, когда каждая сторона меньше суммы двух других.
        if ((side1 < side2 + side3) && (side2 < side3 + side1) && (side3 < side1 + side2)) {
            System.out.println("Данные вершины образуют треугольник!");
            // По теореме Пифагора определим, является ли треугольник прямоугольным. Сперва определим гипотенузу.
            int ifItTrue = 0;
            if (Math.pow(side1, 2) == (Math.pow(side2, 2) + Math.pow(side3, 2)))
                ifItTrue++;
            else if (Math.pow(side2, 2) == (Math.pow(side3, 2) + Math.pow(side1, 2)))
                ifItTrue++;
            else if (Math.pow(side3, 2) == (Math.pow(side1, 2) + Math.pow(side2, 2)))
                ifItTrue++;
            else
                System.out.println("Но данный треугольник не прямоугольный.");
            if (ifItTrue > 0)
                System.out.println("И данный треугольник является прямоугольным!");
        }
        else
            System.out.println("К сожалению, данные вершины не образуют треугольник!");
    }
}
