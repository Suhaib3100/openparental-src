package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: ThaiSolarEra.java */
/* loaded from: classes7.dex */
public enum q0 implements net.time4j.engine.j {
    RATTANAKOSIN,
    BUDDHIST;

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    public int getYear(net.time4j.engine.h hVar) {
        int i4;
        net.time4j.l0 w12 = net.time4j.l0.w1(hVar.b(), net.time4j.engine.b0.UTC);
        if (this == RATTANAKOSIN) {
            int o4 = w12.o();
            i4 = o4 - 1781;
            if (w12.q() < 4) {
                i4 = o4 - 1782;
            }
        } else {
            int o5 = w12.o();
            i4 = o5 + 543;
            if (i4 < 2484 && w12.q() < 4) {
                i4 = o5 + 542;
            }
        }
        if (i4 >= 1) {
            return i4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("釸\u0001") + hVar);
    }

    int toIsoYear(int i4, int i5) {
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("釺\u0001"), i4));
        }
        if (this == RATTANAKOSIN) {
            int e4 = net.time4j.base.c.e(i4, 1781);
            return i5 < 4 ? net.time4j.base.c.e(e4, 1) : e4;
        }
        int l4 = net.time4j.base.c.l(i4, 543);
        if (i5 >= 4) {
            return l4;
        }
        if (l4 != 1940) {
            return l4 < 1940 ? net.time4j.base.c.e(l4, 1) : l4;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("釹\u0001"), i5));
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("釷\u0001"), locale).c(xVar).g(this);
    }
}
