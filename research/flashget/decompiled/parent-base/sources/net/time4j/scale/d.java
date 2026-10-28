package net.time4j.scale;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: LeapSeconds.java */
/* loaded from: classes7.dex */
public final class d implements Iterable<b>, Comparator<b> {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f83522g = Boolean.getBoolean(ProtectedSandApp.s("顐\u0001"));

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f83523h = Boolean.getBoolean(ProtectedSandApp.s("顑\u0001"));

    /* renamed from: i, reason: collision with root package name */
    public static final String f83524i = System.getProperty(ProtectedSandApp.s("顒\u0001"), ProtectedSandApp.s("顓\u0001"));

    /* renamed from: j, reason: collision with root package name */
    private static final net.time4j.scale.a[] f83525j = new net.time4j.scale.a[0];

    /* renamed from: k, reason: collision with root package name */
    private static final d f83526k = new d();

    /* renamed from: l, reason: collision with root package name */
    private static final long f83527l = 63072000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f83528m = 40587;

    /* renamed from: b, reason: collision with root package name */
    private final c f83529b;

    /* renamed from: c, reason: collision with root package name */
    private final List<net.time4j.scale.a> f83530c;

    /* renamed from: d, reason: collision with root package name */
    private final net.time4j.scale.a[] f83531d;

    /* renamed from: e, reason: collision with root package name */
    private volatile net.time4j.scale.a[] f83532e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f83533f;

    private d() {
        c cVar;
        int i4;
        boolean z4 = false;
        if (f83522g) {
            cVar = null;
            i4 = 0;
        } else {
            cVar = null;
            i4 = 0;
            for (c cVar2 : net.time4j.base.d.c().g(c.class)) {
                int size = cVar2.h().size();
                if (size > i4) {
                    cVar = cVar2;
                    i4 = size;
                }
            }
        }
        if (cVar == null || i4 == 0) {
            this.f83529b = null;
            this.f83530c = Collections.emptyList();
            net.time4j.scale.a[] aVarArr = f83525j;
            this.f83531d = aVarArr;
            this.f83532e = aVarArr;
            this.f83533f = false;
            return;
        }
        TreeSet treeSet = new TreeSet(this);
        for (Map.Entry<net.time4j.base.a, Integer> entry : cVar.h().entrySet()) {
            treeSet.add(new a(entry.getKey(), Long.MIN_VALUE, L0(r7) - 62985601, entry.getValue().intValue()));
        }
        K(treeSet);
        boolean z5 = f83523h;
        if (z5) {
            this.f83530c = Collections.unmodifiableList(new ArrayList(treeSet));
        } else {
            this.f83530c = new CopyOnWriteArrayList(treeSet);
        }
        net.time4j.scale.a[] y02 = y0();
        this.f83531d = y02;
        this.f83532e = y02;
        this.f83529b = cVar;
        if (!z5) {
            this.f83533f = true;
            return;
        }
        boolean b5 = cVar.b();
        if (b5) {
            Iterator<net.time4j.scale.a> it = this.f83530c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a() < 0) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            b5 = z4;
        }
        this.f83533f = b5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r7 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F0(int r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            boolean r0 = net.time4j.scale.d.f83523h
            if (r0 != 0) goto L82
            boolean r0 = net.time4j.scale.d.f83522g
            if (r0 != 0) goto L75
            monitor-enter(r3)
            net.time4j.base.b.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r3.z0()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L66
            net.time4j.scale.a[] r0 = r3.f83532e     // Catch: java.lang.Throwable -> L57
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L57
            net.time4j.base.a r1 = r0.c()     // Catch: java.lang.Throwable -> L57
            int r2 = r1.o()     // Catch: java.lang.Throwable -> L57
            if (r4 <= r2) goto L22
            goto L3b
        L22:
            int r2 = r1.o()     // Catch: java.lang.Throwable -> L57
            if (r4 != r2) goto L59
            int r2 = r1.q()     // Catch: java.lang.Throwable -> L57
            if (r5 <= r2) goto L2f
            goto L3b
        L2f:
            int r2 = r1.q()     // Catch: java.lang.Throwable -> L57
            if (r5 != r2) goto L59
            int r1 = r1.t()     // Catch: java.lang.Throwable -> L57
            if (r6 <= r1) goto L59
        L3b:
            if (r7 == 0) goto L3f
            r7 = -1
            goto L40
        L3f:
            r7 = 1
        L40:
            net.time4j.scale.c r1 = r3.f83529b     // Catch: java.lang.Throwable -> L57
            net.time4j.base.a r4 = r1.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            java.util.List<net.time4j.scale.a> r5 = r3.f83530c     // Catch: java.lang.Throwable -> L57
            net.time4j.scale.a r4 = H(r4, r7, r0)     // Catch: java.lang.Throwable -> L57
            r5.add(r4)     // Catch: java.lang.Throwable -> L57
            net.time4j.scale.a[] r4 = r3.y0()     // Catch: java.lang.Throwable -> L57
            r3.f83532e = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            return
        L57:
            r4 = move-exception
            goto L73
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "顔\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L57
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "顕\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L57
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            throw r4
        L75:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "顖\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L82:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "顗\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.scale.d.F0(int, int, int, boolean):void");
    }

    private static net.time4j.scale.a H(net.time4j.base.a aVar, int i4, net.time4j.scale.a aVar2) {
        long L0 = L0(aVar) - 62985601;
        return new a(aVar, L0 + ((int) ((aVar2.b() - aVar2.d()) + i4)), L0, i4);
    }

    private static void K(SortedSet<net.time4j.scale.a> sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        int i4 = 0;
        for (net.time4j.scale.a aVar : sortedSet) {
            if (aVar.b() == Long.MIN_VALUE) {
                int a5 = aVar.a() + i4;
                arrayList.add(new a(aVar, a5));
                i4 = a5;
            } else {
                arrayList.add(aVar);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    private static long L0(net.time4j.base.a aVar) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.k(aVar), f83528m), 86400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String O(net.time4j.base.a aVar) {
        return String.format(ProtectedSandApp.s("願\u0001"), Integer.valueOf(aVar.o()), Integer.valueOf(aVar.q()), Integer.valueOf(aVar.t()));
    }

    private net.time4j.scale.a[] t0() {
        return (f83522g || f83523h) ? this.f83531d : this.f83532e;
    }

    public static d u0() {
        return f83526k;
    }

    private net.time4j.scale.a[] y0() {
        ArrayList arrayList = new ArrayList(this.f83530c.size());
        arrayList.addAll(this.f83530c);
        Collections.reverse(arrayList);
        return (net.time4j.scale.a[]) arrayList.toArray(new net.time4j.scale.a[arrayList.size()]);
    }

    public boolean D0() {
        return !f83523h && z0();
    }

    public boolean E0(long j4) {
        if (j4 <= 0) {
            return false;
        }
        net.time4j.scale.a[] t02 = t0();
        for (int i4 = 0; i4 < t02.length; i4++) {
            long b5 = t02[i4].b();
            if (b5 == j4) {
                return t02[i4].a() == 1;
            }
            if (b5 < j4) {
                break;
            }
        }
        return false;
    }

    @Override // java.util.Comparator
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        net.time4j.base.a c5 = bVar.c();
        net.time4j.base.a c6 = bVar2.c();
        int o4 = c5.o();
        int o5 = c6.o();
        if (o4 < o5) {
            return -1;
        }
        if (o4 > o5) {
            return 1;
        }
        int q4 = c5.q();
        int q5 = c6.q();
        if (q4 < q5) {
            return -1;
        }
        if (q4 > q5) {
            return 1;
        }
        int t4 = c5.t();
        int t5 = c6.t();
        if (t4 < t5) {
            return -1;
        }
        return t4 == t5 ? 0 : 1;
    }

    public void G0(int i4, int i5, int i6) {
        F0(i4, i5, i6, true);
    }

    public long I(long j4) {
        long j5 = j4 - f83527l;
        if (j4 <= 0) {
            return j5;
        }
        for (net.time4j.scale.a aVar : t0()) {
            if (aVar.d() < j5) {
                return net.time4j.base.c.f(j5, aVar.b() - aVar.d());
            }
        }
        return j5;
    }

    public void I0(int i4, int i5, int i6) {
        F0(i4, i5, i6, false);
    }

    public long J0(long j4) {
        if (j4 <= 0) {
            return j4 + f83527l;
        }
        net.time4j.scale.a[] t02 = t0();
        boolean z4 = this.f83533f;
        for (net.time4j.scale.a aVar : t02) {
            if (aVar.b() - aVar.a() < j4 || (z4 && aVar.a() < 0 && aVar.b() < j4)) {
                j4 = net.time4j.base.c.f(j4, aVar.d() - aVar.b());
                break;
            }
        }
        return j4 + f83527l;
    }

    public boolean K0() {
        return this.f83533f;
    }

    public int S(net.time4j.base.f fVar) {
        long j4 = fVar.j();
        return net.time4j.base.c.g((I(j4) + f83527l) - j4);
    }

    public int getCount() {
        return t0().length;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return Collections.unmodifiableList(Arrays.asList(t0())).iterator();
    }

    public net.time4j.base.a q0() {
        if (z0()) {
            return this.f83529b.d();
        }
        throw new IllegalStateException(ProtectedSandApp.s("顕\u0001"));
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(2048, ProtectedSandApp.s("顙\u0001"));
        a5.append(this.f83529b);
        if (this.f83529b != null) {
            a5.append(ProtectedSandApp.s("顚\u0001"));
            a5.append(O(q0()));
        }
        a5.append(ProtectedSandApp.s("顛\u0001"));
        if (z0()) {
            boolean z4 = true;
            for (net.time4j.scale.a aVar : this.f83530c) {
                if (z4) {
                    z4 = false;
                } else {
                    a5.append('|');
                }
                a5.append(aVar);
            }
        } else {
            a5.append(ProtectedSandApp.s("顜\u0001"));
        }
        a5.append(ProtectedSandApp.s("顝\u0001"));
        return a5.toString();
    }

    public b v0(long j4) {
        net.time4j.scale.a[] t02 = t0();
        net.time4j.scale.a aVar = null;
        int i4 = 0;
        while (i4 < t02.length) {
            net.time4j.scale.a aVar2 = t02[i4];
            if (j4 >= aVar2.b()) {
                break;
            }
            i4++;
            aVar = aVar2;
        }
        return aVar;
    }

    public int w0(long j4) {
        if (j4 <= 0) {
            return 0;
        }
        for (net.time4j.scale.a aVar : t0()) {
            if (j4 > aVar.b()) {
                return 0;
            }
            long b5 = aVar.b() - aVar.a();
            if (j4 > b5) {
                return (int) (j4 - b5);
            }
        }
        return 0;
    }

    public int x0(net.time4j.base.a aVar) {
        int o4 = aVar.o();
        if (o4 >= 1972) {
            for (net.time4j.scale.a aVar2 : t0()) {
                net.time4j.base.a c5 = aVar2.c();
                if (o4 == c5.o() && aVar.q() == c5.q() && aVar.t() == c5.t()) {
                    return aVar2.a();
                }
            }
        }
        return 0;
    }

    public boolean z0() {
        return !this.f83530c.isEmpty();
    }

    /* compiled from: LeapSeconds.java */
    private static class a implements net.time4j.scale.a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final net.time4j.base.a date;
        private final int shift;

        a(net.time4j.base.a aVar, long j4, long j5, int i4) {
            this.date = aVar;
            this.shift = i4;
            this._utc = j4;
            this._raw = j5;
        }

        @Override // net.time4j.scale.b
        public int a() {
            return this.shift;
        }

        @Override // net.time4j.scale.a
        public long b() {
            return this._utc;
        }

        @Override // net.time4j.scale.b
        public net.time4j.base.a c() {
            return this.date;
        }

        @Override // net.time4j.scale.a
        public long d() {
            return this._raw;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(b.class.getName());
            sb.append('[');
            sb.append(d.O(this.date));
            sb.append(ProtectedSandApp.s("題\u0001"));
            sb.append(this._utc);
            sb.append(ProtectedSandApp.s("額\u0001"));
            sb.append(this._raw);
            sb.append(ProtectedSandApp.s("顎\u0001"));
            return android.support.v4.media.b.a(sb, this.shift, ProtectedSandApp.s("顏\u0001"));
        }

        a(net.time4j.scale.a aVar, int i4) {
            this.date = aVar.c();
            this.shift = aVar.a();
            this._utc = aVar.d() + i4;
            this._raw = aVar.d();
        }
    }
}
