package com.tencent.beacon.core.info;

import android.content.Context;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.i;

/* loaded from: classes6.dex */
public class BeaconPubParams {
    private static BeaconPubParams sParamsHolder;
    private String androidId;
    private String appFirstInstallTime;
    private String appLastUpdatedTime;
    private String appVersion;
    private String beaconId;
    private String boundleId;
    private String brand;
    private String cid;
    private Context context;
    private String dpi;
    private String dtImei2;
    private String dtMeid;
    private String dtMf;
    private String fingerprint;
    private String gpu;
    private String hardwareOs;
    private String imei;
    private String imsi;
    private String isRooted;
    private String language;
    private String mac;
    private String model;
    private String modelApn;
    private String networkType;
    private String osVersion;
    private String ostar;
    private String platform;
    private String productId;
    private String resolution;
    private String sdkId;
    private String sdkVersion;
    private String wifiMac;
    private String wifiSsid;

    private BeaconPubParams(Context context) {
        this.context = context;
        init(context);
    }

    public static synchronized BeaconPubParams getPubParams(Context context) {
        BeaconPubParams beaconPubParams;
        synchronized (BeaconPubParams.class) {
            try {
                if (sParamsHolder == null) {
                    synchronized (BeaconPubParams.class) {
                        try {
                            if (sParamsHolder == null) {
                                sParamsHolder = new BeaconPubParams(context);
                            }
                        } finally {
                        }
                    }
                }
                sParamsHolder.refresh();
                beaconPubParams = sParamsHolder;
            } catch (Throwable th) {
                throw th;
            }
        }
        return beaconPubParams;
    }

    private void init(Context context) {
        if (context != context.getApplicationContext()) {
            context = context.getApplicationContext();
        }
        c c5 = c.c();
        c5.a(context);
        this.appVersion = b.a();
        this.boundleId = b.b();
        this.sdkId = c5.h();
        this.sdkVersion = c5.i();
        this.beaconId = i.f();
        this.appFirstInstallTime = b.a(context);
        e l4 = e.l();
        this.appLastUpdatedTime = l4.a(context);
        this.platform = String.valueOf((int) c5.g());
        this.dtMf = l4.o();
        this.osVersion = l4.t();
        this.hardwareOs = l4.f() + ProtectedSandApp.s("㈀\u0001") + l4.e();
        this.brand = Build.BRAND;
        g e4 = g.e();
        this.model = e4.h();
        this.language = l4.n();
        this.resolution = l4.v();
        this.dpi = String.valueOf(l4.z());
        this.gpu = "";
        this.isRooted = l4.m() ? ProtectedSandApp.s("㈁\u0001") : ProtectedSandApp.s("㈂\u0001");
        this.fingerprint = l4.w();
        this.ostar = i.b();
        this.mac = e4.f();
        this.wifiMac = e4.j();
        this.wifiSsid = e4.k();
        this.cid = l4.p();
    }

    private void refresh() {
        e l4 = e.l();
        g e4 = g.e();
        this.networkType = l4.q();
        this.modelApn = l4.r();
        this.imei = e4.b();
        this.dtImei2 = e4.c();
        this.dtMeid = e4.g();
        this.imsi = e4.d();
        this.androidId = e4.a();
        this.mac = e4.f();
        this.wifiMac = e4.j();
        this.wifiSsid = e4.k();
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public String getAppFirstInstallTime() {
        return this.appFirstInstallTime;
    }

    public String getAppLastUpdatedTime() {
        return this.appLastUpdatedTime;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBeaconId() {
        return this.beaconId;
    }

    public String getBoundleId() {
        return this.boundleId;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCid() {
        return this.cid;
    }

    public String getDpi() {
        return this.dpi;
    }

    public String getDtImei2() {
        return this.dtImei2;
    }

    public String getDtMeid() {
        return this.dtMeid;
    }

    public String getDtMf() {
        return this.dtMf;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHardwareOs() {
        return this.hardwareOs;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getIsRooted() {
        return this.isRooted;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMac() {
        return this.mac;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelApn() {
        return this.modelApn;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOstar() {
        return this.ostar;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSdkId() {
        return this.sdkId;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getWifiMac() {
        return this.wifiMac;
    }

    public String getWifiSsid() {
        return this.wifiSsid;
    }

    public String toString() {
        return super.toString();
    }
}
