package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72018a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f72019b;

    private a(DashboardManager dashboardManager, boolean z4) {
        this.f72018a = dashboardManager;
        this.f72019b = z4;
    }

    public static Runnable a(DashboardManager dashboardManager, boolean z4) {
        return new a(dashboardManager, z4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72018a.showDashboardInternal(this.f72019b);
    }
}
