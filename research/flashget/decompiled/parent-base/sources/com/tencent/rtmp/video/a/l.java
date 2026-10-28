package com.tencent.rtmp.video.a;

import android.media.projection.MediaProjection;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.a.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72765a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaProjection f72766b;

    private l(f fVar, MediaProjection mediaProjection) {
        this.f72765a = fVar;
        this.f72766b = mediaProjection;
    }

    public static Runnable a(f fVar, MediaProjection mediaProjection) {
        return new l(fVar, mediaProjection);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f72765a;
        MediaProjection mediaProjection = this.f72766b;
        fVar.f72740f = false;
        if (mediaProjection == null) {
            HashMap hashMap = new HashMap(fVar.f72738d);
            fVar.f72738d.clear();
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                VirtualDisplayListener virtualDisplayListener = ((f.a) it.next()).f72748d;
                if (virtualDisplayListener != null) {
                    virtualDisplayListener.onStartFinish(false, true);
                }
            }
            f.d();
            return;
        }
        BaseBridge.printLog(ProtectedSandApp.s("層\u0001"), ProtectedSandApp.s("屣\u0001").concat(String.valueOf(mediaProjection)));
        fVar.f72739e = mediaProjection;
        mediaProjection.registerCallback(fVar.f72743i, fVar.f72736b);
        fVar.b();
        f.b(fVar.f72739e);
        fVar.f72737c.a(fVar.f72742h, TimeUnit.SECONDS.toMillis(1L));
    }
}
