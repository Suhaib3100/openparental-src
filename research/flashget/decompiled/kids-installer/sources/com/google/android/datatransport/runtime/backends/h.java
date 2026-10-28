package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class h {

    /* compiled from: BackendResponse.java */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static h a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static h d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static h e(long j5) {
        return new b(a.OK, j5);
    }

    public static h f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
