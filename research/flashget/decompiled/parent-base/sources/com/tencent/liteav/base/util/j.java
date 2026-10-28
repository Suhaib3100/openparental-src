package com.tencent.liteav.base.util;

import com.tencent.liteav.base.ContextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final j f71938a = new j();

    private j() {
    }

    public static Callable a() {
        return f71938a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(i.a(ContextUtils.getApplicationContext()));
        return valueOf;
    }
}
