package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ProxyNotificationPreferences.java */
/* loaded from: classes2.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17370a = ProtectedSandApp.s("ᢸ");

    private r0() {
    }

    private static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences(ProtectedSandApp.s("ᢵ"), 0);
    }

    @n1
    static boolean b(Context context) {
        return a(context).getBoolean(ProtectedSandApp.s("ᢶ"), false);
    }

    @n1
    static void c(Context context, boolean z5) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean(ProtectedSandApp.s("ᢷ"), z5);
        edit.apply();
    }
}
