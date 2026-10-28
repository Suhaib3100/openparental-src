package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzdk extends zzdn {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    public final Bundle zza(long j4) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    public final Long zzb(long j4) {
        return (Long) zza(zza(j4), Long.class);
    }

    public final String zzc(long j4) {
        return (String) zza(zza(j4), String.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r2 = r2.get(com.flashget.parentalcontrol.ProtectedSandApp.s("틪"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T zza(android.os.Bundle r2, java.lang.Class<T> r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2f
            java.lang.String r1 = "틪"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L14
            return r2
        L14:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r1 = "틫"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String.format(r1, r2)
            throw r0
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdk.zza(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
