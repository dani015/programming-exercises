import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    @Test(expected = OperationNotSupportedException.class)
    public void ifNullThenThrowException() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator(null);

    }

    @Test
    public void moveFunctionWorks() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator("Stefcho", "Pesho");

        System.out.println(iterator.move());
    }

    @Test
    public void printFunctionWorks() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator("Stefcho", "Pesho");

        System.out.println(iterator.print());
    }

    @Test
    public void hasNextFunctionWorks() throws OperationNotSupportedException {
        ListIterator iterator = new ListIterator("Stefcho", "Pesho");

        System.out.println(iterator.hasNext());
    }
}
