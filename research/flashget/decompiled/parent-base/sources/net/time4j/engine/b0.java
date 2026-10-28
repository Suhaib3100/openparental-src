package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: EpochDays.java */
/* loaded from: classes7.dex */
public enum b0 implements q<Long> {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);

    private final int offset;

    /* compiled from: EpochDays.java */
    private static class a<D extends r<D>> implements a0<D, Long> {

        /* renamed from: d, reason: collision with root package name */
        private static final int f82713d = 730;

        /* renamed from: b, reason: collision with root package name */
        private final b0 f82714b;

        /* renamed from: c, reason: collision with root package name */
        private final l<D> f82715c;

        a(b0 b0Var, l<D> lVar) {
            this.f82714b = b0Var;
            this.f82715c = lVar;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(D d5) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(D d5) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long getMaximum(D d5) {
            return Long.valueOf(this.f82714b.transform(this.f82715c.d() + 730, b0.UNIX));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long getMinimum(D d5) {
            return Long.valueOf(this.f82714b.transform(this.f82715c.g() + 730, b0.UNIX));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long getValue(D d5) {
            return Long.valueOf(this.f82714b.transform(this.f82715c.f(d5) + 730, b0.UNIX));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, Long l4) {
            if (l4 == null) {
                return false;
            }
            try {
                long m4 = net.time4j.base.c.m(b0.UNIX.transform(l4.longValue(), this.f82714b), 730L);
                if (m4 <= this.f82715c.d()) {
                    return m4 >= this.f82715c.g();
                }
                return false;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, Long l4, boolean z4) {
            if (l4 == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鋬\u0001"));
            }
            return this.f82715c.e(net.time4j.base.c.m(b0.UNIX.transform(l4.longValue(), this.f82714b), 730L));
        }
    }

    b0(int i4) {
        this.offset = i4 - 2441317;
    }

    <D extends r<D>> a0<D, Long> derive(l<D> lVar) {
        return new a(this, lVar);
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    public long transform(long j4, b0 b0Var) {
        try {
            return net.time4j.base.c.f(j4, b0Var.offset - this.offset);
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // java.util.Comparator
    public int compare(p pVar, p pVar2) {
        return ((Long) pVar.r(this)).compareTo((Long) pVar2.r(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.q
    public Long getDefaultMaximum() {
        return Long.valueOf(365241779741L - this.offset);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.q
    public Long getDefaultMinimum() {
        return Long.valueOf((-365243219892L) - this.offset);
    }
}
