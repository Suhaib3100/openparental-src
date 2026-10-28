package net.time4j.calendar;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataInputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.f0;
import net.time4j.calendar.r0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("japanese")
/* loaded from: classes7.dex */
public final class JapaneseCalendar extends net.time4j.engine.n<i, JapaneseCalendar> implements net.time4j.format.h {

    @net.time4j.engine.d0(format = "F")
    public static final g0<JapaneseCalendar> A;
    private static final h B;
    private static final net.time4j.engine.j0<i, JapaneseCalendar> C;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82105g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82106h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82107i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82108j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f82109k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f82110l = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final int f82111m = 1000000000;

    /* renamed from: n, reason: collision with root package name */
    private static final long f82112n = -36158;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f82113o;

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f82114p;

    /* renamed from: q, reason: collision with root package name */
    private static final long[] f82115q;

    /* renamed from: r, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.format.v<f0> f82116r;

    /* renamed from: s, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, JapaneseCalendar> f82117s;
    private static final long serialVersionUID = -153630575450868922L;

    /* renamed from: t, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82118t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.format.v<l> f82119u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0<Integer, JapaneseCalendar> f82120v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, JapaneseCalendar> f82121w;

    /* renamed from: x, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, JapaneseCalendar> f82122x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, JapaneseCalendar> f82123y;

    /* renamed from: z, reason: collision with root package name */
    private static final r0<JapaneseCalendar> f82124z;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82125b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82126c;

    /* renamed from: d, reason: collision with root package name */
    private final transient f0 f82127d;

    /* renamed from: e, reason: collision with root package name */
    private final transient l f82128e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f82129f;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82130c = 9;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82131b;

        public SPX() {
        }

        private JapaneseCalendar a(ObjectInput objectInput) throws IOException {
            return JapaneseCalendar.H0().y().e(JapaneseCalendar.f1(objectInput.readInt(), objectInput.readInt()));
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            JapaneseCalendar japaneseCalendar = (JapaneseCalendar) this.f82131b;
            objectOutput.writeInt(japaneseCalendar.S0().s() + (japaneseCalendar.o() - 1));
            objectOutput.writeInt(japaneseCalendar.Q0());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82131b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 9) {
                throw new InvalidObjectException(ProtectedSandApp.s("謐\u0001"));
            }
            this.f82131b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(9);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82131b = obj;
        }
    }

    static class a implements net.time4j.engine.t<JapaneseCalendar, net.time4j.engine.l<JapaneseCalendar>> {
        a() {
        }

        public net.time4j.engine.l<JapaneseCalendar> a(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.B;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<JapaneseCalendar> apply(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.B;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82132a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82133b;

        static {
            int[] iArr = new int[i.values().length];
            f82133b = iArr;
            try {
                iArr[i.ERAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82133b[i.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82133b[i.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82133b[i.WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82133b[i.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[net.time4j.format.g.values().length];
            f82132a = iArr2;
            try {
                iArr2[net.time4j.format.g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82132a[net.time4j.format.g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class c implements net.time4j.engine.e0<JapaneseCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82134b;

        c(int i4) {
            this.f82134b = i4;
        }

        private static JapaneseCalendar p(JapaneseCalendar japaneseCalendar, int i4) {
            l lVar = japaneseCalendar.f82128e;
            int number = lVar.getNumber();
            if (i4 >= 1873) {
                if (lVar.e()) {
                    lVar = l.f(lVar.getNumber());
                }
            } else if (lVar.e() && JapaneseCalendar.f82113o[i4 - 701] != number + 1) {
                lVar = l.f(lVar.getNumber());
            }
            return JapaneseCalendar.J0(japaneseCalendar, i4, lVar, Math.min(japaneseCalendar.f82129f, JapaneseCalendar.T0(i4, lVar)));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JapaneseCalendar japaneseCalendar) {
            return getChildAtFloor(japaneseCalendar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JapaneseCalendar japaneseCalendar) {
            int i4 = this.f82134b;
            if (i4 == 0) {
                return JapaneseCalendar.f82119u;
            }
            if (i4 == 1) {
                return JapaneseCalendar.f82121w;
            }
            if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                return null;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(JapaneseCalendar japaneseCalendar) {
            int i4 = this.f82134b;
            if (i4 == 0) {
                return japaneseCalendar.o();
            }
            if (i4 == 1) {
                return JapaneseCalendar.X0(japaneseCalendar.f82125b, japaneseCalendar.f82128e);
            }
            if (i4 == 2) {
                return japaneseCalendar.f82129f;
            }
            if (i4 == 3) {
                return japaneseCalendar.f82126c;
            }
            if (i4 == 4) {
                return japaneseCalendar.f82125b;
            }
            if (i4 == 5) {
                return japaneseCalendar.f82125b + 660;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
        }

        int g(JapaneseCalendar japaneseCalendar) {
            int i4 = this.f82134b;
            if (i4 == 0) {
                f0 f0Var = japaneseCalendar.f82127d;
                f0 o4 = f0Var.o();
                return o4 != null ? (o4.s() - f0Var.s()) + 1 : 1000000000 - f0.b.f82444b.getDefaultMaximum().s();
            }
            if (i4 == 1) {
                return (japaneseCalendar.f82125b >= 1873 || JapaneseCalendar.f82113o[japaneseCalendar.f82125b + (-701)] == 0) ? 12 : 13;
            }
            if (i4 == 2) {
                return JapaneseCalendar.T0(japaneseCalendar.f82125b, japaneseCalendar.f82128e);
            }
            if (i4 == 3) {
                return JapaneseCalendar.U0(japaneseCalendar.f82125b);
            }
            if (i4 == 4) {
                return 999999999;
            }
            if (i4 == 5) {
                return 1000000659;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(JapaneseCalendar japaneseCalendar) {
            return Integer.valueOf(g(japaneseCalendar));
        }

        int i() {
            int i4 = this.f82134b;
            if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
                return 1;
            }
            if (i4 == 4) {
                return w.h.f22555k;
            }
            if (i4 == 5) {
                return 1361;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(JapaneseCalendar japaneseCalendar) {
            return Integer.valueOf(i());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(JapaneseCalendar japaneseCalendar) {
            return Integer.valueOf(d(japaneseCalendar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(JapaneseCalendar japaneseCalendar, int i4) {
            int i5 = this.f82134b;
            if (i5 != 0 && i5 != 1 && i5 != 2 && i5 != 3) {
                if (i5 == 4) {
                    return japaneseCalendar.f82125b == i4;
                }
                if (i5 != 5) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
                }
            }
            return i4 >= 1 && i4 <= g(japaneseCalendar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean j(JapaneseCalendar japaneseCalendar, Integer num) {
            return num != null && e(japaneseCalendar, num.intValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.e0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar a(JapaneseCalendar japaneseCalendar, int i4, boolean z4) {
            l f4;
            if (!e(japaneseCalendar, i4)) {
                if (this.f82134b == 4) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("謒\u0001"));
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("謓\u0001"), i4));
            }
            int i5 = this.f82134b;
            if (i5 == 0) {
                return p(japaneseCalendar, (japaneseCalendar.f82127d.s() + i4) - 1);
            }
            if (i5 == 1) {
                if (japaneseCalendar.f82125b >= 1873) {
                    f4 = l.f(i4);
                } else {
                    byte b5 = JapaneseCalendar.f82113o[japaneseCalendar.f82125b - 701];
                    f4 = (b5 == 0 || b5 > i4) ? l.f(i4) : i4 == b5 ? l.f(i4 - 1).g() : l.f(i4 - 1);
                }
                return (JapaneseCalendar) japaneseCalendar.M(JapaneseCalendar.f82119u, f4);
            }
            if (i5 == 2) {
                return JapaneseCalendar.J0(japaneseCalendar, japaneseCalendar.f82125b, japaneseCalendar.f82128e, i4);
            }
            if (i5 == 3) {
                return new JapaneseCalendar(japaneseCalendar.f82127d, japaneseCalendar.f82125b, i4, null);
            }
            if (i5 == 4) {
                return japaneseCalendar;
            }
            if (i5 == 5) {
                return p(japaneseCalendar, i4 - 660);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("謑\u0001") + this.f82134b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar withValue(JapaneseCalendar japaneseCalendar, Integer num, boolean z4) {
            if (num != null) {
                return a(japaneseCalendar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("謔\u0001"));
        }
    }

    private static class d implements net.time4j.engine.o0<JapaneseCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final i f82135a;

        d(i iVar) {
            this.f82135a = iVar;
        }

        private static void e(long j4) {
            if (Math.abs(j4) >= 25000) {
                throw new ArithmeticException(ProtectedSandApp.s("謕\u0001"));
            }
        }

        private static JapaneseCalendar f(JapaneseCalendar japaneseCalendar, long j4) {
            int s4;
            f0 f0Var = japaneseCalendar.f82127d;
            int o4 = japaneseCalendar.o();
            l lVar = japaneseCalendar.f82128e;
            int i4 = japaneseCalendar.f82129f;
            f0.d dVar = f0.d.NORTHERN_COURT;
            f0Var.getClass();
            if (dVar.test(f0Var)) {
                f0Var = f0.I(japaneseCalendar.f82125b, f0.d.OFFICIAL);
                o4 = (japaneseCalendar.f82125b - f0Var.s()) + 1;
            }
            f0 F = f0.F(net.time4j.base.c.e(f0Var.t(), net.time4j.base.c.g(j4)));
            f0 o5 = F.o();
            if (o5 != null && o4 > (s4 = (o5.s() - F.s()) + 1)) {
                o4 = s4;
            }
            int s5 = F.s() + (o4 - 1);
            if (s5 >= 1873) {
                if (lVar.e()) {
                    lVar = l.f(lVar.getNumber());
                }
            } else if (lVar.e() && JapaneseCalendar.f82113o[s5 - 701] == 0) {
                lVar = l.f(lVar.getNumber());
            }
            int T0 = JapaneseCalendar.T0(s5, lVar);
            if (i4 > T0) {
                i4 = T0;
            }
            return JapaneseCalendar.d1(F, o4, lVar, i4, net.time4j.format.g.SMART);
        }

        private static int g(JapaneseCalendar japaneseCalendar, JapaneseCalendar japaneseCalendar2) {
            f0 f0Var = japaneseCalendar.f82127d;
            int o4 = japaneseCalendar.o();
            int X0 = JapaneseCalendar.X0(japaneseCalendar.f82125b, japaneseCalendar.f82128e);
            int i4 = japaneseCalendar.f82129f;
            f0.d dVar = f0.d.NORTHERN_COURT;
            f0Var.getClass();
            if (dVar.test(f0Var)) {
                f0Var = f0.I(japaneseCalendar.f82125b, f0.d.OFFICIAL);
                o4 = (japaneseCalendar.f82125b - f0Var.s()) + 1;
            }
            f0 f0Var2 = japaneseCalendar2.f82127d;
            int o5 = japaneseCalendar2.o();
            int X02 = JapaneseCalendar.X0(japaneseCalendar2.f82125b, japaneseCalendar2.f82128e);
            int i5 = japaneseCalendar2.f82129f;
            f0Var2.getClass();
            if (dVar.test(f0Var2)) {
                f0Var2 = f0.I(japaneseCalendar2.f82125b, f0.d.OFFICIAL);
                o5 = (japaneseCalendar2.f82125b - f0Var2.s()) + 1;
            }
            int t4 = f0Var2.t() - f0Var.t();
            if (t4 > 0) {
                if (o4 <= o5) {
                    if (o4 != o5) {
                        return t4;
                    }
                    if (X0 <= X02 && (X0 != X02 || i4 <= i5)) {
                        return t4;
                    }
                }
                return t4 - 1;
            }
            if (t4 >= 0) {
                return t4;
            }
            if (o4 >= o5) {
                if (o4 != o5) {
                    return t4;
                }
                if (X0 >= X02 && (X0 != X02 || i4 >= i5)) {
                    return t4;
                }
            }
            return t4 + 1;
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar b(JapaneseCalendar japaneseCalendar, long j4) {
            boolean z4;
            int i4;
            int i5 = b.f82133b[this.f82135a.ordinal()];
            if (i5 == 1) {
                try {
                    return f(japaneseCalendar, j4);
                } catch (IndexOutOfBoundsException e4) {
                    throw new IllegalArgumentException(e4);
                }
            }
            if (i5 == 2) {
                try {
                    int e5 = net.time4j.base.c.e(japaneseCalendar.f82125b, net.time4j.base.c.g(j4));
                    l lVar = japaneseCalendar.f82128e;
                    int number = lVar.getNumber();
                    if (e5 >= 1873) {
                        if (lVar.e()) {
                            lVar = l.f(number);
                        }
                    } else if (lVar.e() && JapaneseCalendar.f82113o[e5 - 701] != number + 1) {
                        lVar = l.f(number);
                    }
                    return JapaneseCalendar.J0(japaneseCalendar, e5, lVar, Math.min(japaneseCalendar.f82129f, JapaneseCalendar.T0(e5, lVar)));
                } catch (IndexOutOfBoundsException e6) {
                    throw new IllegalArgumentException(e6);
                }
            }
            if (i5 != 3) {
                if (i5 == 4) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i5 != 5) {
                    throw new UnsupportedOperationException(this.f82135a.name());
                }
                JapaneseCalendar e7 = JapaneseCalendar.B.e(net.time4j.base.c.f(JapaneseCalendar.B.f(japaneseCalendar), j4));
                f0 f0Var = japaneseCalendar.f82127d;
                f0.d dVar = f0.d.NORTHERN_COURT;
                f0Var.getClass();
                return dVar.test(f0Var) ? e7.g1() : e7;
            }
            try {
                e(j4);
                int i6 = japaneseCalendar.f82125b;
                int X0 = JapaneseCalendar.X0(i6, japaneseCalendar.f82128e);
                int i7 = j4 > 0 ? 1 : -1;
                while (j4 != 0) {
                    X0 += i7;
                    int i10 = 12;
                    if (i6 >= 1873) {
                        if (X0 == 0) {
                            i4 = i6 - 1;
                            if (i4 < 1873) {
                                if (JapaneseCalendar.f82113o[i6 - 702] == 0) {
                                }
                                i10 = 13;
                            }
                            i6 = i4;
                            X0 = i10;
                        } else {
                            if (X0 != 13) {
                            }
                            i6++;
                            X0 = 1;
                        }
                    } else if (X0 == 0) {
                        i4 = i6 - 1;
                        if (JapaneseCalendar.f82113o[i6 - 702] == 0) {
                            i6 = i4;
                            X0 = i10;
                        }
                        i10 = 13;
                        i6 = i4;
                        X0 = i10;
                    } else {
                        if (JapaneseCalendar.f82113o[i6 - 701] != 0) {
                            i10 = 13;
                        }
                        if (X0 > i10) {
                            i6++;
                            X0 = 1;
                        }
                    }
                    j4 -= i7;
                }
                if (i6 >= 1873) {
                    f0 I = f0.I(i6, f0.d.MODERN);
                    l f4 = l.f(X0);
                    return JapaneseCalendar.d1(I, (i6 - I.s()) + 1, f4, Math.min(japaneseCalendar.f82129f, JapaneseCalendar.T0(i6, f4)), net.time4j.format.g.SMART);
                }
                byte b5 = JapaneseCalendar.f82113o[i6 - 701];
                if (b5 > 0) {
                    int i11 = b5 <= X0 ? X0 - 1 : X0;
                    z4 = b5 == X0;
                    X0 = i11;
                } else {
                    z4 = false;
                }
                l f5 = l.f(X0);
                if (z4) {
                    f5 = f5.g();
                }
                return JapaneseCalendar.J0(japaneseCalendar, i6, f5, Math.min(japaneseCalendar.f82129f, JapaneseCalendar.T0(i6, f5)));
            } catch (IndexOutOfBoundsException e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        
            if (net.time4j.calendar.JapaneseCalendar.f82113o[r3 - 702] != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        
            r8 = 13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
        
            if (net.time4j.calendar.JapaneseCalendar.f82113o[r3 - 702] == 0) goto L41;
         */
        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long a(net.time4j.calendar.JapaneseCalendar r12, net.time4j.calendar.JapaneseCalendar r13) {
            /*
                Method dump skipped, instructions count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.JapaneseCalendar.d.a(net.time4j.calendar.JapaneseCalendar, net.time4j.calendar.JapaneseCalendar):long");
        }
    }

    private static class e implements net.time4j.engine.u<JapaneseCalendar> {
        private e() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.k G;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                G = (net.time4j.tz.k) dVar.a(cVar);
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                G = net.time4j.tz.l.e0().G();
            }
            return (JapaneseCalendar) net.time4j.d0.y0(eVar.c()).d1(JapaneseCalendar.C, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            l lVar;
            f0 f0Var = (f0) rVar.r(JapaneseCalendar.f82116r);
            if (f0Var == null) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("謖\u0001"));
                return null;
            }
            int l4 = rVar.l(JapaneseCalendar.f82117s);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("謗\u0001"));
                return null;
            }
            int s4 = f0Var.s() + l4;
            int i4 = s4 - 1;
            net.time4j.format.v<l> vVar = JapaneseCalendar.f82119u;
            if (rVar.w(vVar)) {
                lVar = (l) rVar.r(vVar);
            } else {
                o0<Integer, JapaneseCalendar> o0Var = JapaneseCalendar.f82120v;
                if (rVar.w(o0Var)) {
                    int l5 = rVar.l(o0Var);
                    if (i4 >= 1873) {
                        lVar = l.f(l5);
                    } else {
                        byte b5 = JapaneseCalendar.f82113o[s4 - 702];
                        lVar = l5 == b5 ? l.f(l5 - 1).g() : l5 > b5 ? l.f(l5 - 1) : l.f(l5);
                    }
                } else {
                    lVar = null;
                }
            }
            if (lVar != null) {
                int l6 = rVar.l(JapaneseCalendar.f82121w);
                if (l6 != Integer.MIN_VALUE) {
                    return JapaneseCalendar.d1(f0Var, l4, lVar, l6, z4 ? net.time4j.format.g.LAX : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART));
                }
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("謘\u0001"));
                return null;
            }
            int l7 = rVar.l(JapaneseCalendar.f82122x);
            if (l7 != Integer.MIN_VALUE && l7 <= JapaneseCalendar.U0(i4)) {
                try {
                    return JapaneseCalendar.d1(f0Var, l4, JapaneseCalendar.W0(i4, l7), JapaneseCalendar.O0(i4, l7), z4 ? net.time4j.format.g.LAX : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART));
                } catch (IllegalArgumentException unused) {
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("謙\u0001"));
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
        public net.time4j.engine.p k(JapaneseCalendar japaneseCalendar, net.time4j.engine.d dVar) {
            return japaneseCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return 100;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("謚\u0001"), zVar, locale);
        }

        e(a aVar) {
        }
    }

    private static class f extends k implements net.time4j.engine.a0<JapaneseCalendar, l> {

        /* renamed from: c, reason: collision with root package name */
        static final f f82136c = new f();
        private static final long serialVersionUID = -2978966174642315851L;

        private f() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public boolean j(JapaneseCalendar japaneseCalendar, l lVar) {
            if (lVar == null) {
                return false;
            }
            return japaneseCalendar.f82125b >= 1873 ? !lVar.e() : !lVar.e() || JapaneseCalendar.f82113o[japaneseCalendar.f82125b + (-701)] == lVar.getNumber() + 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar withValue(JapaneseCalendar japaneseCalendar, l lVar, boolean z4) {
            if (j(japaneseCalendar, lVar)) {
                return JapaneseCalendar.J0(japaneseCalendar, japaneseCalendar.f82125b, lVar, Math.min(japaneseCalendar.f82129f, JapaneseCalendar.T0(japaneseCalendar.f82125b, lVar)));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("謢\u0001") + lVar);
        }

        @Override // net.time4j.calendar.k, net.time4j.format.v
        /* renamed from: n */
        public l parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            int intValue = ((Integer) dVar.b(pe.a.G2, 0)).intValue();
            int index = parsePosition.getIndex();
            if (intValue == 0) {
                net.time4j.e0 e0Var = (net.time4j.e0) net.time4j.format.b.f(locale).n((net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).d(charSequence, parsePosition, net.time4j.e0.class, dVar);
                if (e0Var != null) {
                    return l.f(e0Var.getValue());
                }
                parsePosition.setIndex(index);
                parsePosition.setErrorIndex(-1);
            }
            return super.parse(charSequence, parsePosition, dVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82121w;
        }

        @Override // net.time4j.calendar.k, net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            if (((Integer) pVar.r(net.time4j.calendar.d.f82409a)).intValue() < 1873) {
                super.print(pVar, appendable, dVar);
                return;
            }
            int intValue = ((Integer) dVar.b(pe.a.G2, 0)).intValue();
            int number = ((l) pVar.r(JapaneseCalendar.f82119u)).getNumber();
            if (intValue == 0) {
                appendable.append(net.time4j.format.b.f((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).n((net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).g(net.time4j.e0.valueOf(number)));
                return;
            }
            net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
            char charValue = ((Character) dVar.b(net.time4j.format.a.f82791m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue();
            String a5 = pe.b.a(jVar, charValue, number);
            if (jVar.isDecimal()) {
                for (int length = intValue - a5.length(); length > 0; length--) {
                    appendable.append(charValue);
                }
            }
            appendable.append(a5);
        }

        @Override // net.time4j.calendar.k
        protected Object readResolve() throws ObjectStreamException {
            return f82136c;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82121w;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public l getMaximum(JapaneseCalendar japaneseCalendar) {
            l f4 = l.f(12);
            return (japaneseCalendar.f82125b >= 1873 || JapaneseCalendar.f82113o[japaneseCalendar.f82125b + (-701)] != 13) ? f4 : f4.g();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public l getMinimum(JapaneseCalendar japaneseCalendar) {
            return l.f(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public l getValue(JapaneseCalendar japaneseCalendar) {
            return japaneseCalendar.f82128e;
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<JapaneseCalendar, f0> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82117s;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82117s;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public f0 getMaximum(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82116r.getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public f0 getMinimum(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f82116r.getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public f0 getValue(JapaneseCalendar japaneseCalendar) {
            return japaneseCalendar.f82127d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JapaneseCalendar japaneseCalendar, f0 f0Var) {
            return f0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar withValue(JapaneseCalendar japaneseCalendar, f0 f0Var, boolean z4) {
            int s4;
            int o4 = japaneseCalendar.o();
            l lVar = japaneseCalendar.f82128e;
            int i4 = japaneseCalendar.f82129f;
            f0 o5 = f0Var.o();
            if (o5 != null && o4 > (s4 = (o5.s() - f0Var.s()) + 1)) {
                o4 = s4;
            }
            int s5 = f0Var.s() + (o4 - 1);
            if (s5 >= 1873) {
                if (lVar.e()) {
                    lVar = l.f(lVar.getNumber());
                }
            } else if (lVar.e() && JapaneseCalendar.f82113o[s5 - 701] == 0) {
                lVar = l.f(lVar.getNumber());
            }
            int T0 = JapaneseCalendar.T0(s5, lVar);
            if (i4 > T0) {
                i4 = T0;
            }
            return JapaneseCalendar.d1(f0Var, o4, lVar, i4, z4 ? net.time4j.format.g.LAX : net.time4j.format.g.SMART);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.l<JapaneseCalendar> {
        private h() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return f0.B();
        }

        @Override // net.time4j.engine.l
        public long d() {
            return 365241779741L;
        }

        @Override // net.time4j.engine.l
        public long g() {
            return JapaneseCalendar.f82115q[0];
        }

        void i(long j4) {
            if (j4 < g() || j4 > d()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謣\u0001"));
            }
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long f(JapaneseCalendar japaneseCalendar) {
            return JapaneseCalendar.f1(japaneseCalendar.f82125b, japaneseCalendar.f82126c);
        }

        @Override // net.time4j.engine.l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public JapaneseCalendar e(long j4) {
            if (j4 >= JapaneseCalendar.f82112n) {
                net.time4j.l0 w12 = net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC);
                int o4 = w12.o();
                return new JapaneseCalendar(JapaneseCalendar.K0(false, o4, j4), o4, w12.e1(), l.f(w12.q()), w12.t(), null);
            }
            int L0 = JapaneseCalendar.L0(j4);
            if (L0 < 0) {
                throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("謤\u0001"), j4));
            }
            int i4 = L0 + w.h.f22555k;
            return new JapaneseCalendar(JapaneseCalendar.K0(false, i4, j4), i4, (int) ((j4 - JapaneseCalendar.f82115q[L0]) + 1), null);
        }

        h(a aVar) {
        }
    }

    public enum i implements net.time4j.engine.w {
        ERAS(2.147483647E9d),
        YEARS(3.1556952E7d),
        MONTHS(2592000.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        i(double d5) {
            this.length = d5;
        }

        public long between(JapaneseCalendar japaneseCalendar, JapaneseCalendar japaneseCalendar2) {
            return japaneseCalendar.Y(japaneseCalendar2, this);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.w
        public boolean isCalendrical() {
            return true;
        }
    }

    private static class j extends net.time4j.calendar.service.j<JapaneseCalendar> implements pe.a {
        private static final long serialVersionUID = -8502388572788955989L;

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // net.time4j.format.v
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int i4;
            net.time4j.engine.c<net.time4j.format.j> cVar = net.time4j.format.a.f82790l;
            net.time4j.format.j jVar = net.time4j.format.j.ARABIC;
            net.time4j.format.j jVar2 = (net.time4j.format.j) dVar.b(cVar, jVar);
            int index = parsePosition.getIndex();
            if (jVar2 == jVar && charSequence.charAt(index) == 20803 && ((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).getLanguage().equals(ProtectedSandApp.s("謬\u0001"))) {
                parsePosition.setIndex(index + 1);
                return 1;
            }
            net.time4j.engine.c<Character> cVar2 = net.time4j.format.a.f82791m;
            int i5 = 0;
            char charValue = dVar.c(cVar2) ? ((Character) dVar.a(cVar2)).charValue() : jVar2.isDecimal() ? jVar2.getDigits().charAt(0) : '0';
            net.time4j.format.g gVar = jVar2.isDecimal() ? net.time4j.format.g.SMART : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
            if (jVar2.isDecimal()) {
                int min = Math.min(index + 9, charSequence.length());
                int i6 = index;
                i4 = i6;
                while (i6 < min) {
                    int charAt = charSequence.charAt(i6) - charValue;
                    if (charAt < 0 || charAt > 9) {
                        break;
                    }
                    i5 = (i5 * 10) + charAt;
                    i4++;
                    i6++;
                }
            } else {
                int length = charSequence.length();
                int i7 = 0;
                for (int i10 = index; i10 < length && jVar2.contains(charSequence.charAt(i10)); i10++) {
                    i7++;
                }
                if (i7 > 0) {
                    i4 = index + i7;
                    i5 = jVar2.toInteger(charSequence.subSequence(index, i4).toString(), gVar);
                } else {
                    i4 = index;
                }
            }
            if (i4 == index) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            parsePosition.setIndex(i4);
            return Integer.valueOf(i5);
        }

        @Override // pe.a
        public void T(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c5, int i4, int i5) throws IOException, ChronoException {
            int l4 = pVar.l(this);
            if (l4 == 1 && jVar == net.time4j.format.j.ARABIC && ((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).getLanguage().equals(ProtectedSandApp.s("謬\u0001"))) {
                appendable.append((char) 20803);
                return;
            }
            String numeral = jVar.toNumeral(l4);
            if (jVar.isDecimal()) {
                int length = i4 - numeral.length();
                for (int i6 = 0; i6 < length; i6++) {
                    appendable.append(c5);
                }
            }
            appendable.append(numeral);
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
            net.time4j.engine.c<Character> cVar = net.time4j.format.a.f82791m;
            T(pVar, appendable, dVar, jVar, dVar.c(cVar) ? ((Character) dVar.a(cVar)).charValue() : jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0', 1, 9);
        }

        @Override // pe.a
        public Integer x(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, net.time4j.engine.r<?> rVar) {
            return parse(charSequence, parsePosition, dVar);
        }

        private j() {
            super(ProtectedSandApp.s("謫\u0001"), JapaneseCalendar.class, 1, 1000000000 - f0.b.f82444b.getDefaultMaximum().s(), 'y', null, null);
        }
    }

    static {
        net.time4j.base.d c5 = net.time4j.base.d.c();
        String s4 = ProtectedSandApp.s("謭\u0001");
        String s5 = ProtectedSandApp.s("謮\u0001");
        InputStream e4 = net.time4j.base.d.c().e(c5.f(s4, JapaneseCalendar.class, s5), true);
        try {
            if (e4 == null) {
                try {
                    e4 = net.time4j.base.d.c().d(JapaneseCalendar.class, s5, true);
                } catch (IOException e5) {
                    throw new IllegalStateException(e5);
                }
            }
            DataInputStream dataInputStream = new DataInputStream(e4);
            byte[] bArr = new byte[1172];
            int[] iArr = new int[1172];
            long[] jArr = new long[1172];
            long j4 = -464176;
            int i4 = 0;
            for (int i5 = 1172; i4 < i5; i5 = 1172) {
                byte readByte = dataInputStream.readByte();
                int readShort = dataInputStream.readShort();
                bArr[i4] = readByte;
                iArr[i4] = readShort;
                jArr[i4] = j4;
                int i6 = 1;
                int i7 = 0;
                while (true) {
                    if (i6 <= (readByte == 0 ? 12 : 13)) {
                        i7 += (readShort & 1) == 1 ? 30 : 29;
                        readShort >>>= 1;
                        i6++;
                    }
                }
                j4 += i7;
                i4++;
            }
            f82113o = bArr;
            f82114p = iArr;
            f82115q = jArr;
            if (e4 != null) {
                try {
                    e4.close();
                } catch (IOException e6) {
                    e6.printStackTrace(System.err);
                }
            }
            f0.b bVar = f0.b.f82444b;
            f82116r = bVar;
            j jVar = new j(null);
            f82117s = jVar;
            net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謯\u0001"), JapaneseCalendar.class, 1361, 1000000659, (char) 0, null, null);
            f82118t = jVar2;
            f fVar = new f();
            f82119u = fVar;
            net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謰\u0001"), JapaneseCalendar.class, 1, 12, (char) 0, null, null);
            f82120v = jVar3;
            net.time4j.calendar.service.j jVar4 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謱\u0001"), JapaneseCalendar.class, 1, 31, 'd');
            f82121w = jVar4;
            net.time4j.calendar.service.j jVar5 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謲\u0001"), JapaneseCalendar.class, 1, 365, 'D');
            f82122x = jVar5;
            Locale locale = Locale.JAPAN;
            net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(JapaneseCalendar.class, i1.k(locale));
            f82123y = kVar;
            r0<JapaneseCalendar> r0Var = new r0<>(JapaneseCalendar.class, jVar4, kVar);
            f82124z = r0Var;
            A = r0Var;
            h hVar = new h();
            B = hVar;
            j0.c m4 = j0.c.m(i.class, JapaneseCalendar.class, new e(), hVar);
            g gVar = new g();
            i iVar = i.ERAS;
            j0.c g4 = m4.g(bVar, gVar, iVar);
            c cVar = new c(0);
            i iVar2 = i.YEARS;
            j0.c g5 = g4.g(jVar, cVar, iVar2);
            f fVar2 = f.f82136c;
            i iVar3 = i.MONTHS;
            j0.c g6 = g5.g(fVar, fVar2, iVar3).g(jVar3, new c(1), iVar3);
            c cVar2 = new c(2);
            i iVar4 = i.DAYS;
            j0.c i10 = g6.g(jVar4, cVar2, iVar4).g(jVar5, new c(3), iVar4).g(kVar, new s0(i1.k(locale), new a()), iVar4).f(r0Var, new r0.a(r0Var)).g(jVar2, new c(5), iVar2).f(net.time4j.calendar.d.f82409a, new c(4)).i(iVar, new d(iVar), iVar.getLength()).i(iVar2, new d(iVar2), iVar2.getLength()).i(iVar3, new d(iVar3), iVar3.getLength());
            i iVar5 = i.WEEKS;
            C = i10.j(iVar5, new d(iVar5), iVar5.getLength(), Collections.singleton(iVar4)).j(iVar4, new d(iVar4), iVar4.getLength(), Collections.singleton(iVar5)).c();
        } finally {
        }
    }

    /* synthetic */ JapaneseCalendar(f0 f0Var, int i4, int i5, l lVar, int i6, a aVar) {
        this(f0Var, i4, i5, lVar, i6);
    }

    public static net.time4j.engine.j0<i, JapaneseCalendar> H0() {
        return C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JapaneseCalendar J0(JapaneseCalendar japaneseCalendar, int i4, l lVar, int i5) {
        f0 H = f0.H(i4);
        JapaneseCalendar d12 = d1(H, (i4 - H.s()) + 1, lVar, i5, net.time4j.format.g.SMART);
        f0 f0Var = japaneseCalendar.f82127d;
        f0.d dVar = f0.d.NORTHERN_COURT;
        f0Var.getClass();
        return dVar.test(f0Var) ? d12.g1() : d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f0 K0(boolean z4, int i4, long j4) {
        f0 p4;
        f0 I = (!z4 || i4 < 1332 || i4 >= 1394) ? f0.I(i4, f0.d.OFFICIAL) : f0.I(i4, f0.d.NORTHERN_COURT);
        while (I.w() > j4 && (p4 = I.p()) != null) {
            I = p4;
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L0(long j4) {
        int length = f82115q.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) >> 1;
            if (f82115q[i5] <= j4) {
                i4 = i5 + 1;
            } else {
                length = i5 - 1;
            }
        }
        return i4 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O0(int i4, int i5) {
        l W0 = W0(i4, i5);
        if (i4 >= 1873) {
            int number = W0.getNumber();
            for (int i6 = 1; i6 < number; i6++) {
                i5 -= net.time4j.base.b.d(i4, i6);
            }
        } else {
            int X0 = X0(i4, W0);
            int i7 = f82114p[i4 - 701];
            for (int i10 = 1; i10 < X0; i10++) {
                i5 -= (i7 & 1) == 1 ? 30 : 29;
                i7 >>>= 1;
            }
        }
        return i5;
    }

    public static i1 R0() {
        return i1.k(Locale.JAPAN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T0(int i4, l lVar) {
        if (i4 >= 1873) {
            return net.time4j.base.b.d(i4, lVar.getNumber());
        }
        if (i4 == 1872 && lVar.getNumber() == 12) {
            return 2;
        }
        int X0 = X0(i4, lVar);
        int i5 = f82114p[i4 - 701];
        for (int i6 = 1; i6 <= X0; i6++) {
            if (i6 == X0) {
                return (i5 & 1) == 1 ? 30 : 29;
            }
            i5 >>>= 1;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int U0(int i4) {
        if (i4 >= 1873) {
            return net.time4j.base.b.e(i4) ? 366 : 365;
        }
        if (i4 == 1872) {
            return (int) (f82112n - f82115q[1171]);
        }
        int i5 = i4 - 701;
        int i6 = f82114p[i5];
        int i7 = f82113o[i5] == 0 ? 12 : 13;
        int i10 = 0;
        for (int i11 = 1; i11 <= i7; i11++) {
            i10 += (i6 & 1) == 1 ? 30 : 29;
            i6 >>>= 1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l W0(int i4, int i5) {
        if (i5 >= 1) {
            int i6 = 0;
            if (i4 >= 1873) {
                for (int i7 = 1; i7 <= 12; i7++) {
                    i6 += net.time4j.base.b.d(i4, i7);
                    if (i6 >= i5) {
                        return l.f(i7);
                    }
                }
            } else {
                int i10 = i4 - 701;
                byte b5 = f82113o[i10];
                int i11 = f82114p[i10];
                int i12 = b5 != 0 ? 13 : 12;
                int i13 = 1;
                while (i13 <= i12) {
                    i6 += (i11 & 1) == 1 ? 30 : 29;
                    i11 >>>= 1;
                    if (i6 >= i5) {
                        l f4 = l.f((b5 <= 0 || b5 > i13) ? i13 : i13 - 1);
                        return i13 == b5 ? f4.g() : f4;
                    }
                    i13++;
                }
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("謳\u0001"), i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int X0(int i4, l lVar) {
        int number = lVar.getNumber();
        if (i4 >= 1873) {
            return number;
        }
        byte b5 = f82113o[i4 - 701];
        return (lVar.e() || (b5 > 0 && number >= b5)) ? number + 1 : number;
    }

    public static JapaneseCalendar b1() {
        return (JapaneseCalendar) w0.g().f(C);
    }

    public static JapaneseCalendar c1(f0 f0Var, int i4, l lVar, int i5) {
        return d1(f0Var, i4, lVar, i5, net.time4j.format.g.SMART);
    }

    public static JapaneseCalendar d1(f0 f0Var, int i4, l lVar, int i5, net.time4j.format.g gVar) {
        f0 f0Var2;
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("謽\u0001"), i4));
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("謼\u0001"), i5));
        }
        int s4 = f0Var.s() + i4;
        int i6 = s4 - 1;
        f0 o4 = f0Var.o();
        if (o4 != null && o4.s() < i6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("謴\u0001") + f0Var + ProtectedSandApp.s("謵\u0001") + i4);
        }
        String s5 = ProtectedSandApp.s("謶\u0001");
        int i7 = 0;
        if (i6 < 1873) {
            int i10 = s4 - 702;
            int i11 = f82114p[i10];
            int X0 = X0(i6, lVar);
            if (lVar.e() && X0 != f82113o[i10]) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謸\u0001") + lVar);
            }
            for (int i12 = 1; i12 <= X0; i12++) {
                int i13 = (i11 & 1) == 1 ? 30 : 29;
                if (i12 != X0) {
                    i7 += i13;
                    i11 >>>= 1;
                } else {
                    if (i5 > i13) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(s5, i5));
                    }
                    i7 += i5;
                }
            }
        } else {
            if (lVar.e()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謷\u0001") + lVar);
            }
            if (i5 > net.time4j.base.b.d(i6, lVar.getNumber())) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(s5, i5));
            }
            int number = lVar.getNumber();
            for (int i14 = 1; i14 < number; i14++) {
                i7 += net.time4j.base.b.d(i6, i14);
            }
            i7 += i5;
        }
        int i15 = i7;
        if (i6 == 1872 && lVar.getNumber() == 12 && i5 >= 3) {
            if (gVar.isStrict()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謹\u0001"));
            }
            int i16 = i5 - 2;
            return new JapaneseCalendar(f0.f82431v, 1873, i16, l.f(1), i16);
        }
        long f12 = f1(i6, i15);
        B.i(f12);
        f0 K0 = K0(f0.d.NORTHERN_COURT.test(f0Var), i6, f12);
        int i17 = b.f82132a[gVar.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                f0Var2 = K0;
                return new JapaneseCalendar(f0Var2, i6, i15, lVar, i5);
            }
        } else if (K0 != f0Var) {
            throw new IllegalArgumentException(ProtectedSandApp.s("謺\u0001") + K0 + ProtectedSandApp.s("謻\u0001") + f0Var);
        }
        f0Var2 = f0Var;
        return new JapaneseCalendar(f0Var2, i6, i15, lVar, i5);
    }

    public static JapaneseCalendar e1(f0 f0Var, int i4, int i5, int i6) {
        if (!f0Var.A() || (f0Var == f0.f82431v && i4 < 6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("謾\u0001"));
        }
        return d1(f0Var, i4, l.f(i5), i6, net.time4j.format.g.SMART);
    }

    static long f1(int i4, int i5) {
        return i4 >= 1873 ? net.time4j.l0.q1(i4, i5).b() : (f82115q[i4 - 701] + i5) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JapaneseCalendar g1() {
        int i4 = this.f82125b;
        if (i4 < 1332 || i4 >= 1394) {
            return this;
        }
        f0 I = f0.I(i4, f0.d.NORTHERN_COURT);
        while (I.w() > b()) {
            I = I.p();
        }
        return new JapaneseCalendar(I, this.f82125b, this.f82126c, this.f82128e, this.f82129f);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("謿\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public net.time4j.u<JapaneseCalendar> F0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public net.time4j.u<JapaneseCalendar> G0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public int compareTo(JapaneseCalendar japaneseCalendar) {
        int compareTo = super.compareTo(japaneseCalendar);
        if (compareTo != 0) {
            return compareTo;
        }
        int y4 = this.f82127d.y() - japaneseCalendar.f82127d.y();
        if (y4 != 0) {
            return y4;
        }
        f0 f0Var = this.f82127d;
        f0.d dVar = f0.d.NORTHERN_COURT;
        f0Var.getClass();
        boolean test = dVar.test(f0Var);
        f0 f0Var2 = japaneseCalendar.f82127d;
        f0Var2.getClass();
        boolean test2 = dVar.test(f0Var2);
        return (test || !test2) ? (!test || test2) ? 0 : 1 : -1;
    }

    protected JapaneseCalendar N0() {
        return this;
    }

    public g1 P0() {
        return g1.valueOf(net.time4j.base.c.d(B.f(this) + 5, 7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<i, JapaneseCalendar> y() {
        return C;
    }

    public int Q0() {
        return this.f82126c;
    }

    public f0 S0() {
        return this.f82127d;
    }

    public l V0() {
        return this.f82128e;
    }

    public boolean Y0() {
        int i4 = this.f82125b;
        return i4 >= 1873 ? net.time4j.base.b.e(i4) : f82113o[i4 + (-701)] > 0;
    }

    public int Z0() {
        return T0(this.f82125b, this.f82128e);
    }

    @Override // net.time4j.engine.n
    protected int a0(net.time4j.engine.h hVar) {
        JapaneseCalendar e4 = hVar instanceof JapaneseCalendar ? (JapaneseCalendar) JapaneseCalendar.class.cast(hVar) : B.e(hVar.b());
        int i4 = this.f82125b;
        int i5 = e4.f82125b;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = this.f82126c;
        int i7 = e4.f82126c;
        if (i6 < i7) {
            return -1;
        }
        return i6 > i7 ? 1 : 0;
    }

    public int a1() {
        return U0(this.f82125b);
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JapaneseCalendar)) {
            return false;
        }
        JapaneseCalendar japaneseCalendar = (JapaneseCalendar) obj;
        return this.f82125b == japaneseCalendar.f82125b && this.f82126c == japaneseCalendar.f82126c && this.f82127d == japaneseCalendar.f82127d && this.f82129f == japaneseCalendar.f82129f && this.f82128e.equals(japaneseCalendar.f82128e);
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82126c * 31) + (this.f82125b * 17);
    }

    public int o() {
        return (this.f82125b - this.f82127d.s()) + 1;
    }

    public int t() {
        return this.f82129f;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        f0 f0Var = this.f82127d;
        Locale locale = Locale.ROOT;
        f0Var.getClass();
        sb.append(f0Var.r(locale, net.time4j.format.x.WIDE));
        sb.append('-');
        sb.append(o());
        sb.append('(');
        sb.append(this.f82125b);
        sb.append(ProtectedSandApp.s("譀\u0001"));
        if (this.f82128e.e()) {
            sb.append('*');
        }
        int number = this.f82128e.getNumber();
        if (this.f82125b >= 1873 && number < 10) {
            sb.append('0');
        }
        sb.append(number);
        sb.append('-');
        int i4 = this.f82129f;
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        return sb.toString();
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return C;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    /* synthetic */ JapaneseCalendar(f0 f0Var, int i4, int i5, a aVar) {
        this(f0Var, i4, i5);
    }

    private JapaneseCalendar(f0 f0Var, int i4, int i5) {
        this(f0Var, i4, i5, W0(i4, i5), O0(i4, i5));
    }

    private JapaneseCalendar(f0 f0Var, int i4, int i5, l lVar, int i6) {
        this.f82127d = f0Var;
        this.f82125b = i4;
        this.f82126c = i5;
        this.f82128e = lVar;
        this.f82129f = i6;
    }
}
