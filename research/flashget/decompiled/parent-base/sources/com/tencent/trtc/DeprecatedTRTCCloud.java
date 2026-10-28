package com.tencent.trtc;

import android.graphics.Bitmap;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;

/* loaded from: classes7.dex */
public abstract class DeprecatedTRTCCloud {
    @Deprecated
    public abstract int checkAudioCapabilitySupport(int i4);

    public abstract void enableAudioEarMonitoring(boolean z4);

    @Deprecated
    public abstract void enableAudioVolumeEvaluation(int i4);

    @Deprecated
    public abstract void enableAudioVolumeEvaluation(int i4, boolean z4);

    @Deprecated
    public abstract void enableCustomVideoCapture(boolean z4);

    @Deprecated
    public abstract boolean enableTorch(boolean z4);

    @Deprecated
    public abstract int getBGMDuration(String str);

    @Deprecated
    public abstract boolean isCameraAutoFocusFaceModeSupported();

    @Deprecated
    public abstract boolean isCameraFocusPositionInPreviewSupported();

    @Deprecated
    public abstract boolean isCameraTorchSupported();

    @Deprecated
    public abstract boolean isCameraZoomSupported();

    @Deprecated
    public abstract void muteLocalVideo(boolean z4);

    @Deprecated
    public abstract void muteRemoteVideoStream(String str, boolean z4);

    @Deprecated
    public abstract void pauseAudioEffect(int i4);

    @Deprecated
    public abstract void pauseBGM();

    @Deprecated
    public abstract void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam);

    @Deprecated
    public abstract void playBGM(String str, TRTCCloud.BGMNotify bGMNotify);

    @Deprecated
    public abstract void resumeAudioEffect(int i4);

    @Deprecated
    public abstract void resumeBGM();

    @Deprecated
    public abstract void selectMotionTmpl(String str);

    @Deprecated
    public abstract void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    @Deprecated
    public abstract void setAllAudioEffectsVolume(int i4);

    @Deprecated
    public abstract void setAudioEffectVolume(int i4, int i5);

    @Deprecated
    public abstract void setAudioQuality(int i4);

    @Deprecated
    public abstract void setBGMPlayoutVolume(int i4);

    @Deprecated
    public abstract int setBGMPosition(int i4);

    @Deprecated
    public abstract void setBGMPublishVolume(int i4);

    @Deprecated
    public abstract void setBGMVolume(int i4);

    @Deprecated
    public abstract void setBeautyStyle(int i4, int i5, int i6, int i7);

    @Deprecated
    public abstract void setChinLevel(int i4);

    @Deprecated
    public abstract void setEyeScaleLevel(int i4);

    @Deprecated
    public abstract void setFaceShortLevel(int i4);

    @Deprecated
    public abstract void setFaceSlimLevel(int i4);

    @Deprecated
    public abstract void setFaceVLevel(int i4);

    @Deprecated
    public abstract void setFilter(Bitmap bitmap);

    @Deprecated
    public abstract void setFilterConcentration(float f4);

    @Deprecated
    public abstract void setFocusPosition(int i4, int i5);

    @Deprecated
    public abstract void setGSensorMode(int i4);

    @Deprecated
    public abstract boolean setGreenScreenFile(String str);

    @Deprecated
    public abstract void setListener(TRTCCloudListener tRTCCloudListener);

    @Deprecated
    public abstract void setLocalViewFillMode(int i4);

    @Deprecated
    public abstract void setLocalViewMirror(int i4);

    @Deprecated
    public abstract void setLocalViewRotation(int i4);

    @Deprecated
    public abstract void setMicVolumeOnMixing(int i4);

    @Deprecated
    public abstract void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig);

    @Deprecated
    public abstract void setMotionMute(boolean z4);

    @Deprecated
    public abstract void setNoseSlimLevel(int i4);

    @Deprecated
    public abstract int setPriorRemoteVideoStreamType(int i4);

    @Deprecated
    public abstract void setRemoteSubStreamViewFillMode(String str, int i4);

    @Deprecated
    public abstract void setRemoteSubStreamViewRotation(String str, int i4);

    @Deprecated
    public abstract void setRemoteViewFillMode(String str, int i4);

    @Deprecated
    public abstract void setRemoteViewRotation(String str, int i4);

    @Deprecated
    public abstract void setReverbType(int i4);

    public abstract void setSystemVolumeType(int i4);

    @Deprecated
    public abstract void setVideoEncoderMirror(boolean z4);

    @Deprecated
    public abstract void setVideoEncoderRotation(int i4);

    @Deprecated
    public abstract boolean setVoiceChangerType(int i4);

    @Deprecated
    public abstract void setZoom(int i4);

    @Deprecated
    public abstract void snapshotVideo(String str, int i4, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    @Deprecated
    public abstract void startLocalAudio();

    @Deprecated
    public abstract void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    @Deprecated
    public abstract void startPublishing(String str, int i4);

    @Deprecated
    public abstract void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView);

    @Deprecated
    public abstract void startRemoteView(String str, TXCloudVideoView tXCloudVideoView);

    @Deprecated
    public abstract void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    @Deprecated
    public abstract void startSpeedTest(int i4, String str, String str2);

    @Deprecated
    public abstract void stopAllAudioEffects();

    @Deprecated
    public abstract void stopAudioEffect(int i4);

    @Deprecated
    public abstract void stopBGM();

    @Deprecated
    public abstract void stopPublishCDNStream();

    @Deprecated
    public abstract void stopPublishing();

    @Deprecated
    public abstract void stopRemoteSubStreamView(String str);

    @Deprecated
    public abstract void stopRemoteView(String str);

    @Deprecated
    public abstract void switchCamera();
}
