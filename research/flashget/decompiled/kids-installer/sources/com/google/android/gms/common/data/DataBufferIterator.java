package com.google.android.gms.common.data;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    @o0
    protected final DataBuffer<T> zaa;
    protected int zab = -1;

    public DataBufferIterator(@o0 DataBuffer<T> dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @o0
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.a(46, ProtectedSandApp.s("ଐ"), this.zab));
        }
        DataBuffer<T> dataBuffer = this.zaa;
        int i5 = this.zab + 1;
        this.zab = i5;
        return dataBuffer.get(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0b11"));
    }
}
