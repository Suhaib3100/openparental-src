package com.tencent.qcloud.network.sonar.dns;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class DnsResult {

    /* renamed from: a, reason: collision with root package name */
    public String f72683a;
    public String cname;
    public String ip;
    public List<String> localHosts;
    public long lookupTime;
    public String response;

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("嫵\u0001"));
        sb.append(this.lookupTime);
        sb.append(ProtectedSandApp.s("嫶\u0001"));
        sb.append(this.ip);
        sb.append(ProtectedSandApp.s("嫷\u0001"));
        sb.append(this.f72683a);
        sb.append(ProtectedSandApp.s("嫸\u0001"));
        sb.append(this.cname);
        sb.append(ProtectedSandApp.s("嫹\u0001"));
        return c.a(sb, this.response, ProtectedSandApp.s("嫺\u0001"));
    }
}
