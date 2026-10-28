package com.google.firebase.crashlytics.internal.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.h0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes6.dex */
final class f0 extends h0.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f59209a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59210b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f59211c;

    f0(String str, String str2, boolean z4) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("︫"));
        }
        this.f59209a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("︪"));
        }
        this.f59210b = str2;
        this.f59211c = z4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.c
    public boolean b() {
        return this.f59211c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.c
    public String c() {
        return this.f59210b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.c
    public String d() {
        return this.f59209a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.c)) {
            return false;
        }
        h0.c cVar = (h0.c) obj;
        return this.f59209a.equals(cVar.d()) && this.f59210b.equals(cVar.c()) && this.f59211c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f59209a.hashCode() ^ 1000003) * 1000003) ^ this.f59210b.hashCode()) * 1000003) ^ (this.f59211c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︬"));
        sb.append(this.f59209a);
        sb.append(ProtectedSandApp.s("︭"));
        sb.append(this.f59210b);
        sb.append(ProtectedSandApp.s("︮"));
        return androidx.appcompat.app.h.a(sb, this.f59211c, ProtectedSandApp.s("︯"));
    }
}
