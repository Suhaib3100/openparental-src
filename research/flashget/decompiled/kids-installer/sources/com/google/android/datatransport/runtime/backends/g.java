package com.google.android.datatransport.runtime.backends;

import androidx.annotation.q0;
import com.google.android.datatransport.runtime.backends.a;
import com.google.auto.value.AutoValue;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
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
