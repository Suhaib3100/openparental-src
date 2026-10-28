package com.tencent.rtmp.video;

import android.app.Activity;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.a.f;
import com.tencent.rtmp.video.a.i;
import com.tencent.rtmp.video.a.j;
import com.tencent.rtmp.video.a.k;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class VirtualDisplayManagerProxy {
    private static volatile VirtualDisplayManagerProxy sInstance;
    private f mVirtualDisplayManager = new f();

    private VirtualDisplayManagerProxy() {
    }

    public static VirtualDisplayManagerProxy getInstance() {
        if (sInstance == null) {
            synchronized (VirtualDisplayManagerProxy.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VirtualDisplayManagerProxy();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public void registerRequestPermissionActivity(Activity activity) {
        this.mVirtualDisplayManager.a(activity);
    }

    public void signalSessionRequestFinish(MediaProjection mediaProjection) {
        this.mVirtualDisplayManager.a(mediaProjection);
    }

    public void startVirtualDisplaySync(Surface surface, int i4, int i5, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        f fVar = this.mVirtualDisplayManager;
        BaseBridge.printLog(ProtectedSandApp.s("局\u0001"), ProtectedSandApp.s("尺\u0001") + surface + ProtectedSandApp.s("尻\u0001") + i4 + ProtectedSandApp.s("尼\u0001") + i5 + ProtectedSandApp.s("尽\u0001") + mediaProjection + ProtectedSandApp.s("尾\u0001") + virtualDisplayListener + ProtectedSandApp.s("尿\u0001"));
        fVar.f72737c.b(i.a(fVar, surface, i4, i5, mediaProjection, virtualDisplayListener));
    }

    public void stopVirtualDisplaySync(Surface surface) {
        f fVar = this.mVirtualDisplayManager;
        BaseBridge.printLog(ProtectedSandApp.s("局\u0001"), ProtectedSandApp.s("屁\u0001").concat(String.valueOf(surface)));
        fVar.f72737c.b(j.a(fVar, surface));
    }

    public void unRegisterRequestPermissionActivity(Activity activity) {
        f fVar = this.mVirtualDisplayManager;
        BaseBridge.printLog(ProtectedSandApp.s("局\u0001"), ProtectedSandApp.s("层\u0001").concat(String.valueOf(activity)));
        WeakReference<Activity> weakReference = fVar.f72735a;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        fVar.f72735a = null;
    }

    public void updateVirtualDisplaySizeSync(Surface surface, int i4, int i5, VirtualDisplayListener virtualDisplayListener) {
        f fVar = this.mVirtualDisplayManager;
        BaseBridge.printLog(ProtectedSandApp.s("局\u0001"), ProtectedSandApp.s("屃\u0001") + surface + ProtectedSandApp.s("尻\u0001") + i4 + ProtectedSandApp.s("尼\u0001") + i5 + ProtectedSandApp.s("尾\u0001") + virtualDisplayListener);
        fVar.f72737c.b(k.a(fVar, surface, i4, i5, virtualDisplayListener));
    }
}
