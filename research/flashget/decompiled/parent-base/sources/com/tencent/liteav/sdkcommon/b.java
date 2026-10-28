package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72020a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72021b;

    private b(DashboardManager dashboardManager, String str) {
        this.f72020a = dashboardManager;
        this.f72021b = str;
    }

    public static Runnable a(DashboardManager dashboardManager, String str) {
        return new b(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72020a.addDashboardInternal(this.f72021b);
    }
}
