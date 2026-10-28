package com.tencent.liteav.videoproducer.capture;

import java.util.Comparator;

/* loaded from: classes7.dex */
final /* synthetic */ class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final e f72565a = new e();

    private e() {
    }

    public static Comparator a() {
        return f72565a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.tencent.liteav.videoproducer.a.a aVar = (com.tencent.liteav.videoproducer.a.a) obj;
        com.tencent.liteav.videoproducer.a.a aVar2 = (com.tencent.liteav.videoproducer.a.a) obj2;
        int i4 = aVar.f72484a;
        int i5 = aVar2.f72484a;
        if (i4 < i5) {
            return -1;
        }
        if (i4 == i5) {
            return aVar.f72485b - aVar2.f72485b;
        }
        return 1;
    }
}
