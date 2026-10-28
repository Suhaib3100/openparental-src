package com.tencent.liteav.videobase.common;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final a f72203a = new a();

    private a() {
    }

    public static Runnable a() {
        return f72203a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HDRCapability.checkIsHDR10Supported();
    }
}
