package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.b1;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ConnectivityManagerCompat.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26477a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f26478b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f26479c = 3;

    /* compiled from: ConnectivityManagerCompat.java */
    @x0(24)
    /* renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    static class C0420a {
        private C0420a() {
        }

        static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* compiled from: ConnectivityManagerCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a() {
    }

    @q0
    @SuppressLint({"ReferencesDeprecated"})
    @b1("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo a(@o0 ConnectivityManager connectivityManager, @o0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@o0 ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus();
    }

    @w0(expression = "cm.isActiveNetworkMetered()")
    @b1("android.permission.ACCESS_NETWORK_STATE")
    @Deprecated
    public static boolean c(@o0 ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
