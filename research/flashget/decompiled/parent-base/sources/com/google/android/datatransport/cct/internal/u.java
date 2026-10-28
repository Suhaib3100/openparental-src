package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.cct.internal.k;
import java.util.List;
import t9.a;

/* compiled from: LogRequest.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class u {

    /* compiled from: LogRequest.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract u a();

        @o0
        public abstract a b(@q0 o oVar);

        @o0
        public abstract a c(@q0 List<t> list);

        @o0
        abstract a d(@q0 Integer num);

        @o0
        abstract a e(@q0 String str);

        @o0
        public abstract a f(@q0 x xVar);

        @o0
        public abstract a g(long j4);

        @o0
        public abstract a h(long j4);

        @o0
        public a i(int i4) {
            return d(Integer.valueOf(i4));
        }

        @o0
        public a j(@o0 String str) {
            return e(str);
        }
    }

    @o0
    public static a a() {
        return new k.b();
    }

    @q0
    public abstract o b();

    @q0
    @a.InterfaceC1396a(name = "logEvent")
    public abstract List<t> c();

    @q0
    public abstract Integer d();

    @q0
    public abstract String e();

    @q0
    public abstract x f();

    public abstract long g();

    public abstract long h();
}
