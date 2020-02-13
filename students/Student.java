package students;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentPatronymic;
    private byte mark;

    private List<Student> students_list = new ArrayList<>();
    private List<Student> filtered_students = new ArrayList<>();
    private List<Student> lucky_students = new ArrayList<>();
    private Random rnd = new Random();

    Student (String studentSurname, String studentName, String studentPatronymic, byte mark) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPatronymic = studentPatronymic;
        this.mark = mark;
    }

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
        students_list.clear();
        for (int i = 0; i < 100; i++) {
            setStudentSurname();
            setStudentName();
            setStudentPatronymic();
            setMark();
            students_list.add(new Student(getStudentSurname(), getStudentName(), getStudentPatronymic(), getMark()));
        }
    }

    private void setStudents_List(List<Student> students) {
        students_list.clear();
        students_list.addAll(students);
    }

    public void setStudents_list() throws IOException, ClassNotFoundException {
        try (FileInputStream start = new FileInputStream("students.txt")) {
            ObjectInputStream load = new ObjectInputStream(start);
            List<Student> students = (ArrayList<Student>) load.readObject();
            setStudents_List(students);
        } catch (FileNotFoundException e) {
            generateStudents_List();
            FileOutputStream stream = new FileOutputStream("students.txt");
            ObjectOutputStream save = new ObjectOutputStream(stream);
            save.writeObject(students_list);
            save.close();
        }
    }

    public List<Student> getStudents_list() {
        return this.students_list;
    }

    private void sortByMark(List<Student> students_list) {
        students_list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s2, Student s1) {
                if (s1.getMark() > s2.getMark()) {
                    return 1;
                } else if (s2.getMark() > s1.getMark()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public List<Student> getBadStudents() {
        return this.filtered_students;
    }

    public void setBadStudents() throws IOException {
        filtered_students.clear();
        filtered_students = students_list.stream()
                .filter(i -> i.getMark() < 7)
                .collect(Collectors.toList());
        FileOutputStream stream = new FileOutputStream("bad_students.txt");
        ObjectOutputStream save = new ObjectOutputStream(stream);
        save.writeObject(filtered_students);
        save.close();
    }

    private List<Student> setAndGetLuckyStudents() {
        int first = 0;
        int second = 0;
        int third = 0;
        while ((first == second) || (second == third) || (first == third)) {
            first = rnd.nextInt(filtered_students.size());
            second = rnd.nextInt(filtered_students.size());
            third = rnd.nextInt(filtered_students.size());
        }
        lucky_students.add(filtered_students.get(first));
        lucky_students.add(filtered_students.get(second));
        lucky_students.add(filtered_students.get(third));
        return lucky_students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentSurname='" + studentSurname + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPatronymic='" + studentPatronymic + '\'' +
                ", mark=" + mark +
                '}';
    }
}
