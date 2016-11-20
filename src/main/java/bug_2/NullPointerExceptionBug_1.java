package bug_2;

    public class NullPointerExceptionBug_1 {

    static String msg = new String();

    public static void main(String[] args) {

        String handle = Test.handle(new Formatter(), msg);

        System.out.println(handle);
    }
}

class Formatter {
    public String format(String value) {
        return "[" + value + "]";
    }
}

class Test {
    public static String handle(Formatter f, String s) {
        if (s.isEmpty()) {
            return "(none)";
        }
        return f.format(s.trim());
    }
}
