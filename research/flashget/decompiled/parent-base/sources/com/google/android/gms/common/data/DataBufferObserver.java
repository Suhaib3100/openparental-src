package com.google.android.gms.common.data;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Observable {
        void addObserver(@o0 DataBufferObserver dataBufferObserver);

        void removeObserver(@o0 DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i4, int i5);

    void onDataRangeInserted(int i4, int i5);

    void onDataRangeMoved(int i4, int i5, int i6);

    void onDataRangeRemoved(int i4, int i5);
}
