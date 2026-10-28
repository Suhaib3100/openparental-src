package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.cct.internal.e;

/* compiled from: ClientInfo.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class o {

    /* compiled from: ClientInfo.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract o a();

        @o0
        public abstract a b(@q0 com.google.android.datatransport.cct.internal.a aVar);

        @o0
        public abstract a c(@q0 b bVar);
    }

    /* compiled from: ClientInfo.java */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i4) {
            this.value = i4;
        }
    }

    @o0
    public static a a() {
        return new e.b();
    }

    @q0
    public abstract com.google.android.datatransport.cct.internal.a b();

    @q0
    public abstract b c();
}
