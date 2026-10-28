package com.google.android.gms.internal.auth;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import zc.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzdn implements Serializable, zzdj {
    final Object zza;

    zzdn(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@a Object obj) {
        if (!(obj instanceof zzdn)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((zzdn) obj).zza;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return d.a(ProtectedSandApp.s("켜"), this.zza.toString(), ProtectedSandApp.s("켝"));
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        return this.zza;
    }
}
