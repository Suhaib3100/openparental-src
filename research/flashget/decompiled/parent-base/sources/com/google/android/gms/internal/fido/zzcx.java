package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzcx extends zzcs implements Serializable {
    final zzcs zza;

    zzcx(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(ProtectedSandApp.s("퀱"));
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return this.zza;
    }
}
