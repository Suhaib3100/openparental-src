package com.tencent.beacon.event.quic;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class BeaconQuicReportResult {
    private int code;
    private byte[] resBuffer;
    private int resCode;
    private String resMsg;

    public BeaconQuicReportResult(int i4, int i5, byte[] bArr, String str) {
        this.code = i4;
        this.resCode = i5;
        this.resBuffer = bArr;
        this.resMsg = str;
    }

    public int getCode() {
        return this.code;
    }

    public byte[] getResBuffer() {
        return this.resBuffer;
    }

    public int getResCode() {
        return this.resCode;
    }

    public String getResMsg() {
        return this.resMsg;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setResBuffer(byte[] bArr) {
        this.resBuffer = bArr;
    }

    public void setResCode(int i4) {
        this.resCode = i4;
    }

    public void setResMsg(String str) {
        this.resMsg = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㎡\u0001"));
        sb.append(this.code);
        sb.append(ProtectedSandApp.s("㎢\u0001"));
        sb.append(this.resCode);
        sb.append(ProtectedSandApp.s("㎣\u0001"));
        sb.append(Arrays.toString(this.resBuffer));
        sb.append(ProtectedSandApp.s("㎤\u0001"));
        return c.a(sb, this.resMsg, ProtectedSandApp.s("㎥\u0001"));
    }
}
