package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.format.x;

/* compiled from: HistoricEra.java */
/* loaded from: classes7.dex */
public enum j implements net.time4j.engine.j {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    /* compiled from: HistoricEra.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83211a;

        static {
            int[] iArr = new int[j.values().length];
            f83211a = iArr;
            try {
                iArr[j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83211a[j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83211a[j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83211a[j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83211a[j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int annoDomini(int i4) {
        try {
            int i5 = a.f83211a[ordinal()];
            if (i5 == 1) {
                return net.time4j.base.c.l(1, i4);
            }
            if (i5 == 2) {
                return i4;
            }
            if (i5 == 3) {
                return net.time4j.base.c.l(i4, 38);
            }
            if (i5 == 4) {
                return net.time4j.base.c.l(i4, 5508);
            }
            if (i5 == 5) {
                return net.time4j.base.c.l(i4, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("随\u0001"), i4));
        }
    }

    public String getAlternativeName(Locale locale, x xVar) {
        return net.time4j.format.b.f(locale).q(d.D().i(), xVar == x.WIDE ? ProtectedSandApp.s("隐\u0001") : ProtectedSandApp.s("隑\u0001"), ProtectedSandApp.s("隒\u0001")).g(this);
    }

    public String getDisplayName(Locale locale, x xVar) {
        return net.time4j.format.b.f(locale).c(xVar).g(this);
    }

    int yearOfEra(j jVar, int i4) {
        int annoDomini = jVar.annoDomini(i4);
        try {
            int i5 = a.f83211a[ordinal()];
            if (i5 == 1) {
                return net.time4j.base.c.l(1, annoDomini);
            }
            if (i5 == 2) {
                return annoDomini;
            }
            if (i5 == 3) {
                return net.time4j.base.c.e(annoDomini, 38);
            }
            if (i5 == 4) {
                return net.time4j.base.c.e(annoDomini, 5508);
            }
            if (i5 == 5) {
                return net.time4j.base.c.e(annoDomini, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("随\u0001"), i4));
        }
    }
}
