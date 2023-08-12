package i_abstract_interface.abstract_class;

public class Main {
    public static void main(String[] args) {
        Parent child = new Child(20);
        child.run(); // -> Child is running
        System.out.println(child.getX()); // -> 20

        // Parent parent = new Parent(); // cannot instantiate an abstract since it has undefined (only declared) methods

        // But, only way to create object of parent is by overriding the methods;
        Parent parent = new Parent(10) {
            // overriding the run method while creating the object of the parent
            @Override
            void run() {
                System.out.println("Parent is running");
            }
        };
        parent.run(); // -> Parent is running
    }
}
