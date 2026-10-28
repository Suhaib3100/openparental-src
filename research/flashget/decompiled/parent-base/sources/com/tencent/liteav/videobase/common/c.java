package com.tencent.liteav.videobase.common;

/* loaded from: classes7.dex */
public enum c {
    f72209a(65535),
    f72210b(0),
    f72211c(1),
    f72212d(6),
    f72213e(7),
    f72214f(8),
    f72215g(17),
    f72216h(18),
    f72217i(19),
    f72218j(20);


    /* renamed from: k, reason: collision with root package name */
    private static final c[] f72219k = values();
    public final int mValue;

    c(int i4) {
        this.mValue = i4;
    }

    public static c a(int i4) {
        for (c cVar : f72219k) {
            if (cVar.mValue == i4) {
                return cVar;
            }
        }
        return f72209a;
    }
}
