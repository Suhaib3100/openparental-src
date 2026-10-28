package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final n f71910a = new n();

    private n() {
    }

    public static Callable a() {
        return f71910a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.BOARD;
        return str;
    }
}
