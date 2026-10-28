package com.tencent.liteav.sdkcommon;

/* loaded from: classes7.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final DashboardManager f72028a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72029b;

    /* renamed from: c, reason: collision with root package name */
    private final String f72030c;

    private f(DashboardManager dashboardManager, String str, String str2) {
        this.f72028a = dashboardManager;
        this.f72029b = str;
        this.f72030c = str2;
    }

    public static Runnable a(DashboardManager dashboardManager, String str, String str2) {
        return new f(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72028a.appendLogInternal(this.f72029b, this.f72030c);
    }
}
