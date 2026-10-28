package com.tencent.beacon.base.net.call;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.pack.ResponsePackage;

/* compiled from: JceCall.java */
/* loaded from: classes6.dex */
class h implements Callback<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f71352a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f71353b;

    h(i iVar, Callback callback) {
        this.f71353b = iVar;
        this.f71352a = callback;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(byte[] bArr) throws NetException {
        JceRequestEntity jceRequestEntity;
        ResponsePackage a5;
        JceRequestEntity jceRequestEntity2;
        byte[] bArr2;
        long j4;
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㆈ\u0001"), ProtectedSandApp.s("ㆇ\u0001") + bArr.length, new Object[0]);
        jceRequestEntity = this.f71353b.f71354a;
        if (jceRequestEntity.getType() == RequestType.EVENT) {
            a5 = com.tencent.beacon.base.net.c.d().f71321f.b().a(bArr);
            if (a5 == null) {
                throw new NetException(ProtectedSandApp.s("ㆉ\u0001"));
            }
            bArr2 = null;
        } else {
            a5 = com.tencent.beacon.base.net.c.d().f71320e.b().a(bArr);
            if (a5 == null) {
                throw new NetException(ProtectedSandApp.s("ㆍ\u0001"));
            }
            ResponsePackage responsePackage = a5;
            int i4 = responsePackage.cmd;
            jceRequestEntity2 = this.f71353b.f71354a;
            if (i4 != jceRequestEntity2.getResponseCmd()) {
                throw new NetException(ProtectedSandApp.s("ㆌ\u0001"));
            }
            if (responsePackage.result != 0) {
                throw new NetException(ProtectedSandApp.s("ㆋ\u0001"));
            }
            bArr2 = responsePackage.sBuffer;
            if (bArr2 == null || bArr2.length <= 0) {
                throw new NetException(ProtectedSandApp.s("ㆊ\u0001"));
            }
        }
        j4 = this.f71353b.f71355b;
        com.tencent.beacon.base.net.b.d.a(j4, a5.serverTime, a5.srcGatewayIp);
        Callback callback = this.f71352a;
        if (callback != null) {
            callback.onResponse(bArr2);
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        Callback callback = this.f71352a;
        if (callback != null) {
            callback.onFailure(dVar);
        }
    }
}
