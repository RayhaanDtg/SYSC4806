package App;

import static org.junit.Assert.*;

import App.AddressBook;
import App.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {
    private AddressBook book1;

    @Before
    public void setUp() throws Exception {

        book1 = new AddressBook();

        //Add two buddies to address book
        book1.addBuddy(new BuddyInfo("Rayhaan"));
        book1.addBuddy(new BuddyInfo("RayRay"));

    }

    @org.junit.jupiter.api.Test
    public void testSize() {
        assertEquals("Size of Address Book should be 2.", 2, book1.getSize());
    }

    @Test
    public void testClear() {
        book1.clearBuddy();
        assertEquals("Size of Address Book should be 0.", 0, book1.getSize());
    }
}