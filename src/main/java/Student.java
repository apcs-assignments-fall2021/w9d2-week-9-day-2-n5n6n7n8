public class Student extends Person {
    private int classYear;

    public Student(String firstName, String lastName, int classYear){
        super(firstName, lastName); //calls constructor from parent class //you can call super with a different
        this.classYear = classYear; //number of arguments depending on what constructor you want to call
    }
    public int getClassYear() {
        return this.classYear;
    }
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
    //method overriding
    @Override
    public void doSomething() {
        System.out.println("I'm doing homework.");
    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
    }
//
//    // A constructor that assumes that a default student is a ninth-grader
//    public Student(String a, String b) {
//        super(a, b);
//        this.classYear = 2025;
//    }
//
//    // A default/no-argument constructor
//    public Student() {
//        super("Jerry", "Seinfeld");
//        this.classYear = 2024;
//    }
}
