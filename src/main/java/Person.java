public class Person {
    private String firstName;
    private String lastName;
    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String str){
        this.firstName = str;
    }
    public void setLastName(String str){
        this.lastName = str;
    }
    public void doSomething() {
        System.out.println("I am watching netflix.");
    }
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
