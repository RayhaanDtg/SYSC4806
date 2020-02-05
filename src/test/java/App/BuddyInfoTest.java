package App;

import static org.junit.Assert.*;

import App.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {
    private BuddyInfo buddy1;
    private String location;
    private String name;
    private Integer number;
    private int age;

    @Before
    public void setUp() throws Exception {

         name = "Ray";
         location= "Prince of Wales";
         number = 34398844;
         age= 18;
        buddy1 = new BuddyInfo(name,location,number,age);

    }

    @Test
    public void testSettingAndGetting() {
        assertEquals("Name should be Ray", name, buddy1.getName());
        assertEquals("Number should be 3439884493", number, buddy1.getNumber());
        assertEquals("Age should be 18", age, buddy1.getAge());

    }
}