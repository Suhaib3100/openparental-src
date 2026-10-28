package net.time4j.calendar.hindu;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.format.x;

/* compiled from: HinduEra.java */
/* loaded from: classes7.dex */
public enum f implements net.time4j.engine.j {
    KALI_YUGA,
    NEPALESE,
    KOLLAM,
    VIKRAMA,
    SAKA,
    BENGAL;

    private static final int[] SAKA_OFFSETS = {3179, 955, w.b.f22438j, 135, 0, -515};

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, x.WIDE);
    }

    public int yearOfEra(f fVar, int i4) {
        try {
            int[] iArr = SAKA_OFFSETS;
            return net.time4j.base.c.l(net.time4j.base.c.e(i4, iArr[ordinal()]), iArr[fVar.ordinal()]);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("郄\u0001"), i4));
        }
    }

    public String getDisplayName(Locale locale, x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("郃\u0001"), locale).c(xVar).g(this);
    }
}
