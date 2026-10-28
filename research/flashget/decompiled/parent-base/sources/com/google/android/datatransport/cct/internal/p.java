package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.o0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.datatransport.cct.internal.f;

/* compiled from: ComplianceData.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class p {

    /* compiled from: ComplianceData.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract p a();

        @o0
        public abstract a b(@q0 s sVar);

        @o0
        public abstract a c(@q0 b bVar);
    }

    /* compiled from: ComplianceData.java */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<b> valueMap;
        private final int value;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i4) {
            this.value = i4;
        }

        @q0
        public static b forNumber(int i4) {
            return valueMap.get(i4);
        }

        public int getValue() {
            return this.value;
        }
    }

    @o0
    public static a a() {
        return new f.b();
    }

    @q0
    public abstract s b();

    @q0
    public abstract b c();
}
