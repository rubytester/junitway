import org.junit.Test;

public class HelloEmpireTest {

    @Test
    public void testHello(){
        HelloEmpire he = new HelloEmpire();
        String check = he.hello();
        assert check.equalsIgnoreCase("HelloBob");

    }

}
