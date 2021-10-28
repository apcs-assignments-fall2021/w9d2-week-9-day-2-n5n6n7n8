import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class PersonClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person("John", "Bob");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println("What do you want to set the first name to?");
        String first = scan.nextLine();
        person.setFirstName(first);
        System.out.println("What do you want to set the last name to?");
        String last = scan.nextLine();
        person.setLastName(last);
        System.out.println(person + " will now do something:");
        person.doSomething();
    }
}