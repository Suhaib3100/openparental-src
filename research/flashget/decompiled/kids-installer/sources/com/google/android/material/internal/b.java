package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: ContextUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {
    @q0
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
