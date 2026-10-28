package com.tencent.liteav.videoproducer.capture;

import java.util.Comparator;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final f f72566a = new f();

    private f() {
    }

    public static Comparator a() {
        return f72566a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((com.tencent.liteav.videoproducer.a.a) obj).f72485b - ((com.tencent.liteav.videoproducer.a.a) obj2).f72485b;
    }
}
