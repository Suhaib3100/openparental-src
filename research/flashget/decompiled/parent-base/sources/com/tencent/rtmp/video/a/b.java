package com.tencent.rtmp.video.a;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f72729a;

    private b(String str) {
        this.f72729a = str;
    }

    public static ThreadFactory a(String str) {
        return new b(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f72729a);
    }
}
