package com.google.android.datatransport.runtime;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.k;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes3.dex */
final class c extends k {

    /* renamed from: a, reason: collision with root package name */
    private final String f12446a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f12447b;

    /* renamed from: c, reason: collision with root package name */
    private final j f12448c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12449d;

    /* renamed from: e, reason: collision with root package name */
    private final long f12450e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f12451f;

    /* compiled from: AutoValue_EventInternal.java */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private String f12452a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12453b;

        /* renamed from: c, reason: collision with root package name */
        private j f12454c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12455d;

        /* renamed from: e, reason: collision with root package name */
        private Long f12456e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f12457f;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k d() {
            String s5 = this.f12452a == null ? ProtectedSandApp.s("\u202a") : "";
            if (this.f12454c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("\u202b"));
            }
            if (this.f12455d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("\u202c"));
            }
            if (this.f12456e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("\u202d"));
            }
            if (this.f12457f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("\u202e"));
            }
            if (s5.isEmpty()) {
                return new c(this.f12452a, this.f12453b, this.f12454c, this.f12455d.longValue(), this.f12456e.longValue(), this.f12457f);
            }
            throw new IllegalStateException(ProtectedSandApp.s(" ").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.k.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f12457f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException(ProtectedSandApp.s("‰"));
        }

        @Override // com.google.android.datatransport.runtime.k.a
        protected k.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException(ProtectedSandApp.s("‱"));
            }
            this.f12457f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a g(Integer num) {
            this.f12453b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a h(j jVar) {
            if (jVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("′"));
            }
            this.f12454c = jVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a i(long j5) {
            this.f12455d = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a j(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("″"));
            }
            this.f12452a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a k(long j5) {
            this.f12456e = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.k
    protected Map<String, String> c() {
        return this.f12451f;
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public Integer d() {
        return this.f12447b;
    }

    @Override // com.google.android.datatransport.runtime.k
    public j e() {
        return this.f12448c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12446a.equals(kVar.l()) && ((num = this.f12447b) != null ? num.equals(kVar.d()) : kVar.d() == null) && this.f12448c.equals(kVar.e()) && this.f12449d == kVar.f() && this.f12450e == kVar.m() && this.f12451f.equals(kVar.c());
    }

    @Override // com.google.android.datatransport.runtime.k
    public long f() {
        return this.f12449d;
    }

    public int hashCode() {
        int hashCode = (this.f12446a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12447b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12448c.hashCode()) * 1000003;
        long j5 = this.f12449d;
        int i5 = (hashCode2 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f12450e;
        return ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f12451f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.k
    public String l() {
        return this.f12446a;
    }

    @Override // com.google.android.datatransport.runtime.k
    public long m() {
        return this.f12450e;
    }

    public String toString() {
        return ProtectedSandApp.s("‴") + this.f12446a + ProtectedSandApp.s("‵") + this.f12447b + ProtectedSandApp.s("‶") + this.f12448c + ProtectedSandApp.s("‷") + this.f12449d + ProtectedSandApp.s("‸") + this.f12450e + ProtectedSandApp.s("‹") + this.f12451f + ProtectedSandApp.s("›");
    }

    private c(String str, @q0 Integer num, j jVar, long j5, long j6, Map<String, String> map) {
        this.f12446a = str;
        this.f12447b = num;
        this.f12448c = jVar;
        this.f12449d = j5;
        this.f12450e = j6;
        this.f12451f = map;
    }
}
