package com.tencent.liteav.videoproducer.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public final class VideoEncodeParams implements Cloneable {
    public boolean annexb;
    public long baseFrameIndex;
    public long baseGopIndex;
    public int bitrate;
    public VideoEncoderDef.BitrateMode bitrateMode;
    public CodecType codecType;
    public GLConstants.ColorRange colorRange;
    public GLConstants.ColorSpace colorSpace;
    public boolean enableAutoQP;
    public boolean enableBFrame;
    public VideoEncoderDef.EncodeScene encodeScene;
    public VideoEncoderDef.EncoderComplexity encoderComplexity;
    public VideoEncoderDef.EncoderProfile encoderProfile;
    public int fps;
    public boolean fullIFrame;
    public int gop;
    public int height;
    public boolean isTranscodingMode;
    public JSONArray mediaCodecDeviceRelatedParams;
    public VideoEncoderDef.ReferenceStrategy referenceStrategy;
    public int width;

    public VideoEncodeParams() {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.f72568b;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = VideoEncoderDef.ReferenceStrategy.f72598a;
        this.codecType = CodecType.f72197b;
        this.colorSpace = GLConstants.ColorSpace.f72147a;
        this.colorRange = GLConstants.ColorRange.f72143a;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = VideoEncoderDef.EncodeScene.f72577a;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
    }

    private int checkFieldDiffCounts(Object obj, Object obj2) {
        int i4 = 0;
        for (Field field : VideoEncodeParams.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!CommonUtil.equals(field.get(obj), field.get(obj2))) {
                    i4++;
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            }
        }
        return i4;
    }

    public static VideoEncoderDef.EncodeScene createEncodeScene(int i4) {
        return VideoEncoderDef.EncodeScene.a(i4);
    }

    public static VideoEncoderDef.BitrateMode createEncoderBitrateMode(int i4) {
        return VideoEncoderDef.BitrateMode.a(i4);
    }

    public static VideoEncoderDef.EncoderComplexity createEncoderComplexity(int i4) {
        return VideoEncoderDef.EncoderComplexity.a(i4);
    }

    public static VideoEncoderDef.EncoderProfile createEncoderProfileType(int i4) {
        return VideoEncoderDef.EncoderProfile.a(i4);
    }

    public static CodecType createEncoderVideoCodec(int i4) {
        return CodecType.a(i4);
    }

    public static VideoEncoderDef.ReferenceStrategy createReferenceStrategy(int i4) {
        return VideoEncoderDef.ReferenceStrategy.a(i4);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final long getBaseFrameIndex() {
        return this.baseFrameIndex;
    }

    public final long getBaseGopIndex() {
        return this.baseGopIndex;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getCodecType() {
        return this.codecType.mValue;
    }

    public final int getEncodeScene() {
        VideoEncoderDef.EncodeScene encodeScene = this.encodeScene;
        return encodeScene == null ? VideoEncoderDef.EncodeScene.f72577a.mValue : encodeScene.mValue;
    }

    public final int getEncoderComplexity() {
        VideoEncoderDef.EncoderComplexity encoderComplexity = this.encoderComplexity;
        return encoderComplexity == null ? VideoEncoderDef.EncoderComplexity.f72584e.mValue : encoderComplexity.mValue;
    }

    public final int getEncoderProfile() {
        return this.encoderProfile.mValue;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final VideoEncoderDef.ReferenceStrategy getReferenceStrategy() {
        return this.referenceStrategy;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnableAutoQP() {
        return this.enableAutoQP;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isEnablesRps() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.f72599b;
    }

    public final boolean isEnablesSvc() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.f72600c;
    }

    public final boolean isEnablesUnlimitedGop() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.f72601d;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final boolean isTranscodingMode() {
        return this.isTranscodingMode;
    }

    public final void setAnnexb(boolean z4) {
        this.annexb = z4;
    }

    public final void setAutoQPEnabeled(boolean z4) {
        this.enableAutoQP = z4;
    }

    public final void setBFrameEnabled(boolean z4) {
        this.enableBFrame = z4;
    }

    public final void setBaseFrameIndex(long j4) {
        this.baseFrameIndex = j4;
    }

    public final void setBaseGopIndex(long j4) {
        this.baseGopIndex = j4;
    }

    public final void setBitrate(int i4) {
        this.bitrate = i4;
    }

    public final void setBitrateMode(VideoEncoderDef.BitrateMode bitrateMode) {
        this.bitrateMode = bitrateMode;
    }

    public final void setCodecType(CodecType codecType) {
        this.codecType = codecType;
    }

    public final void setColorRangeInt(int i4) {
        this.colorRange = GLConstants.ColorRange.a(i4);
    }

    public final void setColorSpaceInt(int i4) {
        this.colorSpace = GLConstants.ColorSpace.a(i4);
    }

    public final void setEncodeScene(VideoEncoderDef.EncodeScene encodeScene) {
        this.encodeScene = encodeScene;
    }

    public final void setEncoderComplexity(VideoEncoderDef.EncoderComplexity encoderComplexity) {
        this.encoderComplexity = encoderComplexity;
    }

    public final void setEncoderProfile(VideoEncoderDef.EncoderProfile encoderProfile) {
        this.encoderProfile = encoderProfile;
    }

    public final void setFps(int i4) {
        this.fps = i4;
    }

    public final void setFullIFrame(boolean z4) {
        this.fullIFrame = z4;
    }

    public final void setGop(int i4) {
        this.gop = i4;
    }

    public final void setHeight(int i4) {
        this.height = i4;
    }

    public final void setReferenceStrategy(VideoEncoderDef.ReferenceStrategy referenceStrategy) {
        this.referenceStrategy = referenceStrategy;
    }

    public final void setTranscodingModeEnabled(boolean z4) {
        this.isTranscodingMode = z4;
    }

    public final void setWidth(int i4) {
        this.width = i4;
    }

    public final String toString() {
        return ProtectedSandApp.s("圡\u0001") + this.width + ProtectedSandApp.s("圢\u0001") + this.height + ProtectedSandApp.s("圣\u0001") + this.fps + ProtectedSandApp.s("圤\u0001") + this.gop + ProtectedSandApp.s("圥\u0001") + this.bitrate + ProtectedSandApp.s("圦\u0001") + this.annexb + ProtectedSandApp.s("圧\u0001") + this.encoderProfile + ProtectedSandApp.s("在\u0001") + this.bitrateMode + ProtectedSandApp.s("圩\u0001") + this.baseFrameIndex + ProtectedSandApp.s("圪\u0001") + this.baseGopIndex + ProtectedSandApp.s("圫\u0001") + this.fullIFrame + ProtectedSandApp.s("圬\u0001") + this.enableBFrame + ProtectedSandApp.s("圭\u0001") + this.referenceStrategy + ProtectedSandApp.s("圮\u0001") + this.codecType + ProtectedSandApp.s("圯\u0001") + this.isTranscodingMode + ProtectedSandApp.s("地\u0001") + this.mediaCodecDeviceRelatedParams + ProtectedSandApp.s("圱\u0001") + this.encoderComplexity + ProtectedSandApp.s("圲\u0001") + this.encodeScene + ProtectedSandApp.s("圳\u0001") + this.enableAutoQP + ProtectedSandApp.s("圴\u0001") + this.colorSpace + ProtectedSandApp.s("圵\u0001") + this.colorRange;
    }

    public VideoEncodeParams(VideoEncodeParams videoEncodeParams) {
        this.width = 0;
        this.height = 0;
        this.fps = 20;
        this.gop = 3;
        this.bitrate = 0;
        this.annexb = true;
        this.encoderProfile = null;
        this.bitrateMode = VideoEncoderDef.BitrateMode.f72568b;
        this.baseFrameIndex = 0L;
        this.baseGopIndex = 0L;
        this.fullIFrame = false;
        this.enableBFrame = false;
        this.referenceStrategy = VideoEncoderDef.ReferenceStrategy.f72598a;
        this.codecType = CodecType.f72197b;
        this.colorSpace = GLConstants.ColorSpace.f72147a;
        this.colorRange = GLConstants.ColorRange.f72143a;
        this.isTranscodingMode = false;
        this.encoderComplexity = null;
        this.encodeScene = VideoEncoderDef.EncodeScene.f72577a;
        this.enableAutoQP = false;
        this.mediaCodecDeviceRelatedParams = null;
        if (videoEncodeParams == null) {
            return;
        }
        this.width = videoEncodeParams.width;
        this.height = videoEncodeParams.height;
        this.fps = videoEncodeParams.fps;
        this.gop = videoEncodeParams.gop;
        this.bitrate = videoEncodeParams.bitrate;
        this.annexb = videoEncodeParams.annexb;
        this.encoderProfile = videoEncodeParams.encoderProfile;
        this.bitrateMode = videoEncodeParams.bitrateMode;
        this.baseFrameIndex = videoEncodeParams.baseFrameIndex;
        this.baseGopIndex = videoEncodeParams.baseGopIndex;
        this.fullIFrame = videoEncodeParams.fullIFrame;
        this.enableBFrame = videoEncodeParams.enableBFrame;
        this.codecType = videoEncodeParams.codecType;
        this.referenceStrategy = videoEncodeParams.referenceStrategy;
        this.isTranscodingMode = videoEncodeParams.isTranscodingMode;
        this.encoderComplexity = videoEncodeParams.encoderComplexity;
        this.encodeScene = videoEncodeParams.encodeScene;
        this.enableAutoQP = videoEncodeParams.enableAutoQP;
        this.colorSpace = videoEncodeParams.colorSpace;
        this.colorRange = videoEncodeParams.colorRange;
        if (videoEncodeParams.mediaCodecDeviceRelatedParams != null) {
            try {
                this.mediaCodecDeviceRelatedParams = new JSONArray(videoEncodeParams.mediaCodecDeviceRelatedParams.toString());
            } catch (JSONException unused) {
            }
        }
    }
}
