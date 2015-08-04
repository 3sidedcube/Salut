package com.peak.salut;

import android.content.Context;

import com.peak.salut.Callbacks.SalutDataCallback;

/**
 * Created by markrjr on 6/3/15.
 */
public class SalutDataReceiver {

    protected SalutDataCallback dataCallback;
    protected Context currentContext;

    public SalutDataReceiver(Context activity, SalutDataCallback dataCallback)
    {
        this.dataCallback = dataCallback;
        this.currentContext = activity;
    }

}
