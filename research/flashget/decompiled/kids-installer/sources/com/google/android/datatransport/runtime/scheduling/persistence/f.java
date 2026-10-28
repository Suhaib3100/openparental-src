package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: EventStoreModule.java */
@h1.h
/* loaded from: classes2.dex */
public abstract class f {
    @h1.i
    @h3.b("SQLITE_DB_NAME")
    static String b() {
        return ProtectedSandApp.s("॑");
    }

    @h1.i
    @h3.b("PACKAGE_NAME")
    @h3.f
    static String d(Context context) {
        return context.getPackageName();
    }

    @h1.i
    @h3.b("SCHEMA_VERSION")
    static int e() {
        return u0.G;
    }

    @h1.i
    static e f() {
        return e.f12691f;
    }

    @h1.a
    abstract c a(n0 n0Var);

    @h1.a
    abstract d c(n0 n0Var);

    @h1.a
    abstract l1.a g(n0 n0Var);
}
