package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
abstract class zzk implements Iterator {
    private Object zza;
    private int zzb = 2;

    protected zzk() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzr.zza(this.zzb != 4);
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

    protected abstract Object zza();

    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
