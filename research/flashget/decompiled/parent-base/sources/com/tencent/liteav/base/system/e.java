package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final e f71901a = new e();

    private e() {
    }

    public static Callable a() {
        return f71901a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.c();
    }
}
