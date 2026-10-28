package com.tencent.beacon.d;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: DefaultStrategy.java */
/* loaded from: classes6.dex */
public class b implements com.tencent.beacon.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f71402a;

    /* renamed from: b, reason: collision with root package name */
    private static final Random f71403b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Map<String, Integer>> f71404c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    protected Boolean f71410i;

    /* renamed from: k, reason: collision with root package name */
    protected c f71412k;

    /* renamed from: d, reason: collision with root package name */
    protected int f71405d = 48;

    /* renamed from: e, reason: collision with root package name */
    protected int f71406e = 2000;

    /* renamed from: f, reason: collision with root package name */
    protected int f71407f = 48;

    /* renamed from: g, reason: collision with root package name */
    protected int f71408g = 5000;

    /* renamed from: h, reason: collision with root package name */
    protected int f71409h = 60000;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f71411j = true;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f71413l = true;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f71414m = true;

    /* renamed from: n, reason: collision with root package name */
    protected Set<String> f71415n = null;

    /* renamed from: o, reason: collision with root package name */
    protected Map<String, Float> f71416o = null;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f71417p = false;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f71418q = false;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f71419r = false;

    /* renamed from: s, reason: collision with root package name */
    protected float f71420s = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f71421t = false;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f71422u = false;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f71423v = false;

    /* renamed from: w, reason: collision with root package name */
    protected int f71424w = 1;

    /* renamed from: x, reason: collision with root package name */
    protected long f71425x = 6400;

    /* renamed from: y, reason: collision with root package name */
    protected int f71426y = 20;

    /* renamed from: z, reason: collision with root package name */
    protected int f71427z = 300;
    protected boolean A = true;
    protected boolean B = true;
    protected boolean C = true;
    protected boolean D = true;
    protected boolean E = true;
    protected boolean F = true;
    protected boolean G = true;
    protected int H = 10000;
    protected boolean I = true;
    protected boolean J = true;
    protected boolean K = true;
    protected boolean L = false;
    protected int M = 1;
    private boolean N = false;
    protected int O = 10;
    private int P = 2;
    private int Q = 0;
    private int R = 2;

    protected b() {
        com.tencent.beacon.a.a.b.a().a(8, this);
    }

    public static b b() {
        if (f71402a == null) {
            synchronized (b.class) {
                try {
                    if (f71402a == null) {
                        f71402a = new b();
                    }
                } finally {
                }
            }
        }
        return f71402a;
    }

    private void f(int i4) {
        if (this.Q != i4) {
            h.d().g();
        }
        this.Q = i4;
    }

    private void x() {
        c cVar = this.f71412k;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        if (cVar.f71020a != 8) {
            return;
        }
        Map<String, Object> map = cVar.f71021b;
        String s4 = ProtectedSandApp.s("㈈\u0001");
        this.B = map.containsKey(s4) ? ((Boolean) cVar.f71021b.get(s4)).booleanValue() : this.B;
        Map<String, Object> map2 = cVar.f71021b;
        String s5 = ProtectedSandApp.s("㈉\u0001");
        this.A = map2.containsKey(s5) ? ((Boolean) cVar.f71021b.get(s5)).booleanValue() : this.A;
        Map<String, Object> map3 = cVar.f71021b;
        String s6 = ProtectedSandApp.s("㈊\u0001");
        this.H = map3.containsKey(s6) ? ((Integer) cVar.f71021b.get(s6)).intValue() : this.H;
        Map<String, Object> map4 = cVar.f71021b;
        String s7 = ProtectedSandApp.s("㈋\u0001");
        this.f71413l = map4.containsKey(s7) ? ((Boolean) cVar.f71021b.get(s7)).booleanValue() : this.f71413l;
        Map<String, Object> map5 = cVar.f71021b;
        String s10 = ProtectedSandApp.s("㈌\u0001");
        this.C = map5.containsKey(s10) ? ((Boolean) cVar.f71021b.get(s10)).booleanValue() : this.C;
    }

    public void c(int i4) {
        if (i4 < 24 || i4 > 100) {
            return;
        }
        this.f71407f = i4;
    }

    public int d() {
        return this.H;
    }

    public void e(boolean z4) {
        this.G = z4;
    }

    public synchronized int g() {
        return this.f71407f;
    }

    public synchronized int h() {
        return this.f71406e;
    }

    public synchronized int i() {
        return this.f71405d;
    }

    public int j() {
        return this.Q;
    }

    public synchronized int k() {
        return this.M;
    }

    public synchronized int l() {
        return this.f71409h;
    }

    public boolean m() {
        Boolean bool = this.f71410i;
        return bool == null ? this.f71411j : bool.booleanValue();
    }

    public boolean n() {
        return this.N;
    }

    public synchronized boolean o() {
        return this.f71418q;
    }

    public boolean p() {
        return this.E;
    }

    public boolean q() {
        return this.F;
    }

    public boolean r() {
        return this.D;
    }

    public boolean s() {
        return this.f71413l;
    }

    public boolean t() {
        return this.G;
    }

    public boolean u() {
        return this.K;
    }

    public boolean v() {
        return this.C;
    }

    public synchronized boolean w() {
        return this.L;
    }

    public void c(boolean z4) {
        this.F = z4;
    }

    public void d(boolean z4) {
        this.D = z4;
    }

    public int e() {
        return this.O;
    }

    public int c() {
        return this.R;
    }

    public void d(int i4) {
        if (i4 < 24 || i4 > 100) {
            return;
        }
        this.f71405d = i4;
    }

    public void e(int i4) {
        this.Q = i4;
    }

    public synchronized int f() {
        return this.f71408g;
    }

    public void f(boolean z4) {
        this.K = z4;
    }

    private void b(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㈇\u0001"), new HashMap(map));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(2, hashMap));
    }

    public synchronized void b(Set<String> set) {
        if (this.f71416o == null) {
            this.f71416o = new HashMap();
        }
        if (set == null) {
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String[] split = it.next().split(ProtectedSandApp.s("㈖\u0001"));
            if (split.length == 3) {
                try {
                    this.f71416o.put(split[0].toLowerCase(), Float.valueOf(Float.valueOf(split[1]).floatValue() / Float.valueOf(split[2]).floatValue()));
                } catch (Exception e4) {
                    com.tencent.beacon.base.util.c.a(e4);
                }
            }
        }
    }

    public synchronized void a(Map<String, String> map) {
        if (map != null) {
            try {
                b(map);
                try {
                    if (this.f71405d == 48) {
                        this.f71405d = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈍\u0001")), this.f71405d, 24, 100);
                    }
                    if (this.f71407f == 48) {
                        this.f71407f = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈎\u0001")), this.f71407f, 24, 100);
                    }
                    if (this.f71408g == 5000) {
                        this.f71408g = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈏\u0001")), this.f71408g, 2000, 3600000);
                    }
                    if (this.f71406e == 2000) {
                        this.f71406e = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈐\u0001")), this.f71406e, 1000, 10000);
                    }
                    this.f71414m = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈑\u0001")), this.f71414m);
                    this.f71417p = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈒\u0001")), this.f71417p);
                    this.f71418q = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈓\u0001")), this.f71418q);
                    this.f71419r = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈔\u0001")), this.f71419r);
                    String str = map.get(ProtectedSandApp.s("㈕\u0001"));
                    if (str != null) {
                        String trim = str.trim();
                        if (trim.length() > 0) {
                            String[] split = trim.split(ProtectedSandApp.s("㈖\u0001"));
                            if (split.length == 2) {
                                try {
                                    this.f71420s = Float.valueOf(split[0]).floatValue() / Float.valueOf(split[1]).floatValue();
                                } catch (Exception e4) {
                                    com.tencent.beacon.base.util.c.a(e4);
                                }
                            }
                        }
                    }
                    this.L = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈗\u0001")), this.L);
                    this.M = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈘\u0001")), this.M, 1, Integer.MAX_VALUE);
                    this.f71421t = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈙\u0001")), this.f71421t);
                    this.f71422u = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈚\u0001")), this.f71422u);
                    this.f71423v = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈛\u0001")), this.f71423v);
                    this.f71424w = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈜\u0001")), this.f71424w, 1, 50);
                    this.f71425x = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈝\u0001")), this.f71425x, 1000L, 20000L);
                    this.f71426y = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈞\u0001")), this.f71426y, 20, 100);
                    this.f71427z = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("\u321f\u0001")), this.f71427z, 60, MMKV.ExpireInDay);
                    this.A = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈠\u0001")), this.A);
                    this.B = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈡\u0001")), this.B);
                    this.H = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈢\u0001")), this.H, 10000, AndroidComposeViewAccessibilityDelegateCompat.Q2);
                    this.O = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈣\u0001")), this.O, 1, 50);
                    this.f71409h = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈤\u0001")), this.f71409h, 2000, 3600000);
                    this.P = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈥\u0001")), this.P, 1, 3);
                    f(com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈦\u0001")), this.Q, 0, 1));
                    this.F = com.tencent.beacon.base.util.b.a(map.get(ProtectedSandApp.s("㈧\u0001")), this.F);
                    com.tencent.beacon.base.net.b.b.c(map.get(ProtectedSandApp.s("㈨\u0001")));
                    com.tencent.beacon.base.net.b.b.e(map.get(ProtectedSandApp.s("㈩\u0001")));
                } catch (Exception e5) {
                    com.tencent.beacon.base.util.c.a(e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean b(String str) {
        Map<String, Float> map = this.f71416o;
        if (map != null && map.get(str.toLowerCase()) != null) {
            return f71403b.nextInt(1000) + 1 <= ((int) (this.f71416o.get(str.toLowerCase()).floatValue() * 1000.0f));
        }
        return true;
    }

    public void b(boolean z4) {
        this.E = z4;
    }

    public void b(int i4) {
        this.R = i4;
    }

    public synchronized void a(Set<String> set) {
        this.f71415n = set;
    }

    public synchronized boolean a(String str) {
        Set<String> set;
        set = this.f71415n;
        return (set == null || set.size() <= 0) ? false : this.f71415n.contains(str);
    }

    public synchronized void a(String str, Map<String, Integer> map) {
        f71404c.put(str, map);
    }

    public synchronized boolean a(String str, String str2) {
        Map<String, Integer> map = f71404c.get(str);
        if (map != null && map.get(str2) != null) {
            return f71403b.nextInt(10000) + 1 >= map.get(str2).intValue();
        }
        return false;
    }

    public void a(boolean z4, boolean z5) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈪\u0001") + z4, new Object[0]);
        boolean m4 = m();
        if (z5) {
            this.f71410i = Boolean.valueOf(z4);
        } else {
            this.f71411j = z4;
        }
        if (m4 != m()) {
            x();
        }
    }

    public void a(c cVar) {
        this.f71412k = cVar;
    }

    public void a(boolean z4) {
        this.N = z4;
    }

    public int a() {
        return this.P;
    }

    public void a(int i4) {
        this.P = i4;
    }
}
