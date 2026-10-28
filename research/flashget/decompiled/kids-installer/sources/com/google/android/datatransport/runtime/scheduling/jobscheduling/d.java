package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes3.dex */
final class d extends g.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f12591a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12592b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<g.c> f12593c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    static final class b extends g.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f12594a;

        /* renamed from: b, reason: collision with root package name */
        private Long f12595b;

        /* renamed from: c, reason: collision with root package name */
        private Set<g.c> f12596c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b a() {
            String s5 = this.f12594a == null ? ProtectedSandApp.s("⁵") : "";
            if (this.f12595b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⁶"));
            }
            if (this.f12596c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⁷"));
            }
            if (s5.isEmpty()) {
                return new d(this.f12594a.longValue(), this.f12595b.longValue(), this.f12596c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⁸").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a b(long j5) {
            this.f12594a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a c(Set<g.c> set) {
            if (set == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁹"));
            }
            this.f12596c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a d(long j5) {
            this.f12595b = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long b() {
        return this.f12591a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    Set<g.c> c() {
        return this.f12593c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long d() {
        return this.f12592b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.f12591a == bVar.b() && this.f12592b == bVar.d() && this.f12593c.equals(bVar.c());
    }

    public int hashCode() {
        long j5 = this.f12591a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f12592b;
        return ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f12593c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⁺") + this.f12591a + ProtectedSandApp.s("⁻") + this.f12592b + ProtectedSandApp.s("⁼") + this.f12593c + ProtectedSandApp.s("⁽");
    }

    private d(long j5, long j6, Set<g.c> set) {
        this.f12591a = j5;
        this.f12592b = j6;
        this.f12593c = set;
    }
}
