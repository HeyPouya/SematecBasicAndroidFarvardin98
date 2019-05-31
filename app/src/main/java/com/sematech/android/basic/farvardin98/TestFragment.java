package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test, container, false);
        return v;

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final LinearLayout container = view.findViewById(R.id.container);

        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
            }
        });

    }
}
