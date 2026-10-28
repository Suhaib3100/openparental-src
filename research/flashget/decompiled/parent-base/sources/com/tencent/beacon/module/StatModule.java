package com.tencent.beacon.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.d.b;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class StatModule implements BeaconModule, d {

    /* renamed from: a, reason: collision with root package name */
    private Context f71652a;

    /* renamed from: d, reason: collision with root package name */
    private b f71655d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71653b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71654c = true;

    /* renamed from: e, reason: collision with root package name */
    private long f71656e = 0;

    /* renamed from: com.tencent.beacon.module.StatModule$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f71666a;

        @Override // java.lang.Runnable
        public void run() {
            BeaconReport.getInstance().report(BeaconEvent.builder().withCode(ProtectedSandApp.s("㏺\u0001")).withParams(this.f71666a).build());
        }
    }

    /* renamed from: com.tencent.beacon.module.StatModule$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f71667a;

        @Override // java.lang.Runnable
        public void run() {
            BeaconReport.getInstance().report(BeaconEvent.builder().withCode(ProtectedSandApp.s("㏻\u0001")).withIsSucceed(true).withParams(this.f71667a).withType(EventType.REALTIME).build());
        }
    }

    private void c() {
        ((Application) this.f71652a).registerActivityLifecycleCallbacks(new com.tencent.beacon.c.a.d(this));
    }

    private void d() {
        if (this.f71655d.r()) {
            a a5 = a.a();
            String s4 = ProtectedSandApp.s("㏼\u0001");
            if (com.tencent.beacon.base.util.b.e().equals(a5.getString(s4, ""))) {
                return;
            }
            com.tencent.beacon.a.b.b.a().a(50000L, new Runnable() { // from class: com.tencent.beacon.module.StatModule.1
                @Override // java.lang.Runnable
                public void run() {
                    e l4 = e.l();
                    g e4 = g.e();
                    BeaconEvent.Builder withParams = BeaconEvent.builder().withParams(ProtectedSandApp.s("㏗\u0001"), Build.BRAND).withParams(ProtectedSandApp.s("㏘\u0001"), e4.h()).withParams(ProtectedSandApp.s("㏙\u0001"), l4.g()).withParams(ProtectedSandApp.s("㏚\u0001"), l4.n()).withParams(ProtectedSandApp.s("㏛\u0001"), l4.A());
                    StringBuilder sb = new StringBuilder();
                    sb.append(l4.x());
                    String s5 = ProtectedSandApp.s("㏜\u0001");
                    sb.append(s5);
                    BeaconEvent.Builder withParams2 = withParams.withParams(ProtectedSandApp.s("㏝\u0001"), sb.toString()).withParams(ProtectedSandApp.s("㏞\u0001"), l4.u() + s5).withParams(ProtectedSandApp.s("㏟\u0001"), l4.h()).withParams(ProtectedSandApp.s("㏠\u0001"), l4.v()).withParams(ProtectedSandApp.s("㏡\u0001"), "").withParams(ProtectedSandApp.s("㏢\u0001"), e4.j()).withParams(ProtectedSandApp.s("㏣\u0001"), l4.y() + s5).withParams(ProtectedSandApp.s("㏤\u0001"), l4.q());
                    StringBuilder sb2 = new StringBuilder("");
                    sb2.append(l4.z());
                    BeaconEvent.Builder withParams3 = withParams2.withParams(ProtectedSandApp.s("㏥\u0001"), sb2.toString()).withParams(ProtectedSandApp.s("㏦\u0001"), "" + l4.e() + s5);
                    StringBuilder sb3 = new StringBuilder("");
                    sb3.append(l4.s());
                    BeaconEvent.Builder withParams4 = withParams3.withParams(ProtectedSandApp.s("㏧\u0001"), sb3.toString()).withParams(ProtectedSandApp.s("㏨\u0001"), l4.f());
                    boolean E = l4.E();
                    String s6 = ProtectedSandApp.s("㏩\u0001");
                    String s7 = ProtectedSandApp.s("㏪\u0001");
                    BeaconEvent.Builder withParams5 = withParams4.withParams(ProtectedSandApp.s("㏫\u0001"), E ? s7 : s6).withParams(ProtectedSandApp.s("㏬\u0001"), l4.B());
                    if (l4.m()) {
                        s6 = s7;
                    }
                    BeaconReport.getInstance().report(withParams5.withParams(ProtectedSandApp.s("㏭\u0001"), s6).withParams(ProtectedSandApp.s("㏮\u0001"), l4.k() + s5).withParams(ProtectedSandApp.s("㏯\u0001"), e4.k()).withParams(ProtectedSandApp.s("㏰\u0001"), l4.w()).withType(EventType.REALTIME).withCode(ProtectedSandApp.s("㏱\u0001")).build());
                }
            });
            a.SharedPreferencesEditorC0995a edit = a5.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString(s4, com.tencent.beacon.base.util.b.e());
            }
        }
    }

    private void e() {
        if (this.f71655d.r()) {
            boolean o4 = this.f71655d.o();
            String s4 = ProtectedSandApp.s("㏽\u0001");
            if (o4) {
                if (com.tencent.beacon.base.util.b.e().equals(a.a().getString(s4, ""))) {
                    c.d(ProtectedSandApp.s("㏾\u0001"), new Object[0]);
                    return;
                }
            }
            e l4 = e.l();
            HashMap hashMap = new HashMap();
            hashMap.put(ProtectedSandApp.s("㏿\u0001"), l4.q());
            String s5 = ProtectedSandApp.s("㐀\u0001");
            String s6 = ProtectedSandApp.s("㐁\u0001");
            hashMap.put(s5, s6);
            boolean g4 = com.tencent.beacon.a.c.b.g();
            String s7 = ProtectedSandApp.s("㐂\u0001");
            hashMap.put(ProtectedSandApp.s("㐃\u0001"), g4 ? s6 : s7);
            hashMap.put(ProtectedSandApp.s("㐄\u0001"), com.tencent.beacon.a.c.b.e(this.f71652a) ? s6 : s7);
            hashMap.put(ProtectedSandApp.s("㐇\u0001"), com.tencent.beacon.a.c.b.f(this.f71652a) ? ProtectedSandApp.s("㐅\u0001") : ProtectedSandApp.s("㐆\u0001"));
            hashMap.put(ProtectedSandApp.s("㐈\u0001"), "" + com.tencent.beacon.a.c.b.b(this.f71652a));
            if (!com.tencent.beacon.a.c.b.f71072d) {
                s6 = s7;
            }
            hashMap.put(ProtectedSandApp.s("㐉\u0001"), s6);
            hashMap.put(ProtectedSandApp.s("㐊\u0001"), Build.BRAND);
            hashMap.put(ProtectedSandApp.s("㐋\u0001"), l4.x());
            g e4 = g.e();
            hashMap.put(ProtectedSandApp.s("㐌\u0001"), e4.j());
            hashMap.put(ProtectedSandApp.s("㐍\u0001"), e4.k());
            if (a(hashMap)) {
                a.SharedPreferencesEditorC0995a edit = a.a().edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(s4, com.tencent.beacon.base.util.b.e());
                }
            }
        }
    }

    public void a() {
    }

    public void b() {
    }

    static /* synthetic */ long b(StatModule statModule, long j4) {
        long j5 = statModule.f71656e + j4;
        statModule.f71656e = j5;
        return j5;
    }

    public void b(final String str, final long j4, final long j5) {
        if (this.f71655d.r()) {
            com.tencent.beacon.a.b.b.a().a(new Runnable() { // from class: com.tencent.beacon.module.StatModule.3
                @Override // java.lang.Runnable
                public void run() {
                    BeaconReport.getInstance().report(BeaconEvent.builder().withParams(ProtectedSandApp.s("㏶\u0001"), String.valueOf(j5)).withParams(ProtectedSandApp.s("㏷\u0001"), str).withParams(ProtectedSandApp.s("㏸\u0001"), String.valueOf(j4)).withCode(ProtectedSandApp.s("㏹\u0001")).withType(EventType.NORMAL).build());
                    StatModule.b(StatModule.this, j4);
                    if (StatModule.this.f71656e >= 15000) {
                        StatModule.this.f71656e = 0L;
                    }
                }
            });
        }
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        this.f71652a = context;
        if (!com.tencent.beacon.a.c.b.g(context)) {
            c.a(ProtectedSandApp.s("㐎\u0001"), new Object[0]);
            return;
        }
        b b5 = ((StrategyModule) BeaconModule.f71636a.get(ModuleName.STRATEGY)).b();
        this.f71655d = b5;
        this.f71654c = b5.s();
        if (this.f71655d.q()) {
            ((Application) this.f71652a).registerActivityLifecycleCallbacks(new com.tencent.beacon.c.a.c(this));
        }
        com.tencent.beacon.a.a.b.a().a(2, this);
        com.tencent.beacon.a.a.b.a().a(10, this);
    }

    public boolean b(Map<String, String> map) {
        if (!this.f71655d.r()) {
            return true;
        }
        return BeaconReport.getInstance().report(BeaconEvent.builder().withParams(map).withCode(ProtectedSandApp.s("㐓\u0001")).withType(EventType.REALTIME).build()).isSuccess();
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        int i4 = cVar.f71020a;
        if (i4 == 2) {
            Map map = (Map) cVar.f71021b.get(ProtectedSandApp.s("㐏\u0001"));
            if (map != null) {
                this.f71653b = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㐐\u0001")), this.f71653b);
                this.f71654c = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㐑\u0001")), this.f71654c);
                return;
            }
            return;
        }
        if (i4 != 10) {
            return;
        }
        e();
        if (com.tencent.beacon.a.c.b.g(this.f71652a)) {
            new com.tencent.beacon.c.c(this.f71652a).a(this.f71655d);
        }
        if (this.f71653b) {
            d();
        }
        if (this.f71654c) {
            c();
        }
    }

    public boolean a(Map<String, String> map) {
        if (!this.f71655d.r()) {
            return true;
        }
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(ProtectedSandApp.s("㐒\u0001")).withParams(map).withType(EventType.REALTIME).build()).isSuccess();
    }

    public void a(final String str, final long j4, final long j5) {
        if (this.f71655d.r()) {
            com.tencent.beacon.a.b.b.a().a(new Runnable() { // from class: com.tencent.beacon.module.StatModule.2
                @Override // java.lang.Runnable
                public void run() {
                    BeaconReport.getInstance().report(BeaconEvent.builder().withParams(ProtectedSandApp.s("㏲\u0001"), String.valueOf(j5)).withParams(ProtectedSandApp.s("㏳\u0001"), str).withParams(ProtectedSandApp.s("㏴\u0001"), String.valueOf(j4)).withCode(ProtectedSandApp.s("㏵\u0001")).withType(EventType.REALTIME).build());
                }
            });
        }
    }
}
