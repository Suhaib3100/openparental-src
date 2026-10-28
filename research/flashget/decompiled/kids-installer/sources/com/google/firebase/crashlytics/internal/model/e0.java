package com.google.firebase.crashlytics.internal.model;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes3.dex */
final class e0 extends g0.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16089a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16090b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16091c;

    e0(String str, String str2, boolean z5) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤳"));
        }
        this.f16089a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤲"));
        }
        this.f16090b = str2;
        this.f16091c = z5;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public boolean b() {
        return this.f16091c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public String c() {
        return this.f16090b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.c
    public String d() {
        return this.f16089a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f16089a.equals(cVar.d()) && this.f16090b.equals(cVar.c()) && this.f16091c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f16089a.hashCode() ^ 1000003) * 1000003) ^ this.f16090b.hashCode()) * 1000003) ^ (this.f16091c ? 1231 : 1237);
    }

    public String toString() {
        return ProtectedSandApp.s("⤴") + this.f16089a + ProtectedSandApp.s("⤵") + this.f16090b + ProtectedSandApp.s("⤶") + this.f16091c + ProtectedSandApp.s("⤷");
    }
}
