package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.g0;
import com.google.common.base.u0;
import zc.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzgv extends zzhu {
    private final Context zza;

    @h
    private final u0<g0<zzhh>> zzb;

    zzgv(Context context, @h u0<g0<zzhh>> u0Var) {
        if (context == null) {
            throw new NullPointerException(ProtectedSandApp.s("푽"));
        }
        this.zza = context;
        this.zzb = u0Var;
    }

    public final boolean equals(Object obj) {
        u0<g0<zzhh>> u0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zza.equals(zzhuVar.zza()) && ((u0Var = this.zzb) != null ? u0Var.equals(zzhuVar.zzb()) : zzhuVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        u0<g0<zzhh>> u0Var = this.zzb;
        return hashCode ^ (u0Var == null ? 0 : u0Var.hashCode());
    }

    public final String toString() {
        return c.a(ProtectedSandApp.s("푾"), String.valueOf(this.zza), ProtectedSandApp.s("푿"), String.valueOf(this.zzb), ProtectedSandApp.s("풀"));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    @h
    final u0<g0<zzhh>> zzb() {
        return this.zzb;
    }
}
