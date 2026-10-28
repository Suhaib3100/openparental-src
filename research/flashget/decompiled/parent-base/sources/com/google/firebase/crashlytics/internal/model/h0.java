package com.google.firebase.crashlytics.internal.model;

/* compiled from: StaticSessionData.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class h0 {

    /* compiled from: StaticSessionData.java */
    @b9.c
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i4, com.google.firebase.crashlytics.internal.f fVar) {
            return new d0(str, str2, str3, str4, i4, fVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract com.google.firebase.crashlytics.internal.f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* compiled from: StaticSessionData.java */
    @b9.c
    public static abstract class b {
        public static b c(int i4, String str, int i5, long j4, long j5, boolean z4, int i6, String str2, String str3) {
            return new e0(i4, str, i5, j4, j5, z4, i6, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* compiled from: StaticSessionData.java */
    @b9.c
    public static abstract class c {
        public static c a(String str, String str2, boolean z4) {
            return new f0(str, str2, z4);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static h0 b(a aVar, c cVar, b bVar) {
        return new c0(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
