package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.sessions.api.b;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* loaded from: classes3.dex */
public class m implements com.google.firebase.sessions.api.b {

    /* renamed from: a, reason: collision with root package name */
    private final z f15629a;

    /* renamed from: b, reason: collision with root package name */
    private final l f15630b;

    public m(z zVar, com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f15629a = zVar;
        this.f15630b = new l(fVar);
    }

    @Override // com.google.firebase.sessions.api.b
    public boolean a() {
        return this.f15629a.d();
    }

    @Override // com.google.firebase.sessions.api.b
    @androidx.annotation.o0
    public b.a b() {
        return b.a.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.b
    public void c(@androidx.annotation.o0 b.C0231b c0231b) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⠦") + c0231b);
        this.f15630b.h(c0231b.d());
    }

    @androidx.annotation.q0
    public String d(@androidx.annotation.o0 String str) {
        return this.f15630b.c(str);
    }

    public void e(@androidx.annotation.q0 String str) {
        this.f15630b.i(str);
    }
}
