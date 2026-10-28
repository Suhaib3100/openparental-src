package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzhb extends zzhd {
    final /* synthetic */ zzhc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhb(zzhc zzhcVar, zzhe zzheVar, CharSequence charSequence) {
        super(zzheVar, ProtectedSandApp.s("\ue9c0"));
        this.zza = zzhcVar;
    }

    @Override // com.google.android.libraries.places.internal.zzhd
    final int zzc(int i4) {
        return i4 + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzhd
    final int zzd(int i4) {
        zzha.zzb(i4, 5, ProtectedSandApp.s("\ue9c1"));
        while (i4 < 5) {
            if (ProtectedSandApp.s("\ue9c0").charAt(i4) == '.') {
                return i4;
            }
            i4++;
        }
        return -1;
    }
}
