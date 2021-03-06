package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student student) {
        if (!this.students.contains(student)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }
}
