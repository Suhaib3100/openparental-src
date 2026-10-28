package com.tencent.rtmp;

import android.graphics.Bitmap;
import androidx.appcompat.app.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class TXLivePushConfig implements Serializable {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    public int mAudioBitrate;
    public String mAudioPreProcessFuncName;
    public String mAudioPreProcessLibrary;
    public HashMap<String, String> mMetaData;
    public String mVideoPreProcessFuncName;
    public String mVideoPreProcessLibrary;
    public Bitmap mWatermark;
    public int mCustomModeType = 0;
    public int mAudioSample = 48000;
    public int mAudioChannels = 1;
    public int mVideoFPS = 20;
    public TXVideoResolution mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
    public int mVideoBitrate = 1200;
    public int mMaxVideoBitrate = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    public int mMinVideoBitrate = DEFAULT_MIN_VIDEO_BITRATE;
    public int mBeautyLevel = 0;
    public int mWhiteningLevel = 0;
    public int mRuddyLevel = 0;
    public int mEyeScaleLevel = 0;
    public int mFaceSlimLevel = 0;
    public int mConnectRetryCount = 3;
    public int mConnectRetryInterval = 3;
    public int mWatermarkX = 0;
    public int mWatermarkY = 0;
    public float mWatermarkXF = 0.0f;
    public float mWatermarkYF = 0.0f;
    public float mWatermarkWidth = -1.0f;
    public int mVideoEncodeGop = 3;
    public boolean mVideoEncoderXMirror = false;
    public boolean mEnableHighResolutionCapture = false;
    public boolean mEnableVideoHardEncoderMainProfile = true;
    public boolean mFrontCamera = true;
    public boolean mAutoAdjustBitrate = false;
    public int mAutoAdjustStrategy = 0;
    public int mHardwareAccel = 2;
    public boolean mTouchFocus = true;
    public boolean mEnableZoom = false;
    public int mHomeOrientation = 1;
    public Bitmap mPauseImg = null;
    public int mPauseTime = 300;
    public int mPauseFps = 5;
    public int mPauseFlag = 1;
    public boolean mEnableAec = false;
    public boolean mEnableAgc = false;
    public boolean mEnableAns = false;
    public boolean mEnableAudioPreview = false;
    public boolean mEnableScreenCaptureAutoRotate = false;
    public boolean mEnablePureAudioPush = false;
    public boolean mEnableNearestIP = true;
    public int mVolumeType = 0;
    public int mLocalVideoMirrorType = 0;
    public int mRtmpChannelType = 0;

    @Deprecated
    public void enableAEC(boolean z4) {
        this.mEnableAec = z4;
    }

    @Deprecated
    public void enableAGC(boolean z4) {
        this.mEnableAgc = z4;
    }

    public void enableANS(boolean z4) {
        this.mEnableAns = z4;
    }

    public void enableAudioEarMonitoring(boolean z4) {
        this.mEnableAudioPreview = z4;
    }

    @Deprecated
    public void enableHighResolutionCaptureMode(boolean z4) {
        this.mEnableHighResolutionCapture = z4;
    }

    @Deprecated
    public void enableNearestIP(boolean z4) {
        this.mEnableNearestIP = z4;
    }

    public void enablePureAudioPush(boolean z4) {
        this.mEnablePureAudioPush = z4;
    }

    public void enableScreenCaptureAutoRotate(boolean z4) {
        this.mEnableScreenCaptureAutoRotate = z4;
    }

    public void enableVideoHardEncoderMainProfile(boolean z4) {
        this.mEnableVideoHardEncoderMainProfile = z4;
    }

    public void setAudioChannels(int i4) {
        this.mAudioChannels = i4;
    }

    public void setAudioSampleRate(int i4) {
        this.mAudioSample = i4;
    }

    public void setAutoAdjustBitrate(boolean z4) {
        this.mAutoAdjustBitrate = z4;
    }

    public void setAutoAdjustStrategy(int i4) {
        this.mAutoAdjustStrategy = i4;
    }

    @Deprecated
    public void setBeautyFilter(int i4, int i5, int i6) {
        this.mBeautyLevel = i4;
        this.mWhiteningLevel = i5;
        this.mRuddyLevel = i6;
    }

    public void setConnectRetryCount(int i4) {
        this.mConnectRetryCount = i4;
    }

    public void setConnectRetryInterval(int i4) {
        this.mConnectRetryInterval = i4;
    }

    public void setCustomModeType(int i4) {
        this.mCustomModeType = i4;
    }

    public void setEnableZoom(boolean z4) {
        this.mEnableZoom = z4;
    }

    @Deprecated
    public void setEyeScaleLevel(int i4) {
        this.mEyeScaleLevel = i4;
    }

    @Deprecated
    public void setFaceSlimLevel(int i4) {
        this.mFaceSlimLevel = i4;
    }

    @Deprecated
    public void setFrontCamera(boolean z4) {
        this.mFrontCamera = z4;
    }

    public void setHardwareAcceleration(int i4) {
        if (i4 < 0) {
            i4 = 2;
        }
        this.mHardwareAccel = i4 <= 2 ? i4 : 2;
    }

    public void setHomeOrientation(int i4) {
        this.mHomeOrientation = i4;
    }

    public void setLocalVideoMirrorType(int i4) {
        this.mLocalVideoMirrorType = i4;
    }

    public void setMaxVideoBitrate(int i4) {
        this.mMaxVideoBitrate = i4;
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaData = hashMap;
    }

    public void setMinVideoBitrate(int i4) {
        this.mMinVideoBitrate = i4;
    }

    public void setPauseFlag(int i4) {
        this.mPauseFlag = i4;
    }

    public void setPauseImg(Bitmap bitmap) {
        this.mPauseImg = bitmap;
    }

    @Deprecated
    public void setRtmpChannelType(int i4) {
        this.mRtmpChannelType = i4;
    }

    public void setTouchFocus(boolean z4) {
        this.mTouchFocus = z4;
    }

    public void setVideoBitrate(int i4) {
        this.mVideoBitrate = i4;
    }

    public void setVideoEncodeGop(int i4) {
        this.mVideoEncodeGop = i4;
    }

    public void setVideoEncoderXMirror(boolean z4) {
        this.mVideoEncoderXMirror = z4;
    }

    public void setVideoFPS(int i4) {
        this.mVideoFPS = i4;
    }

    public void setVideoResolution(int i4) {
        if (i4 == 30) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1080_1920;
            return;
        }
        if (i4 == 31) {
            this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1920_1080;
            return;
        }
        switch (i4) {
            case 0:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_640;
                break;
            case 1:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_540_960;
                break;
            case 2:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_720_1280;
                break;
            case 3:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_360;
                break;
            case 4:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_960_540;
                break;
            case 5:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_1280_720;
                break;
            case 6:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_480;
                break;
            case 7:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_180_320;
                break;
            case 8:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_480;
                break;
            case 9:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_180;
                break;
            case 10:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_270;
                break;
            case 11:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_240_320;
                break;
            case 12:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_360_480;
                break;
            case 13:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_640;
                break;
            case 14:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_320_240;
                break;
            case 15:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_360;
                break;
            case 16:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_640_480;
                break;
            case 17:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_480_480;
                break;
            case 18:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_270_270;
                break;
            case 19:
                this.mVideoResolution = TXVideoResolution.RESOLUTION_TYPE_160_160;
                break;
        }
    }

    public void setVolumeType(int i4) {
        this.mVolumeType = i4;
    }

    public void setWatermark(Bitmap bitmap, int i4, int i5) {
        this.mWatermark = bitmap;
        this.mWatermarkX = i4;
        this.mWatermarkY = i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("寚\u0001"));
        sb.append(this.mVideoResolution);
        sb.append(ProtectedSandApp.s("寛\u0001"));
        sb.append(this.mVideoFPS);
        sb.append(ProtectedSandApp.s("寜\u0001"));
        sb.append(this.mVideoEncodeGop);
        sb.append(ProtectedSandApp.s("寝\u0001"));
        sb.append(this.mVideoBitrate);
        sb.append(ProtectedSandApp.s("寞\u0001"));
        sb.append(this.mMaxVideoBitrate);
        sb.append(ProtectedSandApp.s("察\u0001"));
        sb.append(this.mMinVideoBitrate);
        sb.append(ProtectedSandApp.s("寠\u0001"));
        sb.append(this.mEnableHighResolutionCapture);
        sb.append(ProtectedSandApp.s("寡\u0001"));
        sb.append(this.mHardwareAccel);
        sb.append(ProtectedSandApp.s("寢\u0001"));
        sb.append(this.mHomeOrientation);
        sb.append(ProtectedSandApp.s("寣\u0001"));
        sb.append(this.mVolumeType);
        sb.append(ProtectedSandApp.s("寤\u0001"));
        sb.append(this.mEnableAudioPreview);
        sb.append(ProtectedSandApp.s("寥\u0001"));
        sb.append(this.mEnableAgc);
        sb.append(ProtectedSandApp.s("實\u0001"));
        sb.append(this.mEnableAns);
        sb.append(ProtectedSandApp.s("寧\u0001"));
        sb.append(this.mEnableAec);
        sb.append(ProtectedSandApp.s("寨\u0001"));
        sb.append(this.mAudioSample);
        sb.append(ProtectedSandApp.s("審\u0001"));
        return h.a(sb, this.mEnablePureAudioPush, ProtectedSandApp.s("寪\u0001"));
    }

    @Deprecated
    public void setPauseImg(int i4, int i5) {
        this.mPauseTime = i4;
        this.mPauseFps = i5;
    }

    public void setWatermark(Bitmap bitmap, float f4, float f5, float f6) {
        this.mWatermark = bitmap;
        this.mWatermarkXF = f4;
        this.mWatermarkYF = f5;
        this.mWatermarkWidth = f6;
    }
}
