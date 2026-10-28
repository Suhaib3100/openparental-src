package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzkv implements Closeable {
    private static final ThreadLocal zza = new zzku();
    private int zzb = 0;

    public static int zza() {
        return ((zzkv) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i4 = this.zzb;
        if (i4 <= 0) {
            throw new AssertionError(ProtectedSandApp.s("\uea20"));
        }
        this.zzb = i4 - 1;
    }
}
