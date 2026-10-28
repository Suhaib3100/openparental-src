package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.manager.c;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: classes3.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11907a = ProtectedSandApp.s("ᶐ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11908b = ProtectedSandApp.s("ᶑ");

    @Override // com.bumptech.glide.manager.d
    @o0
    public c a(@o0 Context context, @o0 c.a aVar) {
        boolean z5 = androidx.core.content.d.a(context, ProtectedSandApp.s("ᶎ")) == 0;
        Log.isLoggable(ProtectedSandApp.s("ᶏ"), 3);
        return z5 ? new e(context, aVar) : new n();
    }
}
