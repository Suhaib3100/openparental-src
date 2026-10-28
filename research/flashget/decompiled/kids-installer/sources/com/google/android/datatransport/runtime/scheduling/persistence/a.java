package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.persistence.e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes3.dex */
final class a extends e {

    /* renamed from: g, reason: collision with root package name */
    private final long f12668g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12669h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12670i;

    /* renamed from: j, reason: collision with root package name */
    private final long f12671j;

    /* renamed from: k, reason: collision with root package name */
    private final int f12672k;

    /* compiled from: AutoValue_EventStoreConfig.java */
    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f12673a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12674b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f12675c;

        /* renamed from: d, reason: collision with root package name */
        private Long f12676d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f12677e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e a() {
            String s5 = this.f12673a == null ? ProtectedSandApp.s("₍") : "";
            if (this.f12674b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("₎"));
            }
            if (this.f12675c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("\u208f"));
            }
            if (this.f12676d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("ₐ"));
            }
            if (this.f12677e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("ₑ"));
            }
            if (s5.isEmpty()) {
                return new a(this.f12673a.longValue(), this.f12674b.intValue(), this.f12675c.intValue(), this.f12676d.longValue(), this.f12677e.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("ₒ").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a b(int i5) {
            this.f12675c = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a c(long j5) {
            this.f12676d = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a d(int i5) {
            this.f12674b = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a e(int i5) {
            this.f12677e = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a f(long j5) {
            this.f12673a = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int b() {
        return this.f12670i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long c() {
        return this.f12671j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int d() {
        return this.f12669h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int e() {
        return this.f12672k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12668g == eVar.f() && this.f12669h == eVar.d() && this.f12670i == eVar.b() && this.f12671j == eVar.c() && this.f12672k == eVar.e();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long f() {
        return this.f12668g;
    }

    public int hashCode() {
        long j5 = this.f12668g;
        int i5 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f12669h) * 1000003) ^ this.f12670i) * 1000003;
        long j6 = this.f12671j;
        return ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f12672k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ₓ"));
        sb.append(this.f12668g);
        sb.append(ProtectedSandApp.s("ₔ"));
        sb.append(this.f12669h);
        sb.append(ProtectedSandApp.s("ₕ"));
        sb.append(this.f12670i);
        sb.append(ProtectedSandApp.s("ₖ"));
        sb.append(this.f12671j);
        sb.append(ProtectedSandApp.s("ₗ"));
        return androidx.constraintlayout.solver.e.a(sb, this.f12672k, ProtectedSandApp.s("ₘ"));
    }

    private a(long j5, int i5, int i6, long j6, int i7) {
        this.f12668g = j5;
        this.f12669h = i5;
        this.f12670i = i6;
        this.f12671j = j6;
        this.f12672k = i7;
    }
}
