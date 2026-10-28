package com.tencent.liteav.base;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final a f71776a = new a();

    private a() {
    }

    public static Callable a() {
        return f71776a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] privateDataDirectorySuffixInternal;
        privateDataDirectorySuffixInternal = PathUtils.setPrivateDataDirectorySuffixInternal();
        return privateDataDirectorySuffixInternal;
    }
}
