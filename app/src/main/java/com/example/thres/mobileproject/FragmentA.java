package com.example.thres.mobileproject;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class FragmentA extends Fragment {
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Resources rsrc= getResources();
        Drawable drawable= rsrc.getDrawable(R.drawable.cgbanner);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageDrawable(drawable);

        final WebView webview = (WebView)view.findViewById(R.id.web);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                webview.loadUrl("javascript: var form = document.getElementsByClassName('wp-ally-speak-assertive');"
                        + "var body = document.getElementsByTagName('div');"
                        + "body[0].innerHTML = form[0].innerHTML");
            }
        });
        webview.loadUrl("http://trusu.ca/tag/common-grounds/");



        Log.v("potato", "fragment A created");
        return view;
    }

}
