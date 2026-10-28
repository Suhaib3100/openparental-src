package com.tencent.rtmp.video.a;

import android.app.Activity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.TXScreenCapture;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final f f72750a;

    private g(f fVar) {
        this.f72750a = fVar;
    }

    public static Runnable a(f fVar) {
        return new g(fVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f72750a;
        WeakReference<Activity> weakReference = fVar.f72735a;
        TXScreenCapture.TXScreenCaptureAssistantActivity tXScreenCaptureAssistantActivity = weakReference != null ? (TXScreenCapture.TXScreenCaptureAssistantActivity) weakReference.get() : null;
        String s4 = ProtectedSandApp.s("屓\u0001");
        if (tXScreenCaptureAssistantActivity != null && !tXScreenCaptureAssistantActivity.isStop()) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("屔\u0001").concat(String.valueOf(tXScreenCaptureAssistantActivity)));
            return;
        }
        if (fVar.f72739e != null) {
            BaseBridge.printLog(s4, ProtectedSandApp.s("展\u0001") + fVar.f72739e);
        } else {
            if (tXScreenCaptureAssistantActivity != null) {
                BaseBridge.printLog(s4, ProtectedSandApp.s("屖\u0001").concat(String.valueOf(tXScreenCaptureAssistantActivity)));
                tXScreenCaptureAssistantActivity.finish();
            }
            f.a();
        }
    }
}
