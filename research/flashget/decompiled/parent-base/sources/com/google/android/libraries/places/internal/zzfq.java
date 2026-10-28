package com.google.android.libraries.places.internal;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.CancellationTokenSource;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzfq extends zzfv {
    private final CancellationTokenSource zza;
    private final String zzb;

    zzfq(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue99c"));
        }
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfv) {
            zzfv zzfvVar = (zzfv) obj;
            if (this.zza.equals(zzfvVar.zza()) && this.zzb.equals(zzfvVar.zzb())) {
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
        StringBuilder sb = new StringBuilder(str.length() + obj.length() + 36);
        l0.a(sb, ProtectedSandApp.s("\ue99d"), obj, ProtectedSandApp.s("\ue99e"), str);
        sb.append(ProtectedSandApp.s("\ue99f"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzfy
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzfv
    public final String zzb() {
        return this.zzb;
    }
}
