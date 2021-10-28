public class NinthGrader extends Student{
    public NinthGrader(String firstName, String lastName) {
        super(firstName, lastName, 2025);
    }
    public NinthGrader() { //default constructor without arguments
        super("Bob", "Smith", 2025);
    }
    public void doSomething() {
        System.out.println("I am preparing for a Harkness discusssion!");

    }
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (Ninth Grader)";
    }
}
