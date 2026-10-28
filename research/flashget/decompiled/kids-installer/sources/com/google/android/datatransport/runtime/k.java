package com.google.android.datatransport.runtime;

import androidx.annotation.q0;
import com.google.android.datatransport.runtime.c;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class k {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    public static abstract class a {
        public final a a(String str, int i5) {
            e().put(str, String.valueOf(i5));
            return this;
        }

        public final a b(String str, long j5) {
            e().put(str, String.valueOf(j5));
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

        public abstract a i(long j5);

        public abstract a j(String str);

        public abstract a k(long j5);
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

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public final String j(String str, String str2) {
        String str3 = c().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] k() {
        return e().a();
    }

    public abstract String l();

    public abstract long m();

    public a n() {
        return new c.b().j(l()).g(d()).h(e()).i(f()).k(m()).f(new HashMap(c()));
    }
}
