package practice10;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Student.";

        if (this.equals(this.klass.getLeader())) {
            return result + " I am Leader of " + this.getKlass().getDisplayName() + ".";
        }
        
        return result + " I am at " + this.getKlass().getDisplayName() + ".";
    }
}