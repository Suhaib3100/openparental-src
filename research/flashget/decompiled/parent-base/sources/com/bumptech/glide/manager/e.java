package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.manager.b;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44681a = ProtectedSandApp.s("\u0a31");

    /* renamed from: b, reason: collision with root package name */
    private static final String f44682b = ProtectedSandApp.s("ਰ");

    @Override // com.bumptech.glide.manager.c
    @o0
    public b a(@o0 Context context, @o0 b.a aVar) {
        boolean z4 = androidx.core.content.d.checkSelfPermission(context, ProtectedSandApp.s("ਰ")) == 0;
        Log.isLoggable(ProtectedSandApp.s("\u0a31"), 3);
        return z4 ? new d(context, aVar) : new m();
    }
}
