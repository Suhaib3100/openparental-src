package com.google.common.collect;

/* compiled from: BoundType.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public enum x {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    x(boolean z4) {
        this.inclusive = z4;
    }

    static x forBoolean(boolean z4) {
        return z4 ? CLOSED : OPEN;
    }
}
