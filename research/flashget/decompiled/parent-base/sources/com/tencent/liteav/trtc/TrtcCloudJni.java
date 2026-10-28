package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.base.util.f;
import com.tencent.liteav.base.util.k;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

@JNINamespace("liteav::trtc")
/* loaded from: classes7.dex */
public class TrtcCloudJni {
    private static boolean mHasInited;
    private TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private final HashSet<View> mFloatingWindowSet;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private TRTCCloudListener mListener;
    private Handler mListenerHandler;
    private List<TRTCCloudListener> mListenerList;
    private String mLocalUserId;
    private final a<TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final ReentrantReadWriteLock mReadWriteLock;
    private final Map<String, a<TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private final a<TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;
    private static final String TAG = ProtectedSandApp.s("呾\u0001");
    private static final Object INIT_LOCK = new Object();

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72082a;

        static {
            int[] iArr = new int[k.values().length];
            f72082a = iArr;
            try {
                iArr[k.f71940b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72082a[k.f71941c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72082a[k.f71942d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioFrame f72083a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f72083a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f72083a.channel;
        }

        public byte[] getData() {
            return this.f72083a.data;
        }

        public int getSampleRate() {
            return this.f72083a.sampleRate;
        }

        public long getTimestamp() {
            return this.f72083a.timestamp;
        }
    }

    static class AudioParallelParams {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioParallelParams f72084a;

        public AudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f72084a = tRTCAudioParallelParams;
        }

        public String[] getIncludeUsers() {
            ArrayList<String> arrayList = this.f72084a.includeUsers;
            return arrayList != null ? (String[]) arrayList.toArray(new String[arrayList.size()]) : new String[0];
        }

        public int getMaxCount() {
            return this.f72084a.maxCount;
        }
    }

    static class AudioRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCAudioRecordingParams f72085a;

        public AudioRecordingParams(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f72085a = tRTCAudioRecordingParams;
        }

        public int getContent() {
            return this.f72085a.recordingContent;
        }

        public String getFilePath() {
            return this.f72085a.filePath;
        }

        public int getMaxDurationPerFile() {
            return this.f72085a.maxDurationPerFile;
        }
    }

    static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCParams f72086a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f72086a = tRTCParams;
        }

        public String getBusinessInfo() {
            return this.f72086a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f72086a.privateMapKey;
        }

        public String getRecordId() {
            return this.f72086a.userDefineRecordId;
        }

        public int getRole() {
            return this.f72086a.role;
        }

        public int getRoomId() {
            return this.f72086a.roomId;
        }

        public int getSdkAppId() {
            return this.f72086a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f72086a.strRoomId;
        }

        public String getStreamId() {
            return this.f72086a.streamId;
        }

        public String getUserId() {
            return this.f72086a.userId;
        }

        public String getUserSig() {
            return this.f72086a.userSig;
        }
    }

    static class LocalRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCLocalRecordingParams f72087a;

        public LocalRecordingParams(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f72087a = tRTCLocalRecordingParams;
        }

        public String getFilePath() {
            return this.f72087a.filePath;
        }

        public int getInterval() {
            return this.f72087a.interval;
        }

        public int getMaxDurationPerFile() {
            return this.f72087a.maxDurationPerFile;
        }

        public int getRecordType() {
            return this.f72087a.recordType;
        }
    }

    static class LocalStatistics {

        /* renamed from: a, reason: collision with root package name */
        private TRTCStatistics.TRTCLocalStatistics f72088a = new TRTCStatistics.TRTCLocalStatistics();

        LocalStatistics() {
        }

        public static void addLocalStatistics(LocalStatistics localStatistics, ArrayList<LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }

        public static LocalStatistics createLocalStatistics(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
            LocalStatistics localStatistics = new LocalStatistics();
            TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f72088a;
            tRTCLocalStatistics.streamType = i4;
            tRTCLocalStatistics.width = i5;
            tRTCLocalStatistics.height = i6;
            tRTCLocalStatistics.frameRate = i7;
            tRTCLocalStatistics.videoBitrate = i10;
            tRTCLocalStatistics.audioBitrate = i12;
            tRTCLocalStatistics.audioSampleRate = i11;
            tRTCLocalStatistics.audioCaptureState = i13;
            return localStatistics;
        }

        public static ArrayList<LocalStatistics> createLocalStatisticsArray() {
            return new ArrayList<>();
        }
    }

    static class MixUser {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCMixUser f72089a;

        /* synthetic */ MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b5) {
            this(tRTCMixUser);
        }

        public int getHeight() {
            return this.f72089a.height;
        }

        public String getImage() {
            return TextUtils.isEmpty(this.f72089a.image) ? "" : this.f72089a.image;
        }

        public int getInputType() {
            return this.f72089a.inputType;
        }

        public boolean getPureAudio() {
            return this.f72089a.pureAudio;
        }

        public int getRenderMode() {
            return this.f72089a.renderMode;
        }

        public String getRoomId() {
            return TextUtils.isEmpty(this.f72089a.roomId) ? "" : this.f72089a.roomId;
        }

        public int getSoundLevel() {
            return this.f72089a.soundLevel;
        }

        public int getStreamType() {
            return this.f72089a.streamType;
        }

        public String getUserId() {
            return TextUtils.isEmpty(this.f72089a.userId) ? "" : this.f72089a.userId;
        }

        public int getWidth() {
            return this.f72089a.width;
        }

        public int getX() {
            return this.f72089a.f72769x;
        }

        public int getY() {
            return this.f72089a.f72770y;
        }

        public int getZOrder() {
            return this.f72089a.zOrder;
        }

        private MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
            this.f72089a = tRTCMixUser;
        }
    }

    static class PayloadPrivateEncryptionConfig {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig f72090a;

        public PayloadPrivateEncryptionConfig(TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
            this.f72090a = tRTCPayloadPrivateEncryptionConfig;
        }

        public int getEncryptionAlgorithm() {
            return this.f72090a.encryptionAlgorithm;
        }

        public String getEncryptionKey() {
            String str = this.f72090a.encryptionKey;
            return str != null ? str : "";
        }

        public byte[] getEncryptionSalt() {
            return this.f72090a.encryptionSalt;
        }
    }

    public static class PublishCDNParams {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishCDNParam f72091a;

        public PublishCDNParams(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f72091a = tRTCPublishCDNParam;
        }

        public int getAppId() {
            return this.f72091a.appId;
        }

        public int getBizId() {
            return this.f72091a.bizId;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f72091a.streamId) ? "" : this.f72091a.streamId;
        }

        public String getUrl() {
            return TextUtils.isEmpty(this.f72091a.url) ? "" : this.f72091a.url;
        }
    }

    static class PublishCdnUrl {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishCdnUrl f72092a;

        public PublishCdnUrl(TRTCCloudDef.TRTCPublishCdnUrl tRTCPublishCdnUrl) {
            this.f72092a = tRTCPublishCdnUrl;
        }

        public boolean getIsInternalLine() {
            return this.f72092a.isInternalLine;
        }

        public String getRtmpUrl() {
            String str = this.f72092a.rtmpUrl;
            return str != null ? str : "";
        }
    }

    static class PublishTarget {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishTarget f72093a;

        public PublishTarget(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget) {
            this.f72093a = tRTCPublishTarget;
        }

        public int getMode() {
            return this.f72093a.mode;
        }

        public PublishCdnUrl[] getPublishCdnUrls() {
            ArrayList<TRTCCloudDef.TRTCPublishCdnUrl> arrayList = this.f72093a.cdnUrlList;
            if (arrayList == null) {
                return null;
            }
            PublishCdnUrl[] publishCdnUrlArr = new PublishCdnUrl[arrayList.size()];
            for (int i4 = 0; i4 < this.f72093a.cdnUrlList.size(); i4++) {
                publishCdnUrlArr[i4] = new PublishCdnUrl(this.f72093a.cdnUrlList.get(i4));
            }
            return publishCdnUrlArr;
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f72093a.mixStreamIdentity);
        }
    }

    static class RemoteStatistics {

        /* renamed from: a, reason: collision with root package name */
        public TRTCStatistics.TRTCRemoteStatistics f72094a = new TRTCStatistics.TRTCRemoteStatistics();

        RemoteStatistics() {
        }

        public static void addRemoteStatistics(RemoteStatistics remoteStatistics, ArrayList<RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }

        public static RemoteStatistics createRemoteStatistics(String str, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23) {
            RemoteStatistics remoteStatistics = new RemoteStatistics();
            TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f72094a;
            tRTCRemoteStatistics.userId = str;
            tRTCRemoteStatistics.streamType = i4;
            tRTCRemoteStatistics.width = i5;
            tRTCRemoteStatistics.height = i6;
            tRTCRemoteStatistics.frameRate = i7;
            tRTCRemoteStatistics.audioPacketLoss = i16;
            tRTCRemoteStatistics.videoPacketLoss = i10;
            tRTCRemoteStatistics.videoBlockRate = i13;
            tRTCRemoteStatistics.videoTotalBlockTime = i12;
            tRTCRemoteStatistics.videoBitrate = i11;
            tRTCRemoteStatistics.audioBitrate = i15;
            tRTCRemoteStatistics.audioSampleRate = i14;
            tRTCRemoteStatistics.audioTotalBlockTime = i17;
            tRTCRemoteStatistics.audioBlockRate = i18;
            tRTCRemoteStatistics.jitterBufferDelay = i19;
            tRTCRemoteStatistics.point2PointDelay = i20;
            tRTCRemoteStatistics.finalLoss = i21;
            tRTCRemoteStatistics.remoteNetworkUplinkLoss = i22;
            tRTCRemoteStatistics.remoteNetworkRTT = i23;
            return remoteStatistics;
        }

        public static ArrayList<RemoteStatistics> createRemoteStatisticsArray() {
            return new ArrayList<>();
        }
    }

    static class ScreenShareParams {

        /* renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCScreenShareParams f72095a;

        public ScreenShareParams(TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f72095a = tRTCScreenShareParams;
        }

        public Object getMediaProjection() {
            return this.f72095a.mediaProjection;
        }
    }

    static class SpeedTestResult {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCSpeedTestResult f72098a = new TRTCCloudDef.TRTCSpeedTestResult();

        SpeedTestResult() {
        }

        public static SpeedTestResult createSpeedTestResult(boolean z4, String str, String str2, int i4, float f4, float f5, int i5, int i6, int i7, int i10, int i11) {
            SpeedTestResult speedTestResult = new SpeedTestResult();
            TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f72098a;
            tRTCSpeedTestResult.success = z4;
            tRTCSpeedTestResult.errMsg = str;
            tRTCSpeedTestResult.ip = str2;
            tRTCSpeedTestResult.quality = i4;
            tRTCSpeedTestResult.upLostRate = f4;
            tRTCSpeedTestResult.downLostRate = f5;
            tRTCSpeedTestResult.rtt = i5;
            tRTCSpeedTestResult.availableUpBandwidth = i6;
            tRTCSpeedTestResult.availableDownBandwidth = i7;
            tRTCSpeedTestResult.upJitter = i10;
            tRTCSpeedTestResult.downJitter = i11;
            return speedTestResult;
        }
    }

    static class Statistics {

        /* renamed from: a, reason: collision with root package name */
        private TRTCStatistics f72099a = new TRTCStatistics();

        Statistics() {
        }

        public static Statistics createStatistics(int i4, int i5, int i6, int i7, int i10, int i11, long j4, long j5, ArrayList<LocalStatistics> arrayList, ArrayList<RemoteStatistics> arrayList2) {
            Statistics statistics = new Statistics();
            TRTCStatistics tRTCStatistics = statistics.f72099a;
            tRTCStatistics.appCpu = i4;
            tRTCStatistics.systemCpu = i5;
            tRTCStatistics.upLoss = i6;
            tRTCStatistics.downLoss = i7;
            tRTCStatistics.rtt = i10;
            tRTCStatistics.gatewayRtt = i11;
            tRTCStatistics.sendBytes = j4;
            tRTCStatistics.receiveBytes = j5;
            tRTCStatistics.localArray = new ArrayList<>();
            statistics.f72099a.remoteArray = new ArrayList<>();
            if (arrayList != null) {
                Iterator<LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f72099a.localArray.add(it.next().f72088a);
                }
            }
            if (arrayList2 != null) {
                Iterator<RemoteStatistics> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    statistics.f72099a.remoteArray.add(it2.next().f72094a);
                }
            }
            return statistics;
        }
    }

    static class StreamEncoderParam {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCStreamEncoderParam f72100a;

        public StreamEncoderParam(TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam) {
            this.f72100a = tRTCStreamEncoderParam;
        }

        public int getAudioEncodedChannelNum() {
            return this.f72100a.audioEncodedChannelNum;
        }

        public int getAudioEncodedCodecType() {
            return this.f72100a.audioEncodedCodecType;
        }

        public int getAudioEncodedKbps() {
            return this.f72100a.audioEncodedKbps;
        }

        public int getAudioEncodedSampleRate() {
            return this.f72100a.audioEncodedSampleRate;
        }

        public int getVideoEncodedCodecType() {
            return this.f72100a.videoEncodedCodecType;
        }

        public int getVideoEncodedFPS() {
            return this.f72100a.videoEncodedFPS;
        }

        public int getVideoEncodedGOP() {
            return this.f72100a.videoEncodedGOP;
        }

        public int getVideoEncodedHeight() {
            return this.f72100a.videoEncodedHeight;
        }

        public int getVideoEncodedKbps() {
            return this.f72100a.videoEncodedKbps;
        }

        public int getVideoEncodedWidth() {
            return this.f72100a.videoEncodedWidth;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f72100a.videoSeiParams) ? "" : this.f72100a.videoSeiParams;
        }
    }

    static class StreamMixingConfig {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCStreamMixingConfig f72101a;

        public StreamMixingConfig(TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
            this.f72101a = tRTCStreamMixingConfig;
        }

        public TRTCUser[] getAudioMixUserList() {
            ArrayList<TRTCCloudDef.TRTCUser> arrayList = this.f72101a.audioMixUserList;
            if (arrayList == null) {
                return null;
            }
            TRTCUser[] tRTCUserArr = new TRTCUser[arrayList.size()];
            for (int i4 = 0; i4 < this.f72101a.audioMixUserList.size(); i4++) {
                tRTCUserArr[i4] = new TRTCUser(this.f72101a.audioMixUserList.get(i4));
            }
            return tRTCUserArr;
        }

        public int getBackgroundColor() {
            return this.f72101a.backgroundColor;
        }

        public String getBackgroundImage() {
            String str = this.f72101a.backgroundImage;
            return str != null ? str : "";
        }

        public VideoLayout[] getVideoLayoutList() {
            ArrayList<TRTCCloudDef.TRTCVideoLayout> arrayList = this.f72101a.videoLayoutList;
            if (arrayList == null) {
                return null;
            }
            VideoLayout[] videoLayoutArr = new VideoLayout[arrayList.size()];
            for (int i4 = 0; i4 < this.f72101a.videoLayoutList.size(); i4++) {
                videoLayoutArr[i4] = new VideoLayout(this.f72101a.videoLayoutList.get(i4));
            }
            return videoLayoutArr;
        }

        public Watermark[] getWatermarkList() {
            ArrayList<TRTCCloudDef.TRTCWatermark> arrayList = this.f72101a.watermarkList;
            if (arrayList == null) {
                return null;
            }
            Watermark[] watermarkArr = new Watermark[arrayList.size()];
            for (int i4 = 0; i4 < this.f72101a.watermarkList.size(); i4++) {
                watermarkArr[i4] = new Watermark(this.f72101a.watermarkList.get(i4));
            }
            return watermarkArr;
        }
    }

    static class SwitchRoomConfig {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCSwitchRoomConfig f72102a;

        public SwitchRoomConfig(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f72102a = tRTCSwitchRoomConfig;
        }

        public String getPrivateMapKey() {
            String str = this.f72102a.privateMapKey;
            return str != null ? str : "";
        }

        public int getRoomId() {
            return this.f72102a.roomId;
        }

        public String getStringRoomId() {
            String str = this.f72102a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserSig() {
            String str = this.f72102a.userSig;
            return str != null ? str : "";
        }
    }

    static class TRTCUser {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCUser f72103a;

        public TRTCUser(TRTCCloudDef.TRTCUser tRTCUser) {
            this.f72103a = tRTCUser;
        }

        public int getIntRoomId() {
            return this.f72103a.intRoomId;
        }

        public String getStrRoomId() {
            String str = this.f72103a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserId() {
            String str = this.f72103a.userId;
            return str != null ? str : "";
        }
    }

    static class TranscodingConfig {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCTranscodingConfig f72104a;

        public TranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f72104a = tRTCTranscodingConfig;
        }

        public int getAppId() {
            return this.f72104a.appId;
        }

        public int getAudioBitrate() {
            return this.f72104a.audioBitrate;
        }

        public int getAudioChannels() {
            return this.f72104a.audioChannels;
        }

        public int getAudioSampleRate() {
            return this.f72104a.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.f72104a.backgroundColor;
        }

        public String getBackgroundImage() {
            return TextUtils.isEmpty(this.f72104a.backgroundImage) ? "" : this.f72104a.backgroundImage;
        }

        public int getBizId() {
            return this.f72104a.bizId;
        }

        public MixUser[] getMixUsers() {
            ArrayList<TRTCCloudDef.TRTCMixUser> arrayList = this.f72104a.mixUsers;
            if (arrayList == null) {
                return null;
            }
            MixUser[] mixUserArr = new MixUser[arrayList.size()];
            byte b5 = 0;
            for (int i4 = 0; i4 < this.f72104a.mixUsers.size(); i4++) {
                mixUserArr[i4] = new MixUser(this.f72104a.mixUsers.get(i4), b5);
            }
            return mixUserArr;
        }

        public int getMode() {
            return this.f72104a.mode;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f72104a.streamId) ? "" : this.f72104a.streamId;
        }

        public int getVideoBitrate() {
            return this.f72104a.videoBitrate;
        }

        public int getVideoFramerate() {
            return this.f72104a.videoFramerate;
        }

        public int getVideoGOP() {
            return this.f72104a.videoGOP;
        }

        public int getVideoHeight() {
            return this.f72104a.videoHeight;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f72104a.videoSeiParams) ? "" : this.f72104a.videoSeiParams;
        }

        public int getVideoWidth() {
            return this.f72104a.videoWidth;
        }
    }

    static class VideoEncParams {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCVideoEncParam f72105a;

        public VideoEncParams(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f72105a = tRTCVideoEncParam;
        }

        public int getMinVideoBitrate() {
            return this.f72105a.minVideoBitrate;
        }

        public int getVideoBitrate() {
            return this.f72105a.videoBitrate;
        }

        public int getVideoFps() {
            return this.f72105a.videoFps;
        }

        public int getVideoResolution() {
            return this.f72105a.videoResolution;
        }

        public int getVideoResolutionMode() {
            return this.f72105a.videoResolutionMode;
        }

        public boolean isEnableAdjustRes() {
            return this.f72105a.enableAdjustRes;
        }
    }

    static class VideoLayout {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCVideoLayout f72106a;

        public VideoLayout(TRTCCloudDef.TRTCVideoLayout tRTCVideoLayout) {
            this.f72106a = tRTCVideoLayout;
        }

        public int getBackgroundColor() {
            return this.f72106a.backgroundColor;
        }

        public int getFillMode() {
            return this.f72106a.fillMode;
        }

        public int getHeight() {
            return this.f72106a.height;
        }

        public String getPlaceHolderImage() {
            String str = this.f72106a.placeHolderImage;
            return str != null ? str : "";
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f72106a.fixedVideoUser);
        }

        public int getVideoStreamType() {
            return this.f72106a.fixedVideoStreamType;
        }

        public int getWidth() {
            return this.f72106a.width;
        }

        public int getX() {
            return this.f72106a.f72771x;
        }

        public int getY() {
            return this.f72106a.f72772y;
        }

        public int getZOrder() {
            return this.f72106a.zOrder;
        }
    }

    static class Watermark {

        /* renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCWatermark f72107a;

        public Watermark(TRTCCloudDef.TRTCWatermark tRTCWatermark) {
            this.f72107a = tRTCWatermark;
        }

        public int getHeight() {
            return this.f72107a.height;
        }

        public String getWatermarkUrl() {
            String str = this.f72107a.watermarkUrl;
            return str != null ? str : "";
        }

        public int getWidth() {
            return this.f72107a.width;
        }

        public int getX() {
            return this.f72107a.f72773x;
        }

        public int getY() {
            return this.f72107a.f72774y;
        }

        public int getZOrder() {
            return this.f72107a.zOrder;
        }
    }

    static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f72108a;

        /* renamed from: b, reason: collision with root package name */
        public int f72109b;

        /* renamed from: c, reason: collision with root package name */
        public int f72110c;

        /* renamed from: d, reason: collision with root package name */
        public T f72111d;

        private a() {
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TrtcCloudJni(boolean z4) {
        this(0L, z4);
    }

    private List<TRTCCloudListener> CopyOnReadListeners() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.mListenerList);
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null && !copyOnWriteArrayList.contains(tRTCCloudListener)) {
            copyOnWriteArrayList.add(tRTCCloudListener);
        }
        return copyOnWriteArrayList;
    }

    private static int convertPixelFrameRotationToTRTCVideoRotation(k kVar) {
        int i4 = AnonymousClass1.f72082a[kVar.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    return 0;
                }
            }
        }
        return i5;
    }

    private static k covertTRTCVideoRotationToPixelFrameRotation(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? k.f71939a : k.f71942d : k.f71941c : k.f71940b;
    }

    public static Bundle createExtraInfoBundle(String str, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i4);
        return bundle;
    }

    private Bundle extraToBundle(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    String[] strArr = new String[jSONArray.length()];
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr[i4] = jSONArray.getString(i4);
                    }
                    bundle.putStringArray(next, strArr);
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return bundle;
    }

    public static long getGLContextNativeHandle(Object obj) {
        return TRTCDefConverter.getGLContextNativeHandle(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        WindowManager windowManager;
        if (this.mFloatingWindowSet.isEmpty()) {
            return;
        }
        Iterator<View> it = this.mFloatingWindowSet.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next != null && (windowManager = (WindowManager) next.getContext().getSystemService(ProtectedSandApp.s("呿\u0001"))) != null) {
                windowManager.removeViewImmediate(next);
            }
        }
        this.mFloatingWindowSet.clear();
    }

    public static void init(int i4) {
        synchronized (INIT_LOCK) {
            try {
                if (!mHasInited) {
                    mHasInited = true;
                    nativeGlobalInit(i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean isCustomPreprocessSupportedBufferType(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3;
    }

    private static boolean isCustomPreprocessSupportedFormatType(int i4) {
        return i4 == 1 || i4 == 4 || i4 == 5 || i4 == 2;
    }

    private static boolean isCustomRenderSupportedBufferType(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3;
    }

    private static boolean isCustomRenderSupportedFormatType(int i4) {
        return i4 == 1 || i4 == 4 || i4 == 5 || i4 == 2;
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    static /* synthetic */ void lambda$enterRoom$0(TrtcCloudJni trtcCloudJni) {
        trtcCloudJni.onEnterRoom(-3316);
        trtcCloudJni.onError(-3316, ProtectedSandApp.s("咀\u0001"));
    }

    static /* synthetic */ void lambda$onSnapshotComplete$2(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.onSnapshotComplete(bitmap);
        }
    }

    private static native String nativeCallExperimentalAPI(long j4, String str);

    private static native void nativeConnectOtherRoom(long j4, String str);

    private static native long nativeCreateAITranscriberManager(long j4);

    private static native long nativeCreateAudioEffectManager(long j4);

    private static native long nativeCreateBeautyManager(long j4);

    private static native long nativeCreateDeviceManager(long j4);

    private static native long nativeCreatePipeline(TrtcCloudJni trtcCloudJni, boolean z4);

    private static native long nativeCreateSubCloud(TrtcCloudJni trtcCloudJni, long j4);

    private static native void nativeDestroyPipeline(long j4);

    private static native void nativeDisconnectOtherRoom(long j4);

    private static native void nativeEnable3DSpatialAudioEffect(long j4, boolean z4);

    private static native void nativeEnableAudioFrameNotification(long j4, boolean z4);

    private static native void nativeEnableAudioVolumeEvaluation(long j4, boolean z4, int i4, boolean z5, boolean z6, boolean z7);

    private static native void nativeEnableCustomAudioCapture(long j4, boolean z4);

    private static native void nativeEnableCustomAudioRendering(long j4, boolean z4);

    private static native void nativeEnableCustomVideoCapture(long j4, int i4, boolean z4);

    private static native void nativeEnableEncSmallVideoStream(long j4, boolean z4, VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j4, boolean z4, boolean z5);

    private static native int nativeEnablePayloadPrivateEncryption(long j4, boolean z4, PayloadPrivateEncryptionConfig payloadPrivateEncryptionConfig);

    private static native void nativeEnableVideoCustomPreprocess(long j4, boolean z4, int i4, int i5);

    private static native void nativeEnableVideoCustomRender(long j4, boolean z4, String str, int i4, int i5, int i6);

    private static native void nativeEnterRoom(long j4, EnterRoomParams enterRoomParams, int i4);

    private static native void nativeExitRoom(long j4);

    private static native int nativeGetAudioCaptureVolume(long j4);

    private static native int nativeGetAudioPlayoutVolume(long j4);

    private static native void nativeGetCustomAudioRenderingFrame(long j4, byte[] bArr, int i4, int i5);

    private static native void nativeGlobalInit(int i4);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j4, AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j4, boolean z4);

    private static native void nativeMuteAllRemoteVideoStreams(long j4, boolean z4);

    private static native void nativeMuteLocalAudio(long j4, boolean z4);

    private static native void nativeMuteLocalVideo(long j4, int i4, boolean z4);

    private static native void nativeMuteRemoteAudio(long j4, String str, boolean z4);

    private static native void nativeMuteRemoteVideoStream(long j4, String str, int i4, boolean z4);

    private static native void nativePauseScreenCapture(long j4, int i4);

    private static native void nativeResumeScreenCapture(long j4, int i4);

    private static native void nativeSendCustomAudioData(long j4, AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j4, int i4, byte[] bArr, boolean z4, boolean z5);

    private static native void nativeSendCustomVideoData(long j4, int i4, int i5, int i6, Object obj, int i7, int i10, int i11, int i12, long j5, byte[] bArr, ByteBuffer byteBuffer);

    private static native boolean nativeSendSEIMsg(long j4, byte[] bArr, int i4);

    private static native void nativeSet3DSpatialReceivingRange(long j4, String str, int i4);

    private static native void nativeSetAudioCaptureVolume(long j4, int i4);

    private static native void nativeSetAudioPlayoutVolume(long j4, int i4);

    private static native void nativeSetAudioQuality(long j4, int i4);

    private static native int nativeSetCapturedAudioFrameCallbackFormat(long j4, int i4, int i5, int i6, int i7);

    private static native void nativeSetConsoleEnabled(boolean z4);

    private static native void nativeSetDefaultStreamRecvMode(long j4, boolean z4, boolean z5);

    private static native void nativeSetGSensorMode(long j4, int i4, int i5);

    private static native void nativeSetGravitySensorAdaptiveMode(long j4, int i4);

    private static native void nativeSetListenerHandler(long j4, Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j4, int i4, int i5, int i6, int i7);

    private static native void nativeSetLocalViewFillMode(long j4, int i4);

    private static native void nativeSetLocalViewMirror(long j4, int i4);

    private static native void nativeSetLocalViewRotation(long j4, int i4);

    private static native void nativeSetLogCompressEnabled(boolean z4);

    private static native void nativeSetLogLevel(int i4);

    private static native void nativeSetLogPath(String str);

    private static native void nativeSetMixExternalAudioVolume(long j4, int i4, int i5);

    private static native void nativeSetMixTranscodingConfig(long j4, TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j4, int i4, int i5, int i6, int i7);

    private static native void nativeSetNetworkQosParam(long j4, int i4, int i5);

    private static native void nativeSetPerspectiveCorrectionPoints(long j4, String str, float[] fArr, float[] fArr2);

    private static native void nativeSetPriorRemoteVideoStreamType(long j4, int i4);

    private static native void nativeSetRemoteAudioParallelParams(long j4, AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j4, String str, int i4);

    private static native void nativeSetRemoteVideoStreamType(long j4, String str, int i4);

    private static native void nativeSetRemoteViewFillMode(long j4, String str, int i4, int i5);

    private static native void nativeSetRemoteViewMirror(long j4, String str, int i4, int i5);

    private static native void nativeSetRemoteViewRotation(long j4, String str, int i4, int i5);

    private static native void nativeSetVideoEncoderMirror(long j4, boolean z4);

    private static native void nativeSetVideoEncoderParams(long j4, int i4, VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j4, int i4);

    private static native void nativeSetVideoMuteImage(long j4, Bitmap bitmap, int i4);

    private static native void nativeSetWatermark(long j4, Bitmap bitmap, int i4, float f4, float f5, float f6);

    private static native void nativeShowDashboardManager(long j4, int i4);

    private static native void nativeSnapshotVideo(long j4, String str, int i4, int i5, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    private static native int nativeStartAudioRecording(long j4, AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j4);

    private static native void nativeStartLocalAudioWithQuality(long j4, int i4);

    private static native void nativeStartLocalPreview(long j4, boolean z4, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartLocalRecording(long j4, LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j4, PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishMediaStream(long j4, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeStartPublishing(long j4, String str, int i4);

    private static native void nativeStartRemoteView(long j4, String str, int i4, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartRemoteViewWithoutStreamType(long j4, String str, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartScreenCapture(long j4, int i4, VideoEncParams videoEncParams, ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j4, SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j4);

    private static native void nativeStopAllRemoteView(long j4);

    private static native void nativeStopAudioRecording(long j4);

    private static native void nativeStopLocalAudio(long j4);

    private static native void nativeStopLocalPreview(long j4);

    private static native void nativeStopLocalRecording(long j4);

    private static native void nativeStopPublishCDNStream(long j4);

    private static native void nativeStopPublishMediaStream(long j4, String str);

    private static native void nativeStopPublishing(long j4);

    private static native void nativeStopRemoteView(long j4, String str, int i4);

    private static native void nativeStopRemoteViewWithoutStreamType(long j4, String str);

    private static native void nativeStopScreenCapture(long j4, int i4);

    private static native void nativeStopSpeedTest(long j4);

    private static native void nativeStopSystemAudioLoopback(long j4);

    private static native void nativeSwitchRole(long j4, int i4);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j4, int i4, String str);

    private static native void nativeSwitchRoom(long j4, SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j4, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateOtherRoomForwardMode(long j4, String str);

    private static native void nativeUpdatePublishMediaStream(long j4, String str, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeUpdateRemote3DSpatialPosition(long j4, String str, int[] iArr);

    private static native void nativeUpdateRemoteView(long j4, String str, int i4, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateSelf3DSpatialPosition(long j4, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);

    private void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void setConsoleEnabled(boolean z4) {
        nativeSetConsoleEnabled(z4);
    }

    public static void setLogCompressEnabled(boolean z4) {
        nativeSetLogCompressEnabled(z4);
    }

    public static void setLogDirPath(String str) {
        nativeSetLogPath(str);
    }

    public static void setLogLevel(int i4) {
        nativeSetLogLevel(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        if (view == null) {
            return;
        }
        int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
        String s4 = ProtectedSandApp.s("呾\u0001");
        if (systemOSVersionInt >= 23 && !Settings.canDrawOverlays(view.getContext())) {
            LiteavLog.e(s4, ProtectedSandApp.s("咁\u0001"));
            return;
        }
        if (this.mFloatingWindowSet.contains(view)) {
            LiteavLog.i(s4, ProtectedSandApp.s("咂\u0001"));
            return;
        }
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService(ProtectedSandApp.s("呿\u0001"));
        if (windowManager == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("咃\u0001"));
            return;
        }
        this.mFloatingWindowSet.add(view);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(LiteavSystemInfo.getSystemOSVersionInt() >= 26 ? 2038 : LiteavSystemInfo.getSystemOSVersionInt() > 24 ? 2002 : 2005);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    public static void uninit() {
        synchronized (INIT_LOCK) {
            try {
                if (mHasInited) {
                    mHasInited = false;
                    nativeGlobalUninit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.add(tRTCCloudListener);
    }

    public String callExperimentalAPI(String str) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                return nativeCallExperimentalAPI(j4, str);
            }
            this.mJniReadLock.unlock();
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void connectOtherRoom(String str) {
        long j4 = this.mNativeTrtcCloudJni;
        if (j4 != 0) {
            nativeConnectOtherRoom(j4, str);
        }
    }

    public long createAITranscriberManager() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeCreateAITranscriberManager(j4) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createAudioEffectManager() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeCreateAudioEffectManager(j4) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createBeautyManager() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeCreateBeautyManager(j4) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public ByteBuffer createByteBuffer(int i4) {
        return ByteBuffer.allocateDirect(i4);
    }

    public long createDeviceManager() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeCreateDeviceManager(j4) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TRTCCloudDef.TRTCVideoFrame createTRTCVideoFrame(int i4, int i5, Object obj, int i6, int i7, int i10, int i11, long j4, byte[] bArr, ByteBuffer byteBuffer) {
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.pixelFormat = i4;
        tRTCVideoFrame.bufferType = i5;
        TRTCCloudDef.TRTCTexture tRTCTexture = new TRTCCloudDef.TRTCTexture();
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCTexture.textureId = i6;
        if (obj instanceof EGLContext) {
            tRTCTexture.eglContext10 = (EGLContext) obj;
        } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        tRTCVideoFrame.data = bArr;
        tRTCVideoFrame.buffer = byteBuffer;
        tRTCVideoFrame.width = i7;
        tRTCVideoFrame.height = i10;
        tRTCVideoFrame.timestamp = j4;
        tRTCVideoFrame.rotation = convertPixelFrameRotationToTRTCVideoRotation(k.a(i11));
        return tRTCVideoFrame;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeDestroyPipeline(j4);
                this.mNativeTrtcCloudJni = 0L;
            }
            this.mListenerList.clear();
            this.mJniWriteLock.unlock();
        } catch (Throwable th) {
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    public void disconnectOtherRoom() {
        long j4 = this.mNativeTrtcCloudJni;
        if (j4 != 0) {
            nativeDisconnectOtherRoom(j4);
        }
    }

    public void enable3DSpatialAudioEffect(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnable3DSpatialAudioEffect(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableAudioVolumeEvaluation(boolean z4, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCAudioVolumeEvaluateParams != null) {
                nativeEnableAudioVolumeEvaluation(j4, z4, tRTCAudioVolumeEvaluateParams.interval, tRTCAudioVolumeEvaluateParams.enableVadDetection, tRTCAudioVolumeEvaluateParams.enablePitchCalculation, tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioCapture(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnableCustomAudioCapture(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioRendering(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnableCustomAudioRendering(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomVideoCapture(int i4, boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnableCustomVideoCapture(j4, i4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enableEncSmallVideoStream(boolean z4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnableEncSmallVideoStream(j4, z4, tRTCVideoEncParam == null ? null : new VideoEncParams(tRTCVideoEncParam));
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void enableMixExternalAudioFrame(boolean z4, boolean z5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnableMixExternalAudioFrame(j4, z4, z5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enablePayloadPrivateEncryption(boolean z4, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        int i4;
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                i4 = nativeEnablePayloadPrivateEncryption(j4, z4, tRTCPayloadPrivateEncryptionConfig == null ? null : new PayloadPrivateEncryptionConfig(tRTCPayloadPrivateEncryptionConfig));
            } else {
                i4 = -1;
            }
            return i4;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i4) {
        if (tRTCParams == null) {
            LiteavLog.e(ProtectedSandApp.s("呾\u0001"), ProtectedSandApp.s("咄\u0001"));
            runOnListenerThread(com.tencent.liteav.trtc.a.a(this));
            return;
        }
        this.mJniReadLock.lock();
        try {
            this.mLocalUserId = tRTCParams.userId;
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeEnterRoom(j4, new EnterRoomParams(tRTCParams), i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void exitRoom() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeExitRoom(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioCaptureVolume() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeGetAudioCaptureVolume(j4) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioPlayoutVolume() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeGetAudioPlayoutVolume(j4) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeGetCustomAudioRenderingFrame(j4, tRTCAudioFrame.data, tRTCAudioFrame.sampleRate, tRTCAudioFrame.channel);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getFrameBufferType(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.bufferType;
    }

    public byte[] getFrameByteArray(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.buffer;
    }

    public Object getFrameEglContext(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? tRTCVideoFrame.texture.eglContext14 : tRTCVideoFrame.texture.eglContext10;
    }

    public int getFrameHeight(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.height;
    }

    public int getFramePixelFormat(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.pixelFormat;
    }

    public long getFramePts(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.timestamp;
    }

    public int getFrameRotation(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue;
    }

    public int getFrameTextureId(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.texture.textureId;
    }

    public int getFrameWidth(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.width;
    }

    public long getTrtcCloudJni() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeTrtcCloudJni;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                return nativeMixExternalAudioFrame(j4, new AudioFrame(tRTCAudioFrame));
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteAudio(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteAllRemoteAudio(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteVideoStreams(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteAllRemoteVideoStreams(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalAudio(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteLocalAudio(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalVideo(int i4, boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteLocalVideo(j4, i4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteAudio(String str, boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteRemoteAudio(j4, str, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteVideoStream(String str, int i4, boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeMuteRemoteVideoStream(j4, str, i4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void onAudioCaptureProcessedData(byte[] bArr, long j4, int i4, int i5) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j4;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrameListener.onCapturedAudioFrame(tRTCAudioFrame);
    }

    public void onAudioMixedAllData(byte[] bArr, int i4, int i5) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
    }

    public void onAudioPlayoutData(byte[] bArr, long j4, int i4, int i5) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j4;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
    }

    public void onAudioRemoteStreamData(String str, byte[] bArr, long j4, int i4, int i5, byte[] bArr2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j4;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrame.extraData = bArr2;
        tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, str);
    }

    public void onAudioRouteChanged(int i4, int i5) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAudioRouteChanged(i4, i5);
        }
    }

    void onCameraDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCameraDidReady();
        }
    }

    public void onCdnStreamStateChanged(String str, int i4, int i5, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCdnStreamStateChanged(str, i4, i5, str2, null);
        }
    }

    public void onConnectOtherRoom(String str, int i4, String str2) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectOtherRoom(str, i4, str2);
        }
    }

    void onConnectionLost() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionLost();
        }
    }

    void onConnectionRecovery() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionRecovery();
        }
    }

    public void onDisConnectOtherRoom(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onDisConnectOtherRoom(i4, str);
        }
    }

    public void onEarMonitoringData(byte[] bArr, int i4, int i5) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrameListener.onVoiceEarMonitorAudioFrame(tRTCAudioFrame);
    }

    public void onEnterRoom(int i4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onEnterRoom(i4);
        }
    }

    public void onError(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(i4, str, null);
        }
    }

    public void onExitRoom(int i4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExitRoom(i4);
        }
        synchronized (this.mLocalVideoRenderListenerWrapper) {
            this.mLocalVideoRenderListenerWrapper.f72111d = null;
        }
        synchronized (this.mRemoteVideoRenderListenerMap) {
            this.mRemoteVideoRenderListenerMap.clear();
        }
    }

    public void onExperimentalEvent(String str, String str2) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExperimentalEvent(str, str2);
        }
    }

    void onFirstAudioFrame(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstAudioFrame(str);
        }
    }

    void onFirstVideoFrame(String str, int i4, int i5, int i6) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstVideoFrame(str, i4, i5, i6);
        }
    }

    public void onGLContextCreated() {
        synchronized (this.mVideoFrameListenerWrapper) {
            this.mCalledGLCreatedFrameListener = this.mVideoFrameListenerWrapper.f72111d;
        }
        LiteavLog.i(ProtectedSandApp.s("呾\u0001"), ProtectedSandApp.s("咅\u0001") + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextCreated();
        }
    }

    public void onGLContextDestroy() {
        LiteavLog.i(ProtectedSandApp.s("呾\u0001"), ProtectedSandApp.s("咆\u0001") + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextDestory();
            this.mCalledGLCreatedFrameListener = null;
        }
    }

    public byte[] onLocalAudioStreamData(byte[] bArr, long j4, int i4, int i5) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j4;
        tRTCAudioFrame.sampleRate = i4;
        tRTCAudioFrame.channel = i5;
        tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.extraData;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        LiteavLog.w(ProtectedSandApp.s("呾\u0001"), ProtectedSandApp.s("咇\u0001"));
        return null;
    }

    public void onLocalRecordBegin(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordBegin(i4, str);
        }
    }

    public void onLocalRecordComplete(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordComplete(i4, str);
        }
    }

    public void onLocalRecordFragment(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordFragment(str);
        }
    }

    public void onLocalRecording(long j4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecording(j4, str);
        }
    }

    void onMicDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMicDidReady();
        }
    }

    public void onMissCustomCmdMsg(String str, int i4, int i5, int i6) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMissCustomCmdMsg(str, i4, i5, i6);
        }
    }

    public void onNetworkQuality(int i4, String[] strArr, int[] iArr) {
        if (CopyOnReadListeners().size() == 0) {
            return;
        }
        TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = "";
        tRTCQuality.quality = i4;
        ArrayList<TRTCCloudDef.TRTCQuality> arrayList = new ArrayList<>();
        if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0 && iArr.length == strArr.length) {
            for (int i5 = 0; i5 < strArr.length; i5++) {
                TRTCCloudDef.TRTCQuality tRTCQuality2 = new TRTCCloudDef.TRTCQuality();
                tRTCQuality2.userId = strArr[i5];
                tRTCQuality2.quality = iArr[i5];
                arrayList.add(tRTCQuality2);
            }
        }
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onNetworkQuality(tRTCQuality, arrayList);
        }
    }

    public void onPreprocessVideoFrame(int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener == null || tRTCVideoFrameListener == null) {
            return;
        }
        tRTCVideoFrameListener.onProcessVideoFrame(tRTCVideoFrame, tRTCVideoFrame2);
    }

    public void onRecvCustomCmdMsg(String str, int i4, int i5, byte[] bArr) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvCustomCmdMsg(str, i4, i5, bArr);
        }
    }

    public void onRemoteAudioStatusUpdated(String str, int i4, int i5) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteAudioStatusUpdated(str, i4, i5, null);
        }
    }

    public void onRemoteVideoStatusUpdated(String str, int i4, int i5, int i6) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteVideoStatusUpdated(str, i4, i5, i6, null);
        }
    }

    public void onRenderVideoFrame(String str, int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (TextUtils.isEmpty(str)) {
            str = this.mLocalUserId;
            tRTCVideoRenderListener = this.mLocalVideoRenderListenerWrapper.f72111d;
        } else {
            a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
            tRTCVideoRenderListener = aVar == null ? null : aVar.f72111d;
        }
        if (tRTCVideoRenderListener != null) {
            tRTCVideoRenderListener.onRenderVideoFrame(str, i4, tRTCVideoFrame);
        }
    }

    public void onSEIMessageReceived(byte[] bArr, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvSEIMsg(str, bArr);
        }
    }

    void onScreenCapturePaused() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCapturePaused();
        }
    }

    void onScreenCaptureResumed() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureResumed();
        }
    }

    void onScreenCaptureStarted() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStarted();
        }
    }

    void onScreenCaptureStopped(int i4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStopped(i4);
        }
    }

    void onSendFirstLocalAudioFrame() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalAudioFrame();
        }
    }

    void onSendFirstLocalVideoFrame(int i4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalVideoFrame(i4);
        }
    }

    void onSetMixTranscodingConfig(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSetMixTranscodingConfig(i4, str);
        }
    }

    public void onSnapshotComplete(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        runOnListenerThread(d.a(tRTCSnapshotListener, bitmap));
    }

    public void onSpeedTest(SpeedTestResult speedTestResult, int i4, int i5) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTest(speedTestResult.f72098a, i4, i5);
        }
    }

    public void onSpeedTestResult(SpeedTestResult speedTestResult) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTestResult(speedTestResult.f72098a);
        }
    }

    void onStartPublishCDNStream(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishCDNStream(i4, str);
        }
    }

    public void onStartPublishMediaStream(String str, int i4, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishMediaStream(str, i4, str2, extraToBundle(str3));
        }
    }

    void onStartPublishing(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishing(i4, str);
        }
    }

    public void onStatistics(Statistics statistics) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStatistics(statistics.f72099a);
        }
    }

    void onStopPublishCDNStream(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishCDNStream(i4, str);
        }
    }

    public void onStopPublishMediaStream(String str, int i4, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishMediaStream(str, i4, str2, extraToBundle(str3));
        }
    }

    void onStopPublishing(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishing(i4, str);
        }
    }

    public void onSwitchRole(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRole(i4, str);
        }
    }

    public void onSwitchRoom(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRoom(i4, str);
        }
    }

    void onTryToReconnect() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onTryToReconnect();
        }
    }

    public void onUpdateOtherRoomForwardMode(int i4, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdateOtherRoomForwardMode(i4, str);
        }
    }

    public void onUpdatePublishMediaStream(String str, int i4, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdatePublishMediaStream(str, i4, str2, extraToBundle(str3));
        }
    }

    void onUserAudioAvailable(String str, boolean z4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserAudioAvailable(str, z4);
        }
    }

    public void onUserEnter(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserEnter(str);
        }
    }

    public void onUserExit(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserExit(str, 0);
        }
    }

    public void onUserOffline(String str, int i4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserLeaveRoom(str, i4);
        }
    }

    public void onUserOnline(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserEnterRoom(str);
        }
    }

    void onUserSubStreamAvailable(String str, boolean z4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserSubStreamAvailable(str, z4);
        }
    }

    void onUserVideoAvailable(String str, boolean z4) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoAvailable(str, z4);
        }
    }

    public void onUserVideoSizeChanged(String str, int i4, int i5, int i6) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoSizeChanged(str, i4, i5, i6);
        }
    }

    public void onUserVoiceVolume(String[] strArr, int[] iArr, int[] iArr2, float[] fArr, float[][] fArr2, int i4) {
        String str;
        if (strArr == null || iArr == null) {
            return;
        }
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException(ProtectedSandApp.s("咈\u0001"));
        }
        ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList = new ArrayList<>();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
            if (!strArr[i5].isEmpty() || (str = this.mLocalUserId) == null || str.isEmpty()) {
                tRTCVolumeInfo.userId = strArr[i5];
            } else {
                tRTCVolumeInfo.userId = this.mLocalUserId;
            }
            tRTCVolumeInfo.volume = iArr[i5];
            tRTCVolumeInfo.vad = iArr2[i5];
            tRTCVolumeInfo.pitch = fArr[i5];
            tRTCVolumeInfo.spectrumData = fArr2[i5];
            arrayList.add(tRTCVolumeInfo);
        }
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVoiceVolume(arrayList, i4);
        }
    }

    public void onWarning(int i4, String str, Bundle bundle) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onWarning(i4, str, bundle);
        }
    }

    public void pauseScreenCapture(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativePauseScreenCapture(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || !this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.remove(tRTCCloudListener);
    }

    public void resumeScreenCapture(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeResumeScreenCapture(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSendCustomAudioData(j4, new AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendCustomCmdMsg(int i4, byte[] bArr, boolean z4, boolean z5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                return nativeSendCustomCmdMsg(j4, i4, bArr, z4, z5);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomVideoData(int i4, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        int i5;
        Object obj;
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                if (tRTCTexture != null) {
                    int i6 = tRTCTexture.textureId;
                    Object obj2 = tRTCTexture.eglContext10;
                    if (obj2 == null) {
                        obj2 = tRTCTexture.eglContext14;
                    }
                    i5 = i6;
                    obj = obj2;
                } else {
                    i5 = -1;
                    obj = null;
                }
                nativeSendCustomVideoData(j4, i4, tRTCVideoFrame.pixelFormat, tRTCVideoFrame.bufferType, obj, i5, tRTCVideoFrame.width, tRTCVideoFrame.height, covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue, tRTCVideoFrame.timestamp, tRTCVideoFrame.data, tRTCVideoFrame.buffer);
            }
            this.mJniReadLock.unlock();
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public boolean sendSEIMsg(byte[] bArr, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                return nativeSendSEIMsg(j4, bArr, i4);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void set3DSpatialReceivingRange(String str, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSet3DSpatialReceivingRange(j4, str, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioCaptureVolume(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetAudioCaptureVolume(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                this.mAudioFrameListener = tRTCAudioFrameListener;
                nativeEnableAudioFrameNotification(j4, tRTCAudioFrameListener != null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioPlayoutVolume(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetAudioPlayoutVolume(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioQuality(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetAudioQuality(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setCapturedAudioFrameCallbackFormat(int i4, int i5, int i6, int i7) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeSetCapturedAudioFrameCallbackFormat(j4, i4, i5, i6, i7) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setDefaultStreamRecvMode(boolean z4, boolean z5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetDefaultStreamRecvMode(j4, z4, z5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGSensorMode(int i4, int i5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetGSensorMode(j4, i4, i5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGravitySensorAdaptiveMode(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetGravitySensorAdaptiveMode(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
        this.mListener = tRTCCloudListener;
    }

    public void setListenerHandler(Handler handler) {
        this.mJniReadLock.lock();
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetListenerHandler(j4, handler);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i4, int i5, int i6, int i7) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeSetLocalProcessedAudioFrameCallbackFormat(j4, i4, i5, i6, i7) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoProcessListener(int i4, int i5, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomPreprocessSupportedFormatType(i4)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomPreprocessSupportedBufferType(i5)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mVideoFrameListenerWrapper) {
                    try {
                        a<TRTCCloudListener.TRTCVideoFrameListener> aVar = this.mVideoFrameListenerWrapper;
                        if (aVar.f72111d != null) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, false, aVar.f72109b, aVar.f72110c);
                        }
                        a<TRTCCloudListener.TRTCVideoFrameListener> aVar2 = this.mVideoFrameListenerWrapper;
                        aVar2.f72111d = tRTCVideoFrameListener;
                        aVar2.f72108a = 0;
                        aVar2.f72109b = i4;
                        aVar2.f72110c = i5;
                        if (tRTCVideoFrameListener != 0) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, true, i4, i5);
                        }
                    } finally {
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoRenderListener(int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomRenderSupportedFormatType(i4)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i5)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mLocalVideoRenderListenerWrapper) {
                    try {
                        a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mLocalVideoRenderListenerWrapper;
                        if (aVar.f72111d != null) {
                            int i6 = aVar.f72109b;
                            if (i6 == i4 && aVar.f72110c == i5 && tRTCVideoRenderListener != 0) {
                                aVar.f72111d = tRTCVideoRenderListener;
                            }
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, "", 0, i6, aVar.f72110c);
                            long j4 = this.mNativeTrtcCloudJni;
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar2 = this.mLocalVideoRenderListenerWrapper;
                            nativeEnableVideoCustomRender(j4, false, "", 2, aVar2.f72109b, aVar2.f72110c);
                        }
                        a<TRTCCloudListener.TRTCVideoRenderListener> aVar3 = this.mLocalVideoRenderListenerWrapper;
                        aVar3.f72111d = tRTCVideoRenderListener;
                        aVar3.f72109b = i4;
                        aVar3.f72110c = i5;
                        if (tRTCVideoRenderListener != 0) {
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i4, i5);
                            long j5 = this.mNativeTrtcCloudJni;
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar4 = this.mLocalVideoRenderListenerWrapper;
                            nativeEnableVideoCustomRender(j5, true, "", 2, aVar4.f72109b, aVar4.f72110c);
                        }
                    } finally {
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewFillMode(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetLocalViewFillMode(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewMirror(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetLocalViewMirror(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewRotation(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetLocalViewRotation(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixExternalAudioVolume(int i4, int i5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetMixExternalAudioVolume(j4, i4, i5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetMixTranscodingConfig(j4, tRTCTranscodingConfig == null ? null : new TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i4, int i5, int i6, int i7) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            return j4 != 0 ? nativeSetMixedPlayAudioFrameCallbackFormat(j4, i4, i5, i6, i7) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCNetworkQosParam != null) {
                nativeSetNetworkQosParam(j4, tRTCNetworkQosParam.preference, tRTCNetworkQosParam.controlMode);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                List list = null;
                float[] a5 = f.a(pointFArr == null ? null : Arrays.asList(pointFArr));
                if (pointFArr2 != null) {
                    list = Arrays.asList(pointFArr2);
                }
                nativeSetPerspectiveCorrectionPoints(j4, str, a5, f.a(list));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setPriorRemoteVideoStreamType(int i4) {
        long j4 = this.mNativeTrtcCloudJni;
        if (j4 == 0) {
            return 0;
        }
        nativeSetPriorRemoteVideoStreamType(j4, i4);
        return 0;
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCAudioParallelParams != null) {
                nativeSetRemoteAudioParallelParams(j4, new AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteAudioVolume(String str, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetRemoteAudioVolume(j4, str, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setRemoteVideoRenderListener(String str, int i4, int i5, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            byte b5 = 0;
            if (this.mNativeTrtcCloudJni != 0) {
                if (TextUtils.isEmpty(str)) {
                    this.mJniReadLock.unlock();
                    return -3319;
                }
                if (!isCustomRenderSupportedFormatType(i4)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i5)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mRemoteVideoRenderListenerMap) {
                    try {
                        a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
                        if (aVar != null) {
                            int i6 = aVar.f72109b;
                            if (i6 == i4 && aVar.f72110c == i5 && tRTCVideoRenderListener != 0) {
                                aVar.f72111d = tRTCVideoRenderListener;
                                this.mRemoteVideoRenderListenerMap.put(str, aVar);
                            }
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 0, i6, aVar.f72110c);
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 2, aVar.f72109b, aVar.f72110c);
                        }
                        if (tRTCVideoRenderListener != 0) {
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar2 = new a<>(b5);
                            aVar2.f72111d = tRTCVideoRenderListener;
                            aVar2.f72109b = i4;
                            aVar2.f72110c = i5;
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 0, i4, i5);
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 2, aVar2.f72109b, aVar2.f72110c);
                            this.mRemoteVideoRenderListenerMap.put(str, aVar2);
                        } else {
                            this.mRemoteVideoRenderListenerMap.remove(str);
                        }
                    } finally {
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setRemoteVideoStreamType(String str, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetRemoteVideoStreamType(j4, str, i4);
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void setRemoteViewFillMode(String str, int i4, int i5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetRemoteViewFillMode(j4, str, i4, i5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewMirror(String str, int i4, int i5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetRemoteViewMirror(j4, str, i4, i5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewRotation(String str, int i4, int i5) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetRemoteViewRotation(j4, str, i4, i5);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderMirror(boolean z4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetVideoEncoderMirror(j4, z4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderParams(int i4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCVideoEncParam != null) {
                nativeSetVideoEncoderParams(j4, i4, new VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderRotation(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetVideoEncoderRotation(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoMuteImage(Bitmap bitmap, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetVideoMuteImage(j4, bitmap, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setWatermark(Bitmap bitmap, int i4, float f4, float f5, float f6) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSetWatermark(j4, bitmap, i4, f4, f5, f6);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void showDashboardManager(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeShowDashboardManager(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void snapshotVideo(String str, int i4, int i5, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSnapshotVideo(j4, str, i4, i5, tRTCSnapshotListener);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCAudioRecordingParams != null) {
                return nativeStartAudioRecording(j4, new AudioRecordingParams(tRTCAudioRecordingParams));
            }
            this.mJniReadLock.unlock();
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalAudio(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartLocalAudioWithQuality(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalPreview(boolean z4, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartLocalPreview(j4, z4, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCLocalRecordingParams != null) {
                nativeStartLocalRecording(j4, new LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCPublishCDNParam != null) {
                nativeStartPublishCDNStream(j4, new PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                StreamMixingConfig streamMixingConfig = null;
                PublishTarget publishTarget = tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget);
                StreamEncoderParam streamEncoderParam = tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam);
                if (tRTCStreamMixingConfig != null) {
                    streamMixingConfig = new StreamMixingConfig(tRTCStreamMixingConfig);
                }
                nativeStartPublishMediaStream(j4, publishTarget, streamEncoderParam, streamMixingConfig);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishing(String str, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartPublishing(j4, str, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartRemoteView(j4, str, i4, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startScreenCapture(int i4, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i4, null, screenShareParams);
                    LiteavLog.w(ProtectedSandApp.s("呾\u0001"), ProtectedSandApp.s("咉\u0001"));
                } else {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i4, new VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            this.mJniReadLock.unlock();
            if (tRTCScreenShareParams != null) {
                ThreadUtils.runOnUiThread(b.a(this, tRTCScreenShareParams));
            }
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCSpeedTestParams != null) {
                nativeStartSpeedTest(j4, new SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartSystemAudioLoopback(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAllRemoteView() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopAllRemoteView(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAudioRecording() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopAudioRecording(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopLocalAudio(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalPreview() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopLocalPreview(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalRecording() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopLocalRecording(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishCDNStream() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopPublishCDNStream(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishMediaStream(String str) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopPublishMediaStream(j4, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishing() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopPublishing(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str, int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopRemoteView(j4, str, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopScreenCapture(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopScreenCapture(j4, i4);
            }
            this.mJniReadLock.unlock();
            ThreadUtils.runOnUiThread(c.a(this));
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void stopSpeedTest() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopSpeedTest(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopSystemAudioLoopback(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i4) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSwitchRole(j4, i4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && tRTCSwitchRoomConfig != null) {
                nativeSwitchRoom(j4, new SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeUpdateLocalView(j4, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateOtherRoomForwardMode(String str) {
        long j4 = this.mNativeTrtcCloudJni;
        if (j4 != 0) {
            nativeUpdateOtherRoomForwardMode(j4, str);
        }
    }

    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeUpdatePublishMediaStream(j4, str, tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget), tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam), tRTCStreamMixingConfig == null ? null : new StreamMixingConfig(tRTCStreamMixingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && iArr != null) {
                nativeUpdateRemote3DSpatialPosition(j4, str, iArr);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemoteView(String str, int i4, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeUpdateRemoteView(j4, str, i4, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0 && iArr != null && fArr != null && fArr2 != null && fArr3 != null) {
                nativeUpdateSelf3DSpatialPosition(j4, iArr, fArr, fArr2, fArr3);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TrtcCloudJni(long j4, boolean z4) {
        this.mNativeTrtcCloudJni = 0L;
        this.mLocalUserId = "";
        this.mListenerList = new CopyOnWriteArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mFloatingWindowSet = new HashSet<>();
        if (j4 == 0) {
            this.mNativeTrtcCloudJni = nativeCreatePipeline(this, z4);
        } else {
            this.mNativeTrtcCloudJni = nativeCreateSubCloud(this, j4);
        }
        byte b5 = 0;
        this.mVideoFrameListenerWrapper = new a<>(b5);
        this.mLocalVideoRenderListenerWrapper = new a<>(b5);
        this.mRemoteVideoRenderListenerMap = new HashMap();
        this.mListenerHandler = new Handler(Looper.getMainLooper());
    }

    static class SpeedTestParams {

        /* renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCSpeedTestParams f72096a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f72097b;

        public SpeedTestParams(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f72096a = tRTCSpeedTestParams;
            this.f72097b = false;
        }

        public int getExpectedDownBandwidth() {
            return this.f72096a.expectedDownBandwidth;
        }

        public int getExpectedUpBandwidth() {
            return this.f72096a.expectedUpBandwidth;
        }

        public boolean getIsCalledFromDeprecatedApi() {
            return this.f72097b;
        }

        public int getSDKAppId() {
            return this.f72096a.sdkAppId;
        }

        public int getScene() {
            return this.f72096a.scene;
        }

        public String getUserId() {
            return this.f72096a.userId;
        }

        public String getUserSig() {
            return this.f72096a.userSig;
        }

        public SpeedTestParams(int i4, String str, String str2) {
            TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new TRTCCloudDef.TRTCSpeedTestParams();
            this.f72096a = tRTCSpeedTestParams;
            tRTCSpeedTestParams.sdkAppId = i4;
            tRTCSpeedTestParams.userId = str;
            tRTCSpeedTestParams.userSig = str2;
            tRTCSpeedTestParams.scene = 1;
            this.f72097b = true;
        }
    }

    public void startLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartLocalAudio(j4);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartRemoteViewWithoutStreamType(j4, str, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(int i4, String str, String str2) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStartSpeedTest(j4, new SpeedTestParams(i4, str, str2));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeStopRemoteViewWithoutStreamType(j4, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i4, String str) {
        this.mJniReadLock.lock();
        try {
            long j4 = this.mNativeTrtcCloudJni;
            if (j4 != 0) {
                nativeSwitchRoleWithPrivateMapKey(j4, i4, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
