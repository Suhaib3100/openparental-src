package com.tencent.rtmp.video.a;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.a.f;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72752a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f72753b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72754c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72755d;

    /* renamed from: e, reason: collision with root package name */
    private final MediaProjection f72756e;

    /* renamed from: f, reason: collision with root package name */
    private final VirtualDisplayListener f72757f;

    private i(f fVar, Surface surface, int i4, int i5, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        this.f72752a = fVar;
        this.f72753b = surface;
        this.f72754c = i4;
        this.f72755d = i5;
        this.f72756e = mediaProjection;
        this.f72757f = virtualDisplayListener;
    }

    public static Runnable a(f fVar, Surface surface, int i4, int i5, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        return new i(fVar, surface, i4, i5, mediaProjection, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f72752a;
        Surface surface = this.f72753b;
        int i4 = this.f72754c;
        int i5 = this.f72755d;
        MediaProjection mediaProjection = this.f72756e;
        VirtualDisplayListener virtualDisplayListener = this.f72757f;
        String s4 = ProtectedSandApp.s("屗\u0001");
        if (surface == null) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("屘\u0001"));
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        f.a aVar = new f.a((byte) 0);
        aVar.f72745a = surface;
        aVar.f72746b = i4;
        aVar.f72747c = i5;
        aVar.f72748d = virtualDisplayListener;
        aVar.f72749e = null;
        fVar.f72738d.put(surface, aVar);
        fVar.f72737c.c(fVar.f72742h);
        MediaProjection mediaProjection2 = fVar.f72739e;
        if (mediaProjection2 == null && mediaProjection == null) {
            if (fVar.f72740f) {
                fVar.f72737c.c(fVar.f72741g);
                fVar.f72737c.a(fVar.f72741g, TimeUnit.SECONDS.toMillis(1L));
                return;
            } else {
                fVar.f72740f = true;
                f.a();
                return;
            }
        }
        if (mediaProjection == null || mediaProjection2 == mediaProjection) {
            fVar.b();
            return;
        }
        BaseBridge.printLog(s4, ProtectedSandApp.s("屙\u0001").concat(String.valueOf(mediaProjection)));
        fVar.a(mediaProjection);
    }
}
