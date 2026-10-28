package com.google.firebase.crashlytics.internal.model;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes3.dex */
final class b0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    private final g0.a f16043a;

    /* renamed from: b, reason: collision with root package name */
    private final g0.c f16044b;

    /* renamed from: c, reason: collision with root package name */
    private final g0.b f16045c;

    b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("⣥"));
        }
        this.f16043a = aVar;
        if (cVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("⣤"));
        }
        this.f16044b = cVar;
        if (bVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("⣣"));
        }
        this.f16045c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.a a() {
        return this.f16043a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.b c() {
        return this.f16045c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.c d() {
        return this.f16044b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f16043a.equals(g0Var.a()) && this.f16044b.equals(g0Var.d()) && this.f16045c.equals(g0Var.c());
    }

    public int hashCode() {
        return ((((this.f16043a.hashCode() ^ 1000003) * 1000003) ^ this.f16044b.hashCode()) * 1000003) ^ this.f16045c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⣦") + this.f16043a + ProtectedSandApp.s("⣧") + this.f16044b + ProtectedSandApp.s("⣨") + this.f16045c + ProtectedSandApp.s("⣩");
    }
}
