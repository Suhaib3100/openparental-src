package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.live.TXLivePusherJni;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: classes7.dex */
public class TXLivePusher implements b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final String TAG = ProtectedSandApp.s("寫\u0001");
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private b mImpl;

    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j4, int i4, int i5, int i6);

        void onRecordRawPcmData(byte[] bArr, long j4, int i4, int i5, int i6, boolean z4);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i4);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    @Deprecated
    public interface OnBGMNotify {
        void onBGMComplete(int i4);

        void onBGMProgress(long j4, long j5);

        void onBGMStart();
    }

    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i4, int i5, int i6);

        void onTextureDestoryed();
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TXLivePusher(Context context) {
        this.mImpl = new TXLivePusherJni(context);
        LiteavLog.i(ProtectedSandApp.s("寫\u0001"), ProtectedSandApp.s("寬\u0001") + this.mImpl.toString());
    }

    @Override // com.tencent.rtmp.b
    public synchronized void callExperimentalAPI(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.callExperimentalAPI(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void enableAudioVolumeEvaluation(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.enableAudioVolumeEvaluation(i4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXAudioEffectManager getAudioEffectManager() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getAudioEffectManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXBeautyManager getBeautyManager() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getBeautyManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXLivePushConfig getConfig() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return new TXLivePushConfig();
        }
        return bVar.getConfig();
    }

    @Override // com.tencent.rtmp.b
    public synchronized int getMaxZoom() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMaxZoom();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized int getMusicDuration(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMusicDuration(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean isPushing() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.isPushing();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void onLogRecord(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.onLogRecord(str);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean pauseBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.pauseBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void pausePusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.pausePusher();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean playBGM(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.playBGM(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void release() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.release();
        LiteavLog.i(ProtectedSandApp.s("寫\u0001"), ProtectedSandApp.s("寭\u0001") + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean resumeBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.resumeBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void resumePusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.resumePusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void sendCustomPCMData(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendCustomPCMData(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoData(byte[] bArr, int i4, int i5, int i6) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoData(bArr, i4, i5, i6);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoTexture(int i4, int i5, int i6) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoTexture(i4, i5, i6);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void sendMessage(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean sendMessageEx(byte[] bArr) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.sendMessageEx(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioProcessListener(audioCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMNofify(OnBGMNotify onBGMNotify) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMNofify(onBGMNotify);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMPitch(float f4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMPitch(f4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMPosition(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMPosition(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMVolume(float f4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMVolume(f4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setBeautyFilter(int i4, int i5, int i6, int i7) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBeautyFilter(i4, i5, i6, i7);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setChinLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setChinLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setConfig(TXLivePushConfig tXLivePushConfig) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setConfig(tXLivePushConfig);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setExposureCompensation(float f4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setExposureCompensation(f4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setEyeScaleLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setEyeScaleLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceShortLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceShortLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceSlimLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceSlimLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceVLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceVLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFilter(Bitmap bitmap) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFilter(bitmap);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setFocusPosition(float f4, float f5) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFocusPosition(f4, f5);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setGreenScreenFile(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setGreenScreenFile(str);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setMicVolume(float f4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMicVolume(f4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setMirror(boolean z4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMirror(z4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionMute(boolean z4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionMute(z4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionTmpl(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setMute(boolean z4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMute(z4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setNoseSlimLevel(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setNoseSlimLevel(i4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setPushListener(ITXLivePushListener iTXLivePushListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setPushListener(iTXLivePushListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setRenderRotation(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setRenderRotation(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setReverb(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setReverb(i4);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setSpecialRatio(float f4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSpecialRatio(f4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setSurface(Surface surface) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurface(surface);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setSurfaceSize(int i4, int i5) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurfaceSize(i4, i5);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoProcessListener(videoCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoQuality(int i4, boolean z4, boolean z5) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoQuality(i4, z4, z5);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoRecordListener(iTXVideoRecordListener);
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setVoiceChangerType(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVoiceChangerType(i4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setZoom(int i4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setZoom(i4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.snapshot(iTXSnapshotListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startCameraPreview(tXCloudVideoView);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startPusher(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.startPusher(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startRecord(String str) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return -3;
        }
        return bVar.startRecord(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startScreenCapture() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean stopBGM() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.stopBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopCameraPreview(boolean z4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopCameraPreview(z4);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopPusher() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopPusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopRecord() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopRecord();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopScreenCapture() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void switchCamera() {
        b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.switchCamera();
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean turnOnFlashLight(boolean z4) {
        b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.turnOnFlashLight(z4);
    }
}
