package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Teacher teacher;
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
        if (!this.isIn(student)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        if (this.getTeacher() != null) {
            this.getTeacher().notifyBecomeMonitor(this.getDisplayName(), student.getName());
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void appendMember(Student student) {
        this.students.add(student);
        if (this.getTeacher() != null) {
            this.getTeacher().notifyJoinClass(this.getDisplayName(), student.getName());
        }
    }

    public boolean isIn(Student student) {
        return this.students.contains(student);
    }
}
