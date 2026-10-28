package com.tencent.liteav.videobase.common;

/* loaded from: classes7.dex */
public enum b {
    f72204a(-1),
    f72205b(0),
    f72206c(1),
    f72207d(2);

    final int mValue;

    b(int i4) {
        this.mValue = i4;
    }

    public static b a(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? f72204a : f72207d : f72206c : f72205b;
    }
}
