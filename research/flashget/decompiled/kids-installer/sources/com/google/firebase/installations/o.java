package com.google.firebase.installations;

import androidx.annotation.o0;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

/* compiled from: InstallationTokenResult.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class o {

    /* compiled from: InstallationTokenResult.java */
    @AutoValue.Builder
    public static abstract class a {
        @o0
        public abstract o a();

        @o0
        public abstract a b(@o0 String str);

        @o0
        public abstract a c(long j5);

        @o0
        public abstract a d(long j5);
    }

    @o0
    public static a a() {
        return new a.b();
    }

    @o0
    public abstract String b();

    @o0
    public abstract long c();

    @o0
    public abstract long d();

    @o0
    public abstract a e();
}
