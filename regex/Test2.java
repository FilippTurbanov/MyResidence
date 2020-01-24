package regex;

import regex.api.IWarAndPiece;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 implements IWarAndPiece {
    public Test2() throws IOException {
    }

    String fileName1 = "src/regex/Война и мир.txt";
    String fileName2 = "src/regex/Война и мир2.txt";
    List<String> part1 = Files.readAllLines(Paths.get(fileName1), StandardCharsets.UTF_8);
    List<String> part2 = Files.readAllLines(Paths.get(fileName2), StandardCharsets.UTF_8);

    @Override
    public int peaceSearch() {
        Pattern pattern = Pattern.compile("мир", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        StringBuilder book1 = new StringBuilder();
        StringBuilder book2 = new StringBuilder();
        int matches = 0;
        for (String b : part1) {
            book1.append(b);
        }
        for (String b : part2) {
            book2.append(b);
        }
        Matcher matcher1 = pattern.matcher(book1.toString());
        while (matcher1.find())
            matches++;
        Matcher matcher2 = pattern.matcher(book2.toString());
        while (matcher2.find())
            matches++;
        return matches;
    }

    @Override
    public int warSearch() {
        Pattern pattern = Pattern.compile("война", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        StringBuilder book1 = new StringBuilder();
        StringBuilder book2 = new StringBuilder();
        int matches = 0;
        for (String b : part1) {
            book1.append(b);
        }
        for (String b : part2) {
            book2.append(b);
        }
        Matcher matcher1 = pattern.matcher(book1.toString());
        while (matcher1.find())
            matches++;
        Matcher matcher2 = pattern.matcher(book2.toString());
        while (matcher2.find())
            matches++;
        return matches;
    }

    @Override
    public int andSearch() {
        Pattern pattern = Pattern.compile("и", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        StringBuilder book1 = new StringBuilder();
        StringBuilder book2 = new StringBuilder();
        int matches = 0;
        for (String b : part1) {
            book1.append(b);
        }
        for (String b : part2) {
            book2.append(b);
        }
        Matcher matcher1 = pattern.matcher(book1.toString());
        while (matcher1.find())
            matches++;
        Matcher matcher2 = pattern.matcher(book2.toString());
        while (matcher2.find())
            matches++;
        return matches;
    }

    @Override
    public int customSearch() {
        Scanner in = new Scanner(System.in);
        System.out.print("Искать совпадения с: ");
        String forSearch = in.nextLine();
        Pattern pattern = Pattern.compile(forSearch, Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        StringBuilder book1 = new StringBuilder();
        StringBuilder book2 = new StringBuilder();
        int matches = 0;
        for (String b : part1) {
            book1.append(b);
        }
        for (String b : part2) {
            book2.append(b);
        }
        Matcher matcher1 = pattern.matcher(book1.toString());
        while (matcher1.find())
            matches++;
        Matcher matcher2 = pattern.matcher(book2.toString());
        while (matcher2.find())
            matches++;
        System.out.print("Слово \"" + forSearch + "\" в книге \"Война и мир\" встречается ");
        return matches;
    }

    public static void main(String[] args) throws IOException {
        Test2 go = new Test2();
        System.out.println("Слово \"мир\" в книге \"Война и мир\" встречается " + go.peaceSearch() + " раз.");
        System.out.println("Слово \"война\" в книге \"Война и мир\" встречается " + go.warSearch() + " раз.");
        System.out.println("Союз \"и\" в книге \"Война и мир\" встречается " + go.andSearch() + " раз.");
        int matches = go.customSearch();
        System.out.println(matches + " раз.");
    }
}
