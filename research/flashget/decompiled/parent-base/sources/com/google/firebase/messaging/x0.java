package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: ProxyNotificationPreferences.java */
/* loaded from: classes6.dex */
final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60336a = ProtectedSandApp.s("̆\u0001");

    private x0() {
    }

    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences(ProtectedSandApp.s("̆\u0001"), 0);
    }

    @androidx.annotation.n1
    static boolean c(Context context) {
        return b(context).getBoolean(ProtectedSandApp.s("̇\u0001"), false);
    }

    @androidx.annotation.n1
    static boolean d(SharedPreferences sharedPreferences, boolean z4) {
        String s4 = ProtectedSandApp.s("̈\u0001");
        return sharedPreferences.contains(s4) && sharedPreferences.getBoolean(s4, false) == z4;
    }

    @androidx.annotation.n1
    static void f(Context context, boolean z4) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean(ProtectedSandApp.s("̇\u0001"), z4);
        edit.apply();
    }

    @androidx.annotation.n1
    static void g(final Context context, j0 j0Var, final boolean z4) {
        if (PlatformVersion.isAtLeastQ() && !d(b(context), z4)) {
            j0Var.l(z4).addOnSuccessListener(new androidx.credentials.k(), new OnSuccessListener() { // from class: com.google.firebase.messaging.w0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    x0.h(context, z4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.n1
    public static void h(Context context, boolean z4) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean(ProtectedSandApp.s("̈\u0001"), z4);
        edit.apply();
    }
}
