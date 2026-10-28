package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes5.dex */
final class d extends g.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f52121a;

    /* renamed from: b, reason: collision with root package name */
    private final long f52122b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<g.c> f52123c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    static final class b extends g.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f52124a;

        /* renamed from: b, reason: collision with root package name */
        private Long f52125b;

        /* renamed from: c, reason: collision with root package name */
        private Set<g.c> f52126c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b a() {
            String s4 = this.f52124a == null ? ProtectedSandApp.s("옙") : "";
            if (this.f52125b == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옚"));
            }
            if (this.f52126c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("옛"));
            }
            if (s4.isEmpty()) {
                return new d(this.f52124a.longValue(), this.f52125b.longValue(), this.f52126c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("옜").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a b(long j4) {
            this.f52124a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a c(Set<g.c> set) {
            if (set == null) {
                throw new NullPointerException(ProtectedSandApp.s("옝"));
            }
            this.f52126c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a d(long j4) {
            this.f52125b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long b() {
        return this.f52121a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    Set<g.c> c() {
        return this.f52123c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long d() {
        return this.f52122b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.f52121a == bVar.b() && this.f52122b == bVar.d() && this.f52123c.equals(bVar.c());
    }

    public int hashCode() {
        long j4 = this.f52121a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f52122b;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f52123c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("옞") + this.f52121a + ProtectedSandApp.s("옟") + this.f52122b + ProtectedSandApp.s("옠") + this.f52123c + ProtectedSandApp.s("옡");
    }

    private d(long j4, long j5, Set<g.c> set) {
        this.f52121a = j4;
        this.f52122b = j5;
        this.f52123c = set;
    }
}
