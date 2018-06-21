package com.example.thres.mobileproject;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.support.constraint.Group;
import java.util.ArrayList;
import java.util.List;

public class FragmentC extends Fragment {

    ImageView imageView;
    String values[] = {"Hot Beverages", "Cold Beverages", "Food"};

    public FragmentC() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        Log.v("potato", "fragment C created");


        Resources rsrc= getResources();
        Resources rsrc2= getResources();
        Resources rsrc3= getResources();
       final Drawable drawable= rsrc.getDrawable(R.drawable.hotbev);
       final Drawable drawable2= rsrc2.getDrawable(R.drawable.coldbev);
       final Drawable drawable3= rsrc3.getDrawable(R.drawable.food);
        imageView = (ImageView) view.findViewById(R.id.imageView3);

        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        LTRadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(LTRadapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinner.
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                if(arg2==0)
                {

                    imageView.setImageDrawable(drawable);
                }
                else if(arg2==1)
                {
                    imageView.setImageDrawable(drawable2);
                }
                else
                {
                    imageView.setImageDrawable(drawable3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

        return view;
    }
}