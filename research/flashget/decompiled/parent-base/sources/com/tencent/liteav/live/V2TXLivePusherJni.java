package com.tencent.liteav.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.i;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.a.b;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class V2TXLivePusherJni extends V2TXLivePusher {
    private static final String TAG = ProtectedSandApp.s("吥\u0001");
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManagerImpl mBeautyManager;
    private TXDeviceManager mDeviceManager;
    private long mNativeV2TXLivePusherJni;
    private V2TXLivePusherObserver mObserver;

    /* renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f71978a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f71979b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f71980c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f71981d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f71982e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f71983f;

        static {
            int[] iArr = new int[GLConstants.a.values().length];
            f71983f = iArr;
            try {
                iArr[GLConstants.a.f72175b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71983f[GLConstants.a.f72177d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71983f[GLConstants.a.f72174a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GLConstants.PixelFormatType.values().length];
            f71982e = iArr2;
            try {
                iArr2[GLConstants.PixelFormatType.f72156a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71982e[GLConstants.PixelFormatType.f72161f.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[V2TXLiveDef.V2TXLiveBufferType.values().length];
            f71981d = iArr3;
            try {
                iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71981d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71981d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLivePixelFormat.values().length];
            f71980c = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f71980c[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f71979b = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f71979b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f71979b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f71978a = iArr6;
            try {
                iArr6[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f71978a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f71978a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public V2TXLivePusherJni(Context context, int i4) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("同\u0001"));
        long nativeCreate = nativeCreate(new WeakReference(this), i4);
        this.mNativeV2TXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeV2TXLivePusherJni));
        this.mDeviceManager = new TXDeviceManagerImpl(nativeCreateDeviceManager(this.mNativeV2TXLivePusherJni));
        if (context instanceof Activity) {
            i.a().a((Activity) context);
        }
    }

    private static Object getEglContextFromLiveVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
        Object obj = v2TXLiveTexture.eglContext10;
        if (obj == null) {
            obj = null;
        }
        Object obj2 = v2TXLiveTexture.eglContext14;
        if (obj2 != null) {
            obj = obj2;
        }
        return obj == null ? EGL14.eglGetCurrentContext() : obj;
    }

    private static native long nativeCreate(WeakReference<V2TXLivePusherJni> weakReference, int i4);

    private static native long nativeCreateAudioEffectManager(long j4);

    private static native long nativeCreateBeautyManager(long j4);

    private static native long nativeCreateDeviceManager(long j4);

    private static native void nativeDestroy(long j4);

    private static native int nativeEnableAudioProcessObserver(long j4, boolean z4, int i4, int i5, int i6, int i7);

    private static native int nativeEnableCustomAudioCapture(long j4, boolean z4);

    private static native int nativeEnableCustomVideoCapture(long j4, boolean z4);

    private static native int nativeEnableCustomVideoProcess(long j4, boolean z4, int i4, int i5);

    private static native void nativeEnableExtensionCallback(long j4, boolean z4);

    private static native void nativeEnableVoiceActivityDetection(long j4, boolean z4);

    private static native int nativeEnableVolumeEvaluation(long j4, int i4);

    private static native String nativeGetProperty(long j4, String str);

    private static native int nativeIsPushing(long j4);

    private static native int nativePauseAudio(long j4);

    private static native int nativePauseVideo(long j4);

    private static native int nativeResumeAudio(long j4);

    private static native int nativeResumeVideo(long j4);

    private static native int nativeSendCustomAudioFrame(long j4, byte[] bArr, int i4, int i5, long j5);

    private static native int nativeSendCustomVideoFrame(long j4, int i4, int i5, int i6, int i7, int i10, int i11, Object obj, byte[] bArr, ByteBuffer byteBuffer);

    private static native int nativeSendSeiMessage(long j4, int i4, byte[] bArr);

    private static native int nativeSetAudioQuality(long j4, int i4);

    private static native int nativeSetEncoderMirror(long j4, boolean z4);

    private static native int nativeSetMixTranscodingConfig(long j4, String str);

    private static native int nativeSetProperty(long j4, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j4, int i4);

    private static native int nativeSetRenderMirror(long j4, int i4);

    private static native int nativeSetRenderRotation(long j4, int i4);

    private static native int nativeSetRenderView(long j4, DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j4, int i4, int i5, int i6, int i7, int i10);

    private static native int nativeSetWatermark(long j4, Bitmap bitmap, float f4, float f5, float f6);

    private static native void nativeShowDebugView(long j4, boolean z4);

    private static native int nativeSnapshot(long j4);

    private static native int nativeStartCamera(long j4, boolean z4);

    private static native int nativeStartMicrophone(long j4);

    private static native int nativeStartPush(long j4, String str);

    private static native int nativeStartRecord(long j4, String str, int i4, int i5);

    private static native int nativeStartScreenCapture(long j4);

    private static native int nativeStartSystemAudioLoopback(long j4);

    private static native int nativeStartVirtualCamera(long j4, Bitmap bitmap);

    private static native int nativeStopCamera(long j4);

    private static native int nativeStopMicrophone(long j4);

    private static native int nativeStopPush(long j4);

    private static native void nativeStopRecord(long j4);

    private static native int nativeStopScreenCapture(long j4);

    private static native int nativeStopSystemAudioLoopback(long j4);

    private static native int nativeStopVirtualCamera(long j4);

    public static V2TXLivePusherJni weakToStrongReference(WeakReference<V2TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public V2TXLiveDef.V2TXLiveVideoFrame createV2TXLiveVideoFrame(int i4, int i5, int i6, int i7, int i10, int i11, Object obj, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        int i12 = AnonymousClass1.f71982e[GLConstants.PixelFormatType.a(i7).ordinal()];
        if (i12 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else {
            if (i12 != 2) {
                return null;
            }
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i13 = AnonymousClass1.f71983f[GLConstants.a.a(i6).ordinal()];
        if (i13 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
            v2TXLiveVideoFrame.texture = v2TXLiveTexture;
            v2TXLiveTexture.textureId = i11;
            if (obj instanceof EGLContext) {
                v2TXLiveTexture.eglContext10 = (EGLContext) obj;
            } else if (obj instanceof android.opengl.EGLContext) {
                v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
            }
        } else if (i13 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.data = bArr;
        } else {
            if (i13 != 3) {
                return null;
            }
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.buffer = byteBuffer;
        }
        v2TXLiveVideoFrame.width = i4;
        v2TXLiveVideoFrame.height = i5;
        v2TXLiveVideoFrame.rotation = i10;
        return v2TXLiveVideoFrame;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z4, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            return -2;
        }
        return nativeEnableAudioProcessObserver(this.mNativeV2TXLivePusherJni, z4, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomAudioCapture(boolean z4) {
        return nativeEnableCustomAudioCapture(this.mNativeV2TXLivePusherJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoCapture(boolean z4) {
        return nativeEnableCustomVideoCapture(this.mNativeV2TXLivePusherJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoProcess(boolean z4, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        if (!z4) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z4, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        if ((v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420) || (v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D)) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z4, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        return -4;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void enableVoiceActivityDetection(boolean z4) {
        nativeEnableVoiceActivityDetection(this.mNativeV2TXLivePusherJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableVolumeEvaluation(int i4) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePusherJni, i4);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        release();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public int getFrameBufferType(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.a aVar = GLConstants.a.f72174a;
        int i4 = AnonymousClass1.f71981d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i4 == 1) {
            aVar = GLConstants.a.f72175b;
        } else if (i4 == 2) {
            aVar = GLConstants.a.f72177d;
        }
        return aVar.mValue;
    }

    public byte[] getFrameByteArray(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.buffer;
    }

    public Object getFrameEglContext(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return null;
        }
        EGLContext eGLContext = v2TXLiveTexture.eglContext10;
        EGLContext eGLContext2 = eGLContext != null ? eGLContext : null;
        android.opengl.EGLContext eGLContext3 = v2TXLiveTexture.eglContext14;
        return eGLContext3 != null ? eGLContext3 : eGLContext2;
    }

    public int getFrameHeight(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.height;
    }

    public int getFramePixelFormat(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType = GLConstants.PixelFormatType.f72156a;
        int i4 = AnonymousClass1.f71980c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        if (i4 != 1 && i4 == 2) {
            pixelFormatType = GLConstants.PixelFormatType.f72161f;
        }
        return pixelFormatType.getValue();
    }

    public int getFrameRotation(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.rotation;
    }

    public int getFrameTextureId(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return -1;
        }
        return v2TXLiveTexture.textureId;
    }

    public int getFrameWidth(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.width;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public String getProperty(String str) {
        return nativeGetProperty(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int isPushing() {
        return nativeIsPushing(this.mNativeV2TXLivePusherJni);
    }

    public void onCaptureFirstAudioFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstAudioFrame();
        }
    }

    public void onCaptureFirstVideoFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstVideoFrame();
        }
    }

    public int onCustomPreprocessFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            return v2TXLivePusherObserver.onProcessVideoFrame(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        }
        return -1;
    }

    public void onEnterRoom(int i4, String str) {
    }

    public void onError(int i4, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onError(i4, str, bundle);
        }
    }

    public void onExitRoom(int i4, String str) {
    }

    public void onGLContextCreated() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextCreated();
        }
    }

    public void onGLContextDestroyed() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextDestroyed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i4) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onMicrophoneVolumeUpdate(i4);
        }
    }

    public void onNetworkQuality(int i4) {
    }

    public void onProcessAudioFrame(byte[] bArr, long j4, int i4, int i5) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i4;
        v2TXLiveAudioFrame.channel = i5;
        v2TXLiveAudioFrame.timestamp = j4;
        v2TXLivePusherObserver.onProcessAudioFrame(v2TXLiveAudioFrame);
    }

    public void onPushEvent(int i4, Bundle bundle) {
    }

    public void onPushNetStatus(Bundle bundle) {
    }

    public void onPushStatusUpdate(int i4, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i4 == 0) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = ProtectedSandApp.s("吐\u0001");
        } else if (i4 == 1) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = ProtectedSandApp.s("吏\u0001");
        } else if (i4 == 2) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = ProtectedSandApp.s("后\u0001");
        } else if (i4 == 3) {
            str = ProtectedSandApp.s("名\u0001");
        }
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onPushStatusUpdate(v2TXLivePushStatus, str, bundle);
        }
    }

    public void onRecordBegin(int i4, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordBegin(i4, str);
        }
    }

    public void onRecordComplete(int i4, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordComplete(i4, str);
        }
    }

    public void onRecordProgress(long j4, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecording(j4, str);
        }
    }

    public void onScreenCaptureStarted() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStoped(int i4) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStopped(i4);
        }
    }

    public void onSetMixTranscodingConfig(int i4, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSetMixTranscodingConfig(i4, str);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSnapshotComplete(bitmap);
        }
    }

    public void onStatisticsUpdate(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics = new V2TXLiveDef.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.appCpu = i4;
            v2TXLivePusherStatistics.systemCpu = i5;
            v2TXLivePusherStatistics.width = i6;
            v2TXLivePusherStatistics.height = i7;
            v2TXLivePusherStatistics.fps = i10;
            v2TXLivePusherStatistics.videoBitrate = i11;
            v2TXLivePusherStatistics.audioBitrate = i12;
            v2TXLivePusherStatistics.rtt = i13;
            v2TXLivePusherStatistics.netSpeed = i14;
            v2TXLivePusherObserver.onStatisticsUpdate(v2TXLivePusherStatistics);
        }
    }

    public void onUserAudioAvailable(String str, boolean z4) {
    }

    public void onUserOffline(String str) {
    }

    public void onUserOnline(String str) {
    }

    public void onUserVideoAvailable(String str, int i4, boolean z4) {
    }

    public void onVoiceActivityDetectionUpdate(boolean z4) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onVoiceActivityDetectionUpdate(z4);
        }
    }

    public void onWarning(int i4, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onWarning(i4, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void release() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j4 = this.mNativeV2TXLivePusherJni;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeV2TXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        if (v2TXLiveAudioFrame == null) {
            return -2;
        }
        return nativeSendCustomAudioFrame(this.mNativeV2TXLivePusherJni, v2TXLiveAudioFrame.data, v2TXLiveAudioFrame.sampleRate, v2TXLiveAudioFrame.channel, v2TXLiveAudioFrame.timestamp);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.a aVar;
        Object eglContextFromLiveVideoFrame;
        if (v2TXLiveVideoFrame == null) {
            return -2;
        }
        int i4 = AnonymousClass1.f71980c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        int i5 = -1;
        if (i4 == 1) {
            pixelFormatType = GLConstants.PixelFormatType.f72156a;
        } else {
            if (i4 != 2) {
                return -1;
            }
            pixelFormatType = GLConstants.PixelFormatType.f72161f;
        }
        int i6 = AnonymousClass1.f71981d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i6 != 1) {
            eglContextFromLiveVideoFrame = null;
            if (i6 == 2) {
                aVar = GLConstants.a.f72177d;
            } else {
                if (i6 != 3) {
                    return -1;
                }
                aVar = GLConstants.a.f72174a;
            }
        } else {
            aVar = GLConstants.a.f72175b;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            if (v2TXLiveTexture == null) {
                return -1;
            }
            i5 = v2TXLiveTexture.textureId;
            eglContextFromLiveVideoFrame = getEglContextFromLiveVideoFrame(v2TXLiveVideoFrame);
        }
        return nativeSendCustomVideoFrame(this.mNativeV2TXLivePusherJni, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height, aVar.mValue, pixelFormatType.getValue(), v2TXLiveVideoFrame.rotation, i5, eglContextFromLiveVideoFrame, v2TXLiveVideoFrame.data, v2TXLiveVideoFrame.buffer);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendSeiMessage(int i4, byte[] bArr) {
        return nativeSendSeiMessage(this.mNativeV2TXLivePusherJni, i4, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return nativeSetAudioQuality(this.mNativeV2TXLivePusherJni, v2TXLiveAudioQuality.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setEncoderMirror(boolean z4) {
        return nativeSetEncoderMirror(this.mNativeV2TXLivePusherJni, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // com.tencent.live2.V2TXLivePusher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.V2TXLivePusherJni.setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef$V2TXLiveTranscodingConfig):int");
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
        this.mObserver = v2TXLivePusherObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof b)) {
            return;
        }
        nativeEnableExtensionCallback(this.mNativeV2TXLivePusherJni, true);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setProperty(String str, Object obj) {
        str.getClass();
        String s4 = ProtectedSandApp.s("吥\u0001");
        if (str.equals(ProtectedSandApp.s("否\u0001"))) {
            LiteavLog.i(s4, ProtectedSandApp.s("吪\u0001"));
            return 0;
        }
        if (!str.equals(ProtectedSandApp.s("吧\u0001"))) {
            return nativeSetProperty(this.mNativeV2TXLivePusherJni, str, obj);
        }
        if (obj == null) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, null);
            return 0;
        }
        if (obj instanceof Surface) {
            nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget((Surface) obj));
            return 0;
        }
        LiteavLog.e(s4, ProtectedSandApp.s("吨\u0001") + str + ProtectedSandApp.s("吩\u0001") + obj);
        return -2;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.f72151a;
        int i4 = AnonymousClass1.f71979b[v2TXLiveFillMode.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                gLScaleType = GLConstants.GLScaleType.f72152b;
            } else {
                if (i4 != 3) {
                    return -2;
                }
                gLScaleType = GLConstants.GLScaleType.f72153c;
            }
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePusherJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return nativeSetRenderMirror(this.mNativeV2TXLivePusherJni, v2TXLiveMirrorType.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        int i4 = AnonymousClass1.f71978a[v2TXLiveRotation.ordinal()];
        return nativeSetRenderRotation(this.mNativeV2TXLivePusherJni, (i4 != 1 ? i4 != 2 ? i4 != 3 ? k.f71939a : k.f71942d : k.f71941c : k.f71940b).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(tXCloudVideoView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        if (v2TXLiveVideoEncoderParam == null) {
            return -2;
        }
        return nativeSetVideoQuality(this.mNativeV2TXLivePusherJni, v2TXLiveVideoEncoderParam.videoResolution.ordinal(), v2TXLiveVideoEncoderParam.videoResolutionMode.ordinal(), v2TXLiveVideoEncoderParam.videoFps, v2TXLiveVideoEncoderParam.videoBitrate, v2TXLiveVideoEncoderParam.minVideoBitrate);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setWatermark(Bitmap bitmap, float f4, float f5, float f6) {
        return nativeSetWatermark(this.mNativeV2TXLivePusherJni, bitmap, f4, f5, f6);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void showDebugView(boolean z4) {
        nativeShowDebugView(this.mNativeV2TXLivePusherJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startCamera(boolean z4) {
        return nativeStartCamera(this.mNativeV2TXLivePusherJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePusherJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startMicrophone() {
        return nativeStartMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startPush(String str) {
        return nativeStartPush(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startScreenCapture() {
        return nativeStartScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startSystemAudioLoopback() {
        return nativeStartSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startVirtualCamera(Bitmap bitmap) {
        return nativeStartVirtualCamera(this.mNativeV2TXLivePusherJni, bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopCamera() {
        return nativeStopCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopMicrophone() {
        return nativeStopMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopPush() {
        return nativeStopPush(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopScreenCapture() {
        return nativeStopScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopSystemAudioLoopback() {
        return nativeStopSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopVirtualCamera() {
        return nativeStopVirtualCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(textureView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surfaceView));
    }
}
