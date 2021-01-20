import java.io.Writer;

public class DefaultExample implements PrinterInterfac, WriterInterface {
    public static void main(String[] args) {
        System.out.println("This is test");

        WriterInterface myInterface = () -> {System.out.println("Executing functional method");};

        new DefaultExample().print("");
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub

    }

    public void print(String text) {
        WriterInterface.super.print("");
        PrinterInterfac.super.print("");
        
    }

}
