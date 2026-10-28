package com.tencent.beacon.event.immediate;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class Beacon2MsfTransferArgs extends BeaconTransferArgs {

    /* renamed from: d, reason: collision with root package name */
    private String f71551d;

    public Beacon2MsfTransferArgs(byte[] bArr) {
        super(bArr);
        this.f71551d = ProtectedSandApp.s("㌰\u0001");
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public String getCommand() {
        return this.f71551d;
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public void setCommand(String str) {
        this.f71551d = str;
    }
}
