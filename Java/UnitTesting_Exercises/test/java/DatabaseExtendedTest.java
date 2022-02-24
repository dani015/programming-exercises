import org.junit.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;
import javax.xml.crypto.Data;
import java.util.Arrays;

public class DatabaseExtendedTest {

    @Test(expected = OperationNotSupportedException.class)
    public void multipleUserWithSameID() throws OperationNotSupportedException {
        Person person = new Person(32, "dis");
        Database database = new Database();

        database.add(new Person(32, "dave"));
        database.add(person);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void norNullsAndIDsArePresent() throws OperationNotSupportedException {
        int n = -1;
        Person person = new Person(n, null);
        Database database = new Database();

        database.add(person);


    }

    @Test
    public void removeTest() throws OperationNotSupportedException {
        Person person = new Person(32, "dis");
        Database database = new Database(person);


        database.add(new Person(32, "dum"));

        database.remove();

    }

    @Test(expected = OperationNotSupportedException.class)
    public void noUsernamePresent() throws OperationNotSupportedException {
        Person person = new Person(32,"dus");
        Database database = new Database(person);

        database.findByUsername("redasd");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void usernameIsNull() throws OperationNotSupportedException {
        Person person = new Person(32, null);
        Database database = new Database(person);

        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void noIdFound() throws OperationNotSupportedException {
        Person person = new Person(32,"dus");
        Database database = new Database(person);

        database.findById(324);
    }




}
