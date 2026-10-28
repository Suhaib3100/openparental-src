package com.google.android.gms.common.data;

import androidx.annotation.o0;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes3.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(@o0 DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @o0
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.a(46, ProtectedSandApp.s("∻"), this.zab));
        }
        int i5 = this.zab + 1;
        this.zab = i5;
        if (i5 == 0) {
            T t5 = (T) Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = t5;
            if (!(t5 instanceof DataBufferRef)) {
                String valueOf = String.valueOf(t5.getClass());
                throw new IllegalStateException(e0.a(new StringBuilder(valueOf.length() + 44), ProtectedSandApp.s("∹"), valueOf, ProtectedSandApp.s("∺")));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
