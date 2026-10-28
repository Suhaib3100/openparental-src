package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72024a;

    private d(DashboardManager dashboardManager) {
        this.f72024a = dashboardManager;
    }

    public static Runnable a(DashboardManager dashboardManager) {
        return new d(dashboardManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72024a.removeAllDashboardInternal();
    }
}
