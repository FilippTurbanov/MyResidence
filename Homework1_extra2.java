public class Homework1_extra2 {
    public static void main(String[] args) {
        int s = 7707116;
        int sec, m, min, h, hour, day, d;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 24;
        int w = (d - day) / 7;
        System.out.println(s + " секунд " + "составляет: "+ w + " недель "+day+" дней "+hour+" часов "+min+" минут "+sec+" секунд.");
    }
}
