package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzks {
    private static final String[] zza;
    private static final zzkw zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.libraries.places.internal.zzkw] */
    static {
        zzkx zzkxVar;
        String[] strArr = {ProtectedSandApp.s("\uea19"), ProtectedSandApp.s("\uea1a")};
        zza = strArr;
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                zzkxVar = new zzkx();
                break;
            }
            zzkxVar = null;
            try {
                zzkxVar = (zzkw) Class.forName(strArr[i4]).asSubclass(zzkw.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzkxVar != null) {
                break;
            } else {
                i4++;
            }
        }
        zzb = zzkxVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i4) {
        zzkt.zza(cls, ProtectedSandApp.s("\uea1b"));
        return zzb.zza(cls, 2);
    }
}
