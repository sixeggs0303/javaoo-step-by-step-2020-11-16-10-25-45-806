package practice09;

import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private final LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.classes = klass;
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
        for (Klass klass : getClasses()) {
            if (klass.isIn(student)) return true;
        }
        return false;
    }
}
