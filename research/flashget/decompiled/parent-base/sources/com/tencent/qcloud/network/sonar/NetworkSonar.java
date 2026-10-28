package com.tencent.qcloud.network.sonar;

import android.content.Context;
import com.tencent.qcloud.network.sonar.dns.AndroidDnsServerLookup;
import com.tencent.qcloud.network.sonar.dns.DnsResult;
import com.tencent.qcloud.network.sonar.dns.DnsSonar;
import com.tencent.qcloud.network.sonar.http.HttpResult;
import com.tencent.qcloud.network.sonar.http.HttpSonar;
import com.tencent.qcloud.network.sonar.ping.PingResult;
import com.tencent.qcloud.network.sonar.ping.PingSonar;
import com.tencent.qcloud.network.sonar.traceroute.TracerouteResult;
import com.tencent.qcloud.network.sonar.traceroute.TracerouteSonar;
import com.tencent.qcloud.network.sonar.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import org.minidns.c;
import org.minidns.dnsserverlookup.b;
import org.minidns.dnsserverlookup.e;

/* loaded from: classes7.dex */
public class NetworkSonar {
    private static Context appContext;

    /* renamed from: com.tencent.qcloud.network.sonar.NetworkSonar$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$qcloud$network$sonar$SonarType;

        static {
            int[] iArr = new int[SonarType.values().length];
            $SwitchMap$com$tencent$qcloud$network$sonar$SonarType = iArr;
            try {
                iArr[SonarType.DNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$network$sonar$SonarType[SonarType.PING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$network$sonar$SonarType[SonarType.TRACEROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$qcloud$network$sonar$SonarType[SonarType.HTTP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static void sonar(Context context, SonarRequest sonarRequest, List<SonarType> list, NetworkSonarCallback networkSonarCallback) {
        SonarResult sonarDns;
        synchronized (NetworkSonar.class) {
            try {
                if (appContext == null) {
                    appContext = context;
                    c.X(b.f87300b);
                    c.X(org.minidns.dnsserverlookup.c.f87303b);
                    c.X(e.f87305b);
                    c.J(new AndroidDnsServerLookup(context));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sonarRequest.setNetworkAvailable(Utils.isNetworkAvailable(context));
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            SonarType sonarType = list.get(i4);
            networkSonarCallback.onStart(sonarType);
            int i5 = AnonymousClass1.$SwitchMap$com$tencent$qcloud$network$sonar$SonarType[sonarType.ordinal()];
            if (i5 != 1) {
                sonarDns = i5 != 2 ? i5 != 3 ? i5 != 4 ? null : sonarHttp(sonarRequest) : sonarTraceroute(sonarRequest) : sonarPing(sonarRequest);
            } else {
                sonarDns = sonarDns(sonarRequest);
                if (sonarDns.isSuccess()) {
                    sonarRequest.setIp(((DnsResult) sonarDns.getResult()).ip);
                }
            }
            if (sonarDns.isSuccess()) {
                networkSonarCallback.onSuccess(sonarDns);
            } else {
                networkSonarCallback.onFail(sonarDns);
            }
            arrayList.add(sonarDns);
            if (i4 == list.size() - 1) {
                networkSonarCallback.onFinish(arrayList);
            }
        }
    }

    public static SonarResult<DnsResult> sonarDns(SonarRequest sonarRequest) {
        return new DnsSonar().start(sonarRequest);
    }

    public static SonarResult<HttpResult> sonarHttp(SonarRequest sonarRequest) {
        return sonarHttp(sonarRequest, false);
    }

    public static SonarResult<PingResult> sonarPing(SonarRequest sonarRequest) {
        return new PingSonar().start(sonarRequest);
    }

    public static SonarResult<TracerouteResult> sonarTraceroute(SonarRequest sonarRequest) {
        return new TracerouteSonar().start(sonarRequest);
    }

    public static SonarResult<HttpResult> sonarHttp(SonarRequest sonarRequest, boolean z4) {
        return new HttpSonar(z4).start(sonarRequest);
    }
}
