package com.google.android.gms.common.data;

import android.support.v4.media.a;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    @o0
    protected final DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(@o0 DataBuffer dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @o0
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.a(ProtectedSandApp.s("쪙"), this.zab));
        }
        DataBuffer dataBuffer = this.zaa;
        int i4 = this.zab + 1;
        this.zab = i4;
        return dataBuffer.get(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("쪚"));
    }
}
