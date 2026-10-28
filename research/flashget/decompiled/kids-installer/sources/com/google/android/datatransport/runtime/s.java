package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.c1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.e;
import com.google.auto.value.AutoValue;

/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class s {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract s a();

        public abstract a b(String str);

        public abstract a c(@q0 byte[] bArr);

        @c1({c1.a.LIBRARY_GROUP})
        public abstract a d(com.google.android.datatransport.e eVar);
    }

    public static a a() {
        return new e.b().d(com.google.android.datatransport.e.DEFAULT);
    }

    public abstract String b();

    @q0
    public abstract byte[] c();

    @c1({c1.a.LIBRARY_GROUP})
    public abstract com.google.android.datatransport.e d();

    public boolean e() {
        return c() != null;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public s f(com.google.android.datatransport.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format(ProtectedSandApp.s("़"), objArr);
    }
}
