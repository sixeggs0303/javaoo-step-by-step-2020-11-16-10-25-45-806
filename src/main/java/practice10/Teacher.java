package practice10;

import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private final LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> klass.setTeacher(this));
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String joinClasses = (getClasses().size() == 0 ? "No Class" : joinClassesNumberToString());
        return super.introduce() + " I am a Teacher. I teach " + joinClasses + ".";
    }

    private String joinClassesNumberToString() {
        return "Class " + getClasses().stream().map(Klass::getNumber).map(Objects::toString).collect(Collectors.joining(", "));
    }

    public String introduceWith(Student student) {
        String isTeachingString = isTeaching(student) ? "" : "don't ";
        return super.introduce() + " I am a Teacher. I " + isTeachingString + "teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return this.getClasses().stream().anyMatch(klass -> klass.isIn(student));
    }

    public void notifyJoinClass(String className, String studentName) {
        System.out.print("I am " + this.getName() + ". I know " + studentName + " has joined " + className + ".\n");
    }

    public void notifyBecomeMonitor(String className, String studentName) {
        System.out.print("I am " + this.getName() + ". I know " + studentName + " become Leader of " + className + ".\n");
    }
}
