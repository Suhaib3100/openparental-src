package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.n1;
import java.io.Closeable;

/* compiled from: EventStore.java */
@n1
/* loaded from: classes5.dex */
public interface d extends Closeable {
    boolean A1(com.google.android.datatransport.runtime.s sVar);

    void E1(Iterable<k> iterable);

    void U(Iterable<k> iterable);

    Iterable<k> j2(com.google.android.datatransport.runtime.s sVar);

    void l0(com.google.android.datatransport.runtime.s sVar, long j4);

    int p();

    Iterable<com.google.android.datatransport.runtime.s> p0();

    @androidx.annotation.q0
    k p3(com.google.android.datatransport.runtime.s sVar, com.google.android.datatransport.runtime.k kVar);

    long w1(com.google.android.datatransport.runtime.s sVar);
}
