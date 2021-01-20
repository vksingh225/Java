@FunctionalInterface
public interface WriterInterface {
    public void execute();

    public default void print(String text) {
        System.out.println("From Writer");
    }

    public static void print(int text) {
        System.out.println(text);
    }

    public static void printText(String text) {
        System.out.println(text);
    }
}
