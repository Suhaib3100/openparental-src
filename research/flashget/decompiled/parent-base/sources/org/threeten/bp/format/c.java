package org.threeten.bp.format;

import java.io.IOException;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.o;
import org.threeten.bp.format.d;
import org.threeten.bp.format.e;
import org.threeten.bp.r;

/* compiled from: DateTimeFormatter.java */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f88101h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f88102i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f88103j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f88104k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f88105l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f88106m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f88107n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f88108o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f88109p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f88110q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f88111r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f88112s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f88113t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f88114u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f88115v;

    /* renamed from: w, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<org.threeten.bp.n> f88116w;

    /* renamed from: x, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<Boolean> f88117x;

    /* renamed from: a, reason: collision with root package name */
    private final d.g f88118a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f88119b;

    /* renamed from: c, reason: collision with root package name */
    private final h f88120c;

    /* renamed from: d, reason: collision with root package name */
    private final j f88121d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<org.threeten.bp.temporal.j> f88122e;

    /* renamed from: f, reason: collision with root package name */
    private final org.threeten.bp.chrono.j f88123f;

    /* renamed from: g, reason: collision with root package name */
    private final r f88124g;

    /* compiled from: DateTimeFormatter.java */
    class a implements org.threeten.bp.temporal.l<org.threeten.bp.n> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.n a(org.threeten.bp.temporal.f fVar) {
            return fVar instanceof org.threeten.bp.format.a ? ((org.threeten.bp.format.a) fVar).f88100h : org.threeten.bp.n.f88288e;
        }
    }

    /* compiled from: DateTimeFormatter.java */
    class b implements org.threeten.bp.temporal.l<Boolean> {
        b() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(org.threeten.bp.temporal.f fVar) {
            return fVar instanceof org.threeten.bp.format.a ? Boolean.valueOf(((org.threeten.bp.format.a) fVar).f88099g) : Boolean.FALSE;
        }
    }

    static {
        d dVar = new d();
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.YEAR;
        k kVar = k.EXCEEDS_PAD;
        d h4 = dVar.v(aVar, 4, 10, kVar).h('-');
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
        d h5 = h4.u(aVar2, 2).h('-');
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.DAY_OF_MONTH;
        d u4 = h5.u(aVar3, 2);
        j jVar = j.STRICT;
        c R = u4.R(jVar);
        o oVar = o.f88011f;
        c D = R.D(oVar);
        f88101h = D;
        f88102i = new d().I().a(D).m().R(jVar).D(oVar);
        f88103j = new d().I().a(D).F().m().R(jVar).D(oVar);
        d dVar2 = new d();
        org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.HOUR_OF_DAY;
        d h6 = dVar2.u(aVar4, 2).h(':');
        org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR;
        d h7 = h6.u(aVar5, 2).F().h(':');
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE;
        c R2 = h7.u(aVar6, 2).F().d(org.threeten.bp.temporal.a.NANO_OF_SECOND, 0, 9, true).R(jVar);
        f88104k = R2;
        f88105l = new d().I().a(R2).m().R(jVar);
        f88106m = new d().I().a(R2).F().m().R(jVar);
        c D2 = new d().I().a(D).h('T').a(R2).R(jVar).D(oVar);
        f88107n = D2;
        c D3 = new d().I().a(D2).m().R(jVar).D(oVar);
        f88108o = D3;
        f88109p = new d().a(D3).F().h('[').J().A().h(']').R(jVar).D(oVar);
        f88110q = new d().a(D2).F().m().F().h('[').J().A().h(']').R(jVar).D(oVar);
        f88111r = new d().I().v(aVar, 4, 10, kVar).h('-').u(org.threeten.bp.temporal.a.DAY_OF_YEAR, 3).F().m().R(jVar).D(oVar);
        d h10 = new d().I().v(org.threeten.bp.temporal.c.f88350d, 4, 10, kVar).i("-W").u(org.threeten.bp.temporal.c.f88349c, 2).h('-');
        org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
        f88112s = h10.u(aVar7, 1).F().m().R(jVar).D(oVar);
        f88113t = new d().I().e().R(jVar);
        f88114u = new d().I().u(aVar, 4).u(aVar2, 2).u(aVar3, 2).F().l("+HHMMss", "Z").R(jVar).D(oVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        f88115v = new d().I().M().F().q(aVar7, hashMap).i(", ").E().v(aVar3, 1, 2, k.NOT_NEGATIVE).h(' ').q(aVar2, hashMap2).h(' ').u(aVar, 4).h(' ').u(aVar4, 2).h(':').u(aVar5, 2).F().h(':').u(aVar6, 2).E().h(' ').l("+HHMM", "GMT").R(j.SMART).D(oVar);
        f88116w = new a();
        f88117x = new b();
    }

    c(d.g gVar, Locale locale, h hVar, j jVar, Set<org.threeten.bp.temporal.j> set, org.threeten.bp.chrono.j jVar2, r rVar) {
        this.f88118a = (d.g) ng.d.j(gVar, "printerParser");
        this.f88119b = (Locale) ng.d.j(locale, "locale");
        this.f88120c = (h) ng.d.j(hVar, "decimalStyle");
        this.f88121d = (j) ng.d.j(jVar, "resolverStyle");
        this.f88122e = set;
        this.f88123f = jVar2;
        this.f88124g = rVar;
    }

    private DateTimeParseException c(CharSequence charSequence, RuntimeException runtimeException) {
        String charSequence2;
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("Text '", charSequence2, "' could not be parsed: ");
        a5.append(runtimeException.getMessage());
        return new DateTimeParseException(a5.toString(), charSequence, 0, runtimeException);
    }

    public static c l(i iVar) {
        ng.d.j(iVar, "dateStyle");
        return new d().j(iVar, null).P().D(o.f88011f);
    }

    public static c m(i iVar) {
        ng.d.j(iVar, "dateTimeStyle");
        return new d().j(iVar, iVar).P().D(o.f88011f);
    }

    public static c n(i iVar, i iVar2) {
        ng.d.j(iVar, "dateStyle");
        ng.d.j(iVar2, "timeStyle");
        return new d().j(iVar, iVar2).P().D(o.f88011f);
    }

    public static c o(i iVar) {
        ng.d.j(iVar, "timeStyle");
        return new d().j(null, iVar).P().D(o.f88011f);
    }

    public static c p(String str) {
        return new d().o(str).P();
    }

    public static c q(String str, Locale locale) {
        return new d().o(str).Q(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.threeten.bp.format.a v(CharSequence charSequence, ParsePosition parsePosition) {
        String charSequence2;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        e.b x4 = x(charSequence, parsePosition2);
        if (x4 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return x4.m();
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            StringBuilder a5 = androidx.appcompat.view.g.a("Text '", charSequence2, "' could not be parsed at index ");
            a5.append(parsePosition2.getErrorIndex());
            throw new DateTimeParseException(a5.toString(), charSequence, parsePosition2.getErrorIndex());
        }
        StringBuilder a6 = androidx.appcompat.view.g.a("Text '", charSequence2, "' could not be parsed, unparsed text found at index ");
        a6.append(parsePosition2.getIndex());
        throw new DateTimeParseException(a6.toString(), charSequence, parsePosition2.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.b x(CharSequence charSequence, ParsePosition parsePosition) {
        ng.d.j(charSequence, "text");
        ng.d.j(parsePosition, "position");
        e eVar = new e(this);
        int parse = this.f88118a.parse(eVar, charSequence, parsePosition.getIndex());
        if (parse < 0) {
            parsePosition.setErrorIndex(~parse);
            return null;
        }
        parsePosition.setIndex(parse);
        return eVar.w();
    }

    public static final org.threeten.bp.temporal.l<org.threeten.bp.n> y() {
        return f88116w;
    }

    public static final org.threeten.bp.temporal.l<Boolean> z() {
        return f88117x;
    }

    public Format A() {
        return new C1366c(this, null);
    }

    public Format B(org.threeten.bp.temporal.l<?> lVar) {
        ng.d.j(lVar, "query");
        return new C1366c(this, lVar);
    }

    d.g C(boolean z4) {
        return this.f88118a.a(z4);
    }

    public c D(org.threeten.bp.chrono.j jVar) {
        return ng.d.c(this.f88123f, jVar) ? this : new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, this.f88122e, jVar, this.f88124g);
    }

    public c E(h hVar) {
        return this.f88120c.equals(hVar) ? this : new c(this.f88118a, this.f88119b, hVar, this.f88121d, this.f88122e, this.f88123f, this.f88124g);
    }

    public c F(Locale locale) {
        return this.f88119b.equals(locale) ? this : new c(this.f88118a, locale, this.f88120c, this.f88121d, this.f88122e, this.f88123f, this.f88124g);
    }

    public c G(Set<org.threeten.bp.temporal.j> set) {
        if (set == null) {
            return new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, null, this.f88123f, this.f88124g);
        }
        if (ng.d.c(this.f88122e, set)) {
            return this;
        }
        return new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, Collections.unmodifiableSet(new HashSet(set)), this.f88123f, this.f88124g);
    }

    public c H(org.threeten.bp.temporal.j... jVarArr) {
        if (jVarArr == null) {
            return new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, null, this.f88123f, this.f88124g);
        }
        HashSet hashSet = new HashSet(Arrays.asList(jVarArr));
        if (ng.d.c(this.f88122e, hashSet)) {
            return this;
        }
        return new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, Collections.unmodifiableSet(hashSet), this.f88123f, this.f88124g);
    }

    public c I(j jVar) {
        ng.d.j(jVar, "resolverStyle");
        return ng.d.c(this.f88121d, jVar) ? this : new c(this.f88118a, this.f88119b, this.f88120c, jVar, this.f88122e, this.f88123f, this.f88124g);
    }

    public c J(r rVar) {
        return ng.d.c(this.f88124g, rVar) ? this : new c(this.f88118a, this.f88119b, this.f88120c, this.f88121d, this.f88122e, this.f88123f, rVar);
    }

    public String d(org.threeten.bp.temporal.f fVar) {
        StringBuilder sb = new StringBuilder(32);
        e(fVar, sb);
        return sb.toString();
    }

    public void e(org.threeten.bp.temporal.f fVar, Appendable appendable) {
        ng.d.j(fVar, "temporal");
        ng.d.j(appendable, "appendable");
        try {
            f fVar2 = new f(fVar, this);
            if (appendable instanceof StringBuilder) {
                this.f88118a.print(fVar2, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.f88118a.print(fVar2, sb);
            appendable.append(sb);
        } catch (IOException e4) {
            throw new DateTimeException(e4.getMessage(), e4);
        }
    }

    public org.threeten.bp.chrono.j f() {
        return this.f88123f;
    }

    public h g() {
        return this.f88120c;
    }

    public Locale h() {
        return this.f88119b;
    }

    public Set<org.threeten.bp.temporal.j> i() {
        return this.f88122e;
    }

    public j j() {
        return this.f88121d;
    }

    public r k() {
        return this.f88124g;
    }

    public <T> T r(CharSequence charSequence, org.threeten.bp.temporal.l<T> lVar) {
        ng.d.j(charSequence, "text");
        ng.d.j(lVar, "type");
        try {
            org.threeten.bp.format.a z4 = v(charSequence, null).z(this.f88121d, this.f88122e);
            z4.getClass();
            return lVar.a(z4);
        } catch (DateTimeParseException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw c(charSequence, e5);
        }
    }

    public org.threeten.bp.temporal.f s(CharSequence charSequence) {
        ng.d.j(charSequence, "text");
        try {
            return v(charSequence, null).z(this.f88121d, this.f88122e);
        } catch (DateTimeParseException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw c(charSequence, e5);
        }
    }

    public org.threeten.bp.temporal.f t(CharSequence charSequence, ParsePosition parsePosition) {
        ng.d.j(charSequence, "text");
        ng.d.j(parsePosition, "position");
        try {
            return v(charSequence, parsePosition).z(this.f88121d, this.f88122e);
        } catch (IndexOutOfBoundsException e4) {
            throw e4;
        } catch (DateTimeParseException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            throw c(charSequence, e6);
        }
    }

    public String toString() {
        String gVar = this.f88118a.toString();
        return gVar.startsWith("[") ? gVar : androidx.core.content.f.a(gVar, 1, 1);
    }

    public org.threeten.bp.temporal.f u(CharSequence charSequence, org.threeten.bp.temporal.l<?>... lVarArr) {
        ng.d.j(charSequence, "text");
        ng.d.j(lVarArr, "types");
        if (lVarArr.length < 2) {
            throw new IllegalArgumentException("At least two types must be specified");
        }
        try {
            org.threeten.bp.format.a z4 = v(charSequence, null).z(this.f88121d, this.f88122e);
            for (org.threeten.bp.temporal.l<?> lVar : lVarArr) {
                try {
                    z4.getClass();
                    return (org.threeten.bp.temporal.f) lVar.a(z4);
                } catch (RuntimeException unused) {
                }
            }
            throw new DateTimeException("Unable to convert parsed text to any specified type: " + Arrays.toString(lVarArr));
        } catch (DateTimeParseException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw c(charSequence, e5);
        }
    }

    public org.threeten.bp.temporal.f w(CharSequence charSequence, ParsePosition parsePosition) {
        return x(charSequence, parsePosition);
    }

    /* compiled from: DateTimeFormatter.java */
    /* renamed from: org.threeten.bp.format.c$c, reason: collision with other inner class name */
    static class C1366c extends Format {

        /* renamed from: b, reason: collision with root package name */
        private final c f88125b;

        /* renamed from: c, reason: collision with root package name */
        private final org.threeten.bp.temporal.l<?> f88126c;

        public C1366c(c cVar, org.threeten.bp.temporal.l<?> lVar) {
            this.f88125b = cVar;
            this.f88126c = lVar;
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            ng.d.j(obj, "obj");
            ng.d.j(stringBuffer, "toAppendTo");
            ng.d.j(fieldPosition, "pos");
            if (!(obj instanceof org.threeten.bp.temporal.f)) {
                throw new IllegalArgumentException("Format target must implement TemporalAccessor");
            }
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                this.f88125b.e((org.threeten.bp.temporal.f) obj, stringBuffer);
                return stringBuffer;
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str) throws ParseException {
            ng.d.j(str, "text");
            try {
                org.threeten.bp.temporal.l<?> lVar = this.f88126c;
                return lVar == null ? this.f88125b.v(str, null).z(this.f88125b.j(), this.f88125b.i()) : this.f88125b.r(str, lVar);
            } catch (DateTimeParseException e4) {
                throw new ParseException(e4.getMessage(), e4.a());
            } catch (RuntimeException e5) {
                throw ((ParseException) new ParseException(e5.getMessage(), 0).initCause(e5));
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            ng.d.j(str, "text");
            try {
                e.b x4 = this.f88125b.x(str, parsePosition);
                if (x4 == null) {
                    if (parsePosition.getErrorIndex() < 0) {
                        parsePosition.setErrorIndex(0);
                    }
                    return null;
                }
                try {
                    org.threeten.bp.format.a z4 = x4.m().z(this.f88125b.j(), this.f88125b.i());
                    org.threeten.bp.temporal.l<?> lVar = this.f88126c;
                    if (lVar == null) {
                        return z4;
                    }
                    z4.getClass();
                    return lVar.a(z4);
                } catch (RuntimeException unused) {
                    parsePosition.setErrorIndex(0);
                    return null;
                }
            } catch (IndexOutOfBoundsException unused2) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
        }
    }
}
