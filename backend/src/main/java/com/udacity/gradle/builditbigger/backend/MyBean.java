package com.udacity.gradle.builditbigger.backend;

import com.example.jokeslib.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData= new Jokes().getJoke();
        return myData;
    }


}