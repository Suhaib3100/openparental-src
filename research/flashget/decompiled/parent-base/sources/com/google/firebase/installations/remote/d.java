package com.google.firebase.installations.remote;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.firebase.installations.remote.a;

/* compiled from: InstallationResponse.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class d {

    /* compiled from: InstallationResponse.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract d a();

        @o0
        public abstract a b(@o0 f fVar);

        @o0
        public abstract a c(@o0 String str);

        @o0
        public abstract a d(@o0 String str);

        @o0
        public abstract a e(@o0 b bVar);

        @o0
        public abstract a f(@o0 String str);
    }

    /* compiled from: InstallationResponse.java */
    public enum b {
        OK,
        BAD_CONFIG
    }

    @o0
    public static a a() {
        return new a.b();
    }

    @q0
    public abstract f b();

    @q0
    public abstract String c();

    @q0
    public abstract String d();

    @q0
    public abstract b e();

    @q0
    public abstract String f();

    @o0
    public abstract a g();
}
