package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class TXLivePlayerJni implements com.tencent.rtmp.a, TXCloudVideoView.b {
    private static final String TAG = ProtectedSandApp.s("可\u0001");
    private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private Object mGLContext = null;
    private ITXLivePlayListener mListener;
    protected long mNativeTXLivePlayerJni;
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;

    public TXLivePlayerJni(Context context) {
        this.mNativeTXLivePlayerJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("叫\u0001"));
        this.mNativeTXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    private static String genFilePath(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String format = new SimpleDateFormat(ProtectedSandApp.s("召\u0001")).format(new Date(Long.valueOf(valueOf + ProtectedSandApp.s("叭\u0001")).longValue()));
            String diskFileDir = getDiskFileDir(context);
            if (TextUtils.isEmpty(diskFileDir)) {
                return null;
            }
            return new File(diskFileDir, String.format(ProtectedSandApp.s("叮\u0001").concat(String.valueOf(str)), format)).getAbsolutePath();
        } catch (Exception e4) {
            LiteavLog.e(ProtectedSandApp.s("可\u0001"), ProtectedSandApp.s("台\u0001"), e4);
            return null;
        }
    }

    private static String getDiskFileDir(Context context) {
        if (context == null) {
            return null;
        }
        if (!ProtectedSandApp.s("叱\u0001").equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        return externalFilesDir != null ? externalFilesDir.getPath() : null;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        String[] strArr = new String[map.size()];
        Iterator<String> it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            strArr[i4] = it.next();
            i4++;
        }
        return strArr;
    }

    public static String[] getMapValues(Map<String, String> map, String[] strArr) {
        String[] strArr2 = new String[map.size()];
        int length = strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            strArr2[i5] = map.get(strArr[i4]);
            i4++;
            i5++;
        }
        return strArr2;
    }

    private static native void nativeCallExperimentalAPI(long j4, String str);

    private static native long nativeCreate(WeakReference<TXLivePlayerJni> weakReference);

    private static native long nativeCreateByIdentifier(WeakReference<TXLivePlayerJni> weakReference, String str);

    private static native void nativeDestroy(long j4);

    private static native void nativeEnableAudioVolumeEvaluation(long j4, int i4);

    private static native void nativeEnableCustomAudioProcess(long j4, boolean z4);

    private static native void nativeEnableCustomRenderI420(long j4, boolean z4);

    private static native void nativeEnableCustomRenderTexture(long j4, boolean z4, Object obj);

    private static native void nativeEnableHardwareDecode(long j4, boolean z4);

    private static native long nativeGetCurrentRenderPts(long j4);

    private static native boolean nativeIsPlaying(long j4);

    private static native void nativePause(long j4);

    private static native void nativeResume(long j4);

    private static native void nativeSetAudioRoute(long j4, int i4);

    private static native void nativeSetConfig(long j4, float f4, float f5, float f6, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6, String str, Map map);

    private static native void nativeSetMute(long j4, boolean z4);

    private static native void nativeSetPlayerView(long j4, DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j4, int i4);

    private static native void nativeSetRenderRotation(long j4, int i4);

    private static native void nativeSetVolume(long j4, int i4);

    private static native void nativeShowDebugView(long j4, boolean z4);

    private static native void nativeSnapshot(long j4);

    private static native int nativeStartPlay(long j4, String str, int i4);

    private static native void nativeStartRecord(long j4, int i4, String str);

    private static native void nativeStopPlay(long j4, boolean z4);

    private static native void nativeStopRecord(long j4);

    private static native int nativeSwitchStream(long j4, String str);

    public static TXLivePlayerJni weakToStrongReference(WeakReference<TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    public boolean addVideoRawData(byte[] bArr) {
        return false;
    }

    @Override // com.tencent.rtmp.a
    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePlayerJni, str);
    }

    @Override // com.tencent.rtmp.a
    public void enableAudioVolumeEvaluation(int i4) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, i4);
    }

    @Override // com.tencent.rtmp.a
    public boolean enableHardwareDecode(boolean z4) {
        nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, z4);
        return true;
    }

    protected void finalize() {
        nativeDestroy(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public long getCurrentRenderPts() {
        return nativeGetCurrentRenderPts(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public boolean isPlaying() {
        return nativeIsPlaying(this.mNativeTXLivePlayerJni);
    }

    public void onAudioInfoChanged(int i4, int i5, int i6) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i4, i5, i6);
        }
    }

    public void onAudioVolumeEvaluationNotify(int i4) {
        TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i4);
        }
    }

    public void onNetStatus(Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPcmDataAvailable(byte[] bArr, long j4) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onPcmDataAvailable(bArr, j4);
        }
    }

    public void onPlayEvent(int i4, Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i4, bundle);
        }
    }

    public void onRecordComplete(int i4, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
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
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i4, bundle);
        }
    }

    public void onRecordProgress(long j4) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j4);
        }
    }

    public void onRenderVideoFrame(int i4, int i5, Object obj, int i6, int i7, int i10, int i11, long j4, byte[] bArr, ByteBuffer byteBuffer) {
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.mVideoRenderListener;
        if (iTXLivePlayVideoRenderListener != null) {
            TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture.textureId = i6;
            tXLiteAVTexture.width = i7;
            tXLiteAVTexture.height = i10;
            tXLiteAVTexture.eglContext = obj;
            iTXLivePlayVideoRenderListener.onRenderVideoFrame(tXLiteAVTexture);
        }
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.mVideoRawDataListener;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.onVideoRawDataAvailable(bArr, i7, i10, j4);
        }
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z4) {
        showDebugView(z4);
    }

    public void onSnapshot(Bitmap bitmap) {
        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    @Override // com.tencent.rtmp.a
    public void pause() {
        nativePause(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void resume() {
        nativeResume(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mAudioRawDataListener = iTXAudioRawDataListener;
        nativeEnableCustomAudioProcess(this.mNativeTXLivePlayerJni, iTXAudioRawDataListener != null);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioRoute(int i4) {
        nativeSetAudioRoute(this.mNativeTXLivePlayerJni, i4);
    }

    @Override // com.tencent.rtmp.a
    public void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.tencent.rtmp.a
    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        if (tXLivePlayConfig == null) {
            return;
        }
        nativeSetConfig(this.mNativeTXLivePlayerJni, tXLivePlayConfig.getCacheTime(), tXLivePlayConfig.getMaxAutoAdjustCacheTime(), tXLivePlayConfig.getMinAutoAdjustCacheTime(), tXLivePlayConfig.getVideoBlockThreshold(), tXLivePlayConfig.getConnectRetryCount(), tXLivePlayConfig.getConnectRetryInterval(), tXLivePlayConfig.isAutoAdjustCacheTime(), tXLivePlayConfig.isEnableMessage(), tXLivePlayConfig.isEnableMetaData(), tXLivePlayConfig.getFlvSessionKey(), tXLivePlayConfig.getHeaders());
    }

    @Override // com.tencent.rtmp.a
    public void setMute(boolean z4) {
        nativeSetMute(this.mNativeTXLivePlayerJni, z4);
    }

    @Override // com.tencent.rtmp.a
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    @Override // com.tencent.rtmp.a
    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            a.a(tXCloudVideoView, new WeakReference(this));
            showDebugView(a.a(tXCloudVideoView));
        }
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderMode(int i4) {
        nativeSetRenderMode(this.mNativeTXLivePlayerJni, i4);
    }

    @Override // com.tencent.rtmp.a
    public void setRenderRotation(int i4) {
        nativeSetRenderRotation(this.mNativeTXLivePlayerJni, i4);
    }

    @Override // com.tencent.rtmp.a
    public void setSurface(Surface surface) {
        nativeSetPlayerView(this.mNativeTXLivePlayerJni, surface != null ? new DisplayTarget(surface) : null);
    }

    @Override // com.tencent.rtmp.a
    public void setSurfaceSize(int i4, int i5) {
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            try {
                if (this.mVideoRenderListener != null) {
                    this.mVideoRenderListener = null;
                    this.mGLContext = null;
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, null);
                }
                this.mVideoRawDataListener = iTXVideoRawDataListener;
                nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, iTXVideoRawDataListener != null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.rtmp.a
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    @Override // com.tencent.rtmp.a
    public int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        synchronized (this) {
            try {
                if (this.mVideoRawDataListener != null) {
                    this.mVideoRawDataListener = null;
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
                }
                this.mVideoRenderListener = iTXLivePlayVideoRenderListener;
                if (iTXLivePlayVideoRenderListener == null) {
                    obj = null;
                }
                this.mGLContext = obj;
                nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, iTXLivePlayVideoRenderListener != null, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public void setVolume(int i4) {
        nativeSetVolume(this.mNativeTXLivePlayerJni, i4);
    }

    @Override // com.tencent.rtmp.a
    public void showDebugView(boolean z4) {
        nativeShowDebugView(this.mNativeTXLivePlayerJni, z4);
    }

    @Override // com.tencent.rtmp.a
    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePlayerJni);
    }

    @Override // com.tencent.rtmp.a
    public int startLivePlay(String str, int i4) {
        return nativeStartPlay(this.mNativeTXLivePlayerJni, str, i4);
    }

    @Override // com.tencent.rtmp.a
    public int startRecord(int i4) {
        String genFilePath = genFilePath(ContextUtils.getApplicationContext(), ProtectedSandApp.s("史\u0001"));
        if (TextUtils.isEmpty(genFilePath)) {
            return -1;
        }
        nativeStartRecord(this.mNativeTXLivePlayerJni, i4, genFilePath);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopPlay(boolean z4) {
        nativeStopPlay(this.mNativeTXLivePlayerJni, z4);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int stopRecord() {
        nativeStopRecord(this.mNativeTXLivePlayerJni);
        return 0;
    }

    @Override // com.tencent.rtmp.a
    public int switchStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return nativeSwitchStream(this.mNativeTXLivePlayerJni, str);
        }
        LiteavLog.e(ProtectedSandApp.s("可\u0001"), ProtectedSandApp.s("右\u0001"));
        return -1;
    }

    public TXLivePlayerJni(Context context, String str) {
        this.mNativeTXLivePlayerJni = 0L;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix(ProtectedSandApp.s("叫\u0001"));
        this.mNativeTXLivePlayerJni = nativeCreateByIdentifier(new WeakReference(this), str);
    }
}
