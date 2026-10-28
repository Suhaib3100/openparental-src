package com.tencent.liteav.videoproducer.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final b f72642a;

    private c(b bVar) {
        this.f72642a = bVar;
    }

    public static Runnable a(b bVar) {
        return new c(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f72642a;
        if (bVar.f72619e != null) {
            LiteavLog.w(bVar.f72615a, ProtectedSandApp.s("垠\u0001"));
            bVar.f72619e.a();
        }
    }
}
