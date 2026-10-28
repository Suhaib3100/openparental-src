package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.k;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes3.dex */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f12359a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.cct.internal.a f12360b;

    /* compiled from: AutoValue_ClientInfo.java */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f12361a;

        /* renamed from: b, reason: collision with root package name */
        private com.google.android.datatransport.cct.internal.a f12362b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k a() {
            return new e(this.f12361a, this.f12362b);
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a b(@q0 com.google.android.datatransport.cct.internal.a aVar) {
            this.f12362b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a c(@q0 k.b bVar) {
            this.f12361a = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @q0
    public com.google.android.datatransport.cct.internal.a b() {
        return this.f12360b;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @q0
    public k.b c() {
        return this.f12359a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f12359a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            com.google.android.datatransport.cct.internal.a aVar = this.f12360b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f12359a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.f12360b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("Ῠ") + this.f12359a + ProtectedSandApp.s("Ῡ") + this.f12360b + ProtectedSandApp.s("Ὺ");
    }

    private e(@q0 k.b bVar, @q0 com.google.android.datatransport.cct.internal.a aVar) {
        this.f12359a = bVar;
        this.f12360b = aVar;
    }
}
