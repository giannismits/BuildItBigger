import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;




@RunWith(AndroidJUnit4.class)
@LargeTest
public class EndPointAsyncTest {



    @Rule
   public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
           new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testJokesAreNotEmpty () throws Exception {
      AppicationTest applicationTest = new AppicationTest();
        applicationTest.execute(InstrumentationRegistry.getContext());
      String Joke = applicationTest.get(5, TimeUnit.SECONDS);
        Assert.assertTrue(!Joke.equals(""));
    }



}
