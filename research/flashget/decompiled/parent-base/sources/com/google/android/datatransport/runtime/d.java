package com.google.android.datatransport.runtime;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.r;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes5.dex */
final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    private final s f52006a;

    /* renamed from: b, reason: collision with root package name */
    private final String f52007b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.f<?> f52008c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.k<?, byte[]> f52009d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.e f52010e;

    /* compiled from: AutoValue_SendRequest.java */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private s f52011a;

        /* renamed from: b, reason: collision with root package name */
        private String f52012b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.f<?> f52013c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.android.datatransport.k<?, byte[]> f52014d;

        /* renamed from: e, reason: collision with root package name */
        private com.google.android.datatransport.e f52015e;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r a() {
            String s4 = this.f52011a == null ? ProtectedSandApp.s("엏") : "";
            if (this.f52012b == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("에"));
            }
            if (this.f52013c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("엑"));
            }
            if (this.f52014d == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("엒"));
            }
            if (this.f52015e == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("엓"));
            }
            if (s4.isEmpty()) {
                return new d(this.f52011a, this.f52012b, this.f52013c, this.f52014d, this.f52015e);
            }
            throw new IllegalStateException(ProtectedSandApp.s("엔").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a b(com.google.android.datatransport.e eVar) {
            if (eVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엕"));
            }
            this.f52015e = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a c(com.google.android.datatransport.f<?> fVar) {
            if (fVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엖"));
            }
            this.f52013c = fVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        r.a e(com.google.android.datatransport.k<?, byte[]> kVar) {
            if (kVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엗"));
            }
            this.f52014d = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a f(s sVar) {
            if (sVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엘"));
            }
            this.f52011a = sVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public r.a g(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("엙"));
            }
            this.f52012b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.r
    public com.google.android.datatransport.e b() {
        return this.f52010e;
    }

    @Override // com.google.android.datatransport.runtime.r
    com.google.android.datatransport.f<?> c() {
        return this.f52008c;
    }

    @Override // com.google.android.datatransport.runtime.r
    com.google.android.datatransport.k<?, byte[]> e() {
        return this.f52009d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f52006a.equals(rVar.f()) && this.f52007b.equals(rVar.g()) && this.f52008c.equals(rVar.c()) && this.f52009d.equals(rVar.e()) && this.f52010e.equals(rVar.b());
    }

    @Override // com.google.android.datatransport.runtime.r
    public s f() {
        return this.f52006a;
    }

    @Override // com.google.android.datatransport.runtime.r
    public String g() {
        return this.f52007b;
    }

    public int hashCode() {
        return ((((((((this.f52006a.hashCode() ^ 1000003) * 1000003) ^ this.f52007b.hashCode()) * 1000003) ^ this.f52008c.hashCode()) * 1000003) ^ this.f52009d.hashCode()) * 1000003) ^ this.f52010e.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("엚") + this.f52006a + ProtectedSandApp.s("엛") + this.f52007b + ProtectedSandApp.s("엜") + this.f52008c + ProtectedSandApp.s("엝") + this.f52009d + ProtectedSandApp.s("엞") + this.f52010e + ProtectedSandApp.s("엟");
    }

    private d(s sVar, String str, com.google.android.datatransport.f<?> fVar, com.google.android.datatransport.k<?, byte[]> kVar, com.google.android.datatransport.e eVar) {
        this.f52006a = sVar;
        this.f52007b = str;
        this.f52008c = fVar;
        this.f52009d = kVar;
        this.f52010e = eVar;
    }
}
