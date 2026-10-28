package net.time4j.calendar;

import androidx.collection.n1;
import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.calendar.d;
import net.time4j.calendar.r0;
import net.time4j.calendar.z;
import net.time4j.engine.ChronoException;
import net.time4j.engine.k;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("islamic")
/* loaded from: classes7.dex */
public final class HijriCalendar extends net.time4j.engine.m<HijriCalendar> implements net.time4j.format.h {

    /* renamed from: f, reason: collision with root package name */
    private static final int f82029f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82030g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82031h = 3;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, HijriCalendar> f82035l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, HijriCalendar> f82036m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, HijriCalendar> f82037n;

    /* renamed from: o, reason: collision with root package name */
    private static final r0<HijriCalendar> f82038o;

    /* renamed from: p, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<HijriCalendar> f82039p;
    private static final long serialVersionUID = 4666707700222367373L;

    /* renamed from: t, reason: collision with root package name */
    private static final Map<String, o<HijriCalendar>> f82043t;

    /* renamed from: u, reason: collision with root package name */
    private static final net.time4j.engine.k<HijriCalendar> f82044u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0<g1, HijriCalendar> f82045v;

    /* renamed from: w, reason: collision with root package name */
    public static final o0<Integer, HijriCalendar> f82046w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0<Integer, HijriCalendar> f82047x;

    /* renamed from: y, reason: collision with root package name */
    public static final o0<Integer, HijriCalendar> f82048y;

    /* renamed from: z, reason: collision with root package name */
    public static final o0<Integer, HijriCalendar> f82049z;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82050b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82051c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82052d;

    /* renamed from: e, reason: collision with root package name */
    private final transient String f82053e;

    /* renamed from: q, reason: collision with root package name */
    public static final String f82040q = ProtectedSandApp.s("諌\u0001");

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final String f82041r = ProtectedSandApp.s("諍\u0001");

    /* renamed from: s, reason: collision with root package name */
    public static final String f82042s = ProtectedSandApp.s("諎\u0001");

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<y> f82032i = new net.time4j.calendar.service.i(ProtectedSandApp.s("諏\u0001"), HijriCalendar.class, y.class, 'G');

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, HijriCalendar> f82033j = new net.time4j.calendar.service.j(ProtectedSandApp.s("諐\u0001"), HijriCalendar.class, Integer.MIN_VALUE, Integer.MAX_VALUE, 'y', new z.a(-12), new z.a(12));

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<z, HijriCalendar> f82034k = new net.time4j.calendar.service.i(ProtectedSandApp.s("諑\u0001"), HijriCalendar.class, z.class, 'M', new z.a(-1), new z.a(1));

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82054c = 1;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82055b;

        public SPX() {
        }

        private HijriCalendar a(ObjectInput objectInput) throws IOException {
            String readUTF = objectInput.readUTF();
            String readUTF2 = objectInput.readUTF();
            if (HijriCalendar.u0(readUTF).equals(readUTF2)) {
                return HijriCalendar.E0(readUTF, objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            }
            throw new InvalidObjectException(androidx.fragment.app.y.a(ProtectedSandApp.s("誷\u0001"), readUTF, ProtectedSandApp.s("誸\u0001"), readUTF2));
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            HijriCalendar hijriCalendar = (HijriCalendar) this.f82055b;
            objectOutput.writeUTF(hijriCalendar.getVariant());
            objectOutput.writeUTF(HijriCalendar.u0(hijriCalendar.getVariant()));
            objectOutput.writeInt(hijriCalendar.o());
            objectOutput.writeByte(hijriCalendar.t0().getValue());
            objectOutput.writeByte(hijriCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82055b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 1) {
                throw new InvalidObjectException(ProtectedSandApp.s("誹\u0001"));
            }
            this.f82055b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(1);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82055b = obj;
        }
    }

    static class a implements net.time4j.engine.t<HijriCalendar, net.time4j.engine.l<HijriCalendar>> {
        a() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.l<HijriCalendar> apply(HijriCalendar hijriCalendar) {
            return hijriCalendar.y().z(hijriCalendar.getVariant());
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82056a;

        static {
            int[] iArr = new int[g.values().length];
            f82056a = iArr;
            try {
                iArr[g.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82056a[g.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82056a[g.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82056a[g.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class c implements net.time4j.engine.a0<HijriCalendar, y> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HijriCalendar hijriCalendar) {
            return HijriCalendar.f82033j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HijriCalendar hijriCalendar) {
            return HijriCalendar.f82033j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public y getMaximum(HijriCalendar hijriCalendar) {
            return y.ANNO_HEGIRAE;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public y getMinimum(HijriCalendar hijriCalendar) {
            return y.ANNO_HEGIRAE;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public y getValue(HijriCalendar hijriCalendar) {
            return y.ANNO_HEGIRAE;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HijriCalendar hijriCalendar, y yVar) {
            return yVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HijriCalendar withValue(HijriCalendar hijriCalendar, y yVar, boolean z4) {
            if (yVar != null) {
                return hijriCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("誺\u0001"));
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.a0<HijriCalendar, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82057b;

        d(int i4) {
            this.f82057b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HijriCalendar hijriCalendar) {
            if (this.f82057b == 0) {
                return HijriCalendar.f82034k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HijriCalendar hijriCalendar) {
            if (this.f82057b == 0) {
                return HijriCalendar.f82034k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(HijriCalendar hijriCalendar) {
            o<HijriCalendar> l02 = hijriCalendar.l0();
            int i4 = this.f82057b;
            if (i4 == 0) {
                return Integer.valueOf(l02.e(l02.d()).f82050b);
            }
            if (i4 == 2) {
                return Integer.valueOf(l02.b(y.ANNO_HEGIRAE, hijriCalendar.f82050b, hijriCalendar.f82051c));
            }
            if (i4 == 3) {
                return Integer.valueOf(l02.h(y.ANNO_HEGIRAE, hijriCalendar.f82050b));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誻\u0001") + this.f82057b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(HijriCalendar hijriCalendar) {
            int i4 = this.f82057b;
            if (i4 == 0) {
                o<HijriCalendar> l02 = hijriCalendar.l0();
                return Integer.valueOf(l02.e(l02.g()).f82050b);
            }
            if (i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誻\u0001") + this.f82057b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(HijriCalendar hijriCalendar) {
            int i4 = this.f82057b;
            if (i4 == 0) {
                return Integer.valueOf(hijriCalendar.f82050b);
            }
            if (i4 == 2) {
                return Integer.valueOf(hijriCalendar.f82052d);
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("誻\u0001") + this.f82057b);
            }
            o<HijriCalendar> l02 = hijriCalendar.l0();
            int i5 = 0;
            for (int i6 = 1; i6 < hijriCalendar.f82051c; i6++) {
                i5 += l02.b(y.ANNO_HEGIRAE, hijriCalendar.f82050b, i6);
            }
            return Integer.valueOf(i5 + hijriCalendar.f82052d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HijriCalendar hijriCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(hijriCalendar).compareTo(num) <= 0 && getMaximum(hijriCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HijriCalendar withValue(HijriCalendar hijriCalendar, Integer num, boolean z4) {
            if (!j(hijriCalendar, num)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("誼\u0001") + num);
            }
            int i4 = this.f82057b;
            if (i4 == 0) {
                o<HijriCalendar> l02 = hijriCalendar.l0();
                int intValue = num.intValue();
                return HijriCalendar.E0(hijriCalendar.getVariant(), intValue, hijriCalendar.f82051c, Math.min(hijriCalendar.f82052d, l02.b(y.ANNO_HEGIRAE, intValue, hijriCalendar.f82051c)));
            }
            if (i4 == 2) {
                return new HijriCalendar(hijriCalendar.f82050b, hijriCalendar.f82051c, num.intValue(), hijriCalendar.getVariant(), null);
            }
            if (i4 == 3) {
                return hijriCalendar.W(net.time4j.engine.i.i(num.intValue() - getValue(hijriCalendar).intValue()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誻\u0001") + this.f82057b);
        }
    }

    private static class e implements net.time4j.engine.u<HijriCalendar> {
        private e() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82721b;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HijriCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.k G;
            String str = (String) dVar.b(net.time4j.format.a.f82798t, "");
            if (str.isEmpty()) {
                return null;
            }
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                G = (net.time4j.tz.k) dVar.a(cVar);
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                G = net.time4j.tz.l.e0().G();
            }
            return (HijriCalendar) net.time4j.d0.y0(eVar.c()).c1(HijriCalendar.f82044u, str, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HijriCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            String str = (String) dVar.b(net.time4j.format.a.f82798t, "");
            if (str.isEmpty()) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誽\u0001"));
                return null;
            }
            o oVar = (o) HijriCalendar.f82043t.get(str);
            if (oVar == null) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誾\u0001").concat(str));
                return null;
            }
            int l4 = rVar.l(HijriCalendar.f82033j);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("調\u0001"));
                return null;
            }
            o0<z, HijriCalendar> o0Var = HijriCalendar.f82034k;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("諀\u0001");
            if (w4) {
                int value = ((z) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(HijriCalendar.f82035l);
                if (l5 != Integer.MIN_VALUE) {
                    if (oVar.c(y.ANNO_HEGIRAE, l4, value, l5)) {
                        return HijriCalendar.E0(str, l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(HijriCalendar.f82036m);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 12) {
                            int b5 = oVar.b(y.ANNO_HEGIRAE, l4, i4) + i5;
                            if (l6 <= b5) {
                                return HijriCalendar.E0(str, l4, i4, l6 - i5);
                            }
                            i4++;
                            i5 = b5;
                        }
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(HijriCalendar hijriCalendar, net.time4j.engine.d dVar) {
            return hijriCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return HijriCalendar.D0(w.WEST_ISLAMIC_CIVIL, net.time4j.engine.g0.f82720a).o() + 20;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("諁\u0001"), zVar, locale);
        }

        e(a aVar) {
        }
    }

    private static class f implements net.time4j.engine.a0<HijriCalendar, z> {
        private f() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HijriCalendar hijriCalendar) {
            return HijriCalendar.f82035l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HijriCalendar hijriCalendar) {
            return HijriCalendar.f82035l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z getMaximum(HijriCalendar hijriCalendar) {
            return z.DHU_AL_HIJJAH;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public z getMinimum(HijriCalendar hijriCalendar) {
            return z.MUHARRAM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public z getValue(HijriCalendar hijriCalendar) {
            return hijriCalendar.t0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HijriCalendar hijriCalendar, z zVar) {
            return zVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HijriCalendar withValue(HijriCalendar hijriCalendar, z zVar, boolean z4) {
            if (zVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("諂\u0001"));
            }
            int value = zVar.getValue();
            return new HijriCalendar(hijriCalendar.f82050b, value, Math.min(hijriCalendar.f82052d, hijriCalendar.l0().b(y.ANNO_HEGIRAE, hijriCalendar.f82050b, value)), hijriCalendar.getVariant(), null);
        }

        f(a aVar) {
        }
    }

    private static class h extends ConcurrentHashMap<String, o<HijriCalendar>> {
        private h() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o<HijriCalendar> get(Object obj) {
            o<HijriCalendar> oVar = (o) super.get(obj);
            if (oVar != null) {
                return oVar;
            }
            String obj2 = obj.toString();
            if (obj.equals(ProtectedSandApp.s("談\u0001"))) {
                oVar = net.time4j.calendar.b.f82361j;
            } else {
                v a5 = v.a(obj2);
                String b5 = a5.b();
                w[] values = w.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    w wVar = values[i4];
                    if (wVar.getVariant().equals(b5)) {
                        oVar = wVar.getCalendarSystem(a5.c());
                        break;
                    }
                    i4++;
                }
                if (oVar == null) {
                    try {
                        oVar = new net.time4j.calendar.b(obj2);
                    } catch (IOException | ChronoException unused) {
                        return null;
                    }
                }
            }
            o<HijriCalendar> putIfAbsent = putIfAbsent(obj2, oVar);
            return putIfAbsent != null ? putIfAbsent : oVar;
        }

        h(a aVar) {
        }
    }

    static {
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("諒\u0001"), HijriCalendar.class, 1, 30, 'd');
        f82035l = jVar;
        f82036m = new net.time4j.calendar.service.j(ProtectedSandApp.s("諓\u0001"), HijriCalendar.class, 1, 355, 'D');
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(HijriCalendar.class, r0());
        f82037n = kVar;
        r0<HijriCalendar> r0Var = new r0<>(HijriCalendar.class, jVar, kVar);
        f82038o = r0Var;
        f82039p = r0Var;
        h hVar = new h();
        hVar.put(ProtectedSandApp.s("諌\u0001"), net.time4j.calendar.b.f82361j);
        for (w wVar : w.values()) {
            hVar.put(wVar.getVariant(), wVar.getCalendarSystem(0));
        }
        f82043t = hVar;
        k.b f4 = k.b.i(HijriCalendar.class, new e(), hVar).f(f82032i, new c()).f(f82033j, new d(0)).f(f82034k, new f());
        net.time4j.engine.q<Integer> qVar = net.time4j.calendar.d.f82409a;
        o0<Integer, HijriCalendar> o0Var = f82036m;
        k.b f5 = f4.f(qVar, new l0(hVar, o0Var));
        o0<Integer, HijriCalendar> o0Var2 = f82035l;
        k.b f6 = f5.f(o0Var2, new d(2)).f(o0Var, new d(3)).f(f82037n, new s0(r0(), new a()));
        r0<HijriCalendar> r0Var2 = f82038o;
        net.time4j.engine.k<HijriCalendar> c5 = f6.f(r0Var2, new r0.a(r0Var2)).g(new d.h(HijriCalendar.class, o0Var2, o0Var, r0())).c();
        f82044u = c5;
        f82045v = net.time4j.calendar.d.i(c5, r0());
        f82046w = net.time4j.calendar.d.k(c5, r0());
        f82047x = net.time4j.calendar.d.j(c5, r0());
        f82048y = net.time4j.calendar.d.d(c5, r0());
        f82049z = net.time4j.calendar.d.c(c5, r0());
    }

    /* synthetic */ HijriCalendar(int i4, int i5, int i6, String str, a aVar) {
        this(i4, i5, i6, str);
    }

    public static HijriCalendar C0(String str, net.time4j.engine.g0 g0Var) {
        return (HijriCalendar) w0.g().c(f82044u, str, g0Var).m();
    }

    public static HijriCalendar D0(net.time4j.engine.q0 q0Var, net.time4j.engine.g0 g0Var) {
        return (HijriCalendar) w0.g().d(f82044u, q0Var, g0Var).m();
    }

    public static HijriCalendar E0(String str, int i4, int i5, int i6) {
        if (m0(str).c(y.ANNO_HEGIRAE, i4, i5, i6)) {
            return new HijriCalendar(i4, i5, i6, str);
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("諔\u0001"), i4, ProtectedSandApp.s("諕\u0001"), i5, ProtectedSandApp.s("論\u0001"));
        a5.append(i6);
        throw new IllegalArgumentException(a5.toString());
    }

    public static HijriCalendar F0(String str, int i4, z zVar, int i5) {
        return E0(str, i4, zVar.getValue(), i5);
    }

    public static HijriCalendar G0(net.time4j.engine.q0 q0Var, int i4, int i5, int i6) {
        return E0(q0Var.getVariant(), i4, i5, i6);
    }

    public static HijriCalendar H0(net.time4j.engine.q0 q0Var, int i4, z zVar, int i5) {
        return E0(q0Var.getVariant(), i4, zVar.getValue(), i5);
    }

    public static HijriCalendar I0(int i4, int i5, int i6) {
        return E0(ProtectedSandApp.s("諌\u0001"), i4, i5, i6);
    }

    public static HijriCalendar J0(int i4, z zVar, int i5) {
        return E0(ProtectedSandApp.s("諌\u0001"), i4, zVar.getValue(), i5);
    }

    public static void L0(x xVar) {
        String str = ProtectedSandApp.s("諗\u0001") + xVar.name();
        xVar.prepare();
        try {
            f82043t.put(str, new net.time4j.calendar.b(xVar));
        } catch (RuntimeException e4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("諘\u0001"), e4);
        }
    }

    public static net.time4j.engine.k<HijriCalendar> k0() {
        return f82044u;
    }

    private static o<HijriCalendar> m0(String str) {
        o<HijriCalendar> oVar = f82043t.get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new ChronoException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("諙\u0001"), str));
    }

    public static i1 r0() {
        return i1.m(g1.SUNDAY, 1, g1.FRIDAY, g1.SATURDAY);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("諚\u0001"));
    }

    public static String u0(String str) {
        o<HijriCalendar> m02 = m0(str);
        return m02 instanceof net.time4j.calendar.b ? ((net.time4j.calendar.b) net.time4j.calendar.b.class.cast(m02)).i() : "";
    }

    public static boolean v0(String str, int i4, int i5, int i6) {
        o<HijriCalendar> oVar = f82043t.get(str);
        return oVar != null && oVar.c(y.ANNO_HEGIRAE, i4, i5, i6);
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HijriCalendar A0() {
        return (HijriCalendar) N(f82034k.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HijriCalendar B0() {
        return (HijriCalendar) N(f82033j.f());
    }

    public HijriCalendar K0(int i4, g gVar) {
        try {
            return gVar.addTo(this, i4);
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(e4.getMessage());
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    @Override // net.time4j.engine.m
    protected net.time4j.engine.l<HijriCalendar> Q() {
        return m0(this.f82053e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m
    /* renamed from: R */
    public net.time4j.engine.k<HijriCalendar> y() {
        return f82044u;
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HijriCalendar)) {
            return false;
        }
        HijriCalendar hijriCalendar = (HijriCalendar) obj;
        return this.f82052d == hijriCalendar.f82052d && this.f82051c == hijriCalendar.f82051c && this.f82050b == hijriCalendar.f82050b && this.f82053e.equals(hijriCalendar.f82053e);
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        return this.f82053e;
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        return ((this.f82050b * 37) + ((this.f82051c * 31) + (this.f82052d * 17))) ^ this.f82053e.hashCode();
    }

    public net.time4j.u<HijriCalendar> i0(net.time4j.m0 m0Var) {
        return net.time4j.u.f(this, m0Var);
    }

    public net.time4j.u<HijriCalendar> j0(int i4, int i5) {
        return net.time4j.u.f(this, net.time4j.m0.b1(i4, i5));
    }

    protected o<HijriCalendar> l0() {
        return m0(this.f82053e);
    }

    protected HijriCalendar n0() {
        return this;
    }

    public int o() {
        return this.f82050b;
    }

    public g1 o0() {
        return g1.valueOf(net.time4j.base.c.d(m0(this.f82053e).f(this) + 5, 7) + 1);
    }

    public int p0() {
        return ((Integer) r(f82036m)).intValue();
    }

    public y s0() {
        return y.ANNO_HEGIRAE;
    }

    public int t() {
        return this.f82052d;
    }

    public z t0() {
        return z.valueOf(this.f82051c);
    }

    @Override // net.time4j.engine.m
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("諛\u0001"));
        String valueOf = String.valueOf(this.f82050b);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        if (this.f82051c < 10) {
            a5.append('0');
        }
        a5.append(this.f82051c);
        a5.append('-');
        if (this.f82052d < 10) {
            a5.append('0');
        }
        a5.append(this.f82052d);
        a5.append('[');
        return f3.a(a5, this.f82053e, ']');
    }

    public int w0() {
        return m0(this.f82053e).b(y.ANNO_HEGIRAE, this.f82050b, this.f82051c);
    }

    public int x0() {
        try {
            return m0(this.f82053e).h(y.ANNO_HEGIRAE, this.f82050b);
        } catch (IllegalArgumentException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    @Override // net.time4j.engine.m, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82044u;
    }

    public HijriCalendar y0(int i4, g gVar) {
        return K0(net.time4j.base.c.j(i4), gVar);
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HijriCalendar z0() {
        return (HijriCalendar) N(f82035l.f());
    }

    private HijriCalendar(int i4, int i5, int i6, String str) {
        this.f82050b = i4;
        this.f82051c = i5;
        this.f82052d = i6;
        this.f82053e = str;
    }

    public enum g implements net.time4j.engine.w {
        YEARS(3.061728E7d),
        MONTHS(2551440.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        g(double d5) {
            this.length = d5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        HijriCalendar addTo(HijriCalendar hijriCalendar, int i4) {
            int i5 = b.f82056a[ordinal()];
            if (i5 == 1) {
                return (HijriCalendar) hijriCalendar.K(HijriCalendar.f82033j, net.time4j.base.c.e(hijriCalendar.o(), i4));
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    return DAYS.addTo(hijriCalendar, net.time4j.base.c.h(i4, 7));
                }
                if (i5 == 4) {
                    return hijriCalendar.W(net.time4j.engine.i.i(i4));
                }
                throw new UnsupportedOperationException(name());
            }
            int e4 = net.time4j.base.c.e((hijriCalendar.f82051c - 1) + (hijriCalendar.f82050b * 12), i4);
            int a5 = net.time4j.base.c.a(e4, 12);
            int c5 = net.time4j.base.c.c(e4, 12) + 1;
            return HijriCalendar.E0(hijriCalendar.getVariant(), a5, c5, Math.min(hijriCalendar.f82052d, hijriCalendar.l0().b(y.ANNO_HEGIRAE, a5, c5)));
        }

        public int between(HijriCalendar hijriCalendar, HijriCalendar hijriCalendar2, String str) {
            int i4 = b.f82056a[ordinal()];
            if (i4 == 1) {
                return MONTHS.between(hijriCalendar, hijriCalendar2, str) / 12;
            }
            if (i4 == 2) {
                HijriCalendar b02 = hijriCalendar.b0(str);
                HijriCalendar b03 = hijriCalendar2.b0(str);
                int i5 = (((b03.f82051c - 1) + (b03.f82050b * 12)) - (b02.f82050b * 12)) - (b02.f82051c - 1);
                return (i5 <= 0 || b03.f82052d >= b02.f82052d) ? (i5 >= 0 || b03.f82052d <= b02.f82052d) ? i5 : i5 + 1 : i5 - 1;
            }
            if (i4 == 3) {
                return DAYS.between(hijriCalendar, hijriCalendar2, str) / 7;
            }
            if (i4 == 4) {
                return (int) net.time4j.engine.i.b(hijriCalendar, hijriCalendar2).d();
            }
            throw new UnsupportedOperationException(name());
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.w
        public boolean isCalendrical() {
            return true;
        }

        public int between(HijriCalendar hijriCalendar, HijriCalendar hijriCalendar2, net.time4j.engine.q0 q0Var) {
            return between(hijriCalendar, hijriCalendar2, q0Var.getVariant());
        }
    }
}
