package com.tencent.cos.xml;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.network.sonar.NetworkSonar;
import com.tencent.qcloud.network.sonar.NetworkSonarCallback;
import com.tencent.qcloud.network.sonar.SonarRequest;
import com.tencent.qcloud.network.sonar.SonarResult;
import com.tencent.qcloud.network.sonar.SonarType;
import com.tencent.qcloud.network.sonar.dns.DnsResult;
import com.tencent.qcloud.network.sonar.ping.PingResult;
import com.tencent.qcloud.network.sonar.traceroute.TracerouteResult;
import com.tencent.qcloud.track.QCloudTrackService;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class CosTrackSonarService {
    private static final String TAG = ProtectedSandApp.s("㓊\u0001");
    private Context applicationContext;
    private final ScheduledExecutorService sonarScheduler = Executors.newScheduledThreadPool(1);

    /* renamed from: com.tencent.cos.xml.CosTrackSonarService$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
        }
    }

    public static boolean isIncludeSonar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$periodicSonar$0() {
        CosTrackService.SonarHost sonarHost = CosTrackService.getInstance().getSonarHosts().get();
        if (sonarHost == null || sonarHost.getHost() == null || (System.currentTimeMillis() - CosTrackService.getInstance().getSonarHosts().getSonarHostsAddTimestamp()) / 60000 > 15) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㓂\u0001"), sonarHost.getRegion());
        hashMap.put(ProtectedSandApp.s("㓃\u0001"), sonarHost.getBucket());
        sonar(ProtectedSandApp.s("㓄\u0001"), sonarHost.getHost(), hashMap, true);
    }

    private void sonar(final String str, String str2, Map<String, String> map, final boolean z4) {
        SonarRequest sonarRequest;
        if (CosTrackService.getInstance().isCloseReport() || !isIncludeSonar()) {
            return;
        }
        try {
            final HashMap hashMap = new HashMap(map);
            hashMap.put(ProtectedSandApp.s("㓅\u0001"), str2);
            ArrayList arrayList = new ArrayList();
            if (z4) {
                arrayList.add(SonarType.PING);
                long currentTimeMillis = System.currentTimeMillis();
                String hostAddress = InetAddress.getByName(str2).getHostAddress();
                hashMap.put(ProtectedSandApp.s("㓆\u0001"), hostAddress);
                hashMap.put(ProtectedSandApp.s("㓇\u0001"), String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                sonarRequest = new SonarRequest(str2, hostAddress);
            } else {
                arrayList.add(SonarType.DNS);
                arrayList.add(SonarType.PING);
                arrayList.add(SonarType.TRACEROUTE);
                sonarRequest = new SonarRequest(str2);
            }
            NetworkSonar.sonar(this.applicationContext, sonarRequest, arrayList, new NetworkSonarCallback() { // from class: com.tencent.cos.xml.CosTrackSonarService.1
                @Override // com.tencent.qcloud.network.sonar.NetworkSonarCallback
                public void onFail(SonarResult sonarResult) {
                }

                @Override // com.tencent.qcloud.network.sonar.NetworkSonarCallback
                public void onFinish(List<SonarResult> list) {
                    String s4;
                    String s5;
                    String s6;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    Iterator<SonarResult> it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        s4 = ProtectedSandApp.s("㒬\u0001");
                        s5 = ProtectedSandApp.s("㒭\u0001");
                        s6 = ProtectedSandApp.s("㒮\u0001");
                        if (!hasNext) {
                            break;
                        }
                        SonarResult next = it.next();
                        if (next != null && next.isSuccess() && next.getResult() != null) {
                            int i4 = AnonymousClass2.$SwitchMap$com$tencent$qcloud$network$sonar$SonarType[next.getType().ordinal()];
                            if (i4 == 1) {
                                DnsResult dnsResult = (DnsResult) next.getResult();
                                hashMap.put(s4, dnsResult.ip);
                                hashMap.put(ProtectedSandApp.s("㒽\u0001"), String.valueOf(dnsResult.lookupTime));
                                hashMap.put(ProtectedSandApp.s("㒾\u0001"), dnsResult.f72683a);
                                hashMap.put(ProtectedSandApp.s("㒿\u0001"), dnsResult.cname);
                                hashMap.put(ProtectedSandApp.s("㓀\u0001"), dnsResult.response);
                            } else if (i4 == 2) {
                                PingResult pingResult = (PingResult) next.getResult();
                                hashMap.put(s5, pingResult.ip);
                                hashMap.put(ProtectedSandApp.s("㒴\u0001"), String.valueOf(pingResult.size));
                                hashMap.put(ProtectedSandApp.s("㒵\u0001"), String.valueOf(pingResult.interval));
                                hashMap.put(ProtectedSandApp.s("㒶\u0001"), String.valueOf(pingResult.count));
                                hashMap.put(ProtectedSandApp.s("㒷\u0001"), String.valueOf(pingResult.getLoss()));
                                hashMap.put(ProtectedSandApp.s("㒸\u0001"), String.valueOf(pingResult.getResponseNum()));
                                hashMap.put(ProtectedSandApp.s("㒹\u0001"), String.valueOf(pingResult.avg));
                                hashMap.put(ProtectedSandApp.s("㒺\u0001"), String.valueOf(pingResult.max));
                                hashMap.put(ProtectedSandApp.s("㒻\u0001"), String.valueOf(pingResult.min));
                                hashMap.put(ProtectedSandApp.s("㒼\u0001"), String.valueOf(pingResult.stddev));
                            } else if (i4 == 3) {
                                TracerouteResult tracerouteResult = (TracerouteResult) next.getResult();
                                hashMap.put(s6, tracerouteResult.getTargetIp());
                                hashMap.put(ProtectedSandApp.s("㒯\u0001"), tracerouteResult.getCommandStatus().getName());
                                hashMap.put(ProtectedSandApp.s("㒰\u0001"), String.valueOf(tracerouteResult.getHopCount()));
                                hashMap.put(ProtectedSandApp.s("㒱\u0001"), String.valueOf(tracerouteResult.getTotalDelay()));
                                hashMap.put(ProtectedSandApp.s("㒲\u0001"), String.valueOf(tracerouteResult.getLossRate()));
                                hashMap.put(ProtectedSandApp.s("㒳\u0001"), tracerouteResult.getNodeResultsString());
                            }
                        }
                    }
                    if (hashMap.containsKey(s4) || hashMap.containsKey(s5) || hashMap.containsKey(s6)) {
                        QCloudTrackService.getInstance().report(str, hashMap);
                        if (z4) {
                            return;
                        }
                        COSLogger.iProbe(ProtectedSandApp.s("㓁\u0001"), hashMap.toString());
                    }
                }

                @Override // com.tencent.qcloud.network.sonar.NetworkSonarCallback
                public void onStart(SonarType sonarType) {
                }

                @Override // com.tencent.qcloud.network.sonar.NetworkSonarCallback
                public void onSuccess(SonarResult sonarResult) {
                }
            });
        } catch (Exception unused) {
        }
    }

    public void failSonar(String str, String str2, String str3, String str4) {
        if (str == null) {
            return;
        }
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("㓂\u0001"), str2, ProtectedSandApp.s("㓃\u0001"), str3);
        a5.put(ProtectedSandApp.s("㓈\u0001"), str4);
        sonar(ProtectedSandApp.s("㓉\u0001"), str, a5, false);
    }

    public void periodicSonar() {
        this.sonarScheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.tencent.cos.xml.e
            @Override // java.lang.Runnable
            public final void run() {
                CosTrackSonarService.this.lambda$periodicSonar$0();
            }
        }, 3L, 10L, TimeUnit.MINUTES);
    }

    public void setContext(Context context) {
        this.applicationContext = context;
    }
}
