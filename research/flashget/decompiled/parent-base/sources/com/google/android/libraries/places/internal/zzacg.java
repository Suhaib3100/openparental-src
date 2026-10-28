package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzacg extends zzaci {
    final /* synthetic */ zzacp zza;
    private int zzb = 0;
    private final int zzc;

    zzacg(zzacp zzacpVar) {
        this.zza = zzacpVar;
        this.zzc = zzacpVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final byte zza() {
        int i4 = this.zzb;
        if (i4 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i4 + 1;
        return this.zza.zzb(i4);
    }
}
