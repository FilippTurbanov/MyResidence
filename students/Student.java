package students;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Serializable{
    private String studentName;
    private String studentSurname;
    private String studentPatronymic;
    private byte mark;

    private List<Student> students_list = new ArrayList<>();
    private List<Student> filtered_students = new ArrayList<>();
    private List<Student> lucky_students = new ArrayList<>();
    private Random rnd = new Random();

    Student () {}

    Student (String studentSurname, String studentName, String studentPatronymic, byte mark) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPatronymic = studentPatronymic;
        this.mark = mark;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setStudents_list();
        student.sortByMark();
        student.setBadStudents();
        student.setLuckyStudents();
        List<Student> show = student.getUnluckyStudents();
        System.out.println("Список студентов, не получивших сертификат: ");
        for (Student s : show) {
            System.out.println(s);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName() throws IOException {
        List<String> names = new ArrayList<>();
        Path path = Paths.get("src/students/names.txt");
        try (Stream<String> streamNames = Files.lines(path)){
            names = streamNames.collect(Collectors.toList());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
        this.studentName = names.get(rnd.nextInt(names.size()));
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname() throws IOException {
        List<String> surnames = new ArrayList<>();
        Path path = Paths.get("src/students/surnames.txt");
        try (Stream<String> streamSurnames = Files.lines(path)){
            surnames = streamSurnames.collect(Collectors.toList());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
        this.studentSurname = surnames.get(rnd.nextInt(surnames.size()));
    }

    public String getStudentPatronymic() {
        return studentPatronymic;
    }

    public void setStudentPatronymic() throws IOException {
        List<String> patronymics = new ArrayList<>();
        Path path = Paths.get("src/students/patronymics.txt");
        try (Stream<String> streamPatronymics = Files.lines(path)){
            patronymics = streamPatronymics.collect(Collectors.toList());
        } catch (NoSuchFileException e) {
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

    private void generateStudents_List() throws IOException {
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

    private void sortByMark() {
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

    private void setLuckyStudents() {
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
    }

    public List<Student> getUnluckyStudents() throws IOException, ClassNotFoundException {
        ArrayList<Student> unlucky_list;
        try (FileInputStream start = new FileInputStream("bad_students.txt")) {
            ObjectInputStream load = new ObjectInputStream(start);
            unlucky_list = (ArrayList<Student>) load.readObject();
            for (Student s : lucky_students) {
                unlucky_list.remove(s);
            }
            FileOutputStream stream = new FileOutputStream("bad_students.txt");
            ObjectOutputStream save = new ObjectOutputStream(stream);
            save.writeObject(unlucky_list);
            save.close();
            return unlucky_list;
        } catch (FileNotFoundException e) {
            setBadStudents();
            return getUnluckyStudents();
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(students_list, student.students_list) &&
                Objects.equals(filtered_students, student.filtered_students) &&
                Objects.equals(lucky_students, student.lucky_students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students_list, filtered_students, lucky_students);
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {}

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {}

    private void readObjectNoData() throws ObjectStreamException {}
}
