package com.tencent.rtmp.video.a;

import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayWrapper;
import com.tencent.rtmp.video.a.f;

/* loaded from: classes7.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72758a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f72759b;

    private j(f fVar, Surface surface) {
        this.f72758a = fVar;
        this.f72759b = surface;
    }

    public static Runnable a(f fVar, Surface surface) {
        return new j(fVar, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayWrapper virtualDisplayWrapper;
        f fVar = this.f72758a;
        Surface surface = this.f72759b;
        if (surface != null) {
            f.a remove = fVar.f72738d.remove(surface);
            if (remove != null && (virtualDisplayWrapper = remove.f72749e) != null) {
                virtualDisplayWrapper.release();
                BaseBridge.printLog(ProtectedSandApp.s("屛\u0001"), ProtectedSandApp.s("屚\u0001") + remove.f72749e);
            }
            fVar.c();
        }
    }
}
