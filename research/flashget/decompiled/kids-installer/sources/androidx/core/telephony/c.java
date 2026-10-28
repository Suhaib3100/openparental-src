package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TelephonyManagerCompat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Method f5101a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f5102b;

    /* compiled from: TelephonyManagerCompat.java */
    @x0(23)
    private static class a {
        private a() {
        }

        @SuppressLint({"MissingPermission"})
        @q0
        @u
        @b1("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager, int i5) {
            return telephonyManager.getDeviceId(i5);
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @x0(26)
    private static class b {
        private b() {
        }

        @SuppressLint({"MissingPermission"})
        @q0
        @u
        @b1("android.permission.READ_PHONE_STATE")
        static String a(TelephonyManager telephonyManager) {
            String imei;
            imei = telephonyManager.getImei();
            return imei;
        }
    }

    /* compiled from: TelephonyManagerCompat.java */
    @x0(30)
    /* renamed from: androidx.core.telephony.c$c, reason: collision with other inner class name */
    private static class C0047c {
        private C0047c() {
        }

        @u
        static int a(TelephonyManager telephonyManager) {
            int subscriptionId;
            subscriptionId = telephonyManager.getSubscriptionId();
            return subscriptionId;
        }
    }

    private c() {
    }

    @q0
    @SuppressLint({"MissingPermission"})
    @b1("android.permission.READ_PHONE_STATE")
    public static String a(@o0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(telephonyManager);
        }
        int b6 = b(telephonyManager);
        return (b6 == Integer.MAX_VALUE || b6 == -1) ? telephonyManager.getDeviceId() : a.a(telephonyManager, androidx.core.telephony.b.a(b6));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@o0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0047c.a(telephonyManager);
        }
        try {
            if (f5102b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f5102b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f5102b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
