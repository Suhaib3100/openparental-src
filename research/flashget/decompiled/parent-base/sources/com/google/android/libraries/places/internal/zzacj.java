package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzacj extends zzacm {
    private final int zzc;

    zzacj(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzacp.zzj(0, i5, bArr.length);
        this.zzc = i5;
    }

    @Override // com.google.android.libraries.places.internal.zzacm, com.google.android.libraries.places.internal.zzacp
    public final byte zza(int i4) {
        int i5 = this.zzc;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.zza[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(com.google.android.gms.internal.location.a.a(22, ProtectedSandApp.s("\ue741"), i4));
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append(ProtectedSandApp.s("\ue742"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue743"));
        sb.append(i5);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzacm, com.google.android.libraries.places.internal.zzacp
    final byte zzb(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.libraries.places.internal.zzacm
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzacm, com.google.android.libraries.places.internal.zzacp
    public final int zzd() {
        return this.zzc;
    }
}
