package com.tencent.liteav.videoproducer.capture;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.Locale;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public abstract class CaptureSourceInterface {
    private static final String TAG = ProtectedSandApp.s("噼\u0001");

    public static class CaptureParams {

        /* renamed from: b, reason: collision with root package name */
        public int f72492b;

        /* renamed from: c, reason: collision with root package name */
        public int f72493c;

        /* renamed from: d, reason: collision with root package name */
        public int f72494d;

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureParams)) {
                return false;
            }
            CaptureParams captureParams = (CaptureParams) obj;
            return this.f72492b == captureParams.f72492b && this.f72493c == captureParams.f72493c && this.f72494d == captureParams.f72494d;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, ProtectedSandApp.s("噳\u0001"), Integer.valueOf(this.f72493c), Integer.valueOf(this.f72494d), Integer.valueOf(this.f72492b));
        }
    }

    public interface CaptureSourceListener {
    }

    public abstract void pause();

    public abstract void resume();

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public abstract void start(Object obj, CaptureParams captureParams, CaptureSourceListener captureSourceListener);

    public abstract void stop();

    public abstract void updateParams(CaptureParams captureParams);
}
