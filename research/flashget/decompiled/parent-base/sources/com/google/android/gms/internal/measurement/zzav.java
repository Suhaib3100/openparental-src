package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzav implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    zzav(zzas zzasVar) {
        this.zzb = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i4 = this.zza;
        str = this.zzb.zza;
        return i4 < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        String str;
        int i4 = this.zza;
        str = this.zzb.zza;
        if (i4 >= str.length()) {
            throw new NoSuchElementException();
        }
        int i5 = this.zza;
        this.zza = i5 + 1;
        return new zzas(String.valueOf(i5));
    }
}
