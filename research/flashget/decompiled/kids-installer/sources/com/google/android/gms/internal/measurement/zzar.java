package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i5 = this.zzb;
        str = this.zza.zza;
        return i5 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i5 = this.zzb;
        str = this.zza.zza;
        if (i5 >= str.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i5 + 1;
        return new zzat(String.valueOf(i5));
    }
}
