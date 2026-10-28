package net.time4j.tz;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: TransitionResolver.java */
/* loaded from: classes7.dex */
final class n implements o, Serializable {
    private static final long serialVersionUID = 1790434289322009750L;

    /* renamed from: b, reason: collision with root package name */
    private final transient b f83624b;

    /* renamed from: c, reason: collision with root package name */
    private final transient g f83625c;

    /* renamed from: e, reason: collision with root package name */
    private static final String f83623e = ProtectedSandApp.s("餵\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Integer, n> f83622d = new HashMap();

    /* compiled from: TransitionResolver.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83626a;

        static {
            int[] iArr = new int[b.values().length];
            f83626a = iArr;
            try {
                iArr[b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83626a[b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83626a[b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        for (b bVar : b.values()) {
            for (g gVar : g.values()) {
                f83622d.put(Integer.valueOf(gVar.ordinal() + (bVar.ordinal() * 2)), new n(bVar, gVar));
            }
        }
    }

    private n(b bVar, g gVar) {
        this.f83624b = bVar;
        this.f83625c = gVar;
    }

    static n e(b bVar, g gVar) {
        return f83622d.get(Integer.valueOf(gVar.ordinal() + (bVar.ordinal() * 2)));
    }

    private static void f(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        throw new IllegalArgumentException(ProtectedSandApp.s("餶\u0001") + aVar + ProtectedSandApp.s("餷\u0001") + gVar + ProtectedSandApp.s("餸\u0001") + lVar.G().canonical() + ProtectedSandApp.s("餹\u0001"));
    }

    private static long g(int i4, int i5, int i6, int i7, int i10, int i11) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.j(i4, i5, i6), 40587L), 86400L) + (i10 * 60) + (i7 * MMKV.ExpireInHour) + i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("餺\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.tz.o
    public o a(g gVar) {
        return gVar == this.f83625c ? this : this.f83624b.and(gVar);
    }

    @Override // net.time4j.tz.o
    public p b(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        b bVar;
        m F = lVar.F();
        if (F == null && this.f83625c == g.LATER_OFFSET && ((bVar = this.f83624b) == b.PUSH_FORWARD || bVar == b.ABORT)) {
            if (bVar == b.ABORT && lVar.V(aVar, gVar)) {
                f(aVar, gVar, lVar);
            }
            return lVar.H(aVar, gVar);
        }
        if (F == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("餵\u0001"));
        }
        q a5 = F.a(aVar, gVar);
        if (a5 != null) {
            int i4 = a5.i();
            if (a5.j()) {
                if (this.f83624b != b.ABORT) {
                    return p.o(i4);
                }
                f(aVar, gVar, lVar);
            } else if (a5.k()) {
                if (this.f83625c == g.EARLIER_OFFSET) {
                    i4 = a5.f();
                }
                return p.o(i4);
            }
        }
        return F.h(aVar, gVar).get(0);
    }

    @Override // net.time4j.tz.o
    public long c(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        long g4;
        int i4;
        b bVar;
        int o4 = aVar.o();
        int q4 = aVar.q();
        int t4 = aVar.t();
        int u4 = gVar.u();
        int m4 = gVar.m();
        int h4 = gVar.h();
        m F = lVar.F();
        if (F != null || this.f83625c != g.LATER_OFFSET || ((bVar = this.f83624b) != b.PUSH_FORWARD && bVar != b.ABORT)) {
            if (F == null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("餵\u0001"));
            }
            q a5 = F.a(aVar, gVar);
            if (a5 != null) {
                if (a5.j()) {
                    int i5 = a.f83626a[this.f83624b.ordinal()];
                    if (i5 == 1) {
                        g4 = g(o4, q4, t4, u4, m4, h4) + a5.g();
                        i4 = a5.i();
                    } else {
                        if (i5 == 2) {
                            return a5.e();
                        }
                        if (i5 != 3) {
                            throw new UnsupportedOperationException(this.f83624b.name());
                        }
                        f(aVar, gVar, lVar);
                    }
                } else if (a5.k()) {
                    g4 = g(o4, q4, t4, u4, m4, h4);
                    i4 = a5.i();
                    if (this.f83625c == g.EARLIER_OFFSET) {
                        i4 = a5.f();
                    }
                }
            }
            return g(o4, q4, t4, u4, m4, h4) - F.h(aVar, gVar).get(0).i();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(lVar.G().canonical()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(o4, q4 - 1, t4, u4, m4, h4);
        int i6 = gregorianCalendar.get(1);
        int i7 = 1 + gregorianCalendar.get(2);
        int i10 = gregorianCalendar.get(5);
        int i11 = gregorianCalendar.get(11);
        int i12 = gregorianCalendar.get(12);
        int i13 = gregorianCalendar.get(13);
        if (this.f83624b == b.ABORT && (o4 != i6 || q4 != i7 || t4 != i10 || u4 != i11 || m4 != i12 || h4 != i13)) {
            f(aVar, gVar, lVar);
        }
        g4 = g(i6, i7, i10, i11, i12, i13);
        i4 = lVar.H(aVar, gVar).i();
        return g4 - i4;
    }

    int d() {
        return this.f83625c.ordinal() + (this.f83624b.ordinal() * 2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        m2.a(n.class, sb, ProtectedSandApp.s("餻\u0001"));
        sb.append(this.f83624b);
        sb.append(ProtectedSandApp.s("餼\u0001"));
        sb.append(this.f83625c);
        sb.append(']');
        return sb.toString();
    }
}
