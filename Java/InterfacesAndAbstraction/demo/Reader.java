package demo;

public class Reader implements Readable{
    @Override
    public void read() {
        System.out.println("Readable");
    }

    @Override
    public int readBytes() {
        return 42;
    }
}
