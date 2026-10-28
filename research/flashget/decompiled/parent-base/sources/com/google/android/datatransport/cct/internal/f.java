package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.p;

/* compiled from: AutoValue_ComplianceData.java */
/* loaded from: classes5.dex */
final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f51882a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f51883b;

    /* compiled from: AutoValue_ComplianceData.java */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f51884a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f51885b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p a() {
            return new f(this.f51884a, this.f51885b);
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p.a b(@q0 s sVar) {
            this.f51884a = sVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p.a c(@q0 p.b bVar) {
            this.f51885b = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @q0
    public s b() {
        return this.f51882a;
    }

    @Override // com.google.android.datatransport.cct.internal.p
    @q0
    public p.b c() {
        return this.f51883b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f51882a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f51883b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f51882a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f51883b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("씧") + this.f51882a + ProtectedSandApp.s("씨") + this.f51883b + ProtectedSandApp.s("씩");
    }

    private f(@q0 s sVar, @q0 p.b bVar) {
        this.f51882a = sVar;
        this.f51883b = bVar;
    }
}
