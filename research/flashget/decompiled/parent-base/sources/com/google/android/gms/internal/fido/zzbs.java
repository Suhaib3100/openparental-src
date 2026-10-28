package com.google.android.gms.internal.fido;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzbs implements Serializable, zzbp {
    final Object zza;

    zzbs(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzbs) {
            return zzbk.zza(this.zza, ((zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return d.a(ProtectedSandApp.s("퀜"), this.zza.toString(), ProtectedSandApp.s("퀝"));
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        return this.zza;
    }
}
