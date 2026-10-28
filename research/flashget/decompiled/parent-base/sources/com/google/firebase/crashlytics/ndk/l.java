package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.ndk.k;
import java.io.File;

/* compiled from: SessionFilesProvider.java */
/* loaded from: classes6.dex */
class l implements com.google.firebase.crashlytics.internal.h {

    /* renamed from: a, reason: collision with root package name */
    private final k f59601a;

    l(k kVar) {
        this.f59601a = kVar;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File a() {
        return this.f59601a.f59590f;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public g0.a b() {
        k.c cVar = this.f59601a.f59585a;
        if (cVar != null) {
            return cVar.f59600b;
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File c() {
        return this.f59601a.f59586b;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File d() {
        return this.f59601a.f59585a.f59599a;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File e() {
        return this.f59601a.f59587c;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File f() {
        return this.f59601a.f59589e;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File g() {
        return this.f59601a.f59591g;
    }

    @Override // com.google.firebase.crashlytics.internal.h
    public File h() {
        return this.f59601a.f59588d;
    }
}
