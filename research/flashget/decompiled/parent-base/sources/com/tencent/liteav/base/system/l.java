package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final l f71908a = new l();

    private l() {
    }

    public static Callable a() {
        return f71908a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.VERSION.RELEASE;
        return str;
    }
}
