import org.junit.Test;

import static org.junit.Assert.*; // we want all assertion

public class HelloEmpireTest {

    @Test
    public void helloPublicMethod() {
        HelloEmpire he = new HelloEmpire();
        // we know hello returns String object
        String check = he.hello();
        assert check.equalsIgnoreCase("Hello");
    }

    @Test
    public void fieldValue() {
        HelloEmpire he = new HelloEmpire();
        //accessing field here not method
        assertTrue(he.someFieldForClass);
    }

    @Test
    public void staticMethodExample() {
        //example of static
        assertEquals(HelloEmpire.exists(true), Boolean.TRUE);

        HelloEmpire rome = HelloEmpire.createRome();
        assertEquals(rome.salutation(), "AVE CESAR");
    }

    @Test
    public void stringEquality() {

        assertTrue("Hello" == "Hello"); //Strings equal

        String s = new String("H");
        String t = new String("H");

        assertFalse(s == t); //but string objects not
    }

    @Test
    public void singleInstance() {
        //static method factory returns the same object every time
        HelloEmpire he = HelloEmpire.createRome();
        HelloEmpire he2 = HelloEmpire.createRome();
        assertTrue(he == he2);
    }

}
