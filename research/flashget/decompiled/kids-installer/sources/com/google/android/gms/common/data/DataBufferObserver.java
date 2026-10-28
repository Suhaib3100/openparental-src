package com.google.android.gms.common.data;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface Observable {
        void addObserver(@o0 DataBufferObserver dataBufferObserver);

        void removeObserver(@o0 DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i5, int i6);

    void onDataRangeInserted(int i5, int i6);

    void onDataRangeMoved(int i5, int i6, int i7);

    void onDataRangeRemoved(int i5, int i6);
}
