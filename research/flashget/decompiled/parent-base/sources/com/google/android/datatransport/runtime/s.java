package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.c1;
import androidx.annotation.q0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.e;

/* compiled from: TransportContext.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class s {

    /* compiled from: TransportContext.java */
    @c.a
    public static abstract class a {
        public abstract s a();

        public abstract a b(String str);

        public abstract a c(@q0 byte[] bArr);

        @c1({c1.a.LIBRARY_GROUP})
        public abstract a d(com.google.android.datatransport.h hVar);
    }

    public static a a() {
        return new e.b().d(com.google.android.datatransport.h.DEFAULT);
    }

    public abstract String b();

    @q0
    public abstract byte[] c();

    @c1({c1.a.LIBRARY_GROUP})
    public abstract com.google.android.datatransport.h d();

    public boolean e() {
        return c() != null;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public s f(com.google.android.datatransport.h hVar) {
        return a().b(b()).d(hVar).c(c()).a();
    }

    public final String toString() {
        return String.format(ProtectedSandApp.s("엯"), b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
