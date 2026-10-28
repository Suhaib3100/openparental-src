package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.d;
import com.google.auto.value.AutoValue;

/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
abstract class r {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        abstract a b(com.google.android.datatransport.c cVar);

        abstract a c(com.google.android.datatransport.d<?> dVar);

        public <T> a d(com.google.android.datatransport.d<T> dVar, com.google.android.datatransport.c cVar, com.google.android.datatransport.g<T, byte[]> gVar) {
            c(dVar);
            b(cVar);
            e(gVar);
            return this;
        }

        abstract a e(com.google.android.datatransport.g<?, byte[]> gVar);

        public abstract a f(s sVar);

        public abstract a g(String str);
    }

    r() {
    }

    public static a a() {
        return new d.b();
    }

    public abstract com.google.android.datatransport.c b();

    abstract com.google.android.datatransport.d<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract com.google.android.datatransport.g<?, byte[]> e();

    public abstract s f();

    public abstract String g();
}
