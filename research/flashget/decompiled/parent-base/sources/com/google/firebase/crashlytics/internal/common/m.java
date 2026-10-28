package com.google.firebase.crashlytics.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.sessions.api.b;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* loaded from: classes6.dex */
public class m implements com.google.firebase.sessions.api.b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f58761a;

    /* renamed from: b, reason: collision with root package name */
    private final l f58762b;

    public m(i0 i0Var, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f58761a = i0Var;
        this.f58762b = new l(gVar);
    }

    @Override // com.google.firebase.sessions.api.b
    public boolean a() {
        return this.f58761a.d();
    }

    @Override // com.google.firebase.sessions.api.b
    @androidx.annotation.o0
    public b.a b() {
        return b.a.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.b
    public void c(@androidx.annotation.o0 b.C0938b c0938b) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﱠ") + c0938b);
        this.f58762b.h(c0938b.d());
    }

    @androidx.annotation.q0
    public String d(@androidx.annotation.o0 String str) {
        return this.f58762b.c(str);
    }

    public void e(@androidx.annotation.q0 String str) {
        this.f58762b.i(str);
    }
}
