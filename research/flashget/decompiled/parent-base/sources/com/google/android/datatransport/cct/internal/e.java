package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.o;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes5.dex */
final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f51878a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.cct.internal.a f51879b;

    /* compiled from: AutoValue_ClientInfo.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f51880a;

        /* renamed from: b, reason: collision with root package name */
        private com.google.android.datatransport.cct.internal.a f51881b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o a() {
            return new e(this.f51880a, this.f51881b);
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a b(@q0 com.google.android.datatransport.cct.internal.a aVar) {
            this.f51881b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a c(@q0 o.b bVar) {
            this.f51880a = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @q0
    public com.google.android.datatransport.cct.internal.a b() {
        return this.f51879b;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    @q0
    public o.b c() {
        return this.f51878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f51878a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            com.google.android.datatransport.cct.internal.a aVar = this.f51879b;
            if (aVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f51878a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.f51879b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("씤") + this.f51878a + ProtectedSandApp.s("씥") + this.f51879b + ProtectedSandApp.s("씦");
    }

    private e(@q0 o.b bVar, @q0 com.google.android.datatransport.cct.internal.a aVar) {
        this.f51878a = bVar;
        this.f51879b = aVar;
    }
}
