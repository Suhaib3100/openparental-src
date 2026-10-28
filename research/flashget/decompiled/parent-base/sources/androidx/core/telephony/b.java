package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TelephonyManagerCompat.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f26672a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f26673b;

    /* compiled from: TelephonyManagerCompat.java */
    @x0(23)
    private static class a {
        private a() {
        }

        @q0
        @SuppressLint({"MissingPermission"})
        @b1("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager, int i4) {
            return telephonyManager.getDeviceId(i4);
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @x0(26)
    /* renamed from: androidx.core.telephony.b$b, reason: collision with other inner class name */
    private static class C0429b {
        private C0429b() {
        }

        @q0
        @SuppressLint({"MissingPermission"})
        @b1("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @x0(30)
    private static class c {
        private c() {
        }

        static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private b() {
    }

    @q0
    @SuppressLint({"MissingPermission"})
    @b1("android.permission.READ_PHONE_STATE")
    public static String a(@o0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0429b.a(telephonyManager);
        }
        int b5 = b(telephonyManager);
        return (b5 == Integer.MAX_VALUE || b5 == -1) ? telephonyManager.getDeviceId() : telephonyManager.getDeviceId(androidx.core.telephony.a.a(b5));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@o0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f26673b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f26673b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f26673b.invoke(telephonyManager, null);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
