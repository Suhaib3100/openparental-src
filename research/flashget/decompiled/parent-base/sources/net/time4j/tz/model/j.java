package net.time4j.tz.model;

import androidx.compose.ui.graphics.l6;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.d0;
import net.time4j.engine.b0;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.n0;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* compiled from: RuleBasedTransitionModel.java */
/* loaded from: classes7.dex */
final class j extends l {

    /* renamed from: h, reason: collision with root package name */
    private static final int f83614h = (int) (net.time4j.base.b.l(b0.MODIFIED_JULIAN_DATE.transform(l.l(100), b0.UNIX)) >> 32);
    private static final long serialVersionUID = 2456700806862862287L;

    /* renamed from: c, reason: collision with root package name */
    private final transient q f83615c;

    /* renamed from: d, reason: collision with root package name */
    private final transient List<d> f83616d;

    /* renamed from: e, reason: collision with root package name */
    private final transient ConcurrentMap<Integer, List<q>> f83617e;

    /* renamed from: f, reason: collision with root package name */
    private final transient List<q> f83618f;

    /* renamed from: g, reason: collision with root package name */
    private final transient boolean f83619g;

    /* compiled from: RuleBasedTransitionModel.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83620a;

        static {
            int[] iArr = new int[i.values().length];
            f83620a = iArr;
            try {
                iArr[i.UTC_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83620a[i.STANDARD_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83620a[i.WALL_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j(q qVar, List<d> list, boolean z4) {
        q qVar2;
        this.f83617e = new ConcurrentHashMap();
        if (list.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("餭\u0001"));
        }
        if (list.size() >= 128) {
            throw new IllegalArgumentException(ProtectedSandApp.s("餬\u0001") + list);
        }
        list = z4 ? new ArrayList(list) : list;
        Collections.sort(list, k.INSTANCE);
        String str = null;
        if (list.size() > 1) {
            for (d dVar : list) {
                if (str == null) {
                    str = dVar.a();
                } else if (!str.equals(dVar.a())) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("餧\u0001"));
                }
            }
        }
        this.f83619g = ProtectedSandApp.s("館\u0001").equals(str);
        if (qVar.e() != Long.MIN_VALUE) {
            if (qVar.i() != v(qVar.e(), qVar, list).f()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("餪\u0001") + qVar + ProtectedSandApp.s("餫\u0001") + list);
            }
            qVar2 = qVar;
        } else {
            if (qVar.d() != 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("餩\u0001") + qVar);
            }
            qVar2 = new q(d0.r0().x0().j(), qVar.h(), qVar.h(), 0);
        }
        this.f83615c = qVar2;
        List<d> unmodifiableList = Collections.unmodifiableList(list);
        this.f83616d = unmodifiableList;
        this.f83618f = B(qVar2, unmodifiableList, 0L, l.l(1));
    }

    private List<q> A(net.time4j.base.a aVar) {
        return z(this.f83616d.get(0).i(aVar));
    }

    static List<q> B(q qVar, List<d> list, long j4, long j5) {
        int i4;
        int i5;
        long e4 = qVar.e();
        if (j4 > j5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("餮\u0001"));
        }
        if (j5 <= e4 || j4 == j5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int h4 = qVar.h();
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        while (true) {
            int i10 = i7 % size;
            d dVar = list.get(i10);
            d dVar2 = list.get(((i7 - 1) + size) % size);
            int x4 = x(dVar, h4, dVar2.e());
            if (i7 == 0) {
                i4 = size;
                i5 = h4;
                i6 = D(dVar, Math.max(j4, e4) + x4);
            } else {
                i4 = size;
                i5 = h4;
                if (i10 == 0) {
                    i6++;
                }
            }
            long y4 = y(dVar, i6, x4);
            i7++;
            if (y4 >= j5) {
                return Collections.unmodifiableList(arrayList);
            }
            if (y4 >= j4 && y4 > e4) {
                arrayList.add(new q(y4, dVar2.e() + i5, dVar.e() + i5, dVar.e()));
            }
            h4 = i5;
            size = i4;
        }
    }

    private static int D(d dVar, long j4) {
        return dVar.h(b0.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(j4, MMKV.ExpireInDay), b0.UNIX));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("餯\u0001"));
    }

    private static q v(long j4, q qVar, List<d> list) {
        long max = Math.max(j4, qVar.e());
        int h4 = qVar.h();
        int size = list.size();
        int i4 = Integer.MIN_VALUE;
        q qVar2 = null;
        int i5 = 0;
        while (qVar2 == null) {
            int i6 = i5 % size;
            d dVar = list.get(i6);
            d dVar2 = list.get(((i5 - 1) + size) % size);
            int x4 = x(dVar, h4, dVar2.e());
            if (i5 == 0) {
                i4 = D(dVar, x4 + max);
            } else if (i6 == 0) {
                i4++;
            }
            long y4 = y(dVar, i4, x4);
            if (y4 > max) {
                qVar2 = new q(y4, dVar2.e() + h4, dVar.e() + h4, dVar.e());
            }
            i5++;
        }
        return qVar2;
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    private static int x(d dVar, int i4, int i5) {
        i d5 = dVar.d();
        int i6 = a.f83620a[d5.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return i4;
        }
        if (i6 == 3) {
            return i4 + i5;
        }
        throw new UnsupportedOperationException(d5.name());
    }

    private static long y(d dVar, int i4, int i5) {
        l0 b5 = dVar.b(i4);
        m0 f4 = dVar.f();
        b5.getClass();
        return n0.B0(b5, f4).e0(p.o(i5)).j();
    }

    private List<q> z(int i4) {
        List<q> putIfAbsent;
        Integer valueOf = Integer.valueOf(i4);
        List<q> list = this.f83617e.get(valueOf);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int h4 = this.f83615c.h();
        int size = this.f83616d.size();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = this.f83616d.get(i5);
            d dVar2 = this.f83616d.get(((i5 - 1) + size) % size);
            arrayList.add(new q(y(dVar, i4, x(dVar, h4, dVar2.e())), dVar2.e() + h4, dVar.e() + h4, dVar.e()));
        }
        List<q> unmodifiableList = Collections.unmodifiableList(arrayList);
        return (i4 > f83614h || !this.f83619g || (putIfAbsent = this.f83617e.putIfAbsent(valueOf, unmodifiableList)) == null) ? unmodifiableList : putIfAbsent;
    }

    List<p> C(net.time4j.base.a aVar, long j4) {
        long e4 = this.f83615c.e();
        int i4 = this.f83615c.i();
        if (j4 <= e4 + Math.max(this.f83615c.f(), i4)) {
            return l.q(i4);
        }
        for (q qVar : A(aVar)) {
            long e5 = qVar.e();
            int i5 = qVar.i();
            if (qVar.j()) {
                if (j4 < qVar.f() + e5) {
                    return l.q(qVar.f());
                }
                if (j4 < e5 + i5) {
                    return Collections.emptyList();
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j4 < i5 + e5) {
                    return l.q(qVar.f());
                }
                if (j4 < e5 + qVar.f()) {
                    return l.r(i5, qVar.f());
                }
            }
            i4 = i5;
        }
        return l.q(i4);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return t(aVar, l.s(aVar, gVar));
    }

    @Override // net.time4j.tz.m
    public List<q> b() {
        return this.f83618f;
    }

    @Override // net.time4j.tz.m
    public List<q> c(net.time4j.base.f fVar, net.time4j.base.f fVar2) {
        return B(this.f83615c, this.f83616d, fVar.j(), fVar2.j());
    }

    @Override // net.time4j.tz.m
    public q d(net.time4j.base.f fVar) {
        long e4 = this.f83615c.e();
        q qVar = null;
        if (fVar.j() <= e4) {
            return null;
        }
        int h4 = this.f83615c.h();
        int size = this.f83616d.size();
        int i4 = 0;
        int i5 = size - 1;
        int D = D(this.f83616d.get(0), fVar.j() + x(r5, h4, this.f83616d.get(i5).e()));
        List<q> z4 = z(D);
        while (i4 < size) {
            q qVar2 = z4.get(i4);
            long e5 = qVar2.e();
            if (fVar.j() < e5) {
                if (qVar != null) {
                    return qVar;
                }
                q qVar3 = i4 == 0 ? z(D - 1).get(i5) : z4.get(i4 - 1);
                return qVar3.e() > e4 ? qVar3 : qVar;
            }
            if (e5 > e4) {
                qVar = qVar2;
            }
            i4++;
        }
        return qVar;
    }

    @Override // net.time4j.tz.model.l, net.time4j.tz.m
    public boolean e() {
        Iterator<d> it = this.f83616d.iterator();
        while (it.hasNext()) {
            if (it.next().e() < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f83615c.equals(jVar.f83615c) && this.f83616d.equals(jVar.f83616d);
    }

    @Override // net.time4j.tz.m
    public p f() {
        return p.o(this.f83615c.i());
    }

    @Override // net.time4j.tz.m
    public void g(Appendable appendable) throws IOException {
        appendable.append(ProtectedSandApp.s("餰\u0001")).append(l.f83621b);
        Iterator<d> it = this.f83616d.iterator();
        while (it.hasNext()) {
            appendable.append(ProtectedSandApp.s("餱\u0001")).append(it.next().toString()).append(l.f83621b);
        }
    }

    @Override // net.time4j.tz.m
    public List<p> h(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return C(aVar, l.s(aVar, gVar));
    }

    public int hashCode() {
        return (this.f83616d.hashCode() * 37) + (this.f83615c.hashCode() * 17);
    }

    @Override // net.time4j.tz.m
    public q i(net.time4j.base.f fVar) {
        return v(fVar.j(), this.f83615c, this.f83616d);
    }

    q t(net.time4j.base.a aVar, long j4) {
        if (j4 <= this.f83615c.e() + Math.max(this.f83615c.f(), this.f83615c.i())) {
            return null;
        }
        for (q qVar : A(aVar)) {
            long e4 = qVar.e();
            if (qVar.j()) {
                if (j4 < qVar.f() + e4) {
                    return null;
                }
                if (j4 < e4 + qVar.i()) {
                    return qVar;
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j4 < qVar.i() + e4) {
                    return null;
                }
                if (j4 < e4 + qVar.f()) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        m2.a(j.class, sb, ProtectedSandApp.s("餲\u0001"));
        sb.append(this.f83615c);
        sb.append(ProtectedSandApp.s("餳\u0001"));
        return l6.a(sb, this.f83616d, ']');
    }

    q u() {
        return this.f83615c;
    }

    List<d> w() {
        return this.f83616d;
    }

    j(p pVar, List<d> list) {
        this(pVar, list, true);
    }

    j(p pVar, List<d> list, boolean z4) {
        this(new q(Long.MIN_VALUE, pVar.i(), pVar.i(), 0), list, z4);
    }
}
