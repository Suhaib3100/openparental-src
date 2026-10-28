package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final h f71904a = new h();

    private h() {
    }

    public static Callable a() {
        return f71904a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        str = Build.MODEL;
        return str;
    }
}
