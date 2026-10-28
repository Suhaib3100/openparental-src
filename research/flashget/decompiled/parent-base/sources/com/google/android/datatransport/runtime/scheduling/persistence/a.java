package com.google.android.datatransport.runtime.scheduling.persistence;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.persistence.e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes5.dex */
final class a extends e {

    /* renamed from: g, reason: collision with root package name */
    private final long f52198g;

    /* renamed from: h, reason: collision with root package name */
    private final int f52199h;

    /* renamed from: i, reason: collision with root package name */
    private final int f52200i;

    /* renamed from: j, reason: collision with root package name */
    private final long f52201j;

    /* renamed from: k, reason: collision with root package name */
    private final int f52202k;

    /* compiled from: AutoValue_EventStoreConfig.java */
    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f52203a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f52204b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f52205c;

        /* renamed from: d, reason: collision with root package name */
        private Long f52206d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f52207e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e a() {
            String s4 = this.f52203a == null ? ProtectedSandApp.s("옵") : "";
            if (this.f52204b == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옶"));
            }
            if (this.f52205c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옷"));
            }
            if (this.f52206d == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옸"));
            }
            if (this.f52207e == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옹"));
            }
            if (s4.isEmpty()) {
                return new a(this.f52203a.longValue(), this.f52204b.intValue(), this.f52205c.intValue(), this.f52206d.longValue(), this.f52207e.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("옺").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a b(int i4) {
            this.f52205c = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a c(long j4) {
            this.f52206d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a d(int i4) {
            this.f52204b = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a e(int i4) {
            this.f52207e = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        e.a f(long j4) {
            this.f52203a = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int b() {
        return this.f52200i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long c() {
        return this.f52201j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int d() {
        return this.f52199h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    int e() {
        return this.f52202k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f52198g == eVar.f() && this.f52199h == eVar.d() && this.f52200i == eVar.b() && this.f52201j == eVar.c() && this.f52202k == eVar.e();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    long f() {
        return this.f52198g;
    }

    public int hashCode() {
        long j4 = this.f52198g;
        int i4 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f52199h) * 1000003) ^ this.f52200i) * 1000003;
        long j5 = this.f52201j;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f52202k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("옻"));
        sb.append(this.f52198g);
        sb.append(ProtectedSandApp.s("옼"));
        sb.append(this.f52199h);
        sb.append(ProtectedSandApp.s("옽"));
        sb.append(this.f52200i);
        sb.append(ProtectedSandApp.s("옾"));
        sb.append(this.f52201j);
        sb.append(ProtectedSandApp.s("옿"));
        return android.support.v4.media.b.a(sb, this.f52202k, ProtectedSandApp.s("와"));
    }

    private a(long j4, int i4, int i5, long j5, int i6) {
        this.f52198g = j4;
        this.f52199h = i4;
        this.f52200i = i5;
        this.f52201j = j5;
        this.f52202k = i6;
    }
}
