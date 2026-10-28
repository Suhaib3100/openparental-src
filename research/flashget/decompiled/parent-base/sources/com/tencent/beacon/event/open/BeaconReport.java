package com.tencent.beacon.event.open;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.coremedia.iso.boxes.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.a.c;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.h;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.util.BeaconLogger;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.quic.IBeaconQuicReport;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BeaconReport {

    /* renamed from: a, reason: collision with root package name */
    private static volatile BeaconReport f71625a;

    /* renamed from: b, reason: collision with root package name */
    private static String f71626b = "";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f71627c;

    /* renamed from: d, reason: collision with root package name */
    private Context f71628d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71629e;

    /* renamed from: f, reason: collision with root package name */
    private IBeaconImmediateReport f71630f;

    /* renamed from: g, reason: collision with root package name */
    private IBeaconQuicReport f71631g;

    /* renamed from: h, reason: collision with root package name */
    private EventModule f71632h;

    private BeaconReport() {
        synchronized (BeaconReport.class) {
            try {
                if (f71627c) {
                    throw new RuntimeException(ProtectedSandApp.s("㍘\u0001"));
                }
                f71627c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(BeaconConfig beaconConfig) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㍠\u0001"), Long.valueOf(beaconConfig.getRealtimePollingTime()));
        hashMap.put(ProtectedSandApp.s("㍡\u0001"), Long.valueOf(beaconConfig.getNormalPollingTIme()));
        com.tencent.beacon.a.a.b.a().b(new c(11, hashMap));
    }

    private void c(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(ProtectedSandApp.s("㍢\u0001"), Boolean.valueOf(beaconConfig.isAuditEnable()));
                hashMap.put(ProtectedSandApp.s("㍣\u0001"), Boolean.valueOf(beaconConfig.isBidEnable()));
                hashMap.put(ProtectedSandApp.s("㍤\u0001"), Integer.valueOf(beaconConfig.getMaxDBCount()));
                hashMap.put(ProtectedSandApp.s("㍥\u0001"), Boolean.valueOf(beaconConfig.isPagePathEnable()));
                hashMap.put(ProtectedSandApp.s("㍦\u0001"), Boolean.valueOf(beaconConfig.isSocketMode()));
                com.tencent.beacon.a.a.b.a().b(new c(8, hashMap));
            } catch (Throwable th) {
                j.e().a(ProtectedSandApp.s("㍩\u0001"), ProtectedSandApp.s("㍧\u0001") + com.tencent.beacon.a.c.b.b() + ProtectedSandApp.s("㍨\u0001") + th.getMessage(), th);
                com.tencent.beacon.base.util.c.a(th);
            }
        }
    }

    private void d(BeaconConfig beaconConfig) {
        g e4 = g.e();
        if (!TextUtils.isEmpty(beaconConfig.getAndroidID())) {
            e4.a(beaconConfig.getAndroidID());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei())) {
            e4.b(beaconConfig.getImei());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei2())) {
            e4.c(beaconConfig.getImei2());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImsi())) {
            e4.d(beaconConfig.getImsi());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMeid())) {
            e4.f(beaconConfig.getMeid());
        }
        if (!TextUtils.isEmpty(beaconConfig.getModel())) {
            e4.g(beaconConfig.getModel());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMac())) {
            e4.e(beaconConfig.getMac());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiMacAddress())) {
            e4.i(beaconConfig.getWifiMacAddress());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiSSID())) {
            e4.j(beaconConfig.getWifiSSID());
        }
        if (TextUtils.isEmpty(beaconConfig.getOaid())) {
            return;
        }
        e4.h(beaconConfig.getOaid());
    }

    public static BeaconReport getInstance() {
        if (f71625a == null) {
            synchronized (BeaconReport.class) {
                try {
                    if (f71625a == null) {
                        f71625a = new BeaconReport();
                    }
                } finally {
                }
            }
        }
        return f71625a;
    }

    public static String getSoPath() {
        return f71626b;
    }

    public static void setSoPath(String str) {
        f71626b = str;
    }

    public void disableReport() {
        com.tencent.beacon.d.b.b().a(false, true);
    }

    public void enableReport() {
        com.tencent.beacon.d.b.b().a(true, true);
    }

    public IBeaconQuicReport getBeaconQuicReport() {
        return this.f71631g;
    }

    public BeaconPubParams getCommonParams(Context context) {
        if (context == null) {
            return null;
        }
        return BeaconPubParams.getPubParams(context);
    }

    public IBeaconImmediateReport getImmediateReport() {
        return this.f71630f;
    }

    @Deprecated
    public String getOAID() {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍪\u0001"), new Object[0]);
        return g.e().i();
    }

    @q0
    public h getOstar(@o0 String str) {
        return i.a(str);
    }

    @q0
    public h getRtOstar(Context context, @o0 String str) {
        return i.a(context, str);
    }

    public String getSDKVersion() {
        return ProtectedSandApp.s("㍫\u0001");
    }

    public boolean isInitBeacon() {
        return this.f71629e;
    }

    public void pauseUpload(boolean z4) {
        EventModule eventModule = this.f71632h;
        if (eventModule == null || !eventModule.e()) {
            return;
        }
        this.f71632h.b(z4);
    }

    public EventResult report(BeaconEvent beaconEvent) {
        try {
            if (!com.tencent.beacon.d.b.b().m()) {
                com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㍬\u0001"), beaconEvent.getCode());
                return EventResult.a.a(102);
            }
            if (TextUtils.isEmpty(beaconEvent.getCode())) {
                return EventResult.a.a(106);
            }
            BeaconEvent build = BeaconEvent.newBuilder(beaconEvent).build();
            EventModule eventModule = this.f71632h;
            if (eventModule != null && eventModule.e()) {
                return this.f71632h.a(build);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ProtectedSandApp.s("㍭\u0001"), build);
            com.tencent.beacon.a.a.b.a().a(new c(6, hashMap));
            return new EventResult(0, -1L, ProtectedSandApp.s("㍮\u0001"));
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            j.e().a(ProtectedSandApp.s("㍯\u0001"), ProtectedSandApp.s("㍰\u0001"), th);
            return new EventResult(EventResult.ERROR_CODE_OTHER, -1L, ProtectedSandApp.s("㍱\u0001"));
        }
    }

    @Deprecated
    public void resumeReport() {
        resumeUpload();
    }

    public void resumeUpload() {
        EventModule eventModule = this.f71632h;
        if (eventModule == null || !eventModule.e()) {
            return;
        }
        this.f71632h.f();
    }

    @Deprecated
    public void setAdditionalParams(@o0 Map<String, String> map) {
        setAdditionalParams(com.tencent.beacon.a.c.c.c().e(), map);
    }

    public void setAndroidID(String str) {
        g.e().a(str);
    }

    public void setAppVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.beacon.a.c.b.f71069a = str;
    }

    public void setBeaconQuicReport(IBeaconQuicReport iBeaconQuicReport) {
        this.f71631g = iBeaconQuicReport;
    }

    @Deprecated
    public boolean setChannelID(String str) {
        return setChannelID(com.tencent.beacon.a.c.c.c().e(), str);
    }

    @Deprecated
    public void setCollectAndroidID(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍴\u0001"), new Object[0]);
    }

    @Deprecated
    public void setCollectImei(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍵\u0001"), new Object[0]);
    }

    @Deprecated
    public void setCollectMac(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍶\u0001"), new Object[0]);
    }

    @Deprecated
    public void setCollectModel(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍷\u0001"), new Object[0]);
    }

    @Deprecated
    public void setCollectOAID(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍸\u0001"), new Object[0]);
    }

    @Deprecated
    public void setCollectPersonalInfo(boolean z4) {
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍹\u0001"), new Object[0]);
    }

    public void setCollectProcessInfo(boolean z4) {
        com.tencent.beacon.d.b.b().e(z4);
    }

    public void setImei(String str) {
        g.e().b(str);
    }

    public void setImei2(String str) {
        g.e().c(str);
    }

    public void setImmediateReport(IBeaconImmediateReport iBeaconImmediateReport) {
        this.f71630f = iBeaconImmediateReport;
    }

    public void setImsi(String str) {
        g.e().d(str);
    }

    public void setLogAble(boolean z4) {
        com.tencent.beacon.base.util.c.a(z4);
    }

    public void setLogger(BeaconLogger beaconLogger) {
        com.tencent.beacon.base.util.c.a(beaconLogger);
    }

    public void setMac(String str) {
        g.e().e(str);
    }

    public void setMeid(String str) {
        g.e().f(str);
    }

    public void setModel(String str) {
        g.e().g(str);
    }

    public void setOAID(String str) {
        g.e().h(str);
    }

    @Deprecated
    public void setOaid(String str) {
        g.e().h(str);
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍺\u0001"), new Object[0]);
    }

    public void setOmgID(String str) {
        com.tencent.beacon.a.c.c.c().d(str);
    }

    public void setOpenID(String str, String str2) {
        com.tencent.beacon.a.a.b.a().b(new c(5, d.a(ProtectedSandApp.s("㍳\u0001"), str, ProtectedSandApp.s("㍻\u0001"), str2)));
    }

    public void setOstar(String str, String str2) {
        i.a(str, str2);
    }

    public void setOstarSdkVersion(String str) {
        i.b(str);
    }

    public void setQQ(String str) {
        com.tencent.beacon.a.c.b.a(str);
    }

    public void setStrictMode(boolean z4) {
        com.tencent.beacon.base.util.h.f71372a.set(z4);
    }

    @Deprecated
    public void setUserID(String str) {
        setUserID(com.tencent.beacon.a.c.c.c().e(), str);
    }

    public void setUserSampleEvents(String str, Map<String, Integer> map) {
        com.tencent.beacon.d.b.b().a(str, map);
    }

    public void setWifiMacAddress(String str) {
        g.e().i(str);
    }

    public void setWifiSSID(String str) {
        g.e().j(str);
    }

    public synchronized void start(@o0 Context context, @o0 String str, @q0 BeaconConfig beaconConfig) throws BeaconInitException {
        if (this.f71629e) {
            a(context, str, String.format(ProtectedSandApp.s("㍽\u0001"), com.tencent.beacon.a.c.c.c().e(), str), ProtectedSandApp.s("㍾\u0001"));
            return;
        }
        com.tencent.beacon.base.util.h.a(ProtectedSandApp.s("㍿\u0001"), context);
        boolean z4 = false;
        if (context == null) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㎀\u0001"), new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f71628d = applicationContext;
        com.tencent.beacon.base.util.h.a(ProtectedSandApp.s("㎁\u0001"), applicationContext);
        if (this.f71628d == null) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㎂\u0001"), new Object[0]);
            return;
        }
        com.tencent.beacon.a.c.c.c().a(this.f71628d);
        com.tencent.beacon.base.util.h.a(ProtectedSandApp.s("㎃\u0001"), str);
        if (TextUtils.isEmpty(str)) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㎄\u0001"), new Object[0]);
            return;
        }
        com.tencent.beacon.a.c.c.c().c(a(context, str));
        com.tencent.beacon.base.util.c.a();
        getSDKVersion();
        j.e().a(beaconConfig != null && beaconConfig.isForceEnableAtta());
        com.tencent.beacon.a.b.i e4 = com.tencent.beacon.a.b.i.e();
        if (beaconConfig != null && beaconConfig.isForceEnableAtta()) {
            z4 = true;
        }
        e4.a(z4);
        ((Application) this.f71628d).registerActivityLifecycleCallbacks(new com.tencent.beacon.b.a());
        c(beaconConfig);
        if (beaconConfig != null) {
            d(beaconConfig);
            i.a(beaconConfig.isNeedInitOstar());
            com.tencent.beacon.d.b.b().d(beaconConfig.needReportRqdEvent());
            com.tencent.beacon.d.b.b().b(beaconConfig.needAttaReport());
            com.tencent.beacon.d.b.b().a(beaconConfig.isHighPerformanceMode());
            com.tencent.beacon.d.b.b().c(beaconConfig.isNeedLifeCycleListener());
            com.tencent.beacon.d.b.b().b(beaconConfig.getLongConnectionType());
            com.tencent.beacon.d.b.b().f(beaconConfig.getRetryAfterQuicFailImme());
        }
        com.tencent.beacon.a.b.b.a().a(new b(this, beaconConfig));
        this.f71629e = true;
        if (beaconConfig != null) {
            com.tencent.beacon.base.util.c.a(str, context.getPackageName());
        }
    }

    @Deprecated
    public void stopReport(boolean z4) {
        pauseUpload(z4);
    }

    public void getOstar(@o0 String str, @o0 Context context, f fVar) {
        i.a(str, context, fVar);
    }

    public void setAdditionalParams(String str, @o0 Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㍲\u0001"), new HashMap(map));
        hashMap.put(ProtectedSandApp.s("㍳\u0001"), str);
        com.tencent.beacon.a.a.b.a().b(new c(3, hashMap));
    }

    public boolean setChannelID(@o0 String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.beacon.a.c.c.c().a(str, str2);
        return true;
    }

    public void setUserID(String str, String str2) {
        com.tencent.beacon.a.a.b.a().b(new c(4, d.a(ProtectedSandApp.s("㍳\u0001"), str, ProtectedSandApp.s("㍼\u0001"), str2)));
    }

    private String a(Context context, String str) throws BeaconInitException {
        String str2;
        if (!BeaconReport.class.getPackage().getName().startsWith(ProtectedSandApp.s("㍙\u0001"))) {
            return str;
        }
        try {
            str2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(ProtectedSandApp.s("㍚\u0001"));
        } catch (Exception unused) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㍛\u0001"), new Object[0]);
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals(str2)) {
            a(context, str, ProtectedSandApp.s("㍜\u0001"), ProtectedSandApp.s("㍝\u0001"));
        }
        return str2;
    }

    private void a(Context context, String str, String str2, String str3) throws BeaconInitException {
        if (!com.tencent.beacon.base.util.c.a()) {
            j.e().a(context, str, str3, str2);
            return;
        }
        throw new BeaconInitException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㍟\u0001"), beaconConfig.toString(), new Object[0]);
            com.tencent.beacon.base.net.b.b.a(beaconConfig.getConfigHost(), beaconConfig.getUploadHost());
            b(beaconConfig);
            com.tencent.beacon.a.c.c.c().a(beaconConfig.isEnableQmsp());
            com.tencent.beacon.d.b.b().d(beaconConfig.getRealtimeUploadNum());
            com.tencent.beacon.d.b.b().c(beaconConfig.getNormalUploadNum());
            com.tencent.beacon.d.b.b().a(beaconConfig.getCompressType());
            com.tencent.beacon.d.b.b().e(beaconConfig.getRsaPubKeyType());
        }
        com.tencent.beacon.base.net.c.d().a(this.f71628d, beaconConfig == null ? null : beaconConfig.getHttpAdapter());
        com.tencent.beacon.a.d.a.a().a(this.f71628d);
        com.tencent.beacon.a.c.b.f();
        e.l().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ModuleName[] values = ModuleName.values();
        for (ModuleName moduleName : values) {
            try {
                BeaconModule.f71636a.put(moduleName, com.tencent.beacon.event.c.d.f(moduleName.getClassName()));
            } catch (Exception e4) {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㍞\u0001") + e4.getMessage(), new Object[0]);
                com.tencent.beacon.base.util.c.a(e4);
            }
        }
        for (ModuleName moduleName2 : values) {
            BeaconModule beaconModule = BeaconModule.f71636a.get(moduleName2);
            if (beaconModule != null) {
                beaconModule.a(this.f71628d);
            }
        }
        this.f71632h = (EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT);
    }
}
