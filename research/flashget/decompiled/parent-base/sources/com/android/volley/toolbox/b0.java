package com.android.volley.toolbox;

import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Threads.java */
/* loaded from: classes3.dex */
final class b0 {
    private b0() {
    }

    static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(ProtectedSandApp.s("گ"));
        }
    }
}
