package person;
import animal.*;

public class Abc {
    public static void main(String[] args) {
        System.out.println(Main.publicField);
        System.out.println(Main.privateField);
        System.out.println(Main.protectedField);
        System.out.println(Main.defaultField);
    }
}
class Dog extends Main {
    public static void main(String[] args) {
        System.out.println(Main.publicField);
        System.out.println(Main.privateField);
        System.out.println(Main.protectedField);
        System.out.println(Main.defaultField);
    }
}