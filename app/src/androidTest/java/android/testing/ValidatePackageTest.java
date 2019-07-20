package android.testing;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ValidatePackageTest {

    @Test
    public void checkApplicationPackage() {
        Context context = InstrumentationRegistry.getTargetContext();
        assertEquals("android.testing", context.getPackageName());
    }
}
