package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzfj {
    private static final String[] zza = {ProtectedSandApp.s("큦"), ProtectedSandApp.s("큧")};
    private static final zzfn zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.fido.zzfn] */
    static {
        zzfo zzfoVar;
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                zzfoVar = new zzfo();
                break;
            }
            zzfoVar = null;
            try {
                zzfoVar = (zzfn) Class.forName(zza[i4]).asSubclass(zzfn.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzfoVar != null) {
                break;
            } else {
                i4++;
            }
        }
        zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i4) {
        zzfk.zza(cls, ProtectedSandApp.s("큨"));
        return zzb.zza(cls, 2);
    }
}
