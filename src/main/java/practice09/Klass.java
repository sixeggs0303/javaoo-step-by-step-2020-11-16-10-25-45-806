package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private final List<Student> students = new ArrayList<>();

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
        if (!isIn(student)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }

    public boolean isIn(Student student) {
        return this.students.contains(student);
    }
}
