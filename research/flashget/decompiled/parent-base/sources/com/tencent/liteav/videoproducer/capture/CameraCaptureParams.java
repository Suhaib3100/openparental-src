package com.tencent.liteav.videoproducer.capture;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.h;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.util.Locale;

/* loaded from: classes7.dex */
public class CameraCaptureParams extends CaptureSourceInterface.CaptureParams {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f72486a = null;

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public boolean equals(Object obj) {
        if (!(obj instanceof CameraCaptureParams)) {
            return false;
        }
        CameraCaptureParams cameraCaptureParams = (CameraCaptureParams) obj;
        return super.equals(cameraCaptureParams) && h.a(this.f72486a, cameraCaptureParams.f72486a);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public String toString() {
        return String.format(Locale.ENGLISH, ProtectedSandApp.s("噴\u0001"), super.toString(), this.f72486a);
    }
}
