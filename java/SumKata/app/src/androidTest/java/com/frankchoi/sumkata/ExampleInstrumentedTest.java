package com.frankchoi.sumkata;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    public ExampleInstrumentedTest() {

    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.frankchoi.sumkata", appContext.getPackageName());
    }

    @Test
    public void testHelloWorldCheck(){
        onView(withId(R.id.appTitle)).check(matches(withText("Welcome to SumKata")));
//        TextView tv = (TextView)mActivityRule.findViewById(R.id.textHelloWorld);
//        String txt = (String) tv.getText();
//
//        assertEquals("Hello World!", txt);
    }

    @Test
    public void test1더하기2(){

        onView(withId(R.id.num1Text)).perform(click());
        onView(withId(R.id.num1Text)).perform(typeText("1"));
        onView(withId(R.id.num2Text)).perform(click());
        onView(withId(R.id.num2Text)).perform(typeText("2"));
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.resultText)).check(matches(withText("3")));
    }

    @Test
    public void test빈스트링_더하기_2(){

        onView(withId(R.id.num1Text)).perform(click());
        onView(withId(R.id.num1Text)).perform(typeText(""));
        onView(withId(R.id.num2Text)).perform(click());
        onView(withId(R.id.num2Text)).perform(typeText("2"));
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.resultText)).check(matches(withText("2")));
    }

    @Test
    public void test빈스트링_더하기_숫자아님(){

        onView(withId(R.id.num1Text)).perform(click());
        onView(withId(R.id.num1Text)).perform(typeText(""));
        onView(withId(R.id.num2Text)).perform(click());
        onView(withId(R.id.num2Text)).perform(typeText("asdf"));
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.resultText)).check(matches(withText("0")));
    }
}
