public interface PrinterInterfac {
    public void execute();

    public default void print(String text) {
        System.out.println("From Printer");
    }
}
