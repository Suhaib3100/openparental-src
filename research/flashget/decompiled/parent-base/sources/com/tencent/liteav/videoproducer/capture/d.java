package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.Size;
import java.util.Comparator;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final d f72564a = new d();

    private d() {
    }

    public static Comparator a() {
        return f72564a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Size) obj2).getArea() - ((Size) obj).getArea();
    }
}
