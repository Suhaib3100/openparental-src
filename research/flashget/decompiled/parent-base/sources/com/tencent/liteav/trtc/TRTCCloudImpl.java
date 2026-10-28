package com.tencent.liteav.trtc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.e;
import com.tencent.liteav.base.util.i;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.transcriber.AITranscriberManager;
import com.tencent.liteav.transcriber.AITranscriberManagerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class TRTCCloudImpl extends TRTCCloud implements TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f72061a;

    /* renamed from: b, reason: collision with root package name */
    private static TRTCCloudImpl f72062b;

    /* renamed from: c, reason: collision with root package name */
    private Context f72063c;

    /* renamed from: d, reason: collision with root package name */
    private TRTCCloudListener f72064d;

    /* renamed from: e, reason: collision with root package name */
    private TrtcCloudJni f72065e;

    /* renamed from: f, reason: collision with root package name */
    private TRTCCloud.BGMNotify f72066f;

    /* renamed from: g, reason: collision with root package name */
    private TXAudioEffectManagerImpl f72067g;

    /* renamed from: h, reason: collision with root package name */
    private TXDeviceManagerImpl f72068h;

    /* renamed from: i, reason: collision with root package name */
    private TXBeautyManagerImpl f72069i;

    /* renamed from: j, reason: collision with root package name */
    private AITranscriberManagerImpl f72070j;

    /* renamed from: k, reason: collision with root package name */
    private int f72071k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<TRTCCloudImpl> f72072l = new ArrayList<>();

    private TRTCCloudImpl(Context context, boolean z4) {
        b(context);
        this.f72063c = context;
        a(context, 0L, z4);
    }

    private static void b(Context context) {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (!f72061a) {
                    ContextUtils.initApplicationContext(context.getApplicationContext());
                    ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("周\u0001"));
                    TrtcCloudJni.init(0);
                    f72061a = true;
                }
                if (context instanceof Activity) {
                    i.a().a((Activity) context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f72063c.getCacheDir());
        return android.support.v4.media.c.a(sb, File.separator, ProtectedSandApp.s("呩\u0001"));
    }

    public static TRTCCloud createInstance(Context context) {
        return new TRTCCloudImpl(context, false);
    }

    public static void destroyInstance(TRTCCloud tRTCCloud) {
        if (tRTCCloud instanceof TRTCCloudImpl) {
            ((TRTCCloudImpl) tRTCCloud).b();
            return;
        }
        LiteavLog.w(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呪\u0001").concat(String.valueOf(tRTCCloud)));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
        this.f72065e.connectOtherRoom(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        this.f72065e.disconnectOtherRoom();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void addListener(TRTCCloudListener tRTCCloudListener) {
        this.f72065e.addListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public String callExperimentalAPI(String str) {
        return this.f72065e.callExperimentalAPI(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int checkAudioCapabilitySupport(int i4) {
        return (i4 == 2 && this.f72068h.isLowLatencyEarMonitorSupported()) ? 1 : 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            tRTCCloudImpl = new TRTCCloudImpl(ContextUtils.getApplicationContext(), this.f72065e.getTrtcCloudJni());
            this.f72072l.add(tRTCCloudImpl);
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(TRTCCloud tRTCCloud) {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (tRTCCloud instanceof TRTCCloudImpl) {
                    LiteavLog.i(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呫\u0001"));
                    ((TRTCCloudImpl) tRTCCloud).b();
                    this.f72072l.remove(tRTCCloud);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enable3DSpatialAudioEffect(boolean z4) {
        this.f72065e.enable3DSpatialAudioEffect(z4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioEarMonitoring(boolean z4) {
        this.f72067g.enableVoiceEarMonitor(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(boolean z4, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f72065e.enableAudioVolumeEvaluation(z4, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z4) {
        this.f72065e.enableCustomAudioCapture(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioRendering(boolean z4) {
        this.f72065e.enableCustomAudioRendering(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(int i4, boolean z4) {
        this.f72065e.enableCustomVideoCapture(i4, z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f72065e.enableEncSmallVideoStream(z4, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableMixExternalAudioFrame(boolean z4, boolean z5) {
        this.f72065e.enableMixExternalAudioFrame(z4, z5);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enablePayloadPrivateEncryption(boolean z4, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        return this.f72065e.enablePayloadPrivateEncryption(z4, tRTCPayloadPrivateEncryptionConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean enableTorch(boolean z4) {
        return this.f72068h.enableCameraTorch(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i4) {
        this.f72065e.enterRoom(tRTCParams, i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        this.f72065e.exitRoom();
        try {
            File file = new File(c());
            if (file.exists() && file.isDirectory() && e.a(file, 5) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e4) {
            LiteavLog.w(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呬\u0001") + e4.toString());
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public AITranscriberManager getAITranscriberManager() {
        return this.f72070j;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.f72065e.getAudioCaptureVolume();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
        return this.f72067g;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.f72065e.getAudioPlayoutVolume();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int getBGMDuration(String str) {
        return (int) this.f72067g.getMusicDurationInMS(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        return this.f72069i;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f72065e.getCustomAudioRenderingFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXDeviceManager getDeviceManager() {
        return this.f72068h;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.f72068h.isCameraAutoFocusFaceModeSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.f72068h.isCameraFocusPositionInPreviewSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraTorchSupported() {
        return this.f72068h.isCameraTorchSupported();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean isCameraZoomSupported() {
        return this.f72068h.isCameraZoomSupported();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return -1;
        }
        return this.f72065e.mixExternalAudioFrame(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteAudio(boolean z4) {
        this.f72065e.muteAllRemoteAudio(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z4) {
        this.f72065e.muteAllRemoteVideoStreams(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalAudio(boolean z4) {
        this.f72065e.muteLocalAudio(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteLocalVideo(int i4, boolean z4) {
        this.f72065e.muteLocalVideo(i4, z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z4) {
        this.f72065e.muteRemoteAudio(str, z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, int i4, boolean z4) {
        this.f72065e.muteRemoteVideoStream(str, i4, z4);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i4, int i5) {
        TRTCCloud.BGMNotify bGMNotify = this.f72066f;
        if (bGMNotify != null) {
            bGMNotify.onBGMComplete(i5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i4, long j4, long j5) {
        TRTCCloud.BGMNotify bGMNotify = this.f72066f;
        if (bGMNotify != null) {
            bGMNotify.onBGMProgress(j4, j5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i4, int i5) {
        TRTCCloud.BGMNotify bGMNotify = this.f72066f;
        if (bGMNotify != null) {
            bGMNotify.onBGMStart(i5);
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseAudioEffect(int i4) {
        this.f72067g.pauseAudioEffect(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void pauseBGM() {
        this.f72067g.pausePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        this.f72065e.pauseScreenCapture(this.f72071k);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam == null) {
            return;
        }
        final int i4 = tRTCAudioEffectParam.effectId;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i4, b(tRTCAudioEffectParam.path));
        audioMusicParam.publish = tRTCAudioEffectParam.publish;
        audioMusicParam.loopCount = tRTCAudioEffectParam.loopCount;
        audioMusicParam.isShortFile = true;
        this.f72067g.playAudioEffect(audioMusicParam);
        this.f72067g.setEffectObserver(i4, new TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.liteav.trtc.TRTCCloudImpl.1
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onComplete(int i5, int i6) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f72064d;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i4, i6);
                }
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onPlayProgress(int i5, long j4, long j5) {
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public final void onStart(int i5, int i6) {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.f72064d;
                if (tRTCCloudListener == null || i6 >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i4, i6);
            }
        });
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
        this.f72066f = bGMNotify;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        this.f72067g.setMusicObserver(Integer.MAX_VALUE, this);
        this.f72067g.startPlayMusic(audioMusicParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        this.f72065e.removeListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeAudioEffect(int i4) {
        this.f72067g.resumeAudioEffect(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void resumeBGM() {
        this.f72067g.resumePlayMusic(Integer.MAX_VALUE);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        this.f72065e.resumeScreenCapture(this.f72071k);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void selectMotionTmpl(String str) {
        this.f72069i.setMotionTmpl(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            return;
        }
        this.f72065e.sendCustomAudioData(tRTCAudioFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i4, byte[] bArr, boolean z4, boolean z5) {
        if (bArr != null) {
            return this.f72065e.sendCustomCmdMsg(i4, bArr, z4, z5);
        }
        LiteavLog.w(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呭\u0001"));
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            LiteavLog.w(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呮\u0001"));
            return;
        }
        if (tRTCVideoFrame.bufferType == 3) {
            GLES20.glFinish();
        }
        this.f72065e.sendCustomVideoData(i4, tRTCVideoFrame);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i4) {
        if (bArr != null && i4 != 0) {
            return this.f72065e.sendSEIMsg(bArr, i4);
        }
        LiteavLog.w(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呯\u0001"));
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void set3DSpatialReceivingRange(String str, int i4) {
        this.f72065e.set3DSpatialReceivingRange(str, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAllAudioEffectsVolume(int i4) {
        this.f72067g.setAllAudioEffectsVolume(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i4) {
        this.f72065e.setAudioCaptureVolume(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioEffectVolume(int i4, int i5) {
        this.f72067g.setAudioEffectVolume(i4, i5);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f72065e.setAudioFrameListener(tRTCAudioFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i4) {
        this.f72065e.setAudioPlayoutVolume(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setAudioQuality(int i4) {
        this.f72065e.setAudioQuality(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i4) {
        this.f72068h.setAudioRoute(TXDeviceManagerImpl.audioRouteFromInt(i4));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPlayoutVolume(int i4) {
        this.f72067g.setMusicPlayoutVolume(Integer.MAX_VALUE, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setBGMPosition(int i4) {
        this.f72067g.seekMusicToPosInMS(Integer.MAX_VALUE, i4);
        return 0;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMPublishVolume(int i4) {
        this.f72067g.setMusicPublishVolume(Integer.MAX_VALUE, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBGMVolume(int i4) {
        this.f72067g.setMusicPlayoutVolume(Integer.MAX_VALUE, i4);
        this.f72067g.setMusicPublishVolume(Integer.MAX_VALUE, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setBeautyStyle(int i4, int i5, int i6, int i7) {
        this.f72069i.setBeautyStyle(i4);
        this.f72069i.setBeautyLevel(i5);
        this.f72069i.setWhitenessLevel(i6);
        this.f72069i.setRuddyLevel(i7);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setCapturedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f72065e.setCapturedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setChinLevel(int i4) {
        this.f72069i.setChinLevel(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z4, boolean z5) {
        this.f72065e.setDefaultStreamRecvMode(z4, z5);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setEyeScaleLevel(int i4) {
        this.f72069i.setEyeScaleLevel(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceShortLevel(int i4) {
        this.f72069i.setFaceShortLevel(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceSlimLevel(int i4) {
        this.f72069i.setFaceSlimLevel(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFaceVLevel(int i4) {
        this.f72069i.setFaceVLevel(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilter(Bitmap bitmap) {
        this.f72069i.setFilter(bitmap);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFilterConcentration(float f4) {
        this.f72069i.setFilterStrength(f4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setFocusPosition(int i4, int i5) {
        this.f72068h.setCameraFocusPosition(i4, i5);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setGSensorMode(int i4) {
        this.f72065e.setGSensorMode(0, i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGravitySensorAdaptiveMode(int i4) {
        this.f72065e.setGravitySensorAdaptiveMode(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setGreenScreenFile(String str) {
        return false;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
        String valueOf = String.valueOf(tRTCCloudListener);
        Log.d(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呰\u0001").concat(valueOf), new Object[0]);
        this.f72064d = tRTCCloudListener;
        this.f72065e.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        this.f72065e.setListenerHandler(handler);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f72065e.setLocalProcessedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoProcessListener(int i4, int i5, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f72065e.setLocalVideoProcessListener(i4, i5, tRTCVideoFrameListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f72065e.setLocalVideoRenderListener(i4, i5, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewFillMode(int i4) {
        this.f72065e.setLocalViewFillMode(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewMirror(int i4) {
        this.f72065e.setLocalViewMirror(i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setLocalViewRotation(int i4) {
        this.f72065e.setLocalViewRotation(b(i4));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMicVolumeOnMixing(int i4) {
        this.f72067g.setVoiceCaptureVolume(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixExternalAudioVolume(int i4, int i5) {
        this.f72065e.setMixExternalAudioVolume(i4, i5);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f72065e.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        if (tRTCAudioFrameCallbackFormat == null) {
            return -1;
        }
        return this.f72065e.setMixedPlayAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall, tRTCAudioFrameCallbackFormat.mode);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setMotionMute(boolean z4) {
        this.f72069i.setMotionMute(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f72065e.setNetworkQosParam(tRTCNetworkQosParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setNoseSlimLevel(int i4) {
        this.f72069i.setNoseSlimLevel(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.f72065e.setPerspectiveCorrectionPoints(str, pointFArr, pointFArr2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public int setPriorRemoteVideoStreamType(int i4) {
        return this.f72065e.setPriorRemoteVideoStreamType(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f72065e.setRemoteAudioParallelParams(tRTCAudioParallelParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i4) {
        this.f72065e.setRemoteAudioVolume(str, i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteRenderParams(String str, int i4, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        if (tRTCRenderParams == null) {
            return;
        }
        this.f72065e.setRemoteViewFillMode(str, i4, tRTCRenderParams.fillMode);
        this.f72065e.setRemoteViewRotation(str, i4, b(tRTCRenderParams.rotation));
        this.f72065e.setRemoteViewMirror(str, i4, tRTCRenderParams.mirrorType);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i4) {
        this.f72065e.setRemoteViewFillMode(str, 2, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i4) {
        this.f72065e.setRemoteViewRotation(str, 2, b(i4));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f72065e.setRemoteVideoRenderListener(str, i4, i5, tRTCVideoRenderListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoStreamType(String str, int i4) {
        return this.f72065e.setRemoteVideoStreamType(str, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewFillMode(String str, int i4) {
        this.f72065e.setRemoteViewFillMode(str, 0, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setRemoteViewRotation(String str, int i4) {
        this.f72065e.setRemoteViewRotation(str, 0, b(i4));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setReverbType(int i4) {
        this.f72067g.setVoiceReverbType(TXAudioEffectManagerImpl.voiceReverbTypeFromInt(i4));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f72065e.setVideoEncoderParams(2, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setSystemVolumeType(int i4) {
        this.f72068h.setSystemVolumeType(TXDeviceManagerImpl.systemVolumeTypefromInt(i4));
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderMirror(boolean z4) {
        this.f72065e.setVideoEncoderMirror(z4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            return;
        }
        this.f72065e.setVideoEncoderParams(0, tRTCVideoEncParam);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setVideoEncoderRotation(int i4) {
        this.f72065e.setVideoEncoderRotation(b(i4));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(Bitmap bitmap, int i4) {
        this.f72065e.setVideoMuteImage(bitmap, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public boolean setVoiceChangerType(int i4) {
        this.f72067g.setVoiceChangerType(TXAudioEffectManagerImpl.voiceChangerTypeFromInt(i4));
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i4, float f4, float f5, float f6) {
        this.f72065e.setWatermark(bitmap, i4, f4, f5, f6);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void setZoom(int i4) {
        this.f72068h.setCameraZoomRatio(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i4) {
        this.f72065e.showDashboardManager(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i4, int i5, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f72065e.snapshotVideo(str, i4, i5, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f72065e.startAudioRecording(tRTCAudioRecordingParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio(int i4) {
        this.f72065e.startLocalAudio(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z4, TXCloudVideoView tXCloudVideoView) {
        this.f72065e.startLocalPreview(z4, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f72065e.startLocalRecording(tRTCLocalRecordingParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f72065e.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f72065e.startPublishMediaStream(tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startPublishing(String str, int i4) {
        this.f72065e.startPublishing(str, i4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        startRemoteView(str, 2, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView) {
        this.f72065e.startRemoteView(str, i4, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(int i4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f72071k = i4;
        this.f72065e.startScreenCapture(i4, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f72065e.startSpeedTest(tRTCSpeedTestParams);
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSystemAudioLoopback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            LiteavLog.e(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呱\u0001"));
        } else {
            this.f72065e.startSystemAudioLoopback();
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAllAudioEffects() {
        this.f72067g.stopAllAudioEffects();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        this.f72065e.stopAllRemoteView();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopAudioEffect(int i4) {
        this.f72067g.stopAudioEffect(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        this.f72065e.stopAudioRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopBGM() {
        this.f72067g.stopPlayMusic(Integer.MAX_VALUE);
        this.f72067g.setMusicObserver(Integer.MAX_VALUE, null);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        this.f72065e.stopLocalAudio();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        this.f72065e.stopLocalPreview();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalRecording() {
        this.f72065e.stopLocalRecording();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishCDNStream() {
        this.f72065e.stopPublishCDNStream();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishMediaStream(String str) {
        this.f72065e.stopPublishMediaStream(str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopPublishing() {
        this.f72065e.stopPublishing();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteSubStreamView(String str) {
        stopRemoteView(str, 2);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str, int i4) {
        this.f72065e.stopRemoteView(str, i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        this.f72065e.stopScreenCapture(this.f72071k);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        this.f72065e.stopSpeedTest();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSystemAudioLoopback() {
        this.f72065e.stopSystemAudioLoopback();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void switchCamera() {
        this.f72068h.switchCamera(!this.f72068h.isFrontCamera());
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i4) {
        this.f72065e.switchRole(i4);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f72065e.switchRoom(tRTCSwitchRoomConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.f72065e.updateLocalView(tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateOtherRoomForwardMode(String str) {
        this.f72065e.updateOtherRoomForwardMode(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f72065e.updatePublishMediaStream(str, tRTCPublishTarget, tRTCStreamEncoderParam, tRTCStreamMixingConfig);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.f72065e.updateRemote3DSpatialPosition(str, iArr);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView) {
        this.f72065e.updateRemoteView(str, i4, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f72065e.updateSelf3DSpatialPosition(iArr, fArr, fArr2, fArr3);
    }

    public static TRTCCloud a(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            try {
                if (f72062b == null) {
                    f72062b = new TRTCCloudImpl(context, true);
                }
                tRTCCloudImpl = f72062b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tRTCCloudImpl;
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i4, boolean z4) {
        TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams = new TRTCCloudDef.TRTCAudioVolumeEvaluateParams();
        tRTCAudioVolumeEvaluateParams.interval = i4;
        tRTCAudioVolumeEvaluateParams.enableVadDetection = z4;
        tRTCAudioVolumeEvaluateParams.enablePitchCalculation = false;
        tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation = false;
        enableAudioVolumeEvaluation(true, tRTCAudioVolumeEvaluateParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableCustomVideoCapture(boolean z4) {
        enableCustomVideoCapture(0, z4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteLocalVideo(boolean z4) {
        this.f72065e.muteLocalVideo(0, z4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void muteRemoteVideoStream(String str, boolean z4) {
        muteRemoteVideoStream(str, 0, z4);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void snapshotVideo(String str, int i4, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f72065e.snapshotVideo(str, i4, 1, tRTCSnapshotListener);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startLocalAudio() {
        this.f72065e.startLocalAudio();
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.f72065e.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startSpeedTest(int i4, String str, String str2) {
        this.f72065e.startSpeedTest(i4, str, str2);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void stopRemoteView(String str) {
        this.f72065e.stopRemoteView(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRole(int i4, String str) {
        this.f72065e.switchRole(i4, str);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f72071k = 0;
        startScreenCapture(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        sendCustomVideoData(0, tRTCVideoFrame);
    }

    private TRTCCloudImpl(Context context, long j4) {
        b(context);
        this.f72063c = context;
        a(context, j4, false);
    }

    public static void a() {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (f72062b != null) {
                    LiteavLog.i(ProtectedSandApp.s("呠\u0001"), ProtectedSandApp.s("呡\u0001"));
                    Iterator<TRTCCloudImpl> it = f72062b.f72072l.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                    f72062b.b();
                    f72062b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.trtc.DeprecatedTRTCCloud
    public void enableAudioVolumeEvaluation(int i4) {
        enableAudioVolumeEvaluation(i4, false);
    }

    private void b() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.f72069i;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        this.f72065e.destroy();
    }

    public static void b(boolean z4) {
        TrtcCloudJni.setLogCompressEnabled(z4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:8|9|10|11|(1:13)(2:65|(1:67))|14|15|(1:17)(1:64)|18|(7:(2:20|(2:24|25))|32|33|34|35|36|25)|26|27|28|29|30|31) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:8|9|10|11|(1:13)(2:65|(1:67))|14|15|(1:17)(1:64)|18|(2:20|(2:24|25))|26|27|28|29|30|31|32|33|34|35|36|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:20|(2:24|25))|32|33|34|35|36|25) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        com.tencent.liteav.base.util.LiteavLog.e(com.flashget.parentalcontrol.ProtectedSandApp.s("呥\u0001"), com.flashget.parentalcontrol.ProtectedSandApp.s("呦\u0001"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
    
        com.tencent.liteav.base.util.e.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r2.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r3 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r3 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
    
        r2 = null;
        r3 = r1;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
    
        r2 = null;
        r3 = r1;
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.TRTCCloudImpl.b(java.lang.String):java.lang.String");
    }

    private void a(Context context, long j4, boolean z4) {
        this.f72063c = context.getApplicationContext();
        if (j4 == 0) {
            this.f72065e = new TrtcCloudJni(z4);
        } else {
            this.f72065e = new TrtcCloudJni(j4, z4);
        }
        this.f72068h = new TXDeviceManagerImpl(this.f72065e.createDeviceManager());
        this.f72067g = new TXAudioEffectManagerImpl(this.f72065e.createAudioEffectManager());
        this.f72069i = new TXBeautyManagerImpl(this.f72065e.createBeautyManager());
        this.f72070j = new AITranscriberManagerImpl(this.f72065e.createAITranscriberManager());
    }

    public static void a(int i4) {
        TrtcCloudJni.setLogLevel(i4);
    }

    public static void a(boolean z4) {
        TrtcCloudJni.setConsoleEnabled(z4);
    }

    public static void a(String str) {
        TrtcCloudJni.setLogDirPath(str);
    }

    private static int b(int i4) {
        if (i4 < 0) {
            return 0;
        }
        return i4 > 3 ? (i4 / 90) % 4 : i4;
    }
}
