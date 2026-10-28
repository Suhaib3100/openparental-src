package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class V2TXLivePlayerJni extends V2TXLivePlayer {
    private static final String TAG = ProtectedSandApp.s("叽\u0001");
    private boolean mClearLastImage = true;
    protected long mNativeV2TXLivePlayerJni;
    private V2TXLivePlayerObserver mObserver;
    private V2TXLivePlayerImpl mProxy;

    /* renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f71973a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f71974b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f71975c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f71976d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f71977e;

        static {
            int[] iArr = new int[k.values().length];
            f71977e = iArr;
            try {
                iArr[k.f71939a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71977e[k.f71940b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71977e[k.f71941c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71977e[k.f71942d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GLConstants.a.values().length];
            f71976d = iArr2;
            try {
                iArr2[GLConstants.a.f72174a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71976d[GLConstants.a.f72177d.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71976d[GLConstants.a.f72175b.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[GLConstants.PixelFormatType.values().length];
            f71975c = iArr3;
            try {
                iArr3[GLConstants.PixelFormatType.f72156a.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71975c[GLConstants.PixelFormatType.f72161f.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f71974b = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f71974b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f71973a = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f71973a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f71973a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public V2TXLivePlayerJni(Context context, V2TXLivePlayerImpl v2TXLivePlayerImpl) {
        this.mNativeV2TXLivePlayerJni = 0L;
        this.mProxy = v2TXLivePlayerImpl;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("叵\u0001"));
        this.mNativeV2TXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    private void enableExtensionCallback(boolean z4) {
        synchronized (this) {
            nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, z4);
        }
    }

    public static V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new V2TXLiveDef.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.appCpu = i4;
        v2TXLivePlayerStatistics.systemCpu = i5;
        v2TXLivePlayerStatistics.rtt = i6;
        v2TXLivePlayerStatistics.width = i7;
        v2TXLivePlayerStatistics.height = i10;
        v2TXLivePlayerStatistics.fps = i11;
        v2TXLivePlayerStatistics.videoBitrate = i12;
        v2TXLivePlayerStatistics.audioBitrate = i13;
        v2TXLivePlayerStatistics.audioPacketLoss = i14;
        v2TXLivePlayerStatistics.videoPacketLoss = i15;
        v2TXLivePlayerStatistics.jitterBufferDelay = i16;
        v2TXLivePlayerStatistics.audioTotalBlockTime = i17;
        v2TXLivePlayerStatistics.audioBlockRate = i18;
        v2TXLivePlayerStatistics.videoTotalBlockTime = i19;
        v2TXLivePlayerStatistics.videoBlockRate = i20;
        v2TXLivePlayerStatistics.netSpeed = i21;
        return v2TXLivePlayerStatistics;
    }

    private static ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamListFormJsonString(String str) {
        ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    arrayList.add(new V2TXLiveDef.V2TXLiveStreamInfo(jSONObject.getInt(ProtectedSandApp.s("叶\u0001")), jSONObject.getInt(ProtectedSandApp.s("号\u0001")), jSONObject.getInt(ProtectedSandApp.s("司\u0001")), (float) jSONObject.getDouble(ProtectedSandApp.s("叹\u0001")), jSONObject.getString(ProtectedSandApp.s("叺\u0001"))));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return arrayList;
    }

    private static native long nativeCreate(WeakReference<V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j4);

    private static native int nativeEnableCustomRendering(long j4, boolean z4, int i4, int i5);

    private static native void nativeEnableExtensionCallback(long j4, boolean z4);

    private static native int nativeEnableObserveAudioFrame(long j4, boolean z4);

    private static native int nativeEnableReceiveSeiMessage(long j4, boolean z4, int i4);

    private static native int nativeEnableVolumeEvaluation(long j4, int i4);

    private static native String nativeGetStreamList(long j4);

    private static native int nativeIsPlaying(long j4);

    private static native int nativePauseAudio(long j4);

    private static native int nativePauseVideo(long j4);

    private static native int nativeResumeAudio(long j4);

    private static native int nativeResumeVideo(long j4);

    private static native int nativeSetCacheParams(long j4, float f4, float f5);

    private static native int nativeSetPlayoutVolume(long j4, int i4);

    private static native int nativeSetProperty(long j4, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j4, int i4);

    private static native int nativeSetRenderMirrorMode(long j4, boolean z4);

    private static native int nativeSetRenderRotation(long j4, int i4);

    private static native int nativeSetRenderView(long j4, DisplayTarget displayTarget);

    private static native void nativeSetSharedEGLContext(long j4, Object obj);

    private static native void nativeShowDebugView(long j4, boolean z4);

    private static native int nativeSnapshot(long j4);

    private static native int nativeStartPlay(long j4, String str);

    private static native int nativeStartRecord(long j4, String str, int i4, int i5);

    private static native int nativeStopPlay(long j4, boolean z4);

    private static native void nativeStopRecord(long j4);

    private static native int nativeSwitchStream(long j4, String str);

    public static V2TXLivePlayerJni weakToStrongReference(WeakReference<V2TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveAudioFrame(boolean z4) {
        return nativeEnableObserveAudioFrame(this.mNativeV2TXLivePlayerJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z4, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.a aVar;
        V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            pixelFormatType = GLConstants.PixelFormatType.f72156a;
            aVar = GLConstants.a.f72177d;
        } else if (v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            pixelFormatType = GLConstants.PixelFormatType.f72161f;
            aVar = GLConstants.a.f72175b;
        } else {
            if (v2TXLivePixelFormat != v2TXLivePixelFormat2 || v2TXLiveBufferType != V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                LiteavLog.e(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("叻\u0001") + v2TXLivePixelFormat + ProtectedSandApp.s("叼\u0001") + v2TXLiveBufferType);
                return -4;
            }
            pixelFormatType = GLConstants.PixelFormatType.f72156a;
            aVar = GLConstants.a.f72174a;
        }
        return nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, z4, pixelFormatType.getValue(), aVar.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z4, int i4) {
        return nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, z4, i4);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i4) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, i4);
    }

    protected void finalize() {
        nativeDestroy(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamList() {
        return getStreamListFormJsonString(nativeGetStreamList(this.mNativeV2TXLivePlayerJni));
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
        return nativeIsPlaying(this.mNativeV2TXLivePlayerJni);
    }

    public void onAudioLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioLoading(this.mProxy, bundle);
        }
    }

    public void onAudioPlaying(boolean z4, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioPlaying(this.mProxy, z4, bundle);
        }
    }

    public void onConnected(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onConnected(this.mProxy, bundle);
        }
    }

    public void onError(int i4, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onError(this.mProxy, i4, str, bundle);
        }
    }

    public void onNetworkQuality(int i4) {
    }

    public void onPlayEvent(int i4, Bundle bundle) {
    }

    public void onPlayNetStatus(Bundle bundle) {
    }

    public void onPlayoutAudioFrame(byte[] bArr, long j4, int i4, int i5) {
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.timestamp = j4;
        v2TXLiveAudioFrame.sampleRate = i4;
        v2TXLiveAudioFrame.channel = i5;
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutAudioFrame(this.mProxy, v2TXLiveAudioFrame);
        }
    }

    public void onPlayoutVolumeUpdate(int i4) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutVolumeUpdate(this.mProxy, i4);
        }
    }

    public void onReceiveSeiMessage(int i4, byte[] bArr) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onReceiveSeiMessage(this.mProxy, i4, bArr);
        }
    }

    public void onRecordBegin(int i4, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordBegin(this.mProxy, i4, str);
        }
    }

    public void onRecordComplete(int i4, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordComplete(this.mProxy, i4, str);
        }
    }

    public void onRecordProgress(long j4, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecording(this.mProxy, j4, str);
        }
    }

    public void onRenderVideoFrame(int i4, int i5, Object obj, int i6, int i7, int i10, int i11, long j4, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        GLConstants.PixelFormatType a5 = GLConstants.PixelFormatType.a(i4);
        int i12 = AnonymousClass1.f71975c[a5.ordinal()];
        String s4 = ProtectedSandApp.s("叾\u0001");
        String s5 = ProtectedSandApp.s("叽\u0001");
        if (i12 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i12 != 2) {
            LiteavLog.e(s5, ProtectedSandApp.s("叿\u0001") + a5 + s4);
        } else {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        GLConstants.a a6 = GLConstants.a.a(i5);
        int i13 = AnonymousClass1.f71976d[a6.ordinal()];
        if (i13 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i13 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i13 != 3) {
            LiteavLog.e(s5, ProtectedSandApp.s("吀\u0001") + a6 + s4);
        } else {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
        v2TXLiveTexture.textureId = i6;
        if (obj instanceof EGLContext) {
            v2TXLiveTexture.eglContext10 = (EGLContext) obj;
        } else if (obj instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        v2TXLiveVideoFrame.texture = v2TXLiveTexture;
        v2TXLiveVideoFrame.data = bArr;
        v2TXLiveVideoFrame.buffer = byteBuffer;
        v2TXLiveVideoFrame.width = i7;
        v2TXLiveVideoFrame.height = i10;
        int i14 = AnonymousClass1.f71977e[k.a(i11).ordinal()];
        if (i14 == 1) {
            v2TXLiveVideoFrame.rotation = 0;
        } else if (i14 == 2) {
            v2TXLiveVideoFrame.rotation = 90;
        } else if (i14 == 3) {
            v2TXLiveVideoFrame.rotation = 180;
        } else if (i14 != 4) {
            v2TXLiveVideoFrame.rotation = 0;
        } else {
            v2TXLiveVideoFrame.rotation = 270;
        }
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onRenderVideoFrame(this.mProxy, v2TXLiveVideoFrame);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onSnapshotComplete(this.mProxy, bitmap);
        }
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStatisticsUpdate(this.mProxy, v2TXLivePlayerStatistics);
        }
    }

    public void onStreamSwitched(int i4, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStreamSwitched(this.mProxy, str, i4);
        }
    }

    public void onVideoLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoLoading(this.mProxy, bundle);
        }
    }

    public void onVideoPlaying(boolean z4, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoPlaying(this.mProxy, z4, bundle);
        }
    }

    public void onVideoResolutionChanged(int i4, int i5) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoResolutionChanged(this.mProxy, i4, i5);
        }
    }

    public void onWarning(int i4, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onWarning(this.mProxy, i4, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f4, float f5) {
        if (f4 < 0.0f || f5 < 0.0f) {
            return -2;
        }
        return nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f4, f5);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mObserver = v2TXLivePlayerObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof com.tencent.live2.impl.a.a)) {
            return;
        }
        enableExtensionCallback(true);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i4) {
        return nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, i4);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(String str, Object obj) {
        char c5;
        synchronized (this) {
            try {
                switch (str.hashCode()) {
                    case 480042124:
                        if (str.equals(ProtectedSandApp.s("各\u0001"))) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 582452376:
                        if (str.equals(ProtectedSandApp.s("吃\u0001"))) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1120433643:
                        if (str.equals(ProtectedSandApp.s("吂\u0001"))) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1615550654:
                        if (str.equals(ProtectedSandApp.s("吁\u0001"))) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                if (c5 != 0) {
                    if (c5 == 1) {
                        if (obj == null) {
                            return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, null);
                        }
                        if (obj instanceof Surface) {
                            return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, new DisplayTarget((Surface) obj));
                        }
                        LiteavLog.e(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("吅\u0001") + str + ProtectedSandApp.s("吆\u0001") + obj);
                        return -2;
                    }
                    if (c5 == 2) {
                        LiteavLog.i(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("吇\u0001"));
                    } else {
                        if (c5 != 3) {
                            return nativeSetProperty(this.mNativeV2TXLivePlayerJni, str, obj);
                        }
                        if (!(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                            LiteavLog.e(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("吅\u0001") + str + ProtectedSandApp.s("吆\u0001") + obj);
                            return -2;
                        }
                        nativeSetSharedEGLContext(this.mNativeV2TXLivePlayerJni, obj);
                    }
                } else {
                    if (!(obj instanceof Boolean)) {
                        LiteavLog.e(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("吅\u0001") + str + ProtectedSandApp.s("吆\u0001") + obj);
                        return -2;
                    }
                    this.mClearLastImage = ((Boolean) obj).booleanValue();
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        int i4 = AnonymousClass1.f71974b[v2TXLiveFillMode.ordinal()];
        return nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, (i4 != 1 ? i4 != 2 ? GLConstants.GLScaleType.f72152b : GLConstants.GLScaleType.f72153c : GLConstants.GLScaleType.f72151a).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderMirrorMode(boolean z4) {
        return nativeSetRenderMirrorMode(this.mNativeV2TXLivePlayerJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        int i4 = AnonymousClass1.f71973a[v2TXLiveRotation.ordinal()];
        return nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, (i4 != 1 ? i4 != 2 ? i4 != 3 ? k.f71939a : k.f71942d : k.f71941c : k.f71940b).mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z4) {
        nativeShowDebugView(this.mNativeV2TXLivePlayerJni, z4);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLivePlay(String str) {
        return nativeStartPlay(this.mNativeV2TXLivePlayerJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePlayerJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
        return nativeStopPlay(this.mNativeV2TXLivePlayerJni, this.mClearLastImage);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeV2TXLivePlayerJni, str);
        }
        LiteavLog.e(ProtectedSandApp.s("叽\u0001"), ProtectedSandApp.s("合\u0001"));
        return -2;
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, textureView != null ? new DisplayTarget(textureView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, surfaceView != null ? new DisplayTarget(surfaceView) : null);
    }
}
