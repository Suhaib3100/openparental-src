package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.q0;

/* compiled from: QosTier.java */
/* loaded from: classes5.dex */
public enum x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<x> valueMap;
    private final int value;

    static {
        x xVar = DEFAULT;
        x xVar2 = UNMETERED_ONLY;
        x xVar3 = UNMETERED_OR_DAILY;
        x xVar4 = FAST_IF_RADIO_AWAKE;
        x xVar5 = NEVER;
        x xVar6 = UNRECOGNIZED;
        SparseArray<x> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, xVar);
        sparseArray.put(1, xVar2);
        sparseArray.put(2, xVar3);
        sparseArray.put(3, xVar4);
        sparseArray.put(4, xVar5);
        sparseArray.put(-1, xVar6);
    }

    x(int i4) {
        this.value = i4;
    }

    @q0
    public static x forNumber(int i4) {
        if (i4 == 0) {
            return DEFAULT;
        }
        if (i4 == 1) {
            return UNMETERED_ONLY;
        }
        if (i4 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i4 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i4 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
