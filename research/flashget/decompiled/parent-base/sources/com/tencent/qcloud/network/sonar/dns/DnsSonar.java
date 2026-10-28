package com.tencent.qcloud.network.sonar.dns;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.Sonar;
import com.tencent.qcloud.network.sonar.SonarRequest;
import com.tencent.qcloud.network.sonar.SonarResult;
import com.tencent.qcloud.network.sonar.SonarType;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.util.ArrayList;
import java.util.List;
import org.minidns.dnsmessage.b;
import org.minidns.hla.a;
import org.minidns.hla.c;
import org.minidns.record.h;
import org.minidns.record.u;

/* loaded from: classes7.dex */
public class DnsSonar implements Sonar<DnsResult> {
    @Override // com.tencent.qcloud.network.sonar.Sonar
    public SonarResult<DnsResult> start(SonarRequest sonarRequest) {
        String s4 = ProtectedSandApp.s("嫻\u0001");
        if (!sonarRequest.isNetworkAvailable()) {
            return new SonarResult<>(SonarType.DNS, new Exception(ProtectedSandApp.s("嫼\u0001")));
        }
        DnsResult dnsResult = new DnsResult();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = a.f87363f;
            aVar.q().K(false);
            c c5 = aVar.c(new b(sonarRequest.getHost(), u.c.A));
            List<u<? extends h>> list = c5.f().f87177l;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (u<? extends h> uVar : list) {
                u.c cVar = uVar.f87494b;
                if (cVar == u.c.A) {
                    arrayList.add(uVar.f87498f.toString());
                } else if (cVar == u.c.CNAME) {
                    arrayList2.add(((org.minidns.record.c) uVar.f87498f).f87491d.f87227b);
                }
            }
            dnsResult.f72683a = tc.a.a(s4, arrayList);
            dnsResult.cname = tc.a.a(s4, arrayList2);
            dnsResult.response = c5.c().f87242c.toString();
            long currentTimeMillis2 = System.currentTimeMillis();
            dnsResult.localHosts = Dns.getLocalHost();
            dnsResult.lookupTime = currentTimeMillis2 - currentTimeMillis;
            if (!arrayList.isEmpty()) {
                dnsResult.ip = (String) arrayList.get(arrayList.size() - 1);
            }
            return new SonarResult<>(SonarType.DNS, dnsResult);
        } catch (Exception e4) {
            if (SonarLog.openLog) {
                e4.printStackTrace();
            }
            return new SonarResult<>(SonarType.DNS, e4);
        }
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public void stop() {
    }
}
