package com.example.displayjokelib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesFragment extends Fragment {

    public JokesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jokes_fragment_layout,container,false);

        Intent intent = getActivity().getIntent();
        String results = intent.getStringExtra("result");
        TextView jokeView= view.findViewById(R.id.jokes_text);
        jokeView.setText(results);
        return view;
    }
}
