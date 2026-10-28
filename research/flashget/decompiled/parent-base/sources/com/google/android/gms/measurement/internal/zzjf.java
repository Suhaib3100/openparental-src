package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzjf {
    public static <T> T zza(@o0 Bundle bundle, String str, Class<T> cls, T t4) {
        T t5 = (T) bundle.get(str);
        if (t5 == null) {
            return t4;
        }
        if (cls.isAssignableFrom(t5.getClass())) {
            return t5;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("\udfa1"), str, cls.getCanonicalName(), t5.getClass().getCanonicalName()));
    }

    public static void zza(@o0 Bundle bundle, @o0 Object obj) {
        boolean z4 = obj instanceof Double;
        String s4 = ProtectedSandApp.s("\udfa2");
        if (z4) {
            bundle.putDouble(s4, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(s4, ((Long) obj).longValue());
        } else {
            bundle.putString(s4, obj.toString());
        }
    }
}
