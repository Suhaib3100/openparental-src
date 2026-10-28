package com.google.firebase.crashlytics.internal.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.h0;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes6.dex */
final class c0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private final h0.a f59162a;

    /* renamed from: b, reason: collision with root package name */
    private final h0.c f59163b;

    /* renamed from: c, reason: collision with root package name */
    private final h0.b f59164c;

    c0(h0.a aVar, h0.c cVar, h0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ufde9"));
        }
        this.f59162a = aVar;
        if (cVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ufde8"));
        }
        this.f59163b = cVar;
        if (bVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ufde7"));
        }
        this.f59164c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0
    public h0.a a() {
        return this.f59162a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0
    public h0.b c() {
        return this.f59164c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0
    public h0.c d() {
        return this.f59163b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f59162a.equals(h0Var.a()) && this.f59163b.equals(h0Var.d()) && this.f59164c.equals(h0Var.c());
    }

    public int hashCode() {
        return ((((this.f59162a.hashCode() ^ 1000003) * 1000003) ^ this.f59163b.hashCode()) * 1000003) ^ this.f59164c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("\ufdea") + this.f59162a + ProtectedSandApp.s("\ufdeb") + this.f59163b + ProtectedSandApp.s("\ufdec") + this.f59164c + ProtectedSandApp.s("\ufded");
    }
}
