package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes2.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f15728a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15729b;

    public t(String str, com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f15728a = str;
        this.f15729b = fVar;
    }

    private File b() {
        return this.f15729b.f(this.f15728a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᒒ") + this.f15728a, e6);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
