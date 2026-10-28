package com.google.android.datatransport.runtime;

import b9.c;
import com.google.android.datatransport.runtime.d;

/* compiled from: SendRequest.java */
@b9.c
/* loaded from: classes5.dex */
abstract class r {

    /* compiled from: SendRequest.java */
    @c.a
    public static abstract class a {
        public abstract r a();

        abstract a b(com.google.android.datatransport.e eVar);

        abstract a c(com.google.android.datatransport.f<?> fVar);

        public <T> a d(com.google.android.datatransport.f<T> fVar, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar) {
            c(fVar);
            b(eVar);
            e(kVar);
            return this;
        }

        abstract a e(com.google.android.datatransport.k<?, byte[]> kVar);

        public abstract a f(s sVar);

        public abstract a g(String str);
    }

    r() {
    }

    public static a a() {
        return new d.b();
    }

    public abstract com.google.android.datatransport.e b();

    abstract com.google.android.datatransport.f<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract com.google.android.datatransport.k<?, byte[]> e();

    public abstract s f();

    public abstract String g();
}
