package com.google.android.libraries.places.internal;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzfr extends zzfw {
    private final CancellationTokenSource zza;
    private final String zzb;

    zzfr(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue9a0"));
        }
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfw) {
            zzfw zzfwVar = (zzfw) obj;
            if (this.zza.equals(zzfwVar.zza()) && this.zzb.equals(zzfwVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(str.length() + obj.length() + 31);
        l0.a(sb, ProtectedSandApp.s("\ue9a1"), obj, ProtectedSandApp.s("\ue9a2"), str);
        sb.append(ProtectedSandApp.s("\ue9a3"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzfy
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzfw
    public final String zzb() {
        return this.zzb;
    }
}
