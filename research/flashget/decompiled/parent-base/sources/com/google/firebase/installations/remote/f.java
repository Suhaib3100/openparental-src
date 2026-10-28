package com.google.firebase.installations.remote;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.firebase.installations.remote.b;

/* compiled from: TokenResult.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class f {

    /* compiled from: TokenResult.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract f a();

        @o0
        public abstract a b(@o0 b bVar);

        @o0
        public abstract a c(@o0 String str);

        @o0
        public abstract a d(long j4);
    }

    /* compiled from: TokenResult.java */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @o0
    public static a a() {
        return new b.C0923b().d(0L);
    }

    @q0
    public abstract b b();

    @q0
    public abstract String c();

    @o0
    public abstract long d();

    @o0
    public abstract a e();
}
