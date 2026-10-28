package com.tencent.rtmp;

import androidx.compose.animation.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes7.dex */
public class TXLivePlayConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected Map<String, String> mHeaders;
    float mCacheTime = 5.0f;
    float mMaxAutoAdjustCacheTime = 5.0f;
    float mMinAutoAdjustCacheTime = 1.0f;
    int mVideoBlockThreshold = TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    boolean mAutoAdjustCacheTime = true;
    boolean mEnableAec = false;
    boolean mEnableMessage = false;
    boolean mEnableMetaData = false;
    String mFlvSessionKey = "";
    boolean mEnableNearestIP = true;
    int mRtmpChannelType = 0;

    public float getCacheTime() {
        return this.mCacheTime;
    }

    public int getConnectRetryCount() {
        return this.mConnectRetryCount;
    }

    public int getConnectRetryInterval() {
        return this.mConnectRetryInterval;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public float getMaxAutoAdjustCacheTime() {
        return this.mMaxAutoAdjustCacheTime;
    }

    public float getMinAutoAdjustCacheTime() {
        return this.mMinAutoAdjustCacheTime;
    }

    public int getRtmpChannelType() {
        return this.mRtmpChannelType;
    }

    public int getVideoBlockThreshold() {
        return this.mVideoBlockThreshold;
    }

    public boolean isAutoAdjustCacheTime() {
        return this.mAutoAdjustCacheTime;
    }

    public boolean isEnableAec() {
        return this.mEnableAec;
    }

    public boolean isEnableMessage() {
        return this.mEnableMessage;
    }

    public boolean isEnableMetaData() {
        return this.mEnableMetaData;
    }

    public boolean isEnableNearestIP() {
        return this.mEnableNearestIP;
    }

    public void setAutoAdjustCacheTime(boolean z4) {
        this.mAutoAdjustCacheTime = z4;
    }

    public void setCacheTime(float f4) {
        this.mCacheTime = f4;
    }

    public void setConnectRetryCount(int i4) {
        this.mConnectRetryCount = i4;
    }

    public void setConnectRetryInterval(int i4) {
        this.mConnectRetryInterval = i4;
    }

    @Deprecated
    public void setEnableAEC(boolean z4) {
        this.mEnableAec = z4;
    }

    public void setEnableMessage(boolean z4) {
        this.mEnableMessage = z4;
    }

    public void setEnableMetaData(boolean z4) {
        this.mEnableMetaData = z4;
    }

    @Deprecated
    public void setEnableNearestIP(boolean z4) {
        this.mEnableNearestIP = z4;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    @Deprecated
    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxAutoAdjustCacheTime(float f4) {
        this.mMaxAutoAdjustCacheTime = f4;
    }

    public void setMinAutoAdjustCacheTime(float f4) {
        this.mMinAutoAdjustCacheTime = f4;
    }

    @Deprecated
    public void setRtmpChannelType(int i4) {
        this.mRtmpChannelType = i4;
    }

    public void setVideoBlockThreshold(int i4) {
        this.mVideoBlockThreshold = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("寏\u0001"));
        sb.append(this.mCacheTime);
        sb.append(ProtectedSandApp.s("寐\u0001"));
        sb.append(this.mMaxAutoAdjustCacheTime);
        sb.append(ProtectedSandApp.s("寑\u0001"));
        sb.append(this.mMinAutoAdjustCacheTime);
        sb.append(ProtectedSandApp.s("寒\u0001"));
        sb.append(this.mAutoAdjustCacheTime);
        sb.append(ProtectedSandApp.s("寓\u0001"));
        sb.append(this.mVideoBlockThreshold);
        sb.append(ProtectedSandApp.s("寔\u0001"));
        sb.append(this.mConnectRetryCount);
        sb.append(ProtectedSandApp.s("寕\u0001"));
        sb.append(this.mConnectRetryInterval);
        sb.append(ProtectedSandApp.s("寖\u0001"));
        sb.append(this.mEnableAec);
        sb.append(ProtectedSandApp.s("寗\u0001"));
        sb.append(this.mEnableMessage);
        sb.append(ProtectedSandApp.s("寘\u0001"));
        return l.a(sb, this.mEnableMetaData, '}');
    }
}
