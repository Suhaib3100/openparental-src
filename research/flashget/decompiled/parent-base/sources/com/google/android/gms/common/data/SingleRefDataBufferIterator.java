package com.google.android.gms.common.data;

import android.support.v4.media.a;
import android.support.v4.media.d;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@o0 DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @o0
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.a(ProtectedSandApp.s("쪪"), this.zab));
        }
        int i4 = this.zab + 1;
        this.zab = i4;
        if (i4 == 0) {
            Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = checkNotNull;
            if (!(checkNotNull instanceof DataBufferRef)) {
                throw new IllegalStateException(d.a(ProtectedSandApp.s("쪨"), String.valueOf(checkNotNull.getClass()), ProtectedSandApp.s("쪩")));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
