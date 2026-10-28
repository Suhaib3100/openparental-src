package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: EventReportTask.java */
/* loaded from: classes6.dex */
public class h implements Runnable, com.tencent.beacon.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f71539a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71540b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.beacon.event.a.a f71541c;

    /* renamed from: g, reason: collision with root package name */
    private final String f71545g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f71546h;

    /* renamed from: i, reason: collision with root package name */
    private int f71547i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f71548j;

    /* renamed from: l, reason: collision with root package name */
    private String f71550l;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Long> f71542d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set<Long> f71543e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final List<Long> f71544f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f71549k = false;

    public h(int i4, com.tencent.beacon.event.a.a aVar, boolean z4) {
        this.f71540b = i4;
        this.f71541c = aVar;
        this.f71546h = z4;
        String s4 = z4 ? ProtectedSandApp.s("㌞\u0001") : ProtectedSandApp.s("㌟\u0001");
        this.f71539a = s4;
        this.f71547i = z4 ? com.tencent.beacon.d.b.b().i() : com.tencent.beacon.d.b.b().g();
        this.f71545g = android.support.v4.media.d.a(ProtectedSandApp.s("㌠\u0001"), s4, ProtectedSandApp.s("㌡\u0001"));
    }

    private void a(List<EventBean> list, Set<Long> set) {
        JceRequestEntity a5 = com.tencent.beacon.event.c.d.a(list, this.f71546h);
        com.tencent.beacon.base.util.c.a(this.f71545g, 2, ProtectedSandApp.s("㌢\u0001"), a5.toString());
        com.tencent.beacon.base.net.c.d().b(a5).a(new g(this, this.f71539a, this.f71541c, set, this.f71550l));
    }

    private List<EventBean> d() {
        String s4;
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = this.f71542d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("㌣\u0001");
            if (!hasNext) {
                break;
            }
            sb.append(it.next());
            sb.append(s4);
        }
        return this.f71541c.a(this.f71539a, sb.length() > 0 ? sb.substring(0, sb.lastIndexOf(s4)) : "", this.f71547i);
    }

    private void e() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    public int b() {
        return this.f71547i;
    }

    public synchronized void c() {
        try {
            if (this.f71549k) {
                this.f71547i = this.f71546h ? com.tencent.beacon.d.b.b().i() : com.tencent.beacon.d.b.b().g();
                this.f71549k = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f71548j) {
            e();
            this.f71548j = true;
        }
        if (com.tencent.beacon.base.net.c.d().f()) {
            com.tencent.beacon.a.b.b.a().a(this.f71540b, false, 0);
            return;
        }
        if (com.tencent.beacon.base.net.c.d().c() >= com.tencent.beacon.d.b.b().e()) {
            com.tencent.beacon.a.b.b.a().b(com.tencent.beacon.d.b.b().l());
            return;
        }
        synchronized (this.f71542d) {
            com.tencent.beacon.base.util.c.a(this.f71545g, 0, ProtectedSandApp.s("㌨\u0001"), new Object[0]);
            List<EventBean> d5 = d();
            if (d5 != null && !d5.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (EventBean eventBean : d5) {
                    long cid = eventBean.getCid();
                    this.f71542d.add(Long.valueOf(cid));
                    this.f71543e.add(Long.valueOf(cid));
                    Map<String, String> eventValue = eventBean.getEventValue();
                    if (eventValue != null) {
                        String appKey = eventBean.getAppKey();
                        String str = (String) hashMap.get(appKey);
                        if (str == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(appKey);
                            sb.append(ProtectedSandApp.s("㌩\u0001"));
                            str = sb.toString();
                        }
                        String str2 = eventValue.get(ProtectedSandApp.s("㌪\u0001"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(str2);
                        sb2.append(ProtectedSandApp.s("㌫\u0001"));
                        hashMap.put(appKey, sb2.toString());
                    }
                }
                StringBuilder sb3 = new StringBuilder(ProtectedSandApp.s("㌬\u0001"));
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    sb3.append((String) ((Map.Entry) it.next()).getValue());
                    sb3.append(ProtectedSandApp.s("㌭\u0001"));
                }
                String sb4 = sb3.toString();
                this.f71550l = sb4;
                com.tencent.beacon.base.util.c.a(this.f71545g, 1, ProtectedSandApp.s("㌮\u0001"), sb4);
                a(d5, this.f71543e);
                d5.clear();
                this.f71543e.clear();
                return;
            }
            com.tencent.beacon.base.util.c.a(this.f71545g, 1, ProtectedSandApp.s("㌯\u0001"), new Object[0]);
            com.tencent.beacon.a.b.b.a().a(this.f71540b, false, 0);
        }
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        Map map;
        if (cVar.f71020a != 2 || (map = (Map) cVar.f71021b.get(ProtectedSandApp.s("㌥\u0001"))) == null) {
            return;
        }
        if (this.f71546h) {
            this.f71547i = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㌦\u0001")), this.f71547i, 24, 100);
        } else {
            this.f71547i = com.tencent.beacon.base.util.b.a((String) map.get(ProtectedSandApp.s("㌧\u0001")), this.f71547i, 24, 100);
        }
    }

    public void a(Set<Long> set) {
        synchronized (this.f71542d) {
            this.f71542d.removeAll(set);
            set.clear();
        }
    }

    public void a(long j4) {
        synchronized (this.f71544f) {
            try {
                this.f71544f.add(Long.valueOf(j4));
                if (this.f71544f.size() >= 10) {
                    Iterator<Long> it = this.f71544f.iterator();
                    long j5 = 0;
                    while (it.hasNext()) {
                        j5 += it.next().longValue();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(j5 / this.f71544f.size());
                    sb.append("");
                    com.tencent.beacon.a.b.i.e().a(ProtectedSandApp.s("㌤\u0001"), sb.toString());
                    this.f71544f.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void a() {
        int i4 = this.f71547i;
        if (i4 >= 2) {
            this.f71547i = i4 >> 1;
            this.f71549k = true;
        }
    }
}
