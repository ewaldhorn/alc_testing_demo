package android.testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    @Test
    public void isValid_Blue() {
        assertEquals(true, validator.isValid("Blue"));
    }

    @Test
    public void isValid_Red() {
        assertEquals(true, validator.isValid("Red"));
    }

    @Test
    public void isValid_Orange() {
        assertEquals(true, validator.isValid("Orange"));
    }

    @Test
    public void isNotValid_Null() {
        assertEquals(false, validator.isValid(null));
    }

}