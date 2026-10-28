package com.tencent.qcloud.core.util;

import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes7.dex */
public class ContextHolder {
    private static Context appContext;

    @q0
    public static Context getAppContext() {
        return appContext;
    }

    public static void setContext(@o0 Context context) {
        appContext = context.getApplicationContext();
    }
}
