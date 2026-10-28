package com.tencent.trtc;

import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes7.dex */
public class TRTCCloudDef {
    public static final int TRTCAVStatusChangeReasonBufferingBegin = 1;
    public static final int TRTCAVStatusChangeReasonBufferingEnd = 2;
    public static final int TRTCAVStatusChangeReasonInternal = 0;
    public static final int TRTCAVStatusChangeReasonLocalStarted = 3;
    public static final int TRTCAVStatusChangeReasonLocalStopped = 4;
    public static final int TRTCAVStatusChangeReasonRemoteStarted = 5;
    public static final int TRTCAVStatusChangeReasonRemoteStopped = 6;
    public static final int TRTCAVStatusLoading = 2;
    public static final int TRTCAVStatusPlaying = 1;
    public static final int TRTCAVStatusStopped = 0;
    public static final int TRTCAudioCapabilityLowLatencyChorus = 1;
    public static final int TRTCAudioCapabilityLowLatencyEarMonitor = 2;
    public static final int TRTCAudioSampleRate16000 = 16000;
    public static final int TRTCAudioSampleRate32000 = 32000;
    public static final int TRTCAudioSampleRate44100 = 44100;
    public static final int TRTCAudioSampleRate48000 = 48000;
    public static final int TRTCRoleAnchor = 20;
    public static final int TRTCRoleAudience = 21;
    public static final int TRTCSystemVolumeTypeAuto = 0;
    public static final int TRTCSystemVolumeTypeMedia = 1;
    public static final int TRTCSystemVolumeTypeVOIP = 2;
    public static final int TRTC_APP_SCENE_AUDIOCALL = 2;
    public static final int TRTC_APP_SCENE_LIVE = 1;
    public static final int TRTC_APP_SCENE_VIDEOCALL = 0;
    public static final int TRTC_APP_SCENE_VOICE_CHATROOM = 3;
    public static final int TRTC_AUDIO_FRAME_FORMAT_PCM = 1;
    public static final int TRTC_AUDIO_FRAME_OPERATION_MODE_READONLY = 1;
    public static final int TRTC_AUDIO_FRAME_OPERATION_MODE_READWRITE = 0;
    public static final int TRTC_AUDIO_QUALITY_DEFAULT = 2;
    public static final int TRTC_AUDIO_QUALITY_MUSIC = 3;
    public static final int TRTC_AUDIO_QUALITY_SPEECH = 1;
    public static final int TRTC_AUDIO_ROUTE_BLUETOOTH_HEADSET = 3;
    public static final int TRTC_AUDIO_ROUTE_EARPIECE = 1;
    public static final int TRTC_AUDIO_ROUTE_SOUND_CARD = 4;
    public static final int TRTC_AUDIO_ROUTE_SPEAKER = 0;
    public static final int TRTC_AUDIO_ROUTE_UNKNOWN = -1;
    public static final int TRTC_AUDIO_ROUTE_WIRED_HEADSET = 2;
    public static final int TRTC_AudioRecordingContent_All = 0;
    public static final int TRTC_AudioRecordingContent_Local = 1;
    public static final int TRTC_AudioRecordingContent_Remote = 2;
    public static final int TRTC_BEAUTY_STYLE_NATURE = 1;
    public static final int TRTC_BEAUTY_STYLE_PITU = 2;
    public static final int TRTC_BEAUTY_STYLE_SMOOTH = 0;
    public static final int TRTC_DEBUG_VIEW_LEVEL_ALL = 2;
    public static final int TRTC_DEBUG_VIEW_LEVEL_GONE = 0;
    public static final int TRTC_DEBUG_VIEW_LEVEL_STATUS = 1;
    public static final int TRTC_EncryptionAlgorithm_Aes_128_Gcm = 0;
    public static final int TRTC_EncryptionAlgorithm_Aes_256_Gcm = 1;
    public static final int TRTC_GRAVITY_SENSOR_ADAPTIVE_MODE_DISABLE = 0;
    public static final int TRTC_GRAVITY_SENSOR_ADAPTIVE_MODE_FILL_BY_CENTER_CROP = 1;
    public static final int TRTC_GRAVITY_SENSOR_ADAPTIVE_MODE_FIT_WITH_BLACK_BORDER = 2;
    public static final int TRTC_GSENSOR_MODE_DISABLE = 0;
    public static final int TRTC_GSENSOR_MODE_UIAUTOLAYOUT = 1;
    public static final int TRTC_GSENSOR_MODE_UIFIXLAYOUT = 2;
    public static final int TRTC_LOG_LEVEL_DEBUG = 1;
    public static final int TRTC_LOG_LEVEL_ERROR = 4;
    public static final int TRTC_LOG_LEVEL_FATAL = 5;
    public static final int TRTC_LOG_LEVEL_INFO = 2;
    public static final int TRTC_LOG_LEVEL_NULL = 6;
    public static final int TRTC_LOG_LEVEL_VERBOSE = 0;
    public static final int TRTC_LOG_LEVEL_WARN = 3;
    public static final int TRTC_MixInputType_AudioVideo = 1;
    public static final int TRTC_MixInputType_PureAudio = 3;
    public static final int TRTC_MixInputType_PureVideo = 2;
    public static final int TRTC_MixInputType_Undefined = 0;
    public static final int TRTC_MixInputType_Watermark = 4;
    public static final int TRTC_PublishBigStream_ToCdn = 1;
    public static final int TRTC_PublishMixStream_ToCdn = 3;
    public static final int TRTC_PublishMixStream_ToRoom = 4;
    public static final int TRTC_PublishMode_Unknown = 0;
    public static final int TRTC_PublishSubStream_ToCdn = 2;
    public static final int TRTC_QUALITY_Bad = 4;
    public static final int TRTC_QUALITY_Down = 6;
    public static final int TRTC_QUALITY_Excellent = 1;
    public static final int TRTC_QUALITY_Good = 2;
    public static final int TRTC_QUALITY_Poor = 3;
    public static final int TRTC_QUALITY_UNKNOWN = 0;
    public static final int TRTC_QUALITY_Vbad = 5;
    public static final int TRTC_RECORD_TYPE_AUDIO = 0;
    public static final int TRTC_RECORD_TYPE_BOTH = 2;
    public static final int TRTC_RECORD_TYPE_VIDEO = 1;
    public static final int TRTC_REVERB_TYPE_0 = 0;
    public static final int TRTC_REVERB_TYPE_1 = 1;
    public static final int TRTC_REVERB_TYPE_2 = 2;
    public static final int TRTC_REVERB_TYPE_3 = 3;
    public static final int TRTC_REVERB_TYPE_4 = 4;
    public static final int TRTC_REVERB_TYPE_5 = 5;
    public static final int TRTC_REVERB_TYPE_6 = 6;
    public static final int TRTC_REVERB_TYPE_7 = 7;
    public static final String TRTC_SDK_VERSION = ProtectedSandApp.s("岗\u0001");
    public static final int TRTC_SNAPSHOT_SOURCE_TYPE_CAPTURE = 2;
    public static final int TRTC_SNAPSHOT_SOURCE_TYPE_STREAM = 0;
    public static final int TRTC_SNAPSHOT_SOURCE_TYPE_VIEW = 1;
    public static final int TRTC_SpeedTestScene_Delay_Bandwidth_Testing = 2;
    public static final int TRTC_SpeedTestScene_Delay_Testing = 1;
    public static final int TRTC_SpeedTestScene_Online_Chorus_Testing = 3;
    public static final int TRTC_TranscodingConfigMode_Manual = 1;
    public static final int TRTC_TranscodingConfigMode_Template_PresetLayout = 3;
    public static final int TRTC_TranscodingConfigMode_Template_PureAudio = 2;
    public static final int TRTC_TranscodingConfigMode_Template_ScreenSharing = 4;
    public static final int TRTC_TranscodingConfigMode_Unknown = 0;
    public static final int TRTC_VIDEO_BUFFER_TYPE_BYTE_ARRAY = 2;
    public static final int TRTC_VIDEO_BUFFER_TYPE_BYTE_BUFFER = 1;
    public static final int TRTC_VIDEO_BUFFER_TYPE_TEXTURE = 3;
    public static final int TRTC_VIDEO_BUFFER_TYPE_UNKNOWN = 0;
    public static final int TRTC_VIDEO_MIRROR_TYPE_AUTO = 0;
    public static final int TRTC_VIDEO_MIRROR_TYPE_DISABLE = 2;
    public static final int TRTC_VIDEO_MIRROR_TYPE_ENABLE = 1;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_I420 = 1;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_NV21 = 4;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_RGBA = 5;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_TEXTURE_EXTERNAL_OES = 3;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_Texture_2D = 2;
    public static final int TRTC_VIDEO_PIXEL_FORMAT_UNKNOWN = 0;
    public static final int TRTC_VIDEO_QOS_PREFERENCE_CLEAR = 2;
    public static final int TRTC_VIDEO_QOS_PREFERENCE_SMOOTH = 1;
    public static final int TRTC_VIDEO_RENDER_MODE_FILL = 0;
    public static final int TRTC_VIDEO_RENDER_MODE_FIT = 1;
    public static final int TRTC_VIDEO_RENDER_MODE_SCALE_FILL = 2;
    public static final int TRTC_VIDEO_RESOLUTION_120_120 = 1;
    public static final int TRTC_VIDEO_RESOLUTION_1280_720 = 112;
    public static final int TRTC_VIDEO_RESOLUTION_160_120 = 50;
    public static final int TRTC_VIDEO_RESOLUTION_160_160 = 3;
    public static final int TRTC_VIDEO_RESOLUTION_160_90 = 100;
    public static final int TRTC_VIDEO_RESOLUTION_1920_1080 = 114;
    public static final int TRTC_VIDEO_RESOLUTION_240_180 = 52;
    public static final int TRTC_VIDEO_RESOLUTION_256_144 = 102;
    public static final int TRTC_VIDEO_RESOLUTION_270_270 = 5;
    public static final int TRTC_VIDEO_RESOLUTION_280_210 = 54;
    public static final int TRTC_VIDEO_RESOLUTION_320_180 = 104;
    public static final int TRTC_VIDEO_RESOLUTION_320_240 = 56;
    public static final int TRTC_VIDEO_RESOLUTION_400_300 = 58;
    public static final int TRTC_VIDEO_RESOLUTION_480_270 = 106;
    public static final int TRTC_VIDEO_RESOLUTION_480_360 = 60;
    public static final int TRTC_VIDEO_RESOLUTION_480_480 = 7;
    public static final int TRTC_VIDEO_RESOLUTION_640_360 = 108;
    public static final int TRTC_VIDEO_RESOLUTION_640_480 = 62;
    public static final int TRTC_VIDEO_RESOLUTION_960_540 = 110;
    public static final int TRTC_VIDEO_RESOLUTION_960_720 = 64;
    public static final int TRTC_VIDEO_RESOLUTION_MODE_LANDSCAPE = 0;
    public static final int TRTC_VIDEO_RESOLUTION_MODE_PORTRAIT = 1;
    public static final int TRTC_VIDEO_ROTATION_0 = 0;
    public static final int TRTC_VIDEO_ROTATION_180 = 2;
    public static final int TRTC_VIDEO_ROTATION_270 = 3;
    public static final int TRTC_VIDEO_ROTATION_90 = 1;
    public static final int TRTC_VIDEO_STREAM_TYPE_BIG = 0;
    public static final int TRTC_VIDEO_STREAM_TYPE_SMALL = 1;
    public static final int TRTC_VIDEO_STREAM_TYPE_SUB = 2;
    public static final int TRTC_VOICE_CHANGER_TYPE_0 = 0;
    public static final int TRTC_VOICE_CHANGER_TYPE_1 = 1;
    public static final int TRTC_VOICE_CHANGER_TYPE_10 = 10;
    public static final int TRTC_VOICE_CHANGER_TYPE_11 = 11;
    public static final int TRTC_VOICE_CHANGER_TYPE_2 = 2;
    public static final int TRTC_VOICE_CHANGER_TYPE_3 = 3;
    public static final int TRTC_VOICE_CHANGER_TYPE_4 = 4;
    public static final int TRTC_VOICE_CHANGER_TYPE_5 = 5;
    public static final int TRTC_VOICE_CHANGER_TYPE_6 = 6;
    public static final int TRTC_VOICE_CHANGER_TYPE_7 = 7;
    public static final int TRTC_VOICE_CHANGER_TYPE_8 = 8;
    public static final int TRTC_VOICE_CHANGER_TYPE_9 = 9;
    public static final int VIDEO_QOS_CONTROL_CLIENT = 0;
    public static final int VIDEO_QOS_CONTROL_SERVER = 1;

    public static class TRTCAudioEffectParam {
        public int effectId;
        public String path;
        public int loopCount = 0;
        public boolean publish = false;
        public int volume = 100;

        public TRTCAudioEffectParam(int i4, String str) {
            this.path = str;
            this.effectId = i4;
        }
    }

    public static class TRTCAudioFrame {
        public int channel;
        public byte[] data;
        public byte[] extraData;
        public int sampleRate;
        public long timestamp;
    }

    public static class TRTCAudioFrameCallbackFormat {
        public int sampleRate = 0;
        public int channel = 0;
        public int samplesPerCall = 0;
        public int mode = 0;
    }

    public static class TRTCAudioParallelParams {
        public int maxCount = 0;
        public ArrayList<String> includeUsers = new ArrayList<>();
    }

    public static class TRTCAudioRecordingParams {
        public String filePath = "";
        public int recordingContent = 0;
        public int maxDurationPerFile = 0;
    }

    public static class TRTCAudioVolumeEvaluateParams {
        public int interval = 300;
        public boolean enableVadDetection = false;
        public boolean enablePitchCalculation = false;
        public boolean enableSpectrumCalculation = false;
    }

    public static class TRTCLocalRecordingParams {
        public String filePath = "";
        public int recordType = 2;
        public int interval = -1;
        public int maxDurationPerFile = 0;

        public String toString() {
            return ProtectedSandApp.s("履\u0001") + this.filePath + ProtectedSandApp.s("屦\u0001") + this.recordType + ProtectedSandApp.s("屧\u0001") + this.interval + ProtectedSandApp.s("屨\u0001") + this.maxDurationPerFile;
        }
    }

    public static class TRTCNetworkQosParam {
        public int controlMode;
        public int preference;
    }

    public static class TRTCPayloadPrivateEncryptionConfig {
        public int encryptionAlgorithm = 0;
        public String encryptionKey = null;
        public final byte[] encryptionSalt;

        public TRTCPayloadPrivateEncryptionConfig() {
            byte[] bArr = new byte[32];
            this.encryptionSalt = bArr;
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static class TRTCPublishCDNParam {
        public int appId;
        public int bizId;
        public String streamId;
        public String url;
    }

    public static class TRTCPublishTarget {
        public int mode = 0;
        public ArrayList<TRTCPublishCdnUrl> cdnUrlList = new ArrayList<>();
        public TRTCUser mixStreamIdentity = new TRTCUser();
    }

    public static class TRTCQuality {
        public int quality;
        public String userId;
    }

    public static class TRTCRenderParams {
        public int fillMode;
        public int mirrorType;
        public int rotation;
    }

    public static class TRTCScreenShareParams {

        @Deprecated
        public boolean enableForegroundService = true;
        public View floatingView;
        public Object mediaProjection;
    }

    public static class TRTCSpeedTestParams {
        public int expectedDownBandwidth;
        public int expectedUpBandwidth;
        public int scene;
        public int sdkAppId;
        public String userId;
        public String userSig;

        public String toString() {
            return ProtectedSandApp.s("屶\u0001") + this.sdkAppId + ProtectedSandApp.s("屷\u0001") + this.userId + ProtectedSandApp.s("屸\u0001") + this.expectedDownBandwidth + ProtectedSandApp.s("屹\u0001") + this.expectedDownBandwidth + ProtectedSandApp.s("屺\u0001") + this.scene;
        }
    }

    public static class TRTCSpeedTestResult {
        public int availableDownBandwidth;
        public int availableUpBandwidth;
        public int downJitter;
        public float downLostRate;
        public String errMsg;
        public String ip;
        public int quality;
        public int rtt;
        public boolean success;
        public int upJitter;
        public float upLostRate;

        public String toString() {
            return ProtectedSandApp.s("屻\u0001") + this.success + ProtectedSandApp.s("屼\u0001") + this.errMsg + ProtectedSandApp.s("屽\u0001") + this.ip + ProtectedSandApp.s("屾\u0001") + this.quality + ProtectedSandApp.s("屿\u0001") + this.upLostRate + ProtectedSandApp.s("岀\u0001") + this.downLostRate + ProtectedSandApp.s("岁\u0001") + this.rtt + ProtectedSandApp.s("岂\u0001") + this.availableUpBandwidth + ProtectedSandApp.s("岃\u0001") + this.availableDownBandwidth + ProtectedSandApp.s("岄\u0001") + this.upJitter + ProtectedSandApp.s("岅\u0001") + this.downJitter;
        }
    }

    public static class TRTCStreamEncoderParam {
        public int videoEncodedWidth = 0;
        public int videoEncodedHeight = 0;
        public int videoEncodedFPS = 0;
        public int videoEncodedGOP = 0;
        public int videoEncodedKbps = 0;
        public int audioEncodedSampleRate = 0;
        public int audioEncodedChannelNum = 0;
        public int audioEncodedKbps = 0;
        public int audioEncodedCodecType = 0;
        public int videoEncodedCodecType = 0;
        public String videoSeiParams = null;
    }

    public static class TRTCStreamMixingConfig {
        public int backgroundColor = 0;
        public String backgroundImage = "";
        public ArrayList<TRTCVideoLayout> videoLayoutList = new ArrayList<>();
        public ArrayList<TRTCUser> audioMixUserList = new ArrayList<>();
        public ArrayList<TRTCWatermark> watermarkList = new ArrayList<>();
    }

    public static class TRTCSwitchRoomConfig {
        public int roomId = 0;
        public String strRoomId = null;
        public String userSig = null;
        public String privateMapKey = null;
    }

    public static class TRTCTexture {
        public EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }

    public static class TRTCUser {
        public String userId = "";
        public int intRoomId = 0;
        public String strRoomId = "";
    }

    public static class TRTCVideoEncParam {
        public boolean enableAdjustRes;
        public int minVideoBitrate;
        public int videoBitrate;
        public int videoFps;
        public int videoResolution;
        public int videoResolutionMode;
    }

    public static class TRTCVideoFrame {
        public ByteBuffer buffer;
        public int bufferType;
        public byte[] data;
        public int height;
        public int pixelFormat;
        public int rotation;
        public TRTCTexture texture;
        public long timestamp;
        public int width;
    }

    public static class TRTCVideoLayout {

        /* renamed from: x, reason: collision with root package name */
        public int f72771x = 0;

        /* renamed from: y, reason: collision with root package name */
        public int f72772y = 0;
        public int width = 0;
        public int height = 0;
        public int zOrder = 0;
        public int fillMode = 0;
        public int backgroundColor = 0;
        public String placeHolderImage = "";
        public TRTCUser fixedVideoUser = new TRTCUser();
        public int fixedVideoStreamType = 0;
    }

    public static class TRTCVolumeInfo {
        public float pitch;
        public float[] spectrumData;
        public String userId;
        public int vad;
        public int volume;
    }

    public static class TRTCWatermark {
        public String watermarkUrl = "";

        /* renamed from: x, reason: collision with root package name */
        public int f72773x = 0;

        /* renamed from: y, reason: collision with root package name */
        public int f72774y = 0;
        public int height = 0;
        public int width = 0;
        public int zOrder = 0;
    }

    public static class TRTCPublishCdnUrl {
        public boolean isInternalLine;
        public String rtmpUrl;

        public TRTCPublishCdnUrl() {
            this.rtmpUrl = "";
            this.isInternalLine = true;
        }

        public TRTCPublishCdnUrl(String str, boolean z4) {
            this.rtmpUrl = str;
            this.isInternalLine = z4;
        }
    }

    public static class TRTCParams {
        public String businessInfo;
        public String privateMapKey;
        public int role;
        public int roomId;
        public int sdkAppId;
        public String strRoomId;
        public String streamId;
        public String userDefineRecordId;
        public String userId;
        public String userSig;

        public TRTCParams() {
            this.sdkAppId = 0;
            this.userId = "";
            this.userSig = "";
            this.roomId = 0;
            this.strRoomId = "";
            this.role = 20;
            this.streamId = "";
            this.userDefineRecordId = "";
            this.privateMapKey = "";
            this.businessInfo = "";
        }

        public TRTCParams(int i4, String str, String str2, int i5, String str3, String str4) {
            this.role = 20;
            this.streamId = "";
            this.userDefineRecordId = "";
            this.sdkAppId = i4;
            this.userId = str;
            this.userSig = str2;
            this.roomId = i5;
            this.strRoomId = "";
            this.privateMapKey = str3;
            this.businessInfo = str4;
        }

        public TRTCParams(int i4, String str, String str2, String str3, String str4, String str5) {
            this.roomId = 0;
            this.role = 20;
            this.streamId = "";
            this.userDefineRecordId = "";
            this.sdkAppId = i4;
            this.userId = str;
            this.userSig = str2;
            this.strRoomId = str3;
            this.privateMapKey = str4;
            this.businessInfo = str5;
        }

        public TRTCParams(TRTCParams tRTCParams) {
            this.sdkAppId = 0;
            this.userId = "";
            this.userSig = "";
            this.roomId = 0;
            this.strRoomId = "";
            this.role = 20;
            this.streamId = "";
            this.userDefineRecordId = "";
            this.privateMapKey = "";
            this.businessInfo = "";
            this.sdkAppId = tRTCParams.sdkAppId;
            this.userId = tRTCParams.userId;
            this.userSig = tRTCParams.userSig;
            this.roomId = tRTCParams.roomId;
            this.strRoomId = tRTCParams.strRoomId;
            this.role = tRTCParams.role;
            this.streamId = tRTCParams.streamId;
            this.userDefineRecordId = tRTCParams.userDefineRecordId;
            this.privateMapKey = tRTCParams.privateMapKey;
            this.businessInfo = tRTCParams.businessInfo;
        }
    }

    public static class TRTCMixUser {
        public int height;
        public String image;
        public int inputType;
        public boolean pureAudio;
        public int renderMode;
        public String roomId;
        public int soundLevel;
        public int streamType;
        public String userId;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f72769x;

        /* renamed from: y, reason: collision with root package name */
        public int f72770y;
        public int zOrder;

        public TRTCMixUser() {
            this.userId = "";
            this.f72769x = 0;
            this.f72770y = 0;
            this.width = 0;
            this.height = 0;
            this.zOrder = 0;
            this.streamType = 0;
            this.inputType = 0;
            this.renderMode = 0;
            this.soundLevel = 100;
            this.image = null;
        }

        public String toString() {
            return ProtectedSandApp.s("屩\u0001") + this.userId + ProtectedSandApp.s("屪\u0001") + this.roomId + ProtectedSandApp.s("屫\u0001") + this.f72769x + ProtectedSandApp.s("屬\u0001") + this.f72770y + ProtectedSandApp.s("屭\u0001") + this.width + ProtectedSandApp.s("屮\u0001") + this.height + ProtectedSandApp.s("屯\u0001") + this.zOrder + ProtectedSandApp.s("屰\u0001") + this.streamType + ProtectedSandApp.s("山\u0001") + this.pureAudio + ProtectedSandApp.s("屲\u0001") + this.inputType + ProtectedSandApp.s("屳\u0001") + this.renderMode + ProtectedSandApp.s("屴\u0001") + this.soundLevel + ProtectedSandApp.s("屵\u0001") + this.image;
        }

        public TRTCMixUser(String str, int i4, int i5, int i6, int i7, int i10) {
            this.userId = str;
            this.f72769x = i4;
            this.f72770y = i5;
            this.width = i6;
            this.height = i7;
            this.zOrder = i10;
            this.streamType = 0;
            this.inputType = 0;
            this.renderMode = 0;
            this.soundLevel = 100;
            this.image = null;
        }

        public TRTCMixUser(TRTCMixUser tRTCMixUser) {
            this.userId = tRTCMixUser.userId;
            this.roomId = tRTCMixUser.roomId;
            this.f72769x = tRTCMixUser.f72769x;
            this.f72770y = tRTCMixUser.f72770y;
            this.width = tRTCMixUser.width;
            this.height = tRTCMixUser.height;
            this.zOrder = tRTCMixUser.zOrder;
            this.streamType = tRTCMixUser.streamType;
            this.pureAudio = tRTCMixUser.pureAudio;
            this.inputType = tRTCMixUser.inputType;
            this.renderMode = tRTCMixUser.renderMode;
            this.soundLevel = tRTCMixUser.soundLevel;
            this.image = tRTCMixUser.image;
        }
    }

    public static class TRTCTranscodingConfig {
        public int appId;
        public int audioBitrate;
        public int audioChannels;
        public int audioCodec;
        public int audioSampleRate;
        public int backgroundColor;
        public String backgroundImage;
        public int bizId;
        public ArrayList<TRTCMixUser> mixUsers;
        public int mode;
        public String streamId;
        public int videoBitrate;
        public int videoFramerate;
        public int videoGOP;
        public int videoHeight;
        public String videoSeiParams;
        public int videoWidth;

        public TRTCTranscodingConfig() {
            this.mode = 0;
            this.videoWidth = 0;
            this.videoHeight = 0;
            this.videoBitrate = 0;
            this.videoFramerate = 15;
            this.videoGOP = 2;
            this.backgroundColor = 0;
            this.backgroundImage = null;
            this.audioSampleRate = 48000;
            this.audioBitrate = 64;
            this.audioChannels = 1;
            this.audioCodec = 0;
            this.streamId = null;
            this.videoSeiParams = null;
        }

        public String toString() {
            return ProtectedSandApp.s("岆\u0001") + this.appId + ProtectedSandApp.s("岇\u0001") + this.bizId + ProtectedSandApp.s("岈\u0001") + this.mode + ProtectedSandApp.s("岉\u0001") + this.videoWidth + ProtectedSandApp.s("岊\u0001") + this.videoHeight + ProtectedSandApp.s("岋\u0001") + this.videoBitrate + ProtectedSandApp.s("岌\u0001") + this.videoFramerate + ProtectedSandApp.s("岍\u0001") + this.videoGOP + ProtectedSandApp.s("岎\u0001") + this.backgroundColor + ProtectedSandApp.s("岏\u0001") + this.backgroundImage + ProtectedSandApp.s("岐\u0001") + this.audioSampleRate + ProtectedSandApp.s("岑\u0001") + this.audioBitrate + ProtectedSandApp.s("岒\u0001") + this.audioChannels + ProtectedSandApp.s("岓\u0001") + this.audioCodec + ProtectedSandApp.s("岔\u0001") + this.streamId + ProtectedSandApp.s("岕\u0001") + this.videoSeiParams + ProtectedSandApp.s("岖\u0001") + this.mixUsers;
        }

        public TRTCTranscodingConfig(TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.appId = tRTCTranscodingConfig.appId;
            this.bizId = tRTCTranscodingConfig.bizId;
            this.mode = tRTCTranscodingConfig.mode;
            this.videoWidth = tRTCTranscodingConfig.videoWidth;
            this.videoHeight = tRTCTranscodingConfig.videoHeight;
            this.videoBitrate = tRTCTranscodingConfig.videoBitrate;
            this.videoFramerate = tRTCTranscodingConfig.videoFramerate;
            this.videoGOP = tRTCTranscodingConfig.videoGOP;
            this.backgroundColor = tRTCTranscodingConfig.backgroundColor;
            this.backgroundImage = tRTCTranscodingConfig.backgroundImage;
            this.audioSampleRate = tRTCTranscodingConfig.audioSampleRate;
            this.audioBitrate = tRTCTranscodingConfig.audioBitrate;
            this.audioChannels = tRTCTranscodingConfig.audioChannels;
            this.audioCodec = tRTCTranscodingConfig.audioCodec;
            this.streamId = tRTCTranscodingConfig.streamId;
            this.videoSeiParams = tRTCTranscodingConfig.videoSeiParams;
            this.mixUsers = new ArrayList<>(tRTCTranscodingConfig.mixUsers);
        }
    }
}
