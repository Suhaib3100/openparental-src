package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final k f71907a = new k();

    private k() {
    }

    public static Callable a() {
        return f71907a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.HARDWARE;
        return str;
    }
}
