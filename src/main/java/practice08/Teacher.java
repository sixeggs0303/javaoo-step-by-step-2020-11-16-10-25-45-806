package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
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
