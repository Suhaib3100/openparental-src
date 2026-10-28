package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final o f71911a = new o();

    private o() {
    }

    public static Callable a() {
        return f71911a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a();
    }
}
