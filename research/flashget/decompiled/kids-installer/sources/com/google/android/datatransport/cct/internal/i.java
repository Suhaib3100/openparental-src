package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.o;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes3.dex */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f12392a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f12393b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f12394a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f12395b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o a() {
            return new i(this.f12394a, this.f12395b);
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a b(@q0 o.b bVar) {
            this.f12395b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a c(@q0 o.c cVar) {
            this.f12394a = cVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @q0
    public o.b b() {
        return this.f12393b;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @q0
    public o.c c() {
        return this.f12392a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f12392a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f12393b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f12392a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f12393b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("\u2004") + this.f12392a + ProtectedSandApp.s("\u2005") + this.f12393b + ProtectedSandApp.s("\u2006");
    }

    private i(@q0 o.c cVar, @q0 o.b bVar) {
        this.f12392a = cVar;
        this.f12393b = bVar;
    }
}
