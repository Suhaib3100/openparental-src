package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.s;

/* compiled from: AutoValue_ExternalPrivacyContext.java */
/* loaded from: classes5.dex */
final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    private final r f51892a;

    /* compiled from: AutoValue_ExternalPrivacyContext.java */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private r f51893a;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.s.a
        public s a() {
            return new i(this.f51893a);
        }

        @Override // com.google.android.datatransport.cct.internal.s.a
        public s.a b(@q0 r rVar) {
            this.f51893a = rVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.s
    @q0
    public r b() {
        return this.f51892a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f51892a;
        r b5 = ((s) obj).b();
        return rVar == null ? b5 == null : rVar.equals(b5);
    }

    public int hashCode() {
        r rVar = this.f51892a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("씯") + this.f51892a + ProtectedSandApp.s("씰");
    }

    private i(@q0 r rVar) {
        this.f51892a = rVar;
    }
}
