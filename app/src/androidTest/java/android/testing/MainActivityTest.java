package android.testing;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.rule.ActivityTestRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    public static final String TEST_STRING = "This is just some random string that gets typed into the field.";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDrawerOpenAndClose() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.close());

        onView(withId(R.id.editText)).perform(clearText());
        onView(withId(R.id.editText)).perform(typeText(TEST_STRING), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.textViewHello)).check(matches(withText(TEST_STRING)));
    }
}