package practice05;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass(){
        return this.klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. " + (getKlass() == null ? "I teach No Class." : "I teach Class " + getKlass() + ".");
    }
}
