package com.google.firebase.installations.local;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.firebase.installations.local.a;
import com.google.firebase.installations.local.c;

/* compiled from: PersistedInstallationEntry.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @o0
    public static d f59779a = a().a();

    /* compiled from: PersistedInstallationEntry.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract d a();

        @o0
        public abstract a b(@q0 String str);

        @o0
        public abstract a c(long j4);

        @o0
        public abstract a d(@o0 String str);

        @o0
        public abstract a e(@q0 String str);

        @o0
        public abstract a f(@q0 String str);

        @o0
        public abstract a g(@o0 c.a aVar);

        @o0
        public abstract a h(long j4);
    }

    @o0
    public static a a() {
        return new a.b().h(0L).g(c.a.ATTEMPT_MIGRATION).c(0L);
    }

    @q0
    public abstract String b();

    public abstract long c();

    @q0
    public abstract String d();

    @q0
    public abstract String e();

    @q0
    public abstract String f();

    @o0
    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        return g() == c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == c.a.NOT_GENERATED || g() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == c.a.REGISTERED;
    }

    public boolean l() {
        return g() == c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == c.a.ATTEMPT_MIGRATION;
    }

    @o0
    public abstract a n();

    @o0
    public d o(@o0 String str, long j4, long j5) {
        return n().b(str).c(j4).h(j5).a();
    }

    @o0
    public d p() {
        return n().b(null).a();
    }

    @o0
    public d q(@o0 String str) {
        return n().e(str).g(c.a.REGISTER_ERROR).a();
    }

    @o0
    public d r() {
        return n().g(c.a.NOT_GENERATED).a();
    }

    @o0
    public d s(@o0 String str, @o0 String str2, long j4, @q0 String str3, long j5) {
        return n().d(str).g(c.a.REGISTERED).b(str3).f(str2).c(j5).h(j4).a();
    }

    @o0
    public d t(@o0 String str) {
        return n().d(str).g(c.a.UNREGISTERED).a();
    }
}
