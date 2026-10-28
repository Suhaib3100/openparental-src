package com.google.firebase.crashlytics.internal.model;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes3.dex */
final class c0 extends g0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16064a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16065b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16066c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16067d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16068e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.f f16069f;

    c0(String str, String str2, String str3, String str4, int i5, com.google.firebase.crashlytics.internal.f fVar) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤃"));
        }
        this.f16064a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤂"));
        }
        this.f16065b = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤁"));
        }
        this.f16066c = str3;
        if (str4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤀"));
        }
        this.f16067d = str4;
        this.f16068e = i5;
        if (fVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("⣿"));
        }
        this.f16069f = fVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String a() {
        return this.f16064a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public int c() {
        return this.f16068e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public com.google.firebase.crashlytics.internal.f d() {
        return this.f16069f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String e() {
        return this.f16067d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f16064a.equals(aVar.a()) && this.f16065b.equals(aVar.f()) && this.f16066c.equals(aVar.g()) && this.f16067d.equals(aVar.e()) && this.f16068e == aVar.c() && this.f16069f.equals(aVar.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String f() {
        return this.f16065b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.a
    public String g() {
        return this.f16066c;
    }

    public int hashCode() {
        return ((((((((((this.f16064a.hashCode() ^ 1000003) * 1000003) ^ this.f16065b.hashCode()) * 1000003) ^ this.f16066c.hashCode()) * 1000003) ^ this.f16067d.hashCode()) * 1000003) ^ this.f16068e) * 1000003) ^ this.f16069f.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⤄") + this.f16064a + ProtectedSandApp.s("⤅") + this.f16065b + ProtectedSandApp.s("⤆") + this.f16066c + ProtectedSandApp.s("⤇") + this.f16067d + ProtectedSandApp.s("⤈") + this.f16068e + ProtectedSandApp.s("⤉") + this.f16069f + ProtectedSandApp.s("⤊");
    }
}
