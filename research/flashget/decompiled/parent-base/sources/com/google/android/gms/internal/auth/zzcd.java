package com.google.android.gms.internal.auth;

import android.content.Context;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.h;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    zzcd(Context context, @h zzdj zzdjVar) {
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza()) && this.zzb.equals(zzdaVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return c.a(ProtectedSandApp.s("컶"), this.zza.toString(), ProtectedSandApp.s("컷"), this.zzb.toString(), ProtectedSandApp.s("컸"));
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @h
    final zzdj zzb() {
        return this.zzb;
    }
}
