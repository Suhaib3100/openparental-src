package com.tencent.trtc;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.trtc.TRTCCloudDef;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class TRTCCloudListener {

    public interface TRTCAudioFrameListener {
        void onCapturedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onLocalProcessedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onMixedAllAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onMixedPlayAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onRemoteUserAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, String str);

        void onVoiceEarMonitorAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);
    }

    public static abstract class TRTCLogListener {
        public abstract void onLog(String str, int i4, String str2);
    }

    public interface TRTCSnapshotListener {
        void onSnapshotComplete(Bitmap bitmap);
    }

    public interface TRTCVideoFrameListener {
        void onGLContextCreated();

        void onGLContextDestory();

        int onProcessVideoFrame(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2);
    }

    public interface TRTCVideoRenderListener {
        void onRenderVideoFrame(String str, int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);
    }

    @Deprecated
    public void onAudioEffectFinished(int i4, int i5) {
    }

    public void onAudioRouteChanged(int i4, int i5) {
    }

    public void onCameraDidReady() {
    }

    public void onCdnStreamStateChanged(String str, int i4, int i5, String str2, Bundle bundle) {
    }

    public void onConnectOtherRoom(String str, int i4, String str2) {
    }

    public void onConnectionLost() {
    }

    public void onConnectionRecovery() {
    }

    public void onDisConnectOtherRoom(int i4, String str) {
    }

    public void onEnterRoom(long j4) {
    }

    public void onError(int i4, String str, Bundle bundle) {
    }

    public void onExitRoom(int i4) {
    }

    public void onExperimentalEvent(String str, String str2) {
    }

    public void onFirstAudioFrame(String str) {
    }

    public void onFirstVideoFrame(String str, int i4, int i5, int i6) {
    }

    public void onLocalRecordBegin(int i4, String str) {
    }

    public void onLocalRecordComplete(int i4, String str) {
    }

    public void onLocalRecordFragment(String str) {
    }

    public void onLocalRecording(long j4, String str) {
    }

    public void onMicDidReady() {
    }

    public void onMissCustomCmdMsg(String str, int i4, int i5, int i6) {
    }

    public void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
    }

    public void onRecvCustomCmdMsg(String str, int i4, int i5, byte[] bArr) {
    }

    public void onRecvSEIMsg(String str, byte[] bArr) {
    }

    public void onRemoteAudioStatusUpdated(String str, int i4, int i5, Bundle bundle) {
    }

    public void onRemoteUserEnterRoom(String str) {
    }

    public void onRemoteUserLeaveRoom(String str, int i4) {
    }

    public void onRemoteVideoStatusUpdated(String str, int i4, int i5, int i6, Bundle bundle) {
    }

    public void onScreenCapturePaused() {
    }

    public void onScreenCaptureResumed() {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i4) {
    }

    public void onSendFirstLocalAudioFrame() {
    }

    public void onSendFirstLocalVideoFrame(int i4) {
    }

    public void onSetMixTranscodingConfig(int i4, String str) {
    }

    @Deprecated
    public void onSpeedTest(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult, int i4, int i5) {
    }

    public void onSpeedTestResult(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult) {
    }

    public void onStartPublishCDNStream(int i4, String str) {
    }

    public void onStartPublishMediaStream(String str, int i4, String str2, Bundle bundle) {
    }

    public void onStartPublishing(int i4, String str) {
    }

    public void onStatistics(TRTCStatistics tRTCStatistics) {
    }

    public void onStopPublishCDNStream(int i4, String str) {
    }

    public void onStopPublishMediaStream(String str, int i4, String str2, Bundle bundle) {
    }

    public void onStopPublishing(int i4, String str) {
    }

    public void onSwitchRole(int i4, String str) {
    }

    public void onSwitchRoom(int i4, String str) {
    }

    public void onTryToReconnect() {
    }

    public void onUpdateOtherRoomForwardMode(int i4, String str) {
    }

    public void onUpdatePublishMediaStream(String str, int i4, String str2, Bundle bundle) {
    }

    public void onUserAudioAvailable(String str, boolean z4) {
    }

    @Deprecated
    public void onUserEnter(String str) {
    }

    @Deprecated
    public void onUserExit(String str, int i4) {
    }

    public void onUserSubStreamAvailable(String str, boolean z4) {
    }

    public void onUserVideoAvailable(String str, boolean z4) {
    }

    public void onUserVideoSizeChanged(String str, int i4, int i5, int i6) {
    }

    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i4) {
    }

    public void onWarning(int i4, String str, Bundle bundle) {
    }
}
