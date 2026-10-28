package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.m0;
import net.time4j.calendar.n;

/* compiled from: CyclicYear.java */
/* loaded from: classes7.dex */
public final class g extends m0 {

    /* renamed from: r, reason: collision with root package name */
    private static final g[] f82482r;
    private static final long serialVersionUID = 4908662352833192131L;

    /* compiled from: CyclicYear.java */
    class a extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82483a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f82484b;

        a(int i4, int i5) {
            this.f82483a = i4;
            this.f82484b = i5;
        }

        @Override // net.time4j.calendar.n
        public int f() {
            int i4 = this.f82483a;
            int i5 = this.f82484b;
            return i4 + i5 + (i5 < 0 ? 2696 : 2636);
        }
    }

    /* compiled from: CyclicYear.java */
    class b extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82486a;

        b(int i4) {
            this.f82486a = i4;
        }

        @Override // net.time4j.calendar.n
        public int f() {
            return (g.this.getNumber() + ((this.f82486a - 1) * 60)) - 1;
        }
    }

    static {
        g[] gVarArr = new g[60];
        int i4 = 0;
        while (i4 < 60) {
            int i5 = i4 + 1;
            gVarArr[i4] = new g(i5);
            i4 = i5;
        }
        f82482r = gVarArr;
    }

    private g(int i4) {
        super(i4);
    }

    public static g r(int i4) {
        if (i4 < 1 || i4 > 60) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("遳\u0001"), i4));
        }
        return f82482r[i4 - 1];
    }

    public static g s(m0.b bVar, m0.a aVar) {
        return r(m0.k(bVar, aVar).getNumber());
    }

    static g t(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z4) {
        m0 l4 = m0.l(charSequence, parsePosition, locale, z4);
        if (l4 == null) {
            return null;
        }
        return r(l4.getNumber());
    }

    public static g u(String str, Locale locale) throws ParseException {
        return r(m0.m(str, locale).getNumber());
    }

    public n p(int i4) {
        if (i4 >= 1) {
            return new b(i4);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("遴\u0001"), i4));
    }

    public n q(c cVar) {
        if (!cVar.isQingDynasty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("遶\u0001"));
        }
        if (cVar != c.QING_KANGXI_1662_1723 || getNumber() != 39) {
            int startAsGregorianYear = cVar.getStartAsGregorianYear();
            return new a(startAsGregorianYear, getNumber() - new n.a(startAsGregorianYear).g().getNumber());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("遵\u0001") + g(Locale.ROOT));
    }

    @Override // net.time4j.calendar.m0
    Object readResolve() throws ObjectStreamException {
        return r(getNumber());
    }

    @Override // net.time4j.calendar.m0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public g n(int i4) {
        return i4 == 0 ? this : r(super.n(i4).getNumber());
    }
}
