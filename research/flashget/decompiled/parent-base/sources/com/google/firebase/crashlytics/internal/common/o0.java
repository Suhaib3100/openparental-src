package com.google.firebase.crashlytics.internal.common;

/* compiled from: InstallIdProvider.java */
/* loaded from: classes6.dex */
public interface o0 {

    /* compiled from: InstallIdProvider.java */
    @b9.c
    public static abstract class a {
        static a a(String str, m0 m0Var) {
            return new c(str, m0Var.f(), m0Var.e());
        }

        public static a b(String str) {
            return new c(str, null, null);
        }

        @androidx.annotation.o0
        public abstract String c();

        @androidx.annotation.q0
        public abstract String d();

        @androidx.annotation.q0
        public abstract String e();
    }

    a a();
}
