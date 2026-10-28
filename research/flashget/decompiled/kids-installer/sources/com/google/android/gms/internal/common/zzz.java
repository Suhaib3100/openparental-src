package com.google.android.gms.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes3.dex */
abstract class zzz extends zzak {
    private final int zza;
    private int zzb;

    protected zzz(int i5, int i6) {
        zzs.zzb(i6, i5, ProtectedSandApp.s("⊶"));
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        return zza(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.zzb - 1;
        this.zzb = i5;
        return zza(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    protected abstract Object zza(int i5);
}
