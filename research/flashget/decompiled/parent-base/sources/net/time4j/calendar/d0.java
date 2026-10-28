package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;

/* compiled from: KoreanEra.java */
/* loaded from: classes7.dex */
public enum d0 implements net.time4j.engine.j {
    DANGI;

    private final transient net.time4j.engine.q<d0> eraElement;
    private final transient net.time4j.engine.q<Integer> yearOfEraElement;

    /* compiled from: KoreanEra.java */
    private static class b extends net.time4j.format.d<d0> implements net.time4j.format.v<d0> {
        private static final long serialVersionUID = -5179188137244162427L;

        private b() {
            super(ProtectedSandApp.s("趧\u0001"));
        }

        private Object readResolve() throws ObjectStreamException {
            return d0.DANGI.era();
        }

        @Override // net.time4j.format.v
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public d0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            boolean booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f82788j, Boolean.FALSE)).booleanValue();
            net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            int index = parsePosition.getIndex();
            d0 d0Var = d0.DANGI;
            String displayName = d0Var.getDisplayName(locale, xVar);
            int max = Math.max(Math.min(displayName.length() + index, charSequence.length()), index);
            if (max > index) {
                String charSequence2 = charSequence.subSequence(index, max).toString();
                if (booleanValue) {
                    displayName = displayName.toLowerCase(locale);
                    charSequence2 = charSequence2.toLowerCase(locale);
                }
                if (displayName.equals(charSequence2) || (booleanValue2 && displayName.startsWith(charSequence2))) {
                    parsePosition.setIndex(max);
                    return d0Var;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, d0> g(net.time4j.engine.x<T> xVar) {
            if (xVar.K(net.time4j.l0.f83326q)) {
                return new c();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.q
        public Class<d0> getType() {
            return d0.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(d0.DANGI.getDisplayName((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public d0 getDefaultMaximum() {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public d0 getDefaultMinimum() {
            return d0.DANGI;
        }
    }

    /* compiled from: KoreanEra.java */
    private static class c implements net.time4j.engine.a0<net.time4j.engine.r<?>, d0> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(net.time4j.engine.r<?> rVar) {
            throw new AbstractMethodError(ProtectedSandApp.s("趨\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(net.time4j.engine.r<?> rVar) {
            throw new AbstractMethodError(ProtectedSandApp.s("趨\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public d0 getMaximum(net.time4j.engine.r<?> rVar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d0 getMinimum(net.time4j.engine.r<?> rVar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d0 getValue(net.time4j.engine.r<?> rVar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(net.time4j.engine.r<?> rVar, d0 d0Var) {
            return d0Var == d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r<?> withValue(net.time4j.engine.r<?> rVar, d0 d0Var, boolean z4) {
            if (j(rVar, d0Var)) {
                return rVar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("趩\u0001") + d0Var);
        }

        c(a aVar) {
        }
    }

    /* compiled from: KoreanEra.java */
    private static class d implements net.time4j.engine.a0<net.time4j.engine.r<?>, Integer> {
        private d() {
        }

        private int f(net.time4j.engine.r<?> rVar) {
            return ((net.time4j.l0) rVar.r(net.time4j.l0.f83326q)).o() + 2333;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(net.time4j.engine.r<?> rVar) {
            throw new AbstractMethodError(ProtectedSandApp.s("趪\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(net.time4j.engine.r<?> rVar) {
            throw new AbstractMethodError(ProtectedSandApp.s("趪\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(net.time4j.engine.r<?> rVar) {
            return 1000002332;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(net.time4j.engine.r<?> rVar) {
            return -999997666;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(net.time4j.engine.r<?> rVar) {
            return Integer.valueOf(f(rVar));
        }

        @Override // net.time4j.engine.a0
        public boolean j(net.time4j.engine.r<?> rVar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= getMinimum(rVar).intValue() && num.intValue() <= getMaximum(rVar).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r<?> withValue(net.time4j.engine.r<?> rVar, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("趬\u0001"));
            }
            if (j(rVar, num)) {
                int f4 = f(rVar);
                net.time4j.f fVar = net.time4j.l0.f83326q;
                return rVar.M(fVar, (net.time4j.l0) ((net.time4j.l0) rVar.r(fVar)).W(num.intValue() - f4, net.time4j.h.YEARS));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("趫\u0001") + num);
        }

        d(a aVar) {
        }
    }

    /* compiled from: KoreanEra.java */
    private static class e extends net.time4j.format.d<Integer> {
        private static final long serialVersionUID = -7864513245908399367L;

        private e() {
            super(ProtectedSandApp.s("趭\u0001"));
        }

        private Object readResolve() throws ObjectStreamException {
            return d0.DANGI.yearOfEra();
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, Integer> g(net.time4j.engine.x<T> xVar) {
            if (xVar.K(net.time4j.l0.f83326q)) {
                return new d();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'y';
        }

        @Override // net.time4j.engine.q
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMaximum() {
            return 5332;
        }

        @Override // net.time4j.engine.q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMinimum() {
            return 3978;
        }
    }

    d0() {
        this.eraElement = new b();
        this.yearOfEraElement = new e();
    }

    @net.time4j.engine.d0(format = "G")
    net.time4j.engine.q<d0> era() {
        return this.eraElement;
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    @net.time4j.engine.d0(format = "y")
    net.time4j.engine.q<Integer> yearOfEra() {
        return this.yearOfEraElement;
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("趯\u0001"), locale).c(xVar).g(this);
    }
}
