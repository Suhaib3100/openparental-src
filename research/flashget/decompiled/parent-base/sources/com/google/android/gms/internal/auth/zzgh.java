package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzgh implements zzfu {
    private final zzfx zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzgh(zzfx zzfxVar, String str, Object[] objArr) {
        this.zza = zzfxVar;
        String s4 = ProtectedSandApp.s("콰");
        this.zzb = s4;
        this.zzc = objArr;
        char charAt = s4.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = s4.charAt(i5);
            if (charAt2 < 55296) {
                this.zzd = (charAt2 << i6) | i4;
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzfx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
        return (this.zzd & 1) != 0 ? 1 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
