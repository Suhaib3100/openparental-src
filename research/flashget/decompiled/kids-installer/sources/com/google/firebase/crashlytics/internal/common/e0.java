package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.m1;
import com.google.auto.value.AutoValue;

/* compiled from: InstallIdProvider.java */
/* loaded from: classes2.dex */
public interface e0 {

    /* compiled from: InstallIdProvider.java */
    @AutoValue
    public static abstract class a {
        static a a(String str, @androidx.annotation.q0 String str2) {
            return new c(str, str2);
        }

        @m1(otherwise = 3)
        public static a b(String str) {
            return new c(str, null);
        }

        @androidx.annotation.o0
        public abstract String c();

        @androidx.annotation.q0
        public abstract String d();
    }

    a a();
}
