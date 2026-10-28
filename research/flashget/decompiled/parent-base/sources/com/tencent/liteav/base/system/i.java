package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final i f71905a = new i();

    private i() {
    }

    public static Callable a() {
        return f71905a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.BRAND;
        return str;
    }
}
