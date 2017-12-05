package com.sharvai_sid.meagl;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by siddharth on 23/09/17.
 */

public class MyAppWebViewClient extends WebViewClient{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view,String url){
        if(Uri.parse(url).getHost().endsWith("m.meagl.com")){
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
