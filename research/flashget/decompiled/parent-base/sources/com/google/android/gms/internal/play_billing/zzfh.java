package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfh extends zzfi {
    final /* synthetic */ zzfp zza;
    private int zzb;
    private final int zzc;

    zzfh(zzfp zzfpVar) {
        Objects.requireNonNull(zzfpVar);
        this.zza = zzfpVar;
        this.zzb = 0;
        this.zzc = zzfpVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfk
    public final byte zza() {
        int i4 = this.zzb;
        if (i4 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i4 + 1;
        return this.zza.zza(i4);
    }
}
