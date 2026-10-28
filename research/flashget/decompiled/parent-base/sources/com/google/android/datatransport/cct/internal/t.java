package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.cct.internal.j;

/* compiled from: LogEvent.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class t {

    /* compiled from: LogEvent.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract t a();

        @o0
        public abstract a b(@q0 p pVar);

        @o0
        public abstract a c(@q0 Integer num);

        @o0
        public abstract a d(long j4);

        @o0
        public abstract a e(long j4);

        @o0
        public abstract a f(@q0 q qVar);

        @o0
        public abstract a g(@q0 w wVar);

        @o0
        abstract a h(@q0 byte[] bArr);

        @o0
        abstract a i(@q0 String str);

        @o0
        public abstract a j(long j4);
    }

    private static a a() {
        return new j.b();
    }

    @o0
    public static a k(@o0 String str) {
        return new j.b().i(str);
    }

    @o0
    public static a l(@o0 byte[] bArr) {
        return new j.b().h(bArr);
    }

    @q0
    public abstract p b();

    @q0
    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    @q0
    public abstract q f();

    @q0
    public abstract w g();

    @q0
    public abstract byte[] h();

    @q0
    public abstract String i();

    public abstract long j();
}
