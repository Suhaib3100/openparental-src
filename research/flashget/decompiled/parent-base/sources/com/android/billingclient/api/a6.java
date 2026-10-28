package com.android.billingclient.api;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class a6 {
    static synchronized double a(Context context) {
        double doubleValue;
        synchronized (a6.class) {
            doubleValue = ((Double) e(new y5(), Double.valueOf(2.0d))).doubleValue();
        }
        return doubleValue;
    }

    static synchronized long b(Context context) {
        long longValue;
        synchronized (a6.class) {
            longValue = ((Long) e(new x5(), 3L)).longValue();
        }
        return longValue;
    }

    static synchronized long c(Context context) {
        long longValue;
        synchronized (a6.class) {
            longValue = ((Long) e(new v5(), 100L)).longValue();
        }
        return longValue;
    }

    static synchronized long d(Context context) {
        long longValue;
        synchronized (a6.class) {
            longValue = ((Long) e(new w5(), 60000L)).longValue();
        }
        return longValue;
    }

    private static Object e(z5 z5Var, Object obj) {
        try {
            return z5Var.zza();
        } catch (Exception e4) {
            zzc.zzn(ProtectedSandApp.s("ͤ"), ProtectedSandApp.s("ͣ").concat(e4.toString()));
            return obj;
        }
    }
}
