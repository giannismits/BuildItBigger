package test;

import android.content.Context;
import android.media.audiofx.DynamicsProcessing;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import com.udacity.gradle.builditbigger.EndPointAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;




@RunWith(AndroidJUnit4.class)

public  class EndPointAsyncTest  {

private Context context;

    @Rule
   public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
           new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testJokesAreNotEmpty () throws Exception {

     EndPointAsyncTask endPointAsyncTask= new EndPointAsyncTask((MainActivity) context);
       endPointAsyncTask.execute(InstrumentationRegistry.getContext());
      String Joke = endPointAsyncTask.get(5, TimeUnit.SECONDS);
        Assert.assertTrue(!Joke.equals(""));
    }



}
