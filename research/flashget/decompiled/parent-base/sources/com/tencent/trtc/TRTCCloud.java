package com.tencent.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.transcriber.AITranscriberManager;
import com.tencent.liteav.trtc.TRTCCloudImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public abstract class TRTCCloud extends DeprecatedTRTCCloud {
    private static a mTXLogListener;
    static WeakReference<TRTCCloud> sInstance;

    @Deprecated
    public interface BGMNotify {
        void onBGMComplete(int i4);

        void onBGMProgress(long j4, long j5);

        void onBGMStart(int i4);
    }

    public static class TRTCViewMargin {
        public float bottomMargin;
        public float leftMargin;
        public float rightMargin;
        public float topMargin;

        public TRTCViewMargin(float f4, float f5, float f6, float f7) {
            this.leftMargin = f4;
            this.topMargin = f6;
            this.rightMargin = f5;
            this.bottomMargin = f7;
        }
    }

    static class a implements LiteavLog.a {

        /* renamed from: a, reason: collision with root package name */
        TRTCCloudListener.TRTCLogListener f72768a = null;

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i4, String str, String str2) {
            TRTCCloudListener.TRTCLogListener tRTCLogListener = this.f72768a;
            if (tRTCLogListener != null) {
                tRTCLogListener.onLog(str2, i4, str);
            }
        }
    }

    public static void destroySharedInstance() {
        TRTCCloudImpl.a();
    }

    public static long generateCustomPTS() {
        return TimeUtil.a();
    }

    public static String getSDKVersion() {
        return CommonUtil.getSDKVersionStr();
    }

    public static void setConsoleEnabled(boolean z4) {
        TRTCCloudImpl.a(z4);
    }

    public static void setLogCompressEnabled(boolean z4) {
        TRTCCloudImpl.b(z4);
    }

    public static void setLogDirPath(String str) {
        TRTCCloudImpl.a(str);
    }

    public static void setLogLevel(int i4) {
        TRTCCloudImpl.a(i4);
    }

    public static void setLogListener(TRTCCloudListener.TRTCLogListener tRTCLogListener) {
        a aVar = mTXLogListener;
        if (aVar != null) {
            aVar.f72768a = null;
        }
        if (tRTCLogListener != null) {
            a aVar2 = new a();
            mTXLogListener = aVar2;
            aVar2.f72768a = tRTCLogListener;
        } else {
            mTXLogListener = null;
        }
        LiteavLog.setCallback(mTXLogListener);
        LiteavLog.nativeSetLogCallbackEnabled(mTXLogListener != null);
    }

    public static TRTCCloud sharedInstance(Context context) {
        return TRTCCloudImpl.a(context);
    }

    public abstract void ConnectOtherRoom(String str);

    public abstract void DisconnectOtherRoom();

    public abstract void addListener(TRTCCloudListener tRTCCloudListener);

    public abstract String callExperimentalAPI(String str);

    public abstract TRTCCloud createSubCloud();

    public abstract void destroySubCloud(TRTCCloud tRTCCloud);

    public abstract void enable3DSpatialAudioEffect(boolean z4);

    public abstract void enableAudioVolumeEvaluation(boolean z4, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams);

    public abstract void enableCustomAudioCapture(boolean z4);

    public abstract void enableCustomAudioRendering(boolean z4);

    public abstract void enableCustomVideoCapture(int i4, boolean z4);

    public abstract int enableEncSmallVideoStream(boolean z4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void enableMixExternalAudioFrame(boolean z4, boolean z5);

    public abstract int enablePayloadPrivateEncryption(boolean z4, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig);

    public abstract void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i4);

    public abstract void exitRoom();

    public abstract AITranscriberManager getAITranscriberManager();

    public abstract int getAudioCaptureVolume();

    public abstract TXAudioEffectManager getAudioEffectManager();

    public abstract int getAudioPlayoutVolume();

    public abstract TXBeautyManager getBeautyManager();

    public abstract void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract TXDeviceManager getDeviceManager();

    public abstract int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract void muteAllRemoteAudio(boolean z4);

    public abstract void muteAllRemoteVideoStreams(boolean z4);

    public abstract void muteLocalAudio(boolean z4);

    public abstract void muteLocalVideo(int i4, boolean z4);

    public abstract void muteRemoteAudio(String str, boolean z4);

    public abstract void muteRemoteVideoStream(String str, int i4, boolean z4);

    public abstract void pauseScreenCapture();

    public abstract void removeListener(TRTCCloudListener tRTCCloudListener);

    public abstract void resumeScreenCapture();

    public abstract void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract boolean sendCustomCmdMsg(int i4, byte[] bArr, boolean z4, boolean z5);

    public abstract void sendCustomVideoData(int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    public abstract boolean sendSEIMsg(byte[] bArr, int i4);

    public abstract void set3DSpatialReceivingRange(String str, int i4);

    public abstract void setAudioCaptureVolume(int i4);

    public abstract void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener);

    public abstract void setAudioPlayoutVolume(int i4);

    public abstract void setAudioRoute(int i4);

    public abstract int setCapturedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setDebugViewMargin(String str, TRTCViewMargin tRTCViewMargin);

    public abstract void setDefaultStreamRecvMode(boolean z4, boolean z5);

    public abstract void setGravitySensorAdaptiveMode(int i4);

    public abstract void setListenerHandler(Handler handler);

    public abstract int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    public abstract int setLocalVideoProcessListener(int i4, int i5, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener);

    public abstract int setLocalVideoRenderListener(int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract void setMixExternalAudioVolume(int i4, int i5);

    public abstract int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam);

    public abstract void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2);

    public abstract void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams);

    public abstract void setRemoteAudioVolume(String str, int i4);

    public abstract void setRemoteRenderParams(String str, int i4, TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    public abstract int setRemoteVideoRenderListener(String str, int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract int setRemoteVideoStreamType(String str, int i4);

    public abstract void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoMuteImage(Bitmap bitmap, int i4);

    public abstract void setWatermark(Bitmap bitmap, int i4, float f4, float f5, float f6);

    public abstract void showDebugView(int i4);

    public abstract void snapshotVideo(String str, int i4, int i5, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    public abstract int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams);

    public abstract void startLocalAudio(int i4);

    public abstract void startLocalPreview(boolean z4, TXCloudVideoView tXCloudVideoView);

    public abstract void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams);

    public abstract void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    public abstract void startRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView);

    public abstract void startScreenCapture(int i4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    public abstract int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams);

    public abstract void startSystemAudioLoopback();

    public abstract void stopAllRemoteView();

    public abstract void stopAudioRecording();

    public abstract void stopLocalAudio();

    public abstract void stopLocalPreview();

    public abstract void stopLocalRecording();

    public abstract void stopPublishMediaStream(String str);

    public abstract void stopRemoteView(String str, int i4);

    public abstract void stopScreenCapture();

    public abstract void stopSpeedTest();

    public abstract void stopSystemAudioLoopback();

    public abstract void switchRole(int i4);

    public abstract void switchRole(int i4, String str);

    public abstract void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig);

    public abstract void updateLocalView(TXCloudVideoView tXCloudVideoView);

    public abstract void updateOtherRoomForwardMode(String str);

    public abstract void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    public abstract void updateRemote3DSpatialPosition(String str, int[] iArr);

    public abstract void updateRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView);

    public abstract void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);
}
