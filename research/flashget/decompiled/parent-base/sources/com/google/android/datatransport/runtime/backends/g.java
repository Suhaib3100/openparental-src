package com.google.android.datatransport.runtime.backends;

import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.runtime.backends.a;

/* compiled from: BackendRequest.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class g {

    /* compiled from: BackendRequest.java */
    @c.a
    public static abstract class a {
        public abstract g a();

        public abstract a b(Iterable<com.google.android.datatransport.runtime.k> iterable);

        public abstract a c(@q0 byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public static g b(Iterable<com.google.android.datatransport.runtime.k> iterable) {
        return new a.b().b(iterable).a();
    }

    public abstract Iterable<com.google.android.datatransport.runtime.k> c();

    @q0
    public abstract byte[] d();
}
