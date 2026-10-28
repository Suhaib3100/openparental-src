package com.google.android.gms.internal.fido;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzbn extends zzbl {
    private final Object zza;

    zzbn(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzbn) {
            return this.zza.equals(((zzbn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return d.a(ProtectedSandApp.s("퀌"), this.zza.toString(), ProtectedSandApp.s("퀍"));
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return true;
    }
}
