package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarUnit.java */
/* loaded from: classes7.dex */
public abstract class h implements x {
    private static final /* synthetic */ h[] $VALUES;
    public static final h CENTURIES;
    public static final h DAYS;
    public static final h DECADES;
    public static final h MILLENNIA;
    public static final h MONTHS;
    public static final h QUARTERS;
    public static final h WEEKS;
    public static final h YEARS;
    private final x co;
    private final x eof;
    private final x joda;
    private final x kld;
    private final x nvd;
    private final x ui;

    /* compiled from: CalendarUnit.java */
    enum a extends h {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return 3.1556952E10d;
        }

        @Override // net.time4j.z
        public char getSymbol() {
            return 'I';
        }
    }

    /* compiled from: CalendarUnit.java */
    static /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83136a;

        static {
            int[] iArr = new int[h.values().length];
            f83136a = iArr;
            try {
                iArr[h.WEEKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83136a[h.DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83136a[h.MILLENNIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83136a[h.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83136a[h.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83136a[h.YEARS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83136a[h.QUARTERS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83136a[h.MONTHS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: CalendarUnit.java */
    static class j<T extends net.time4j.engine.r<T>> implements net.time4j.engine.o0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final h f83137a;

        /* renamed from: b, reason: collision with root package name */
        private final int f83138b;

        j(h hVar) {
            this(hVar, 0);
        }

        private static long e(l0 l0Var, l0 l0Var2) {
            return l0Var.o() == l0Var2.o() ? l0Var2.e1() - l0Var.e1() : l0Var2.f1() - l0Var.f1();
        }

        private long f(l0 l0Var, l0 l0Var2) {
            long g12 = l0Var2.g1() - l0Var.g1();
            int i4 = this.f83138b;
            if (i4 != 5 && i4 != 2 && i4 != 6) {
                if (g12 <= 0 || l0Var2.t() >= l0Var.t()) {
                    if (g12 >= 0 || l0Var2.t() <= l0Var.t()) {
                        return g12;
                    }
                    return g12 + 1;
                }
                return g12 - 1;
            }
            h hVar = h.MONTHS;
            if (g12 <= 0 || !l0.U0(hVar, l0Var, g12, i4).s(l0Var2)) {
                if (g12 >= 0 || !l0.U0(hVar, l0Var, g12, this.f83138b).f(l0Var2)) {
                    return g12;
                }
                return g12 + 1;
            }
            return g12 - 1;
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(T t4, long j4) {
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            return (T) t4.M(qVar, l0.U0(this.f83137a, (l0) t4.r(qVar), j4, this.f83138b));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(T t4, T t5) {
            long e4;
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            l0 l0Var2 = (l0) t5.r(qVar);
            switch (i.f83136a[this.f83137a.ordinal()]) {
                case 1:
                    e4 = e(l0Var, l0Var2) / 7;
                    break;
                case 2:
                    e4 = e(l0Var, l0Var2);
                    break;
                case 3:
                    e4 = f(l0Var, l0Var2) / 12000;
                    break;
                case 4:
                    e4 = f(l0Var, l0Var2) / 1200;
                    break;
                case 5:
                    e4 = f(l0Var, l0Var2) / 120;
                    break;
                case 6:
                    e4 = f(l0Var, l0Var2) / 12;
                    break;
                case 7:
                    e4 = f(l0Var, l0Var2) / 3;
                    break;
                case 8:
                    e4 = f(l0Var, l0Var2);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f83137a.name());
            }
            if (e4 == 0) {
                return e4;
            }
            net.time4j.engine.q<m0> qVar2 = m0.f83368s;
            if (!t4.w(qVar2) || !t5.w(qVar2)) {
                return e4;
            }
            h hVar = this.f83137a;
            if (hVar != h.DAYS && ((l0) l0Var.W(e4, hVar)).a0(l0Var2) != 0) {
                return e4;
            }
            m0 m0Var = (m0) t4.r(qVar2);
            m0 m0Var2 = (m0) t5.r(qVar2);
            return (e4 <= 0 || !m0Var.s(m0Var2)) ? (e4 >= 0 || !m0Var.f(m0Var2)) ? e4 : e4 + 1 : e4 - 1;
        }

        j(h hVar, int i4) {
            this.f83137a = hVar;
            this.f83138b = i4;
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("阎\u0001"), 0);
        MILLENNIA = aVar;
        h hVar = new h(ProtectedSandApp.s("阏\u0001"), 1) { // from class: net.time4j.h.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 3.1556952E9d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'C';
            }
        };
        CENTURIES = hVar;
        h hVar2 = new h(ProtectedSandApp.s("阐\u0001"), 2) { // from class: net.time4j.h.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 3.1556952E8d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'E';
            }
        };
        DECADES = hVar2;
        h hVar3 = new h(ProtectedSandApp.s("阑\u0001"), 3) { // from class: net.time4j.h.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 3.1556952E7d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'Y';
            }
        };
        YEARS = hVar3;
        h hVar4 = new h(ProtectedSandApp.s("阒\u0001"), 4) { // from class: net.time4j.h.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 7889238.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'Q';
            }
        };
        QUARTERS = hVar4;
        h hVar5 = new h(ProtectedSandApp.s("阓\u0001"), 5) { // from class: net.time4j.h.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 2629746.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'M';
            }
        };
        MONTHS = hVar5;
        h hVar6 = new h(ProtectedSandApp.s("阔\u0001"), 6) { // from class: net.time4j.h.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 604800.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'W';
            }
        };
        WEEKS = hVar6;
        h hVar7 = new h(ProtectedSandApp.s("阕\u0001"), 7) { // from class: net.time4j.h.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 86400.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'D';
            }
        };
        DAYS = hVar7;
        $VALUES = new h[]{aVar, hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
    }

    private h(String str, int i4) {
        this.eof = new k0(this, 2);
        this.kld = new k0(this, 5);
        this.ui = new k0(this, 4);
        this.nvd = new k0(this, 1);
        this.co = new k0(this, 3);
        this.joda = new k0(this, 6);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public static x weekBasedYears() {
        return f1.f82779b;
    }

    public x atEndOfMonth() {
        int i4 = i.f83136a[ordinal()];
        if (i4 != 1 && i4 != 2) {
            return this.eof;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("阖\u0001") + name());
    }

    public <T extends net.time4j.engine.m0<? super h, T>> long between(T t4, T t5) {
        return t4.Y(t5, this);
    }

    @Override // net.time4j.engine.w
    public boolean isCalendrical() {
        return true;
    }

    public x keepingEndOfMonth() {
        int i4 = i.f83136a[ordinal()];
        if (i4 != 1 && i4 != 2) {
            return this.kld;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("阖\u0001") + name());
    }

    public x nextValidDate() {
        int i4 = i.f83136a[ordinal()];
        return (i4 == 1 || i4 == 2) ? this : this.nvd;
    }

    public x unlessInvalid() {
        int i4 = i.f83136a[ordinal()];
        return (i4 == 1 || i4 == 2) ? this : this.ui;
    }

    public x withCarryOver() {
        int i4 = i.f83136a[ordinal()];
        return (i4 == 1 || i4 == 2) ? this : this.co;
    }

    public x withJodaMetric() {
        int i4 = i.f83136a[ordinal()];
        return (i4 == 1 || i4 == 2) ? this : this.joda;
    }

    /* synthetic */ h(String str, int i4, a aVar) {
        this(str, i4);
    }
}
