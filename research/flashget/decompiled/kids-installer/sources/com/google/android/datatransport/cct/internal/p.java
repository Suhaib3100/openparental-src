package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.q0;

/* compiled from: QosTier.java */
/* loaded from: classes2.dex */
public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<p> valueMap;
    private final int value;

    static {
        p pVar = DEFAULT;
        p pVar2 = UNMETERED_ONLY;
        p pVar3 = UNMETERED_OR_DAILY;
        p pVar4 = FAST_IF_RADIO_AWAKE;
        p pVar5 = NEVER;
        p pVar6 = UNRECOGNIZED;
        SparseArray<p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    p(int i5) {
        this.value = i5;
    }

    @q0
    public static p forNumber(int i5) {
        if (i5 == 0) {
            return DEFAULT;
        }
        if (i5 == 1) {
            return UNMETERED_ONLY;
        }
        if (i5 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i5 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i5 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
