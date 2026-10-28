package com.tencent.beacon.base.net.a;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.d.h;
import com.tencent.beacon.pack.SocketRequestPackage;
import java.util.Map;

/* compiled from: SocketRequestConverter.java */
/* loaded from: classes6.dex */
public final class d implements c<JceRequestEntity, SocketRequestPackage> {
    private Map<String, String> b(JceRequestEntity jceRequestEntity) {
        Map<String, String> header = jceRequestEntity.getHeader();
        String s4 = ProtectedSandApp.s("ビ\u0001");
        if (!header.containsKey(s4)) {
            String e4 = h.d().e();
            if (!TextUtils.isEmpty(e4)) {
                header.put(s4, e4);
            }
        }
        return header;
    }

    @Override // com.tencent.beacon.base.net.a.c
    public SocketRequestPackage a(JceRequestEntity jceRequestEntity) {
        return new SocketRequestPackage(b(jceRequestEntity), jceRequestEntity.getContent());
    }
}
