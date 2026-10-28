package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;
import x1.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes2.dex */
abstract class zzj implements Iterator {

    @CheckForNull
    private Object zza;
    private int zzb = 2;

    protected zzj() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zzb;
        if (i5 == 4) {
            throw new IllegalStateException();
        }
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 0) {
            return true;
        }
        if (i6 != 2) {
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

    @CheckForNull
    protected abstract Object zza();

    @CheckForNull
    @a
    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
