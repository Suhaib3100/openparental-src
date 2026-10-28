package com.google.android.gms.internal.measurement;

import androidx.annotation.b0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgl {

    @q0
    @b0("GservicesDelegateSupplier.class")
    private static zzgk zza;

    public static synchronized zzgk zza() {
        zzgk zzgkVar;
        synchronized (zzgl.class) {
            try {
                if (zza == null) {
                    zza(new zzgn());
                }
                zzgkVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgkVar;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        synchronized (zzgl.class) {
            if (zza == null) {
                zza = zzgkVar;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("푵"));
            }
        }
    }
}
