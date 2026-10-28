package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72022a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72023b;

    private c(DashboardManager dashboardManager, String str) {
        this.f72022a = dashboardManager;
        this.f72023b = str;
    }

    public static Runnable a(DashboardManager dashboardManager, String str) {
        return new c(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72022a.removeDashboardInternal(this.f72023b);
    }
}
