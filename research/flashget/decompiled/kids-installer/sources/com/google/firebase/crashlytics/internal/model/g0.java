package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.AutoValue;

/* compiled from: StaticSessionData.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class g0 {

    /* compiled from: StaticSessionData.java */
    @AutoValue
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i5, com.google.firebase.crashlytics.internal.f fVar) {
            return new c0(str, str2, str3, str4, i5, fVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract com.google.firebase.crashlytics.internal.f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* compiled from: StaticSessionData.java */
    @AutoValue
    public static abstract class b {
        public static b c(int i5, String str, int i6, long j5, long j6, boolean z5, int i7, String str2, String str3) {
            return new d0(i5, str, i6, j5, j6, z5, i7, str2, str3);
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
    @AutoValue
    public static abstract class c {
        public static c a(String str, String str2, boolean z5) {
            return new e0(str, str2, z5);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static g0 b(a aVar, c cVar, b bVar) {
        return new b0(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
