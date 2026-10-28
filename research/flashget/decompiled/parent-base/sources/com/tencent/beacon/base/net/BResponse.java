package com.tencent.beacon.base.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class BResponse {
    public byte[] body;
    public int code;
    public Map<String, List<String>> headers;
    public String msg;

    public BResponse(Map<String, List<String>> map, int i4, String str, byte[] bArr) {
        this.headers = map;
        this.code = i4;
        this.msg = str;
        this.body = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ジ\u0001"));
        sb.append(this.code);
        sb.append(ProtectedSandApp.s("ス\u0001"));
        return android.support.v4.media.c.a(sb, this.msg, ProtectedSandApp.s("ズ\u0001"));
    }
}
