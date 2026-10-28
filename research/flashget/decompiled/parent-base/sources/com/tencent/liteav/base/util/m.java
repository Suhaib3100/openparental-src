package com.tencent.liteav.base.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes7.dex */
final /* synthetic */ class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f71953a;

    private m(String str) {
        this.f71953a = str;
    }

    public static ThreadFactory a(String str) {
        return new m(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f71953a);
    }
}
