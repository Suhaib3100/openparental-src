package com.google.android.datatransport.runtime;

import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.runtime.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class k {

    /* compiled from: EventInternal.java */
    @c.a
    public static abstract class a {
        public final a a(String str, int i4) {
            e().put(str, String.valueOf(i4));
            return this;
        }

        public final a b(String str, long j4) {
            e().put(str, String.valueOf(j4));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract k d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(j jVar);

        public abstract a i(long j4);

        public abstract a j(byte[] bArr);

        public abstract a k(byte[] bArr);

        public abstract a l(Integer num);

        public abstract a m(String str);

        public abstract a n(String str);

        public abstract a o(long j4);
    }

    public static a a() {
        return new c.b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract Map<String, String> c();

    @q0
    public abstract Integer d();

    public abstract j e();

    public abstract long f();

    @q0
    public abstract byte[] g();

    @q0
    public abstract byte[] h();

    public final int i(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long j(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> k() {
        return Collections.unmodifiableMap(c());
    }

    public final String l(String str, String str2) {
        String str3 = c().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] m() {
        return e().a();
    }

    @q0
    public abstract Integer n();

    @q0
    public abstract String o();

    public abstract String p();

    public abstract long q();

    public a r() {
        return new c.b().n(p()).g(d()).l(n()).m(o()).j(g()).k(h()).h(e()).i(f()).o(q()).f(new HashMap(c()));
    }
}
