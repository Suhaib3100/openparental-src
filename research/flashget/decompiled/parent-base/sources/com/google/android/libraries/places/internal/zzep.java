package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzep extends zzes {
    private String zza;
    private int zzb;
    private byte zzc;
    private int zzd;

    zzep() {
    }

    final zzes zza(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue950"));
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzes
    final zzes zzb(int i4) {
        this.zzb = i4;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzes
    final zzet zzc() {
        String str;
        int i4;
        if (this.zzc == 1 && (str = this.zza) != null && (i4 = this.zzd) != 0) {
            return new zzer(str, this.zzb, i4, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue951"));
        }
        if (this.zzc == 0) {
            sb.append(ProtectedSandApp.s("\ue952"));
        }
        if (this.zzd == 0) {
            sb.append(ProtectedSandApp.s("\ue953"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue954").concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zzes
    public final zzes zzd(int i4) {
        this.zzd = i4;
        return this;
    }
}
