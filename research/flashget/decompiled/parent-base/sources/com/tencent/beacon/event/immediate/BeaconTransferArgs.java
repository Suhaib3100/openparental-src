package com.tencent.beacon.event.immediate;

/* loaded from: classes6.dex */
public abstract class BeaconTransferArgs {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f71556a;

    /* renamed from: b, reason: collision with root package name */
    private String f71557b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f71558c = "";

    public BeaconTransferArgs(byte[] bArr) {
        this.f71556a = bArr;
    }

    public String getAppkey() {
        return this.f71557b;
    }

    public abstract String getCommand();

    public byte[] getData() {
        return this.f71556a;
    }

    public String getEventCode() {
        return this.f71558c;
    }

    public void setAppkey(String str) {
        this.f71557b = str;
    }

    public abstract void setCommand(String str);

    public void setData(byte[] bArr) {
        this.f71556a = bArr;
    }

    public void setEventCode(String str) {
        this.f71558c = str;
    }
}
