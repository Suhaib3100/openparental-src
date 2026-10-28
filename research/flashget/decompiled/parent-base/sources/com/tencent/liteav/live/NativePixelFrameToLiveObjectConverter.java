package com.tencent.liteav.live;

import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class NativePixelFrameToLiveObjectConverter {
    public static ByteBuffer createByteBuffer(int i4) {
        return ByteBuffer.allocateDirect(i4);
    }

    public static long getGLContextNativeHandle(Object obj) {
        return OpenGlUtils.getGLContextNativeHandle(obj);
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
