package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.datatransport.cct.internal.f;
import com.google.auto.value.AutoValue;

/* compiled from: LogEvent.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class l {

    /* compiled from: LogEvent.java */
    @AutoValue.Builder
    public static abstract class a {
        @o0
        public abstract l a();

        @o0
        public abstract a b(@q0 Integer num);

        @o0
        public abstract a c(long j5);

        @o0
        public abstract a d(long j5);

        @o0
        public abstract a e(@q0 o oVar);

        @o0
        abstract a f(@q0 byte[] bArr);

        @o0
        abstract a g(@q0 String str);

        @o0
        public abstract a h(long j5);
    }

    private static a a() {
        return new f.b();
    }

    @o0
    public static a i(@o0 String str) {
        return new f.b().g(str);
    }

    @o0
    public static a j(@o0 byte[] bArr) {
        return new f.b().f(bArr);
    }

    @q0
    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    @q0
    public abstract o e();

    @q0
    public abstract byte[] f();

    @q0
    public abstract String g();

    public abstract long h();
}
