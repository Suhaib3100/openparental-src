package com.google.android.datatransport.runtime.backends;

/* compiled from: BackendResponse.java */
@b9.c
/* loaded from: classes5.dex */
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

    public static h e(long j4) {
        return new b(a.OK, j4);
    }

    public static h f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
