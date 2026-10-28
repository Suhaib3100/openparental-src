package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: Tabot.java */
/* loaded from: classes7.dex */
public final class p0 implements Comparable<p0> {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f82617c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f82618d;

    /* renamed from: e, reason: collision with root package name */
    private static final p0[] f82619e;

    /* renamed from: b, reason: collision with root package name */
    private final int f82620b;

    /* compiled from: Tabot.java */
    enum a implements net.time4j.format.v<p0> {
        TABOT;

        @Override // net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.q
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.q
        public Class<p0> getType() {
            return p0.class;
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

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(((p0) pVar.r(TABOT)).e((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)));
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            a aVar = TABOT;
            return ((p0) pVar.r(aVar)).d() - ((p0) pVar2.r(aVar)).d();
        }

        @Override // net.time4j.engine.q
        public p0 getDefaultMaximum() {
            return p0.f(30);
        }

        @Override // net.time4j.engine.q
        public p0 getDefaultMinimum() {
            return p0.f(1);
        }

        @Override // net.time4j.format.v
        public p0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            int index = parsePosition.getIndex();
            for (int i4 = 1; i4 <= 30; i4++) {
                String e4 = p0.f(i4).e(locale);
                int length = e4.length() + index;
                if (length <= charSequence.length() && e4.equals(charSequence.subSequence(index, length).toString())) {
                    parsePosition.setIndex(length);
                    return p0.f(i4);
                }
            }
            return null;
        }
    }

    static {
        new net.time4j.calendar.service.d();
        Locale locale = Locale.ROOT;
        String s4 = ProtectedSandApp.s("釭\u0001");
        net.time4j.i18n.e i4 = net.time4j.i18n.e.i(s4, locale);
        net.time4j.i18n.e i5 = net.time4j.i18n.e.i(s4, new Locale(ProtectedSandApp.s("釮\u0001")));
        String[] strArr = new String[30];
        String[] strArr2 = new String[30];
        p0[] p0VarArr = new p0[30];
        int i6 = 0;
        while (i6 < 30) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("釯\u0001"));
            int i7 = i6 + 1;
            sb.append(String.valueOf(i7));
            String sb2 = sb.toString();
            strArr[i6] = i4.g(sb2);
            strArr2[i6] = i5.g(sb2);
            p0VarArr[i6] = new p0(i7);
            i6 = i7;
        }
        f82617c = strArr;
        f82618d = strArr2;
        f82619e = p0VarArr;
    }

    private p0(int i4) {
        this.f82620b = i4;
    }

    public static List<p0> a() {
        return Collections.unmodifiableList(Arrays.asList(f82619e));
    }

    private static net.time4j.i18n.e c(Locale locale) {
        return net.time4j.i18n.e.i(ProtectedSandApp.s("釭\u0001"), locale);
    }

    public static p0 f(int i4) {
        if (i4 < 1 || i4 > 30) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("釰\u0001"), i4));
        }
        return f82619e[i4 - 1];
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(p0 p0Var) {
        return this.f82620b - p0Var.f82620b;
    }

    public int d() {
        return this.f82620b;
    }

    public String e(Locale locale) {
        return locale.getLanguage().equals(ProtectedSandApp.s("釮\u0001")) ? f82618d[this.f82620b - 1] : f82617c[this.f82620b - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.f82620b == ((p0) obj).f82620b;
    }

    public int hashCode() {
        return Integer.valueOf(this.f82620b).hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("釱\u0001") + this.f82620b;
    }
}
