package com.tencent.liteav.videoproducer2.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import androidx.collection.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.video.VirtualDisplayManagerProxy;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeScreenCapture {
    private static final String TAG = ProtectedSandApp.s("埴\u0001");
    static boolean sIsCaptureClassExist;
    static boolean sIsCheck;
    private NativeScreenCaptureListener mListener;
    private MediaProjection mMediaProjection;
    private j mScreenCaptureBridge;
    private Surface mSurface;

    public NativeScreenCapture(Surface surface, MediaProjection mediaProjection, NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.mSurface = surface;
        this.mMediaProjection = mediaProjection;
        this.mListener = nativeScreenCaptureListener;
    }

    private static boolean checkIfScreenCaptureClassExist() {
        boolean z4;
        String s4 = ProtectedSandApp.s("埴\u0001");
        if (sIsCheck) {
            return sIsCaptureClassExist;
        }
        try {
            Class.forName(ProtectedSandApp.s("埵\u0001"));
            Class.forName(ProtectedSandApp.s("埶\u0001"));
            try {
                LiteavLog.i(s4, ProtectedSandApp.s("執\u0001"));
                z4 = true;
            } catch (ClassNotFoundException unused) {
                z4 = true;
                LiteavLog.e(s4, ProtectedSandApp.s("埸\u0001"));
                sIsCaptureClassExist = z4;
                sIsCheck = true;
                return z4;
            }
        } catch (ClassNotFoundException unused2) {
            z4 = false;
        }
        sIsCaptureClassExist = z4;
        sIsCheck = true;
        return z4;
    }

    public void startVirtualDisplaySync(int i4, int i5) {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        if (this.mScreenCaptureBridge == null) {
            this.mScreenCaptureBridge = new j(this.mSurface, i4, i5, this.mMediaProjection, this.mListener);
        }
        j jVar = this.mScreenCaptureBridge;
        VirtualDisplayManagerProxy.getInstance().startVirtualDisplaySync(jVar.f72667a, jVar.f72669c, jVar.f72670d, jVar.f72668b, jVar.f72672f);
    }

    public void stopVirtualDisplaySync() {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        j jVar = this.mScreenCaptureBridge;
        if (jVar != null) {
            VirtualDisplayWrapper virtualDisplayWrapper = jVar.f72671e;
            if (virtualDisplayWrapper != null) {
                virtualDisplayWrapper.release();
                jVar.f72671e = null;
            }
            VirtualDisplayManagerProxy.getInstance().stopVirtualDisplaySync(jVar.f72667a);
            this.mScreenCaptureBridge = null;
        }
    }

    public void updateVirtualDisplaySync(int i4, int i5, boolean z4) {
        if (!checkIfScreenCaptureClassExist()) {
            this.mListener.onClassNotFound();
            return;
        }
        j jVar = this.mScreenCaptureBridge;
        if (jVar == null) {
            LiteavLog.e(ProtectedSandApp.s("埴\u0001"), ProtectedSandApp.s("培\u0001"));
            return;
        }
        jVar.f72669c = i4;
        jVar.f72670d = i5;
        StringBuilder a5 = n1.a(ProtectedSandApp.s("基\u0001"), i4, ProtectedSandApp.s("埻\u0001"), i5, ProtectedSandApp.s("埼\u0001"));
        a5.append(z4);
        a5.append(ProtectedSandApp.s("埽\u0001"));
        LiteavLog.i(ProtectedSandApp.s("埾\u0001"), a5.toString());
        VirtualDisplayWrapper virtualDisplayWrapper = jVar.f72671e;
        if (virtualDisplayWrapper != null && !z4) {
            virtualDisplayWrapper.resize(i4, i5);
            return;
        }
        if (virtualDisplayWrapper != null) {
            virtualDisplayWrapper.release();
            jVar.f72671e = null;
        }
        VirtualDisplayManagerProxy.getInstance().updateVirtualDisplaySizeSync(jVar.f72667a, jVar.f72669c, jVar.f72670d, jVar.f72672f);
    }
}
