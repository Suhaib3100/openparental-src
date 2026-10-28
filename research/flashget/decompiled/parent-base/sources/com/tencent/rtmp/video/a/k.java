package com.tencent.rtmp.video.a;

import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;
import com.tencent.rtmp.video.a.f;

/* loaded from: classes7.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72760a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f72761b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72762c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72763d;

    /* renamed from: e, reason: collision with root package name */
    private final VirtualDisplayListener f72764e;

    private k(f fVar, Surface surface, int i4, int i5, VirtualDisplayListener virtualDisplayListener) {
        this.f72760a = fVar;
        this.f72761b = surface;
        this.f72762c = i4;
        this.f72763d = i5;
        this.f72764e = virtualDisplayListener;
    }

    public static Runnable a(f fVar, Surface surface, int i4, int i5, VirtualDisplayListener virtualDisplayListener) {
        return new k(fVar, surface, i4, i5, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f72760a;
        Surface surface = this.f72761b;
        int i4 = this.f72762c;
        int i5 = this.f72763d;
        VirtualDisplayListener virtualDisplayListener = this.f72764e;
        String s4 = ProtectedSandApp.s("屜\u0001");
        if (surface == null || fVar.f72739e == null) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("屡\u0001") + surface + ProtectedSandApp.s("屢\u0001") + fVar.f72739e);
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        f.a aVar = fVar.f72738d.get(surface);
        if (aVar != null) {
            VirtualDisplayWrapper virtualDisplayWrapper = aVar.f72749e;
            if (virtualDisplayWrapper != null) {
                virtualDisplayWrapper.release();
                BaseBridge.printLog(s4, ProtectedSandApp.s("屝\u0001") + aVar.f72749e);
            }
            aVar.f72746b = i4;
            aVar.f72747c = i5;
            aVar.f72748d = virtualDisplayListener;
        } else {
            aVar = new f.a((byte) 0);
            aVar.f72745a = surface;
            aVar.f72746b = i4;
            aVar.f72747c = i5;
            aVar.f72748d = virtualDisplayListener;
            aVar.f72749e = null;
            fVar.f72738d.put(surface, aVar);
        }
        try {
            aVar.f72749e = new VirtualDisplayWrapper(fVar.f72739e.createVirtualDisplay(ProtectedSandApp.s("属\u0001"), aVar.f72746b, aVar.f72747c, 1, 1, aVar.f72745a, null, null));
            BaseBridge.printLog(s4, ProtectedSandApp.s("屟\u0001") + aVar.f72749e);
            VirtualDisplayListener virtualDisplayListener2 = aVar.f72748d;
            if (virtualDisplayListener2 != null) {
                virtualDisplayListener2.onVirtualDisplayCreate(aVar.f72749e);
            }
        } catch (Throwable th) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("屠\u0001").concat(String.valueOf(th)));
        }
    }
}
