package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.w;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes5.dex */
final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private final w.c f51927a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f51928b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        private w.c f51929a;

        /* renamed from: b, reason: collision with root package name */
        private w.b f51930b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w a() {
            return new m(this.f51929a, this.f51930b);
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w.a b(@q0 w.b bVar) {
            this.f51930b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.w.a
        public w.a c(@q0 w.c cVar) {
            this.f51929a = cVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @q0
    public w.b b() {
        return this.f51928b;
    }

    @Override // com.google.android.datatransport.cct.internal.w
    @q0
    public w.c c() {
        return this.f51927a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f51927a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f51928b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f51927a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f51928b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("앏") + this.f51927a + ProtectedSandApp.s("앐") + this.f51928b + ProtectedSandApp.s("앑");
    }

    private m(@q0 w.c cVar, @q0 w.b bVar) {
        this.f51927a = cVar;
        this.f51928b = bVar;
    }
}
