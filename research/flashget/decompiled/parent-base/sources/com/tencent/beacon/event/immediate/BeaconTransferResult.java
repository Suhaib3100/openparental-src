package com.tencent.beacon.event.immediate;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class BeaconTransferResult {

    /* renamed from: a, reason: collision with root package name */
    private int f71559a;

    /* renamed from: b, reason: collision with root package name */
    private int f71560b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f71561c;

    /* renamed from: d, reason: collision with root package name */
    private String f71562d;

    public byte[] getBizBuffer() {
        return this.f71561c;
    }

    public int getBizCode() {
        return this.f71560b;
    }

    public String getBizMsg() {
        return this.f71562d;
    }

    public int getCode() {
        return this.f71559a;
    }

    public void setBizBuffer(byte[] bArr) {
        this.f71561c = bArr;
    }

    public void setBizCode(int i4) {
        this.f71560b = i4;
    }

    public void setBizMsg(String str) {
        this.f71562d = str;
    }

    public void setCode(int i4) {
        this.f71559a = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㌷\u0001"));
        sb.append(this.f71559a);
        sb.append(ProtectedSandApp.s("㌸\u0001"));
        sb.append(this.f71560b);
        sb.append(ProtectedSandApp.s("㌹\u0001"));
        return c.a(sb, this.f71562d, ProtectedSandApp.s("㌺\u0001"));
    }
}
