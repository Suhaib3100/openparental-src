package com.google.firebase.crashlytics.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes6.dex */
class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f58665a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58666b;

    public d0(String str, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f58665a = str;
        this.f58666b = gVar;
    }

    private File b() {
        return this.f58666b.h(this.f58665a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﯴ") + this.f58665a, e4);
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
