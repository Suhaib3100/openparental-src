package com.luck.picture.lib.entity;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class MediaExtraInfo {
    private long duration;
    private int height;
    private String orientation;
    private String videoThumbnail;
    private int width;

    public long getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getVideoThumbnail() {
        return this.videoThumbnail;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDuration(long j4) {
        this.duration = j4;
    }

    public void setHeight(int i4) {
        this.height = i4;
    }

    public void setOrientation(String str) {
        this.orientation = str;
    }

    public void setVideoThumbnail(String str) {
        this.videoThumbnail = str;
    }

    public void setWidth(int i4) {
        this.width = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᙆ\u0001"));
        sb.append(this.videoThumbnail);
        sb.append(ProtectedSandApp.s("ᙇ\u0001"));
        sb.append(this.width);
        sb.append(ProtectedSandApp.s("ᙈ\u0001"));
        sb.append(this.height);
        sb.append(ProtectedSandApp.s("ᙉ\u0001"));
        sb.append(this.duration);
        sb.append(ProtectedSandApp.s("ᙊ\u0001"));
        return c.a(sb, this.orientation, ProtectedSandApp.s("ᙋ\u0001"));
    }
}
