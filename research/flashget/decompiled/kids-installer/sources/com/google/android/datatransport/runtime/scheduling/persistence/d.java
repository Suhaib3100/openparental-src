package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.n1;
import java.io.Closeable;

/* compiled from: EventStore.java */
@n1
/* loaded from: classes2.dex */
public interface d extends Closeable {
    Iterable<k> C(com.google.android.datatransport.runtime.s sVar);

    void J(com.google.android.datatransport.runtime.s sVar, long j5);

    Iterable<com.google.android.datatransport.runtime.s> N();

    @androidx.annotation.q0
    k P0(com.google.android.datatransport.runtime.s sVar, com.google.android.datatransport.runtime.k kVar);

    long W0(com.google.android.datatransport.runtime.s sVar);

    boolean a1(com.google.android.datatransport.runtime.s sVar);

    void c1(Iterable<k> iterable);

    int p();

    void s(Iterable<k> iterable);
}
