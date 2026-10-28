package com.google.firebase.crashlytics.internal.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.h0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes6.dex */
final class d0 extends h0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f59184a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59185b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59186c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59187d;

    /* renamed from: e, reason: collision with root package name */
    private final int f59188e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.f f59189f;

    d0(String str, String str2, String str3, String str4, int i4, com.google.firebase.crashlytics.internal.f fVar) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﷻ"));
        }
        this.f59184a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﷺ"));
        }
        this.f59185b = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﷹ"));
        }
        this.f59186c = str3;
        if (str4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﷸ"));
        }
        this.f59187d = str4;
        this.f59188e = i4;
        if (fVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﷷ"));
        }
        this.f59189f = fVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public String a() {
        return this.f59184a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public int c() {
        return this.f59188e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public com.google.firebase.crashlytics.internal.f d() {
        return this.f59189f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public String e() {
        return this.f59187d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.a)) {
            return false;
        }
        h0.a aVar = (h0.a) obj;
        return this.f59184a.equals(aVar.a()) && this.f59185b.equals(aVar.f()) && this.f59186c.equals(aVar.g()) && this.f59187d.equals(aVar.e()) && this.f59188e == aVar.c() && this.f59189f.equals(aVar.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public String f() {
        return this.f59185b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.a
    public String g() {
        return this.f59186c;
    }

    public int hashCode() {
        return ((((((((((this.f59184a.hashCode() ^ 1000003) * 1000003) ^ this.f59185b.hashCode()) * 1000003) ^ this.f59186c.hashCode()) * 1000003) ^ this.f59187d.hashCode()) * 1000003) ^ this.f59188e) * 1000003) ^ this.f59189f.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("﷼") + this.f59184a + ProtectedSandApp.s("﷽") + this.f59185b + ProtectedSandApp.s("﷾") + this.f59186c + ProtectedSandApp.s("﷿") + this.f59187d + ProtectedSandApp.s("︀") + this.f59188e + ProtectedSandApp.s("︁") + this.f59189f + ProtectedSandApp.s("︂");
    }
}
