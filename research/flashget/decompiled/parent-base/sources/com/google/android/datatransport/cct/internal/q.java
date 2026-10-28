package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.cct.internal.g;

/* compiled from: ExperimentIds.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class q {

    /* compiled from: ExperimentIds.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract q a();

        @o0
        public abstract a b(@q0 byte[] bArr);

        @o0
        public abstract a c(@q0 byte[] bArr);
    }

    @o0
    public static a a() {
        return new g.b();
    }

    @q0
    public abstract byte[] b();

    @q0
    public abstract byte[] c();
}
