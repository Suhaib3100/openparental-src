package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final f f71902a = new f();

    private f() {
    }

    public static Callable a() {
        return f71902a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String a5;
        a5 = p.a(LiteavSystemInfo.sAppPackageName.a());
        return a5;
    }
}
