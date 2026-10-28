package com.google.android.gms.common.data;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public interface Freezable<T> {
    @o0
    T freeze();

    boolean isDataValid();
}
