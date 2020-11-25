package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (getKlass() == null ? "No Class" : getKlass().getDisplayName()) + ".";
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. I " + (student.getKlass().getNumber() == this.getKlass().getNumber() ? "" : "don't ") + "teach " + student.getName() + ".";
    }
}
