
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;


public class DatabaseTest {

    @Test
    public void capacityIsExactly16Integers() throws OperationNotSupportedException {

        Database database = new Database(new Integer[16]);

        if(database.getElements().length != 16){
            throw new OperationNotSupportedException();
        }
    }

    @Test
    public void addAddsAnElementAtTheNextFreeCell() throws OperationNotSupportedException {
        Database database = new Database(new Integer[8]);

        database.add(3);

        System.out.println(database.getElements().length);
    }

    @Test
    public void removeSupportsRemovingLastIndex() throws OperationNotSupportedException {
        Database database = new Database(new Integer[1]);

        database.remove();

        System.out.println(database.getElements().length);
    }

    @Test
    public void constructorShouldTakeIntegersOnly() throws OperationNotSupportedException {
        int elements = 15;

        Database database = new Database(elements);



    }
}
