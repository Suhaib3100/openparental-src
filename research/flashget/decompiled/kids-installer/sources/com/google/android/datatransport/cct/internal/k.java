package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.datatransport.cct.internal.e;
import com.google.auto.value.AutoValue;

/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    public static abstract class a {
        @o0
        public abstract k a();

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

        b(int i5) {
            this.value = i5;
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
