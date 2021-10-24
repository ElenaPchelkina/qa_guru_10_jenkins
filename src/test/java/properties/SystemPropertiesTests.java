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

    @Test
    void readWithTerminalFromPropertyTest() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);


        //  gradle clean properties_tests
        //  gradle clean properties_tests -Dbrowser=safari
        //  gradle clean properties_tests -Dbrowser=safari -Dversion=89
    }

    @Test
    void setPropertyTest() {

        System.out.println(System.getProperty("browser"));
        System.setProperty("browser", "firefox");

        System.out.println(System.getProperty("browser"));


        //  gradle clean properties_tests
        //  gradle clean properties_tests -Dbrowser=safari
        //  gradle clean properties_tests -Dbrowser=safari -Dversion=89
    }

}

