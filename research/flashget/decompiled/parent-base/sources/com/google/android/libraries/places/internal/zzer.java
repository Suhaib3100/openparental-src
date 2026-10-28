package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzer extends zzet {
    private final String zza;
    private final int zzb;
    private final int zzc;

    /* synthetic */ zzer(String str, int i4, int i5, zzeq zzeqVar) {
        this.zza = str;
        this.zzb = i4;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzet) {
            zzet zzetVar = (zzet) obj;
            if (this.zza.equals(zzetVar.zzb()) && this.zzb == zzetVar.zza() && this.zzc == zzetVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        int i4 = this.zzb;
        String s4 = this.zzc != 1 ? ProtectedSandApp.s("\ue955") : ProtectedSandApp.s("\ue956");
        StringBuilder sb = new StringBuilder(s4.length() + str.length() + 68);
        sb.append(ProtectedSandApp.s("\ue957"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\ue958"));
        sb.append(i4);
        return k0.a(sb, ProtectedSandApp.s("\ue959"), s4, ProtectedSandApp.s("\ue95a"));
    }

    @Override // com.google.android.libraries.places.internal.zzet
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzet
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzet
    public final int zzc() {
        return this.zzc;
    }
}
