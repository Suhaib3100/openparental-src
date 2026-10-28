package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgz {
    public static Object zza(@o0 Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("\u0fe9"), str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static void zzb(@o0 Bundle bundle, @o0 Object obj) {
        boolean z5 = obj instanceof Double;
        String s5 = ProtectedSandApp.s("\u0fea");
        if (z5) {
            bundle.putDouble(s5, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(s5, ((Long) obj).longValue());
        } else {
            bundle.putString(s5, obj.toString());
        }
    }
}
