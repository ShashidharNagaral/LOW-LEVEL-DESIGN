package a_introduction;

public class Student {
    private int roll;
    private String name;
    private float marks;

    // primary constructor
    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    // default constructor
    public Student() {
        new Student(0, "admin", 0.0f);
    }

    // copy constructor
    public Student(Student newObject) {
        this.name = newObject.name;
        this.roll = newObject.roll;
        this.marks = newObject.marks;
    }

//    @Override
//    public String toString() {
//        return this.name+" "+this.roll+" "+ this.marks;
//    }

    public String getDetail() {
        return "shashid";
    }

    public void updateMarks(float marks) {
        this.marks = marks;
    }
}
