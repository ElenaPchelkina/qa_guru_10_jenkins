package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")
public class SystemPropertiesTests {
    @Test
    void test1() {
    System.out.println("[test1] Browser: " + System.getProperty("browser"));
    }

    @Test
    void readNullFromPropertyTest() {
        String value = System.getProperty("our_property");
        System.out.println(value);
        // null
    }

    @Test
    void readDefaultFromPropertyTest() {
        String value = System.getProperty("our_property", "default_value");
        System.out.println(value);
        // default_value
    }

}

