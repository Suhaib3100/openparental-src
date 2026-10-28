package com.tencent.liteav.beauty;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class NativeLoad {
    public static final int PROGRAM_BEAUTY = 1;
    public static final int PROGRAM_BEAUTY2 = 5;
    public static final int PROGRAM_BEAUTY2_SAMSUNG_S4 = 15;
    public static final int PROGRAM_BEAUTY3_FILTER = 14;
    public static final int PROGRAM_BEAUTYBLEND = 12;
    public static final int PROGRAM_EYE_SCALE = 3;
    public static final int PROGRAM_FACE_SLIM = 4;
    public static final int PROGRAM_FACE_VAR = 2;
    public static final int PROGRAM_I4202RGBA = 7;
    public static final int PROGRAM_NV122RGBA = 10;
    public static final int PROGRAM_NV212RGBA = 9;
    public static final int PROGRAM_RGBA2I420 = 8;
    public static final int PROGRAM_RGBA2NV21 = 11;
    public static final int PROGRAM_SKIN = 6;
    public static final int PROGRAM_SMOOTHHORIZONTAL = 13;
    private static final String TAG = ProtectedSandApp.s("參\u0001");

    static {
        onLoadBeauty();
        LiteavLog.i(ProtectedSandApp.s("參\u0001"), ProtectedSandApp.s("叄\u0001"));
    }

    public static native void nativeClearQueue();

    public static native void nativeDeleteYuv2Yuv();

    public static native void nativeGlMapBufferToQueue(int i4, int i5, ByteBuffer byteBuffer);

    public static native void nativeGlReadPixs(int i4, int i5, byte[] bArr);

    public static native boolean nativeGlReadPixsFromQueue(int i4, int i5, byte[] bArr);

    public static native void nativeGlReadPixsToQueue(int i4, int i5);

    public static native int nativeLoadGLProgram(int i4);

    public static native void nativeglTexImage2D(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, byte[] bArr, int i14);

    public static native void onLoadBeauty();
}
