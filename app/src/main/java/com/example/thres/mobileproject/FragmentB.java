package com.example.thres.mobileproject;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentB extends Fragment {

    ImageView imageView;
    ImageView imageView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Log.v("potato", "fragment BBB created");


        Resources rsrc= getResources();
        Drawable drawable= rsrc.getDrawable(R.drawable.cgmap);

        imageView = (ImageView) view.findViewById(R.id.imageView2);
        imageView.setImageDrawable(drawable);

        //Actually used, others left in background to slow down the app of course! (In case I change my mind)
        Resources rsrc2= getResources();
        Drawable drawable2= rsrc.getDrawable(R.drawable.about);

        imageView2 = (ImageView) view.findViewById(R.id.imageView4);
        imageView2.setImageDrawable(drawable2);


        return view;
    }
}