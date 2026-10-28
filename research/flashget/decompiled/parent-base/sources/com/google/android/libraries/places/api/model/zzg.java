package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzg extends zzbb {
    private final int zza;
    private final int zzb;

    zzg(int i4, int i5) {
        this.zza = i4;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.zza == zzbbVar.zzb() && this.zzb == zzbbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i4 = this.zza;
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(54);
        sb.append(ProtectedSandApp.s("\ue603"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue604"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\ue605"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.zzbb
    final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzbb
    final int zzb() {
        return this.zza;
    }
}
