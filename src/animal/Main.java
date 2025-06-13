package animal;

public class Main {
    public static String publicField = "나는 퍼블릭 하다.";
    private static String privateField = "나는 프리베이트 하다.";
    protected static String protectedField = "나는 프로텍티드 하다.";
     static String defaultField = "나는 디폴트 하다.";


    public static void main(String[] args) {
        System.out.println(publicField);
        System.out.println(privateField);
        System.out.println(protectedField);
        System.out.println(defaultField);
    }
}
class Child extends Main {
    public static void main(String[] args) {
        System.out.println(publicField);
        System.out.println(privateField);
        System.out.println(protectedField);
        System.out.println(defaultField);
    }
}