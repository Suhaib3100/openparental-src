package com.google.android.libraries.places.internal;

import java.util.logging.Level;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzka implements zzju {
    private final String zza;
    private final Level zzb;

    private zzka(String str, boolean z4, boolean z5, Level level, boolean z6) {
        this.zza = "";
        this.zzb = level;
    }

    @Override // com.google.android.libraries.places.internal.zzju
    public final zzja zza(String str) {
        return new zzkd(this.zza, str, true, false, this.zzb, null);
    }

    public final zzka zzb(boolean z4) {
        return new zzka(this.zza, true, false, Level.OFF, false);
    }

    public zzka() {
        this("", true, false, Level.ALL, false);
    }
}
