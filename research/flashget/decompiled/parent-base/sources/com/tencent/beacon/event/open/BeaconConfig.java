package com.tencent.beacon.event.open;

import androidx.appcompat.app.h;
import androidx.view.C1434k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.base.util.c;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public class BeaconConfig {
    private final boolean A;
    private final boolean B;
    private final int C;
    private final int D;
    private final boolean E;
    private final int F;
    private final boolean G;

    /* renamed from: a, reason: collision with root package name */
    private final int f71563a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71564b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f71565c;

    /* renamed from: d, reason: collision with root package name */
    private final long f71566d;

    /* renamed from: e, reason: collision with root package name */
    private final long f71567e;

    /* renamed from: f, reason: collision with root package name */
    private final int f71568f;

    /* renamed from: g, reason: collision with root package name */
    private final int f71569g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f71570h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractNetAdapter f71571i;

    /* renamed from: j, reason: collision with root package name */
    private final String f71572j;

    /* renamed from: k, reason: collision with root package name */
    private final String f71573k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f71574l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f71575m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f71576n;

    /* renamed from: o, reason: collision with root package name */
    private final String f71577o;

    /* renamed from: p, reason: collision with root package name */
    private final String f71578p;

    /* renamed from: q, reason: collision with root package name */
    private final String f71579q;

    /* renamed from: r, reason: collision with root package name */
    private final String f71580r;

    /* renamed from: s, reason: collision with root package name */
    private final String f71581s;

    /* renamed from: t, reason: collision with root package name */
    private final String f71582t;

    /* renamed from: u, reason: collision with root package name */
    private final String f71583u;

    /* renamed from: v, reason: collision with root package name */
    private final String f71584v;

    /* renamed from: w, reason: collision with root package name */
    private final String f71585w;

    /* renamed from: x, reason: collision with root package name */
    private final String f71586x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f71587y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f71588z;

    public static final class Builder {

        /* renamed from: d, reason: collision with root package name */
        private ScheduledExecutorService f71592d;

        /* renamed from: f, reason: collision with root package name */
        private AbstractNetAdapter f71594f;

        /* renamed from: k, reason: collision with root package name */
        private String f71599k;

        /* renamed from: l, reason: collision with root package name */
        private String f71600l;

        /* renamed from: a, reason: collision with root package name */
        private int f71589a = 10000;

        /* renamed from: b, reason: collision with root package name */
        private boolean f71590b = true;

        /* renamed from: c, reason: collision with root package name */
        private boolean f71591c = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f71593e = true;

        /* renamed from: g, reason: collision with root package name */
        private long f71595g = 2000;

        /* renamed from: h, reason: collision with root package name */
        private long f71596h = C1434k.f30360a;

        /* renamed from: i, reason: collision with root package name */
        private int f71597i = 48;

        /* renamed from: j, reason: collision with root package name */
        private int f71598j = 48;

        /* renamed from: m, reason: collision with root package name */
        private boolean f71601m = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f71602n = true;

        /* renamed from: o, reason: collision with root package name */
        private boolean f71603o = true;

        /* renamed from: p, reason: collision with root package name */
        private String f71604p = "";

        /* renamed from: q, reason: collision with root package name */
        private String f71605q = "";

        /* renamed from: r, reason: collision with root package name */
        private String f71606r = "";

        /* renamed from: s, reason: collision with root package name */
        private String f71607s = "";

        /* renamed from: t, reason: collision with root package name */
        private String f71608t = "";

        /* renamed from: u, reason: collision with root package name */
        private String f71609u = "";

        /* renamed from: v, reason: collision with root package name */
        private String f71610v = "";

        /* renamed from: w, reason: collision with root package name */
        private String f71611w = "";

        /* renamed from: x, reason: collision with root package name */
        private String f71612x = "";

        /* renamed from: y, reason: collision with root package name */
        private String f71613y = "";

        /* renamed from: z, reason: collision with root package name */
        private boolean f71614z = true;
        private boolean A = true;
        private boolean B = true;
        private boolean C = false;
        private int D = 2;
        private int E = 0;
        private boolean F = true;
        private int G = -1;
        private boolean H = true;

        public Builder auditEnable(boolean z4) {
            this.f71590b = z4;
            return this;
        }

        public Builder bidEnable(boolean z4) {
            this.f71591c = z4;
            return this;
        }

        public BeaconConfig build() {
            ScheduledExecutorService scheduledExecutorService = this.f71592d;
            if (scheduledExecutorService != null) {
                com.tencent.beacon.a.b.b.a(scheduledExecutorService);
            }
            return new BeaconConfig(this);
        }

        @Deprecated
        public Builder eventReportEnable(boolean z4) {
            c.b(ProtectedSandApp.s("㌻\u0001"), new Object[0]);
            return this;
        }

        public Builder maxDBCount(int i4) {
            this.f71589a = i4;
            return this;
        }

        public Builder pagePathEnable(boolean z4) {
            this.f71603o = z4;
            return this;
        }

        public Builder qmspEnable(boolean z4) {
            this.f71602n = z4;
            return this;
        }

        public Builder setAndroidID(String str) {
            this.f71604p = str;
            return this;
        }

        public Builder setCompressType(int i4) {
            this.D = i4;
            return this;
        }

        public Builder setConfigHost(String str) {
            this.f71600l = str;
            return this;
        }

        public Builder setExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.f71592d = scheduledExecutorService;
            return this;
        }

        public Builder setForceEnableAtta(boolean z4) {
            this.f71601m = z4;
            return this;
        }

        public Builder setHighPerformanceMode(boolean z4) {
            this.C = z4;
            return this;
        }

        public Builder setHttpAdapter(AbstractNetAdapter abstractNetAdapter) {
            this.f71594f = abstractNetAdapter;
            return this;
        }

        public Builder setImei(String str) {
            this.f71605q = str;
            return this;
        }

        public Builder setImei2(String str) {
            this.f71606r = str;
            return this;
        }

        public Builder setImsi(String str) {
            this.f71607s = str;
            return this;
        }

        public Builder setIsSocketMode(boolean z4) {
            this.f71593e = z4;
            return this;
        }

        public Builder setLongConnectionType(int i4) {
            this.G = i4;
            return this;
        }

        public Builder setMac(String str) {
            this.f71610v = str;
            return this;
        }

        public Builder setMeid(String str) {
            this.f71608t = str;
            return this;
        }

        public Builder setModel(String str) {
            this.f71609u = str;
            return this;
        }

        public Builder setNeedAttaReport(boolean z4) {
            this.B = z4;
            return this;
        }

        public Builder setNeedInitOstar(boolean z4) {
            this.f71614z = z4;
            return this;
        }

        public Builder setNeedLifeCycleListener(boolean z4) {
            this.F = z4;
            return this;
        }

        public Builder setNeedReportRqdEvent(boolean z4) {
            this.A = z4;
            return this;
        }

        public Builder setNormalPollingTime(long j4) {
            this.f71596h = j4;
            return this;
        }

        public Builder setNormalUploadNum(int i4) {
            this.f71598j = i4;
            return this;
        }

        public Builder setOaid(String str) {
            this.f71613y = str;
            return this;
        }

        public Builder setRealtimePollingTime(long j4) {
            this.f71595g = j4;
            return this;
        }

        public Builder setRealtimeUploadNum(int i4) {
            this.f71597i = i4;
            return this;
        }

        public Builder setRetryAfterQuicFailImme(boolean z4) {
            this.H = z4;
            return this;
        }

        public Builder setRsaPubKeyType(int i4) {
            this.E = i4;
            return this;
        }

        public Builder setUploadHost(String str) {
            this.f71599k = str;
            return this;
        }

        public Builder setWifiMacAddress(String str) {
            this.f71611w = str;
            return this;
        }

        public Builder setWifiSSID(String str) {
            this.f71612x = str;
            return this;
        }
    }

    public BeaconConfig(Builder builder) {
        this.f71563a = builder.f71589a;
        this.f71564b = builder.f71590b;
        this.f71565c = builder.f71591c;
        this.f71566d = builder.f71595g;
        this.f71567e = builder.f71596h;
        this.f71568f = builder.f71597i;
        this.f71569g = builder.f71598j;
        this.f71570h = builder.f71593e;
        this.f71571i = builder.f71594f;
        this.f71572j = builder.f71599k;
        this.f71573k = builder.f71600l;
        this.f71574l = builder.f71601m;
        this.f71575m = builder.f71602n;
        this.f71576n = builder.f71603o;
        this.f71577o = builder.f71604p;
        this.f71578p = builder.f71605q;
        this.f71579q = builder.f71606r;
        this.f71580r = builder.f71607s;
        this.f71581s = builder.f71608t;
        this.f71582t = builder.f71609u;
        this.f71583u = builder.f71610v;
        this.f71584v = builder.f71611w;
        this.f71585w = builder.f71612x;
        this.f71586x = builder.f71613y;
        this.f71587y = builder.f71614z;
        this.f71588z = builder.A;
        this.A = builder.B;
        this.B = builder.C;
        this.C = builder.D;
        this.D = builder.E;
        this.E = builder.F;
        this.F = builder.G;
        this.G = builder.H;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAndroidID() {
        return this.f71577o;
    }

    public int getCompressType() {
        return this.C;
    }

    public String getConfigHost() {
        return this.f71573k;
    }

    public AbstractNetAdapter getHttpAdapter() {
        return this.f71571i;
    }

    public String getImei() {
        return this.f71578p;
    }

    public String getImei2() {
        return this.f71579q;
    }

    public String getImsi() {
        return this.f71580r;
    }

    public int getLongConnectionType() {
        return this.F;
    }

    public String getMac() {
        return this.f71583u;
    }

    public int getMaxDBCount() {
        return this.f71563a;
    }

    public String getMeid() {
        return this.f71581s;
    }

    public String getModel() {
        return this.f71582t;
    }

    public long getNormalPollingTIme() {
        return this.f71567e;
    }

    public int getNormalUploadNum() {
        return this.f71569g;
    }

    public String getOaid() {
        return this.f71586x;
    }

    public long getRealtimePollingTime() {
        return this.f71566d;
    }

    public int getRealtimeUploadNum() {
        return this.f71568f;
    }

    public boolean getRetryAfterQuicFailImme() {
        return this.G;
    }

    public int getRsaPubKeyType() {
        return this.D;
    }

    public String getUploadHost() {
        return this.f71572j;
    }

    public String getWifiMacAddress() {
        return this.f71584v;
    }

    public String getWifiSSID() {
        return this.f71585w;
    }

    public boolean isAuditEnable() {
        return this.f71564b;
    }

    public boolean isBidEnable() {
        return this.f71565c;
    }

    public boolean isEnableQmsp() {
        return this.f71575m;
    }

    public boolean isForceEnableAtta() {
        return this.f71574l;
    }

    public boolean isHighPerformanceMode() {
        return this.B;
    }

    public boolean isNeedInitOstar() {
        return this.f71587y;
    }

    public boolean isNeedLifeCycleListener() {
        return this.E;
    }

    public boolean isPagePathEnable() {
        return this.f71576n;
    }

    public boolean isSocketMode() {
        return this.f71570h;
    }

    public boolean needAttaReport() {
        return this.A;
    }

    public boolean needReportRqdEvent() {
        return this.f71588z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㌼\u0001"));
        sb.append(this.f71563a);
        sb.append(ProtectedSandApp.s("㌽\u0001"));
        sb.append(this.f71564b);
        sb.append(ProtectedSandApp.s("㌾\u0001"));
        sb.append(this.f71565c);
        sb.append(ProtectedSandApp.s("㌿\u0001"));
        sb.append(this.f71566d);
        sb.append(ProtectedSandApp.s("㍀\u0001"));
        sb.append(this.f71567e);
        sb.append(ProtectedSandApp.s("㍁\u0001"));
        sb.append(this.f71569g);
        sb.append(ProtectedSandApp.s("㍂\u0001"));
        sb.append(this.f71568f);
        sb.append(ProtectedSandApp.s("㍃\u0001"));
        sb.append(this.f71571i);
        sb.append(ProtectedSandApp.s("㍄\u0001"));
        sb.append(this.f71572j);
        sb.append(ProtectedSandApp.s("㍅\u0001"));
        sb.append(this.f71573k);
        sb.append(ProtectedSandApp.s("㍆\u0001"));
        sb.append(this.f71574l);
        sb.append(ProtectedSandApp.s("㍇\u0001"));
        sb.append(this.f71575m);
        sb.append(ProtectedSandApp.s("㍈\u0001"));
        sb.append(this.f71576n);
        sb.append(ProtectedSandApp.s("㍉\u0001"));
        sb.append(this.f71577o);
        sb.append(ProtectedSandApp.s("㍊\u0001"));
        sb.append(this.f71578p);
        sb.append(ProtectedSandApp.s("㍋\u0001"));
        sb.append(this.f71579q);
        sb.append(ProtectedSandApp.s("㍌\u0001"));
        sb.append(this.f71580r);
        sb.append(ProtectedSandApp.s("㍍\u0001"));
        sb.append(this.f71581s);
        sb.append(ProtectedSandApp.s("㍎\u0001"));
        sb.append(this.f71582t);
        sb.append(ProtectedSandApp.s("㍏\u0001"));
        sb.append(this.f71583u);
        sb.append(ProtectedSandApp.s("㍐\u0001"));
        sb.append(this.f71584v);
        sb.append(ProtectedSandApp.s("㍑\u0001"));
        sb.append(this.f71585w);
        sb.append(ProtectedSandApp.s("㍒\u0001"));
        sb.append(this.f71586x);
        sb.append(ProtectedSandApp.s("㍓\u0001"));
        return h.a(sb, this.f71587y, ProtectedSandApp.s("㍔\u0001"));
    }
}
