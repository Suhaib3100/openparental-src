package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class OpenGlUtils {
    private static final String TAG = ProtectedSandApp.s("唲\u0001");

    /* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72285a;

        static {
            int[] iArr = new int[k.values().length];
            f72285a = iArr;
            try {
                iArr[k.f71940b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72285a[k.f71941c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72285a[k.f71942d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72285a[k.f71939a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void attachTextureToFrameBuffer(int i4, int i5) {
        GLES20.glBindFramebuffer(36160, i5);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static void bindFramebuffer(int i4, int i5) {
        GLES20.glBindFramebuffer(i4, i5);
    }

    public static void bindTexture(int i4, int i5) {
        GLES20.glBindTexture(i4, i5);
    }

    public static void checkGlError(String str) {
    }

    public static void convertYuvFormat(GLConstants.PixelFormatType pixelFormatType, Object obj, GLConstants.PixelFormatType pixelFormatType2, Object obj2, int i4, int i5) {
        int value = pixelFormatType.getValue();
        int value2 = pixelFormatType2.getValue();
        boolean z4 = obj instanceof ByteBuffer;
        if ((z4 && (obj2 instanceof ByteBuffer)) ? nativeConvertYuvFormatBufferToBuffer(value, (ByteBuffer) obj, value2, (ByteBuffer) obj2, i4, i5) : (z4 && (obj2 instanceof byte[])) ? nativeConvertYuvFormatBufferToArray(value, (ByteBuffer) obj, value2, (byte[]) obj2, i4, i5) : ((obj instanceof byte[]) && (obj2 instanceof ByteBuffer)) ? nativeConvertYuvFormatArrayToBuffer(value, (byte[]) obj, value2, (ByteBuffer) obj2, i4, i5) : nativeConvertYuvFormatArrayToArray(value, (byte[]) obj, value2, (byte[]) obj2, i4, i5)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("唯\u0001") + pixelFormatType + ProtectedSandApp.s("唰\u0001") + pixelFormatType2);
    }

    public static FloatBuffer createNormalCubeVerticesBuffer() {
        float[] fArr = GLConstants.f72138d;
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
    }

    public static int createTexture(int i4, int i5, int i6, int i7) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        LiteavLog.d(ProtectedSandApp.s("唲\u0001"), ProtectedSandApp.s("唱\u0001") + iArr[0]);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, androidx.work.f.f35970d, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, i6, i4, i5, 0, i7, 5121, null);
        return iArr[0];
    }

    public static FloatBuffer createTextureCoordsBuffer(k kVar, boolean z4, boolean z5) {
        float[] fArr = GLConstants.f72139e;
        float[] fArr2 = new float[fArr.length];
        initTextureCoordsBuffer(fArr2, kVar, z4, z5);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2).position(0);
        return asFloatBuffer;
    }

    public static void deleteFrameBuffer(int i4) {
        if (i4 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i4}, 0);
        }
    }

    public static void deleteShaderId(int i4) {
        if (i4 != -1) {
            GLES20.glDeleteShader(i4);
        }
    }

    public static void deleteTexture(int i4) {
        if (i4 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i4}, 0);
        }
    }

    public static void detachTextureFromFrameBuffer(int i4) {
        GLES20.glBindFramebuffer(36160, i4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private static float flip(float f4) {
        return f4 == 0.0f ? 1.0f : 0.0f;
    }

    public static int generateFrameBufferId() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int generateTextureOES() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, androidx.work.f.f35970d, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static Object getCurrentContext() {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? EGL14.eglGetCurrentContext() : ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public static long getGLContextNativeHandle(Object obj) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof android.opengl.EGLContext)) {
            return 0L;
        }
        return LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? ((android.opengl.EGLContext) obj).getNativeHandle() : ((android.opengl.EGLContext) obj).getHandle();
    }

    public static int getGLErrorCount() {
        int i4 = 0;
        while (GLES20.glGetError() != 0) {
            i4++;
        }
        return i4;
    }

    public static void glViewport(int i4, int i5, int i6, int i7) {
        GLES20.glViewport(i4, i5, i6, i7);
    }

    public static void initTextureCoordsBuffer(float[] fArr, k kVar, boolean z4, boolean z5) {
        float[] fArr2 = GLConstants.f72139e;
        if (kVar != null) {
            int i4 = AnonymousClass1.f72285a[kVar.ordinal()];
            if (i4 == 1) {
                fArr2 = GLConstants.f72141g;
            } else if (i4 == 2) {
                fArr2 = GLConstants.f72142h;
            } else if (i4 == 3) {
                fArr2 = GLConstants.f72140f;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z4) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z5) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    public static boolean isNoGLContext(Object obj) {
        return obj instanceof EGLContext ? obj.equals(EGL10.EGL_NO_CONTEXT) : (obj instanceof android.opengl.EGLContext) && getGLContextNativeHandle(obj) == 0;
    }

    public static int loadTexture(Bitmap bitmap, int i4, boolean z4) {
        int[] iArr = new int[1];
        if (i4 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            LiteavLog.d(ProtectedSandApp.s("唲\u0001"), ProtectedSandApp.s("唱\u0001") + iArr[0]);
            bindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, androidx.work.f.f35970d, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            bindTexture(3553, i4);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i4;
        }
        if (z4) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void loadYuv420DataToTextures(ByteBuffer byteBuffer, int i4, int i5, int i6, int[] iArr) {
        if (byteBuffer.isDirect()) {
            nativeLoadYuv420ByteBufferToTextures(byteBuffer, i4, i5, i6, iArr);
        } else {
            nativeLoadYuv420ByteArrayToTextures(byteBuffer.array(), i4, i5, i6, iArr);
        }
    }

    private static native boolean nativeConvertYuvFormatArrayToArray(int i4, byte[] bArr, int i5, byte[] bArr2, int i6, int i7);

    private static native boolean nativeConvertYuvFormatArrayToBuffer(int i4, byte[] bArr, int i5, ByteBuffer byteBuffer, int i6, int i7);

    private static native boolean nativeConvertYuvFormatBufferToArray(int i4, ByteBuffer byteBuffer, int i5, byte[] bArr, int i6, int i7);

    private static native boolean nativeConvertYuvFormatBufferToBuffer(int i4, ByteBuffer byteBuffer, int i5, ByteBuffer byteBuffer2, int i6, int i7);

    public static native void nativeCopyDataFromByteArrayToByteBuffer(byte[] bArr, ByteBuffer byteBuffer, int i4);

    public static native void nativeCopyDataFromByteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i4);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i4);

    public static native void nativeCopyYuvFromByteBufferToByteBuffer(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7, int i10);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i4, int i5, int i6, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(ByteBuffer byteBuffer, int i4, int i5, int i6, int[] iArr);

    public static void readPixels(int i4, int i5, int i6, int i7, Object obj) {
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            buffer.position(0);
            GLES20.glReadPixels(i4, i5, i6, i7, 6408, 5121, buffer);
        } else {
            if (obj instanceof byte[]) {
                GLES20.glReadPixels(i4, i5, i6, i7, 6408, 5121, ByteBuffer.wrap((byte[]) obj));
                return;
            }
            LiteavLog.e(ProtectedSandApp.s("唲\u0001"), ProtectedSandApp.s("唳\u0001").concat(String.valueOf(obj)));
        }
    }

    public static Point reverseMappingPoint(GLConstants.GLScaleType gLScaleType, k kVar, Point point, Size size, Size size2) {
        float f4 = (size2.width * 1.0f) / size.width;
        float f5 = (size2.height * 1.0f) / size.height;
        Matrix matrix = new Matrix();
        matrix.setTranslate((-size.width) / 2.0f, (-size.height) / 2.0f);
        if (gLScaleType == GLConstants.GLScaleType.f72151a) {
            float min = Math.min(f4, f5);
            matrix.postScale(min, min);
        } else if (gLScaleType == GLConstants.GLScaleType.f72153c) {
            matrix.postScale(f4, f5);
        } else if (gLScaleType == GLConstants.GLScaleType.f72152b) {
            float max = Math.max(f4, f5);
            matrix.postScale(max, max);
        }
        matrix.postRotate(360 - kVar.mValue);
        if (kVar == k.f71940b || kVar == k.f71942d) {
            matrix.postTranslate(size2.height / 2.0f, size2.width / 2.0f);
        } else {
            matrix.postTranslate(size2.width / 2.0f, size2.height / 2.0f);
        }
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{point.x, point.y});
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public static int loadTexture(int i4, Buffer buffer, int i5, int i6, int i7) {
        int[] iArr = new int[1];
        if (i7 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            LiteavLog.d(ProtectedSandApp.s("唲\u0001"), ProtectedSandApp.s("唱\u0001") + iArr[0]);
            bindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, androidx.work.f.f35970d, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, i4, i5, i6, 0, i4, 5121, buffer);
        } else {
            bindTexture(3553, i7);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i5, i6, i4, 5121, buffer);
            iArr[0] = i7;
        }
        return iArr[0];
    }
}
