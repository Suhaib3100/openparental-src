package com.tencent.liteav.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.view.Surface;
import androidx.constraintlayout.core.motion.utils.w;
import com.android.volley.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.i;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.b;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class TXLivePusherJni implements ITXLivePushListener, TXLivePusher.AudioCustomProcessListener, TXLivePusher.ITXAudioVolumeEvaluationListener, TXLivePusher.ITXSnapshotListener, TXLivePusher.OnBGMNotify, TXLivePusher.VideoCustomProcessListener, b, TXCloudVideoView.b {
    private TXLivePusher.AudioCustomProcessListener mAudioCustomProcessListener;
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManagerImpl mBeautyManager;
    private TXLivePushConfig mConfig;
    private TXLivePusher.ITXAudioVolumeEvaluationListener mITXAudioVolumeEvaluationListener;
    private ITXLivePushListener mITXLivePushListener;
    private TXLivePusher.ITXSnapshotListener mITXSnapshotListener;
    private TXRecordCommon.ITXVideoRecordListener mITXVideoRecordListener;
    private long mNativeTXLivePusherJni;
    private TXLivePusher.OnBGMNotify mOnBGMNotify;
    private TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private int mVideoQuality = -1;

    public TXLivePusherJni(Context context) {
        this.mNativeTXLivePusherJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("叴\u0001"));
        this.mConfig = new TXLivePushConfig();
        long nativeCreate = nativeCreate(new WeakReference(this));
        this.mNativeTXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeTXLivePusherJni));
        if (context instanceof Activity) {
            i.a().a((Activity) context);
        }
    }

    public static String[] getMapKeys(HashMap<String, String> hashMap) {
        String[] strArr = new String[hashMap.size()];
        Iterator<String> it = hashMap.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            strArr[i4] = it.next();
            i4++;
        }
        return strArr;
    }

    public static String[] getMapValues(HashMap<String, String> hashMap, String[] strArr) {
        String[] strArr2 = new String[hashMap.size()];
        int length = strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            strArr2[i5] = hashMap.get(strArr[i4]);
            i4++;
            i5++;
        }
        return strArr2;
    }

    public static boolean isMapValid(HashMap<String, String> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str == null || hashMap.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    private static native void nativeCallExperimentalAPI(long j4, String str);

    private static native long nativeCreate(WeakReference<TXLivePusherJni> weakReference);

    private static native long nativeCreateAudioEffectManager(long j4);

    private static native long nativeCreateBeautyManager(long j4);

    private static native void nativeDestroy(long j4);

    private static native void nativeEnableAudioVolumeEvaluation(long j4, int i4);

    private static native int nativeGetMaxZoom(long j4);

    private static native int nativeGetMusicDuration(long j4, String str);

    private static native boolean nativeIsPushing(long j4);

    private static native void nativeOnLogRecord(long j4, String str);

    private static native boolean nativePauseBGM(long j4);

    private static native void nativePausePusher(long j4);

    private static native boolean nativePlayBGM(long j4, String str);

    private static native boolean nativeResumeBGM(long j4);

    private static native void nativeResumePusher(long j4);

    private static native void nativeSendCustomPCMData(long j4, byte[] bArr);

    private static native void nativeSendCustomVideoFrame(long j4, int i4, int i5, int i6, int i7, int i10, Object obj, byte[] bArr);

    private static native void nativeSendMessage(long j4, byte[] bArr);

    private static native boolean nativeSendMessageEx(long j4, byte[] bArr);

    private static native void nativeSetAudioConfig(long j4, int i4, int i5, int i6, boolean z4, boolean z5);

    private static native void nativeSetBGMPitch(long j4, float f4);

    private static native boolean nativeSetBGMPosition(long j4, int i4);

    private static native boolean nativeSetBGMVolume(long j4, float f4);

    private static native boolean nativeSetBeautyFilter(long j4, int i4, int i5, int i6, int i7);

    private static native void nativeSetCaptureConfig(long j4, int i4, int i5, Bitmap bitmap, int i6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, int i7);

    private static native void nativeSetEncoderConfig(long j4, int i4, int i5, boolean z4, int i6, int i7, int i10, int i11, int i12, boolean z5, int i13, boolean z6);

    private static native void nativeSetExposureCompensation(long j4, float f4);

    private static native void nativeSetFilter(long j4, Bitmap bitmap);

    private static native void nativeSetFocusPosition(long j4, float f4, float f5);

    private static native boolean nativeSetMicVolume(long j4, float f4);

    private static native boolean nativeSetMirror(long j4, boolean z4);

    private static native void nativeSetMute(long j4, boolean z4);

    private static native void nativeSetNetworkConfig(long j4, int i4, boolean z4, int i5, int i6, int i7, HashMap hashMap);

    private static native void nativeSetRenderRotation(long j4, int i4);

    private static native void nativeSetReverb(long j4, int i4);

    private static native void nativeSetSpecialRatio(long j4, float f4);

    private static native void nativeSetView(long j4, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j4, int i4);

    private static native void nativeSetWaterMark(long j4, Bitmap bitmap, float f4, float f5, float f6);

    private static native boolean nativeSetZoom(long j4, int i4);

    private static native void nativeShowDebugView(long j4, boolean z4);

    private static native void nativeSnapshot(long j4);

    private static native void nativeStartCamera(long j4);

    private static native int nativeStartPusher(long j4, String str);

    private static native int nativeStartRecord(long j4, String str);

    private static native void nativeStartScreenCapture(long j4);

    private static native boolean nativeStopBGM(long j4);

    private static native void nativeStopCameraPreview(long j4, boolean z4);

    private static native void nativeStopPusher(long j4);

    private static native void nativeStopRecord(long j4);

    private static native void nativeStopScreenCapture(long j4);

    private static native void nativeSwitchCamera(long j4);

    private static native boolean nativeTurnOnFlashLight(long j4, boolean z4);

    public static TXLivePusherJni weakToStrongReference(WeakReference<TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.rtmp.b
    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void enableAudioVolumeEvaluation(int i4) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePusherJni, i4);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        release();
    }

    @Override // com.tencent.rtmp.b
    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.rtmp.b
    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.rtmp.b
    public TXLivePushConfig getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.rtmp.b
    public int getMaxZoom() {
        return nativeGetMaxZoom(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public int getMusicDuration(String str) {
        return nativeGetMusicDuration(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public boolean isPushing() {
        return nativeIsPushing(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i4) {
        TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mITXAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i4);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMComplete(int i4) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMComplete(i4);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMProgress(long j4, long j5) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMProgress(j4, j5);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMStart() {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMStart();
        }
    }

    public int onCustomPreprocessFrame(int i4, int i5, int i6) {
        return onTextureCustomProcess(i4, i5, i6);
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onDetectFacePoints(float[] fArr) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onDetectFacePoints(fArr);
        }
    }

    @Override // com.tencent.rtmp.b
    public void onLogRecord(String str) {
        nativeOnLogRecord(this.mNativeTXLivePusherJni, str);
    }

    public byte[] onNativeRecordPcmData(byte[] bArr, long j4, int i4, int i5, int i6) {
        onRecordPcmData(bArr, j4, i4, i5, i6);
        return bArr;
    }

    public byte[] onNativeRecordRawPcmData(byte[] bArr, long j4, int i4, int i5, int i6, boolean z4) {
        onRecordRawPcmData(bArr, j4, i4, i5, i6, z4);
        return bArr;
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onNetStatus(Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onPushEvent(int i4, Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onPushEvent(i4, bundle);
        }
    }

    public void onRecordComplete(int i4, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
            if (i4 == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i4, Bundle bundle) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i4, bundle);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordPcmData(byte[] bArr, long j4, int i4, int i5, int i6) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordPcmData(bArr, j4, i4, i5, i6);
        }
    }

    public void onRecordProgress(long j4) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j4);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordRawPcmData(byte[] bArr, long j4, int i4, int i5, int i6, boolean z4) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordRawPcmData(bArr, j4, i4, i5, i6, z4);
        }
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z4) {
        nativeShowDebugView(this.mNativeTXLivePusherJni, z4);
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    public void onSnapshot(Bitmap bitmap) {
        TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mITXSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public int onTextureCustomProcess(int i4, int i5, int i6) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i4, i5, i6);
        }
        return -1;
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onTextureDestoryed() {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    @Override // com.tencent.rtmp.b
    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void pausePusher() {
        nativePausePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean playBGM(String str) {
        return nativePlayBGM(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void release() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j4 = this.mNativeTXLivePusherJni;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeTXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.rtmp.b
    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void resumePusher() {
        nativeResumePusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void sendCustomPCMData(byte[] bArr) {
        nativeSendCustomPCMData(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoData(byte[] bArr, int i4, int i5, int i6) {
        GLConstants.PixelFormatType pixelFormatType;
        if (i4 == 3) {
            pixelFormatType = GLConstants.PixelFormatType.f72156a;
        } else {
            if (i4 != 5) {
                return -3;
            }
            pixelFormatType = GLConstants.PixelFormatType.f72161f;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i5, i6, GLConstants.a.f72177d.mValue, pixelFormatType.getValue(), -1, null, bArr);
        return 0;
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoTexture(int i4, int i5, int i6) {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext == null) {
            return -1;
        }
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, i5, i6, GLConstants.a.f72175b.mValue, GLConstants.PixelFormatType.f72161f.getValue(), i4, eglGetCurrentContext, null);
        return 0;
    }

    @Override // com.tencent.rtmp.b
    public void sendMessage(byte[] bArr) {
        nativeSendMessage(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public boolean sendMessageEx(byte[] bArr) {
        return nativeSendMessageEx(this.mNativeTXLivePusherJni, bArr);
    }

    @Override // com.tencent.rtmp.b
    public void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        this.mAudioCustomProcessListener = audioCustomProcessListener;
    }

    @Override // com.tencent.rtmp.b
    public void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mITXAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.b
    public void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mOnBGMNotify = onBGMNotify;
    }

    @Override // com.tencent.rtmp.b
    public void setBGMPitch(float f4) {
        nativeSetBGMPitch(this.mNativeTXLivePusherJni, f4);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMPosition(int i4) {
        return nativeSetBGMPosition(this.mNativeTXLivePusherJni, i4);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMVolume(float f4) {
        return nativeSetBGMVolume(this.mNativeTXLivePusherJni, f4);
    }

    @Override // com.tencent.rtmp.b
    public boolean setBeautyFilter(int i4, int i5, int i6, int i7) {
        return nativeSetBeautyFilter(this.mNativeTXLivePusherJni, i4, i5, i6, i7);
    }

    @Override // com.tencent.rtmp.b
    public void setChinLevel(int i4) {
        this.mBeautyManager.setChinLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setConfig(TXLivePushConfig tXLivePushConfig) {
        if (tXLivePushConfig == null) {
            return;
        }
        this.mConfig = tXLivePushConfig;
        nativeSetCaptureConfig(this.mNativeTXLivePusherJni, tXLivePushConfig.mCustomModeType, tXLivePushConfig.mLocalVideoMirrorType, tXLivePushConfig.mPauseImg, tXLivePushConfig.mPauseFps, tXLivePushConfig.mFrontCamera, tXLivePushConfig.mTouchFocus, tXLivePushConfig.mEnableZoom, tXLivePushConfig.mEnableScreenCaptureAutoRotate, tXLivePushConfig.mEnableHighResolutionCapture, tXLivePushConfig.mPauseFlag);
        long j4 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig2 = this.mConfig;
        int i4 = tXLivePushConfig2.mHomeOrientation;
        int ordinal = tXLivePushConfig2.mVideoResolution.ordinal();
        TXLivePushConfig tXLivePushConfig3 = this.mConfig;
        nativeSetEncoderConfig(j4, i4, ordinal, tXLivePushConfig3.mAutoAdjustBitrate, tXLivePushConfig3.mVideoBitrate, tXLivePushConfig3.mMaxVideoBitrate, tXLivePushConfig3.mMinVideoBitrate, tXLivePushConfig3.mVideoEncodeGop, tXLivePushConfig3.mVideoFPS, tXLivePushConfig3.mVideoEncoderXMirror, tXLivePushConfig3.mHardwareAccel, tXLivePushConfig3.mEnableVideoHardEncoderMainProfile);
        long j5 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig4 = this.mConfig;
        nativeSetWaterMark(j5, tXLivePushConfig4.mWatermark, tXLivePushConfig4.mWatermarkXF, tXLivePushConfig4.mWatermarkYF, tXLivePushConfig4.mWatermarkWidth);
        long j6 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig5 = this.mConfig;
        nativeSetAudioConfig(j6, tXLivePushConfig5.mAudioChannels, tXLivePushConfig5.mAudioSample, tXLivePushConfig5.mVolumeType, tXLivePushConfig5.mEnableAudioPreview, tXLivePushConfig5.mEnableAns);
        long j7 = this.mNativeTXLivePusherJni;
        TXLivePushConfig tXLivePushConfig6 = this.mConfig;
        nativeSetNetworkConfig(j7, tXLivePushConfig6.mAutoAdjustStrategy, tXLivePushConfig6.mEnablePureAudioPush, tXLivePushConfig6.mConnectRetryCount, tXLivePushConfig6.mConnectRetryInterval, tXLivePushConfig6.mRtmpChannelType, tXLivePushConfig6.mMetaData);
    }

    @Override // com.tencent.rtmp.b
    public void setExposureCompensation(float f4) {
        nativeSetExposureCompensation(this.mNativeTXLivePusherJni, f4);
    }

    @Override // com.tencent.rtmp.b
    public void setEyeScaleLevel(int i4) {
        this.mBeautyManager.setEyeScaleLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceShortLevel(int i4) {
        this.mBeautyManager.setFaceShortLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceSlimLevel(int i4) {
        this.mBeautyManager.setFaceSlimLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setFaceVLevel(int i4) {
        this.mBeautyManager.setFaceVLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setFilter(Bitmap bitmap) {
        nativeSetFilter(this.mNativeTXLivePusherJni, bitmap);
    }

    @Override // com.tencent.rtmp.b
    public void setFocusPosition(float f4, float f5) {
        nativeSetFocusPosition(this.mNativeTXLivePusherJni, f4, f5);
    }

    @Override // com.tencent.rtmp.b
    public boolean setGreenScreenFile(String str) {
        return this.mBeautyManager.setGreenScreenFile(str) != 0;
    }

    @Override // com.tencent.rtmp.b
    public boolean setMicVolume(float f4) {
        return nativeSetMicVolume(this.mNativeTXLivePusherJni, f4);
    }

    @Override // com.tencent.rtmp.b
    public boolean setMirror(boolean z4) {
        return nativeSetMirror(this.mNativeTXLivePusherJni, z4);
    }

    @Override // com.tencent.rtmp.b
    public void setMotionMute(boolean z4) {
        this.mBeautyManager.setMotionMute(z4);
    }

    @Override // com.tencent.rtmp.b
    public void setMotionTmpl(String str) {
        this.mBeautyManager.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.b
    public void setMute(boolean z4) {
        nativeSetMute(this.mNativeTXLivePusherJni, z4);
    }

    @Override // com.tencent.rtmp.b
    public void setNoseSlimLevel(int i4) {
        this.mBeautyManager.setNoseSlimLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.mITXLivePushListener = iTXLivePushListener;
    }

    @Override // com.tencent.rtmp.b
    public void setRenderRotation(int i4) {
        nativeSetRenderRotation(this.mNativeTXLivePusherJni, i4);
    }

    @Override // com.tencent.rtmp.b
    public void setReverb(int i4) {
        nativeSetReverb(this.mNativeTXLivePusherJni, i4);
    }

    @Override // com.tencent.rtmp.b
    public void setSpecialRatio(float f4) {
        nativeSetSpecialRatio(this.mNativeTXLivePusherJni, f4);
    }

    @Override // com.tencent.rtmp.b
    public void setSurface(Surface surface) {
        nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(surface));
    }

    @Override // com.tencent.rtmp.b
    public void setSurfaceSize(int i4, int i5) {
    }

    @Override // com.tencent.rtmp.b
    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.rtmp.b
    public void setVideoQuality(int i4, boolean z4, boolean z5) {
        Object[] objArr = z4 && z5;
        this.mConfig.setHardwareAcceleration(1);
        this.mConfig.setAutoAdjustBitrate(z4);
        switch (i4) {
            case 1:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(z5 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(301);
                } else {
                    this.mConfig.setMinVideoBitrate(500);
                }
                this.mConfig.setVideoBitrate(TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE);
                this.mConfig.setMaxVideoBitrate(w.b.f22438j);
                break;
            case 2:
                this.mConfig.setVideoResolution(1);
                this.mConfig.setAutoAdjustStrategy(z5 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE);
                }
                this.mConfig.setVideoBitrate(1200);
                this.mConfig.setMaxVideoBitrate(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                break;
            case 3:
                this.mConfig.setVideoResolution(2);
                this.mConfig.setAutoAdjustStrategy(z5 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(1000);
                }
                this.mConfig.setVideoBitrate(1800);
                this.mConfig.setMaxVideoBitrate(1800);
                break;
            case 4:
                int i5 = this.mVideoQuality;
                if (i5 == 1) {
                    this.mConfig.setVideoResolution(0);
                    this.mConfig.setMinVideoBitrate(500);
                    this.mConfig.setVideoBitrate(TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE);
                    this.mConfig.setMaxVideoBitrate(w.b.f22438j);
                } else if (i5 == 3) {
                    this.mConfig.setVideoResolution(2);
                    this.mConfig.setMinVideoBitrate(1000);
                    this.mConfig.setVideoBitrate(1800);
                    this.mConfig.setMaxVideoBitrate(1800);
                } else if (i5 == 7) {
                    this.mConfig.setVideoResolution(30);
                    this.mConfig.setMinVideoBitrate(2000);
                    this.mConfig.setVideoBitrate(3000);
                    this.mConfig.setMaxVideoBitrate(3000);
                } else {
                    this.mConfig.setVideoResolution(1);
                    this.mConfig.setMinVideoBitrate(TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE);
                    this.mConfig.setVideoBitrate(1200);
                    this.mConfig.setMaxVideoBitrate(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                }
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 5:
                this.mConfig.setVideoResolution(6);
                this.mConfig.setMinVideoBitrate(350);
                this.mConfig.setVideoBitrate(350);
                this.mConfig.setMaxVideoBitrate(350);
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 6:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(5);
                this.mConfig.setVideoEncodeGop(1);
                this.mConfig.setMinVideoBitrate(190);
                this.mConfig.setVideoBitrate(400);
                this.mConfig.setMaxVideoBitrate(810);
                break;
            case 7:
                this.mConfig.setVideoResolution(30);
                this.mConfig.setAutoAdjustStrategy(z5 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (objArr == true) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(g.f40879e);
                }
                this.mConfig.setVideoBitrate(3000);
                this.mConfig.setMaxVideoBitrate(3000);
                break;
            default:
                return;
        }
        this.mVideoQuality = i4;
        setConfig(this.mConfig);
    }

    @Override // com.tencent.rtmp.b
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mITXVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.b
    public void setVoiceChangerType(int i4) {
        nativeSetVoiceChangerType(this.mNativeTXLivePusherJni, i4);
    }

    @Override // com.tencent.rtmp.b
    public boolean setZoom(int i4) {
        return nativeSetZoom(this.mNativeTXLivePusherJni, i4);
    }

    @Override // com.tencent.rtmp.b
    public void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mITXSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            a.a(tXCloudVideoView, new WeakReference(this));
            nativeShowDebugView(this.mNativeTXLivePusherJni, a.a(tXCloudVideoView));
        }
        nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(tXCloudVideoView));
        nativeStartCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public int startPusher(String str) {
        return nativeStartPusher(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public int startRecord(String str) {
        return nativeStartRecord(this.mNativeTXLivePusherJni, str);
    }

    @Override // com.tencent.rtmp.b
    public void startScreenCapture() {
        nativeStartScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopCameraPreview(boolean z4) {
        nativeStopCameraPreview(this.mNativeTXLivePusherJni, z4);
    }

    @Override // com.tencent.rtmp.b
    public void stopPusher() {
        nativeStopPusher(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopRecord() {
        nativeStopRecord(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void stopScreenCapture() {
        nativeStopScreenCapture(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public void switchCamera() {
        this.mConfig.setFrontCamera(!r0.mFrontCamera);
        nativeSwitchCamera(this.mNativeTXLivePusherJni);
    }

    @Override // com.tencent.rtmp.b
    public boolean turnOnFlashLight(boolean z4) {
        return nativeTurnOnFlashLight(this.mNativeTXLivePusherJni, z4);
    }
}
