package com.tencent.liteav.videoconsumer.decoder;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.h;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class SpsInfo {
    public int width = 0;
    public int height = 0;
    public Integer videoFormat = null;
    public Integer videoFullRangeFlag = null;
    public Integer colourPrimaries = null;
    public Integer transferCharacteristics = null;
    public Integer matrixCoefficients = null;
    public Integer maxNumRefFrames = null;

    public static native SpsInfo nativeDecodeSps(boolean z4, ByteBuffer byteBuffer);

    public static native byte[] nativeGetSpsPps(byte[] bArr, boolean z4, boolean z5);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpsInfo)) {
            return false;
        }
        SpsInfo spsInfo = (SpsInfo) obj;
        return spsInfo.width == this.width && spsInfo.height == this.height && h.a(this.videoFormat, spsInfo.videoFormat) && h.a(this.videoFullRangeFlag, spsInfo.videoFullRangeFlag) && h.a(this.colourPrimaries, spsInfo.colourPrimaries) && h.a(this.transferCharacteristics, spsInfo.transferCharacteristics) && h.a(this.matrixCoefficients, spsInfo.matrixCoefficients) && h.a(this.maxNumRefFrames, spsInfo.maxNumRefFrames);
    }

    public void set(SpsInfo spsInfo) {
        if (spsInfo == null) {
            spsInfo = new SpsInfo();
        }
        this.width = spsInfo.width;
        this.height = spsInfo.height;
        this.videoFormat = spsInfo.videoFormat;
        this.videoFullRangeFlag = spsInfo.videoFullRangeFlag;
        this.colourPrimaries = spsInfo.colourPrimaries;
        this.transferCharacteristics = spsInfo.transferCharacteristics;
        this.matrixCoefficients = spsInfo.matrixCoefficients;
        this.maxNumRefFrames = spsInfo.maxNumRefFrames;
    }

    public void setColourPrimaries(int i4) {
        this.colourPrimaries = Integer.valueOf(i4);
    }

    public void setHeight(int i4) {
        this.height = i4;
    }

    public void setMatrixCoefficients(int i4) {
        this.matrixCoefficients = Integer.valueOf(i4);
    }

    public void setMaxNumRefFrames(int i4) {
        this.maxNumRefFrames = Integer.valueOf(i4);
    }

    public void setTransferCharacteristics(int i4) {
        this.transferCharacteristics = Integer.valueOf(i4);
    }

    public void setVideoFormat(int i4) {
        this.videoFormat = Integer.valueOf(i4);
    }

    public void setVideoFullRangeFlag(int i4) {
        this.videoFullRangeFlag = Integer.valueOf(i4);
    }

    public void setWidth(int i4) {
        this.width = i4;
    }

    public String toString() {
        return d.a(ProtectedSandApp.s("嘃\u0001"), ProtectedSandApp.s("嗻\u0001") + this.width + ProtectedSandApp.s("嗼\u0001") + this.height + ProtectedSandApp.s("嗽\u0001") + this.videoFormat + ProtectedSandApp.s("嗾\u0001") + this.videoFullRangeFlag + ProtectedSandApp.s("嗿\u0001") + this.colourPrimaries + ProtectedSandApp.s("嘀\u0001") + this.transferCharacteristics + ProtectedSandApp.s("嘁\u0001") + this.matrixCoefficients + ProtectedSandApp.s("嘂\u0001") + this.maxNumRefFrames, ProtectedSandApp.s("嘄\u0001"));
    }
}
