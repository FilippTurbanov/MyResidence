package students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentPatronymic;
    private byte mark;

    Student (String studentSurname, String studentName, String studentPatronymic, byte mark) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPatronymic = studentPatronymic;
        this.mark = mark;
    }

    private List<Student> students_list = new ArrayList<>();
    private Random rnd = new Random();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName() {
        List<String> names = new ArrayList<>();
        Path path = Paths.get("students/names.txt");
        try (Stream<String> streamNames = Files.lines(path)){
            names = streamNames.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.studentName = names.get(rnd.nextInt(names.size()));
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname() {
        List<String> surnames = new ArrayList<>();
        Path path = Paths.get("students/surnames.txt");
        try (Stream<String> streamSurnames = Files.lines(path)){
            surnames = streamSurnames.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.studentSurname = surnames.get(rnd.nextInt(surnames.size()));
    }

    public String getStudentPatronymic() {
        return studentPatronymic;
    }

    public void setStudentPatronymic() {
        List<String> patronymics = new ArrayList<>();
        Path path = Paths.get("students/patronymics.txt");
        try (Stream<String> streamPatronymics = Files.lines(path)){
            patronymics = streamPatronymics.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.studentPatronymic = patronymics.get(rnd.nextInt(patronymics.size()));
    }

    public byte getMark() {
        return mark;
    }

    public void setMark() {
        this.mark = (byte) rnd.nextInt(11);
    }

    private void generateStudents_List() {
        for (int i = 0; i < 100; i++) {
            setStudentSurname();
            setStudentName();
            setStudentPatronymic();
            setMark();
            students_list.clear();
            students_list.add(new Student(getStudentSurname(), getStudentName(), getStudentPatronymic(), getMark()));
        }
    }

    private void setStudents_List(List<Student> students) {
        students_list.clear();
        students_list.addAll(students);
    }

    public List<Student> getStudents_list() throws IOException, ClassNotFoundException {
        try (FileInputStream start = new FileInputStream("students.txt")) {
            ObjectInputStream load = new ObjectInputStream(start);
            List<Student> students = (ArrayList<Student>) load.readObject();
            setStudents_List(students);
            return students_list;
        } catch (FileNotFoundException e) {
            generateStudents_List();
            return students_list;
        }
    }
}
