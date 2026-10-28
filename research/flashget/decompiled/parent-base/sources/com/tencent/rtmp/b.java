package com.tencent.rtmp;

import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: classes7.dex */
public interface b {
    void callExperimentalAPI(String str);

    void enableAudioVolumeEvaluation(int i4);

    TXAudioEffectManager getAudioEffectManager();

    TXBeautyManager getBeautyManager();

    TXLivePushConfig getConfig();

    int getMaxZoom();

    @Deprecated
    int getMusicDuration(String str);

    boolean isPushing();

    void onLogRecord(String str);

    @Deprecated
    boolean pauseBGM();

    void pausePusher();

    @Deprecated
    boolean playBGM(String str);

    void release();

    @Deprecated
    boolean resumeBGM();

    void resumePusher();

    void sendCustomPCMData(byte[] bArr);

    int sendCustomVideoData(byte[] bArr, int i4, int i5, int i6);

    int sendCustomVideoTexture(int i4, int i5, int i6);

    @Deprecated
    void sendMessage(byte[] bArr);

    boolean sendMessageEx(byte[] bArr);

    void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener);

    void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    @Deprecated
    void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify);

    @Deprecated
    void setBGMPitch(float f4);

    @Deprecated
    boolean setBGMPosition(int i4);

    @Deprecated
    boolean setBGMVolume(float f4);

    boolean setBeautyFilter(int i4, int i5, int i6, int i7);

    @Deprecated
    void setChinLevel(int i4);

    void setConfig(TXLivePushConfig tXLivePushConfig);

    void setExposureCompensation(float f4);

    @Deprecated
    void setEyeScaleLevel(int i4);

    @Deprecated
    void setFaceShortLevel(int i4);

    @Deprecated
    void setFaceSlimLevel(int i4);

    @Deprecated
    void setFaceVLevel(int i4);

    @Deprecated
    void setFilter(Bitmap bitmap);

    void setFocusPosition(float f4, float f5);

    @Deprecated
    boolean setGreenScreenFile(String str);

    @Deprecated
    boolean setMicVolume(float f4);

    boolean setMirror(boolean z4);

    @Deprecated
    void setMotionMute(boolean z4);

    @Deprecated
    void setMotionTmpl(String str);

    void setMute(boolean z4);

    @Deprecated
    void setNoseSlimLevel(int i4);

    void setPushListener(ITXLivePushListener iTXLivePushListener);

    void setRenderRotation(int i4);

    @Deprecated
    void setReverb(int i4);

    @Deprecated
    void setSpecialRatio(float f4);

    void setSurface(Surface surface);

    @Deprecated
    void setSurfaceSize(int i4, int i5);

    void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener);

    void setVideoQuality(int i4, boolean z4, boolean z5);

    void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    @Deprecated
    void setVoiceChangerType(int i4);

    boolean setZoom(int i4);

    void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener);

    void startCameraPreview(TXCloudVideoView tXCloudVideoView);

    int startPusher(String str);

    int startRecord(String str);

    void startScreenCapture();

    @Deprecated
    boolean stopBGM();

    void stopCameraPreview(boolean z4);

    void stopPusher();

    void stopRecord();

    void stopScreenCapture();

    void switchCamera();

    boolean turnOnFlashLight(boolean z4);
}
