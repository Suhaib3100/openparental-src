package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue;

/* compiled from: PersistedEvent.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class k {
    public static k a(long j5, com.google.android.datatransport.runtime.s sVar, com.google.android.datatransport.runtime.k kVar) {
        return new b(j5, sVar, kVar);
    }

    public abstract com.google.android.datatransport.runtime.k b();

    public abstract long c();

    public abstract com.google.android.datatransport.runtime.s d();
}
