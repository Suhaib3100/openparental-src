package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72025a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72026b;

    /* renamed from: c, reason: collision with root package name */
    private final String f72027c;

    private e(DashboardManager dashboardManager, String str, String str2) {
        this.f72025a = dashboardManager;
        this.f72026b = str;
        this.f72027c = str2;
    }

    public static Runnable a(DashboardManager dashboardManager, String str, String str2) {
        return new e(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72025a.setStatusInternal(this.f72026b, this.f72027c);
    }
}
