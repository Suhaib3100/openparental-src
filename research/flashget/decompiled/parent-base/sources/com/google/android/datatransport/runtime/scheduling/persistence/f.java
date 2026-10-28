package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EventStoreModule.java */
@m8.e
/* loaded from: classes5.dex */
public abstract class f {
    @cd.b("SQLITE_DB_NAME")
    @m8.f
    static String b() {
        return ProtectedSandApp.s("왇");
    }

    @cd.b("PACKAGE_NAME")
    @cd.f
    @m8.f
    static String d(Context context) {
        return context.getPackageName();
    }

    @cd.b("SCHEMA_VERSION")
    @m8.f
    static int e() {
        return w0.f52285t;
    }

    @m8.f
    static e f() {
        return e.f52218f;
    }

    @m8.a
    abstract c a(n0 n0Var);

    @m8.a
    abstract d c(n0 n0Var);

    @m8.a
    abstract p8.a g(n0 n0Var);
}
