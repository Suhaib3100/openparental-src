package com.google.android.libraries.places.internal;

import androidx.view.h1;
import androidx.view.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzgd implements k1.b {
    private final zzfs zza;
    private final zzgi zzb;
    private final zzgj zzc;

    public zzgd(zzfs zzfsVar, zzgi zzgiVar, zzgj zzgjVar) {
        this.zza = zzfsVar;
        this.zzb = zzgiVar;
        this.zzc = zzgjVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final h1 create(Class cls) {
        zzha.zze(cls == zzgf.class, ProtectedSandApp.s("\ue9af"));
        return new zzgf(this.zza, this.zzb, this.zzc, null);
    }
}
