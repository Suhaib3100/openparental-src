package com.tencent.beacon.module;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.base.util.h;
import com.tencent.beacon.d.c;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.b.a;
import com.tencent.beacon.event.b.b;
import com.tencent.beacon.event.c.g;
import com.tencent.beacon.event.i;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.quic.IBeaconQuicReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class EventModule implements BeaconModule, d, e.a, c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, String>> f71637a = new ConcurrentHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f71638b = new ConcurrentHashMap(3);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f71639c = new ConcurrentHashMap(3);

    /* renamed from: d, reason: collision with root package name */
    private final List<com.tencent.beacon.event.b.c> f71640d = new ArrayList(3);

    /* renamed from: e, reason: collision with root package name */
    private AtomicInteger f71641e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f71642f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private AtomicInteger f71643g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f71644h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<BeaconEvent>> f71645i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private StrategyModule f71646j;

    /* renamed from: k, reason: collision with root package name */
    private i f71647k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f71648l;

    private void b(BeaconEvent beaconEvent) {
        String appKey = beaconEvent.getAppKey();
        if (this.f71643g.addAndGet(1) > 1000) {
            String format = String.format(ProtectedSandApp.s("㎬\u0001"), appKey, beaconEvent.getCode());
            com.tencent.beacon.base.util.c.a(format, new Object[0]);
            if (this.f71644h.compareAndSet(false, true)) {
                j.e().a(ProtectedSandApp.s("㎭\u0001"), format);
                return;
            }
            return;
        }
        List<BeaconEvent> list = this.f71645i.get(appKey);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(beaconEvent);
        this.f71645i.put(appKey, list);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎮\u0001"), appKey, beaconEvent.getCode());
    }

    private String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㎯\u0001"), new Object[0]);
        return com.tencent.beacon.a.c.c.c().e();
    }

    private void g() {
        this.f71640d.add(new b());
        this.f71640d.add(new a());
        for (int i4 = 1; i4 < this.f71640d.size(); i4++) {
            this.f71640d.get(i4 - 1).a(this.f71640d.get(i4));
        }
    }

    private void h() {
        if (com.tencent.beacon.d.b.b().m()) {
            com.tencent.beacon.event.e eVar = new com.tencent.beacon.event.e();
            this.f71647k = eVar;
            eVar.a();
        }
    }

    private void i() {
        com.tencent.beacon.a.a.b.a().a(3, this);
        com.tencent.beacon.a.a.b.a().a(4, this);
        com.tencent.beacon.a.a.b.a().a(5, this);
        com.tencent.beacon.a.a.b.a().a(6, this);
        com.tencent.beacon.a.a.b.a().a(1, this);
        com.tencent.beacon.a.a.b.a().a(7, this);
        com.tencent.beacon.a.a.b.a().a(14, this);
    }

    private void j() {
        com.tencent.beacon.a.b.b.a().a(3000).postAtFrontOfQueue(new Runnable() { // from class: com.tencent.beacon.module.EventModule.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.beacon.event.a.a a5 = com.tencent.beacon.event.a.a.a();
                    Map<String, Integer> b5 = a5.b(ProtectedSandApp.s("㎦\u0001"));
                    EventModule.this.a(b5, a5.b(ProtectedSandApp.s("㎧\u0001")));
                } catch (Throwable th) {
                    com.tencent.beacon.base.util.c.a(th);
                    j.e().a(ProtectedSandApp.s("㎨\u0001"), ProtectedSandApp.s("㎩\u0001"), th);
                }
            }
        });
    }

    @o0
    public String c(String str) {
        String str2;
        String d5 = d(str);
        boolean isEmpty = TextUtils.isEmpty(d5);
        String s4 = ProtectedSandApp.s("㏏\u0001");
        return (isEmpty || (str2 = f71638b.get(d5)) == null) ? s4 : str2;
    }

    public boolean e() {
        return this.f71648l;
    }

    public void f() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎱\u0001"), ProtectedSandApp.s("㏐\u0001"), new Object[0]);
        this.f71647k.a(2);
        com.tencent.beacon.base.net.c.d().g();
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        j();
        this.f71646j = (StrategyModule) BeaconModule.f71636a.get(ModuleName.STRATEGY);
        g();
        h();
        i();
        e.a(context, this);
        com.tencent.beacon.d.b.b().a(this);
        this.f71648l = true;
    }

    @Override // com.tencent.beacon.d.c
    public void c() {
        if (com.tencent.beacon.d.b.b().m()) {
            if (this.f71647k == null) {
                h();
                return;
            } else {
                f();
                return;
            }
        }
        b(true);
    }

    public i d() {
        return this.f71647k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Integer> map, Map<String, Integer> map2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        boolean isEmpty = hashSet.isEmpty();
        String s4 = ProtectedSandApp.s("㎪\u0001");
        String s5 = ProtectedSandApp.s("㎫\u0001");
        if (isEmpty) {
            com.tencent.beacon.a.b.i.e().a(s4, String.format(s5, 0, 0, com.tencent.beacon.a.c.c.c().e()));
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.tencent.beacon.a.b.i.e().a(s4, String.format(s5, Integer.valueOf(map.containsKey(str) ? map.get(str).intValue() : 0), Integer.valueOf(map2.containsKey(str) ? map2.get(str).intValue() : 0), str));
        }
    }

    public void b(String str, String str2) {
        f71638b.put(d(str), com.tencent.beacon.event.c.d.e(str2));
    }

    @o0
    public String b(String str) {
        String str2;
        String d5 = d(str);
        return (TextUtils.isEmpty(d5) || (str2 = f71639c.get(d5)) == null) ? "" : str2;
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void b() {
        b(false);
    }

    public void b(boolean z4) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎱\u0001"), ProtectedSandApp.s("㏎\u0001"), new Object[0]);
        this.f71647k.a(z4, 2);
        com.tencent.beacon.base.net.c.d().close();
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        List<BeaconEvent> list;
        int i4 = cVar.f71020a;
        if (i4 == 1) {
            com.tencent.beacon.a.a.b.a().a(12, this);
            return;
        }
        if (i4 == 12) {
            Object obj = cVar.f71021b.get(ProtectedSandApp.s("㎹\u0001"));
            if (obj instanceof BeaconEvent) {
                BeaconEvent beaconEvent = (BeaconEvent) obj;
                beaconEvent.getParams().put(ProtectedSandApp.s("㏉\u0001"), ProtectedSandApp.s("㏊\u0001"));
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㏋\u0001"), beaconEvent.getAppKey(), beaconEvent.getCode());
                a(beaconEvent);
                return;
            }
            return;
        }
        if (i4 == 14) {
            Object obj2 = cVar.f71021b.get(ProtectedSandApp.s("㏇\u0001"));
            if (!(obj2 instanceof String) || (list = this.f71645i.get(obj2)) == null || list.isEmpty()) {
                return;
            }
            for (BeaconEvent beaconEvent2 : list) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㏈\u0001"), obj2, beaconEvent2.getCode());
                a(beaconEvent2);
            }
            return;
        }
        String s4 = ProtectedSandApp.s("㏁\u0001");
        if (i4 == 3) {
            a((String) cVar.f71021b.get(s4), (HashMap) cVar.f71021b.get(ProtectedSandApp.s("㏆\u0001")));
            return;
        }
        if (i4 == 4) {
            b((String) cVar.f71021b.get(s4), (String) cVar.f71021b.get(ProtectedSandApp.s("㏅\u0001")));
            return;
        }
        if (i4 == 5) {
            a((String) cVar.f71021b.get(s4), (String) cVar.f71021b.get(ProtectedSandApp.s("㏄\u0001")));
            return;
        }
        if (i4 != 6) {
            if (i4 != 7) {
                return;
            }
            com.tencent.beacon.d.b.b().a(((Boolean) cVar.f71021b.get(ProtectedSandApp.s("㏂\u0001"))).booleanValue(), false);
        } else {
            Object obj3 = cVar.f71021b.get(ProtectedSandApp.s("㏃\u0001"));
            if (obj3 instanceof BeaconEvent) {
                a((BeaconEvent) obj3);
            }
        }
    }

    public void a(boolean z4) {
        i iVar = this.f71647k;
        if (iVar != null) {
            iVar.a(z4);
        }
    }

    public EventResult a(@o0 BeaconEvent beaconEvent) {
        StrategyModule strategyModule;
        Object[] objArr = {beaconEvent.getCode()};
        String s4 = ProtectedSandApp.s("㎰\u0001");
        String s5 = ProtectedSandApp.s("㎱\u0001");
        com.tencent.beacon.base.util.c.a(s5, 0, s4, objArr);
        if (!com.tencent.beacon.d.b.b().m()) {
            com.tencent.beacon.base.util.c.a(s5, 1, ProtectedSandApp.s("㎲\u0001"), beaconEvent.getCode());
            return EventResult.a.a(102);
        }
        beaconEvent.setAppKey(d(beaconEvent.getAppKey()));
        final g a5 = g.a(com.tencent.beacon.a.c.c.c().b(), beaconEvent.getAppKey());
        if (!a5.b()) {
            b(beaconEvent);
            com.tencent.beacon.a.b.b.a().a(new Runnable() { // from class: com.tencent.beacon.module.EventModule.2
                @Override // java.lang.Runnable
                public void run() {
                    a5.a();
                }
            });
            return EventResult.a.a(107);
        }
        h.a(beaconEvent.getParams());
        StrategyModule strategyModule2 = this.f71646j;
        if (strategyModule2 != null && strategyModule2.b().a(beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a(s5, 1, ProtectedSandApp.s("㎳\u0001"), beaconEvent.getCode());
            return EventResult.a.a(100);
        }
        if (beaconEvent.isSucceed() && (strategyModule = this.f71646j) != null && !strategyModule.b().b(beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a(s5, 1, ProtectedSandApp.s("㎴\u0001"), beaconEvent.getCode());
            return EventResult.a.a(101);
        }
        StrategyModule strategyModule3 = this.f71646j;
        if (strategyModule3 != null && strategyModule3.b().a(beaconEvent.getAppKey(), beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a(s5, 1, ProtectedSandApp.s("㎵\u0001"), beaconEvent.getAppKey(), beaconEvent.getCode());
            return EventResult.a.a(108);
        }
        EventBean b5 = this.f71640d.get(0).b(beaconEvent);
        if (b5 == null) {
            return EventResult.a.a(105);
        }
        if (TextUtils.isEmpty(com.tencent.beacon.a.c.i.b()) && TextUtils.isEmpty(com.tencent.beacon.a.c.i.c())) {
            if (this.f71641e.addAndGet(1) > 64) {
                String format = String.format(ProtectedSandApp.s("㎶\u0001"), beaconEvent.getAppKey(), beaconEvent.getCode());
                com.tencent.beacon.base.util.c.a(format, new Object[0]);
                if (this.f71642f.compareAndSet(false, true)) {
                    j.e().a(ProtectedSandApp.s("㎷\u0001"), format);
                }
            } else {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎸\u0001"), beaconEvent.getAppKey(), beaconEvent.getCode());
                BeaconEvent build = BeaconEvent.newBuilder(beaconEvent).build();
                HashMap hashMap = new HashMap();
                hashMap.put(ProtectedSandApp.s("㎹\u0001"), build);
                com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(12, hashMap));
            }
        }
        int eventType = b5.getEventType();
        String s6 = ProtectedSandApp.s("㎺\u0001");
        if (eventType == 3) {
            IBeaconImmediateReport immediateReport = BeaconReport.getInstance().getImmediateReport();
            h.a(ProtectedSandApp.s("㎻\u0001"), immediateReport);
            if (immediateReport != null) {
                String str = beaconEvent.getParams().get(s6);
                this.f71647k.b(str, b5);
                return EventResult.a.a(Long.parseLong(str));
            }
            String s7 = ProtectedSandApp.s("㎼\u0001");
            com.tencent.beacon.base.util.c.a(s7, new Object[0]);
            j.e().a(ProtectedSandApp.s("㎽\u0001"), s7);
        }
        if (eventType == 2) {
            IBeaconQuicReport beaconQuicReport = BeaconReport.getInstance().getBeaconQuicReport();
            h.a(ProtectedSandApp.s("㎾\u0001"), beaconQuicReport);
            if (beaconQuicReport != null) {
                String str2 = beaconEvent.getParams().get(s6);
                this.f71647k.a(str2, b5);
                return EventResult.a.a(Long.parseLong(str2));
            }
            String s10 = ProtectedSandApp.s("㎿\u0001");
            com.tencent.beacon.base.util.c.a(s10, new Object[0]);
            j.e().a(ProtectedSandApp.s("㏀\u0001"), s10);
        }
        return this.f71647k.c(beaconEvent.getParams().get(s6), b5);
    }

    public void a(String str, String str2) {
        f71639c.put(d(str), com.tencent.beacon.event.c.d.c(str2));
    }

    public void a(String str, Map<String, String> map) {
        if (map == null || map.isEmpty() || map.size() >= 50) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㏍\u0001"), Integer.valueOf(map != null ? map.size() : 0));
            return;
        }
        String d5 = d(str);
        Map<String, Map<String, String>> map2 = f71637a;
        Map<String, String> map3 = map2.get(d5);
        if (map3 == null) {
            map2.put(d5, new HashMap(map));
            return;
        }
        if (map.size() + map3.size() >= 50) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㏌\u0001"), new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map3);
        hashMap.putAll(map);
        map2.put(d5, hashMap);
    }

    public Map<String, String> a(String str) {
        return f71637a.get(d(str));
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void a() {
        f();
    }
}
