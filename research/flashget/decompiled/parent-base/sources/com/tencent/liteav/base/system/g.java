package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final g f71903a = new g();

    private g() {
    }

    public static Callable a() {
        return f71903a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] strArr;
        strArr = Build.SUPPORTED_ABIS;
        return strArr;
    }
}
