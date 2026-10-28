package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzgl implements Iterator {

    @zc.a
    private Object zza;
    private int zzb = 2;

    protected zzgl() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzha.zzh(this.zzb != 4);
        int i4 = this.zzb;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @zc.a
    protected abstract Object zza();

    @zc.a
    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
