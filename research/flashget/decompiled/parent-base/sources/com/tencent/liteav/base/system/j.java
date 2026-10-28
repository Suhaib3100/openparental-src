package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final j f71906a = new j();

    private j() {
    }

    public static Callable a() {
        return f71906a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.MANUFACTURER;
        return str;
    }
}
