package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.datatransport.cct.internal.g;
import com.google.auto.value.AutoValue;
import j2.a;
import java.util.List;

/* compiled from: LogRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class m {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        @o0
        public abstract m a();

        @o0
        public abstract a b(@q0 k kVar);

        @o0
        public abstract a c(@q0 List<l> list);

        @o0
        abstract a d(@q0 Integer num);

        @o0
        abstract a e(@q0 String str);

        @o0
        public abstract a f(@q0 p pVar);

        @o0
        public abstract a g(long j5);

        @o0
        public abstract a h(long j5);

        @o0
        public a i(int i5) {
            return d(Integer.valueOf(i5));
        }

        @o0
        public a j(@o0 String str) {
            return e(str);
        }
    }

    @o0
    public static a a() {
        return new g.b();
    }

    @q0
    public abstract k b();

    @q0
    @a.InterfaceC0250a(name = "logEvent")
    public abstract List<l> c();

    @q0
    public abstract Integer d();

    @q0
    public abstract String e();

    @q0
    public abstract p f();

    public abstract long g();

    public abstract long h();
}
