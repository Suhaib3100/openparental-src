package com.android.volley;

import androidx.annotation.q0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes3.dex */
public interface e {

    /* compiled from: Cache.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f40862a;

        /* renamed from: b, reason: collision with root package name */
        public String f40863b;

        /* renamed from: c, reason: collision with root package name */
        public long f40864c;

        /* renamed from: d, reason: collision with root package name */
        public long f40865d;

        /* renamed from: e, reason: collision with root package name */
        public long f40866e;

        /* renamed from: f, reason: collision with root package name */
        public long f40867f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f40868g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<i> f40869h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j4) {
            return this.f40866e < j4;
        }

        public boolean c() {
            return d(System.currentTimeMillis());
        }

        boolean d(long j4) {
            return this.f40867f < j4;
        }
    }

    void c();

    void clear();

    void d(String str, boolean z4);

    void e(String str, a aVar);

    @q0
    a get(String str);

    void remove(String str);
}
