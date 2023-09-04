package n_pojo_javabeans;


/*
The POJO class in java must NOT extend predefined classes.
The POJO class in java must NOT implement prespecified interfaces.
The POJO class in java must NOT have any prespecified annotation.

The POJO class in java should ALWAYS be public.
The POJO class in java should ALWAYS have a public default constructor.
The POJO class in java MAY contain the argument constructor.
The objects of the POJO class in java should contain public Getters and Setters so that the other Java programs can access object values.
The access modifiers for the objects in the POJO class of java COULD be public, private, or protected.
The instance variables for the objects in the POJO class of java should be private for better security.
 */

public class StudentPOJO {
    int roll;
    String name;
    private double score;


    // default constructor
    public StudentPOJO () {

    }

    public StudentPOJO(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
