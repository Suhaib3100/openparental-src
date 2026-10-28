package com.google.android.gms.internal.measurement;

import android.content.preferences.protobuf.v;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes4.dex */
final class zzju extends zzjx {
    private final int zzc;

    zzju(byte[] bArr, int i5, int i6) {
        super(bArr);
        zzka.zzj(0, i6, bArr.length);
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i5) {
        int i6 = this.zzc;
        if (((i6 - (i5 + 1)) | i5) >= 0) {
            return this.zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(s.a(ProtectedSandApp.s("\u2e5e"), i5));
        }
        throw new ArrayIndexOutOfBoundsException(v.a(ProtectedSandApp.s("\u2e5f"), i5, ProtectedSandApp.s("\u2e60"), i6));
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    final byte zzb(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.zzc;
    }
}
