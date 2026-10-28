package com.tencent.liteav.videobase.common;

/* loaded from: classes7.dex */
public enum d {
    f72221a(0),
    f72222b(1),
    f72223c(2),
    f72224d(3),
    f72225e(11),
    f72226f(12),
    f72227g(13);


    /* renamed from: h, reason: collision with root package name */
    private static final d[] f72228h = values();
    public final int mValue;

    d(int i4) {
        this.mValue = i4;
    }

    public static d a(int i4) {
        for (d dVar : f72228h) {
            if (dVar.mValue == i4) {
                return dVar;
            }
        }
        return f72221a;
    }
}
