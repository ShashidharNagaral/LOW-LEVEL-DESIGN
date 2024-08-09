package a_introduction;

public class Student {

    /*
    NOTE: In java variable name can start with _ (underscore), $(dollar symbol) or by letters,
    a variable can then contain any of the below
    - letter
    - digit
    - $
    - _ (underscore)
    */

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
        // this(-1, "anonymous", 0.0F); // this will call primary constructor
    }

    // copy constructor
    public Student(Student newObject) {
        this.name = newObject.name;
        this.roll = newObject.roll;
        this.marks = newObject.marks;
    }

    @Override
    public String toString() {
        return this.name+" "+this.roll+" "+ this.marks;
    }

    public String getDetail() {
        return "name: " + this.name + "rollno.: "+ this.roll + "marks: "+ this.marks;
    }

    public void updateMarks(float marks) {
        this.marks = marks;
    }
}
