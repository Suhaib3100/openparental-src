package net.time4j.calendar.frenchrev;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.format.m;

/* compiled from: Sansculottides.java */
/* loaded from: classes7.dex */
public enum f {
    COMPLEMENTARY_DAY_1,
    COMPLEMENTARY_DAY_2,
    COMPLEMENTARY_DAY_3,
    COMPLEMENTARY_DAY_4,
    COMPLEMENTARY_DAY_5,
    LEAP_DAY;

    public String getDisplayName(Locale locale, m mVar) {
        net.time4j.format.b d5 = net.time4j.format.b.d(ProtectedSandApp.s("违\u0001"), locale);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("连\u0001"));
        m mVar2 = m.STANDALONE;
        sb.append(mVar == mVar2 ? ProtectedSandApp.s("迟\u0001") : ProtectedSandApp.s("迠\u0001"));
        sb.append(ProtectedSandApp.s("迡\u0001"));
        sb.append(getValue());
        String str = d5.o().get(sb.toString());
        if (str != null || mVar != mVar2) {
            return str;
        }
        return d5.o().get(ProtectedSandApp.s("迢\u0001") + getValue());
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static f valueOf(int i4) {
        if (i4 < 1 || i4 > 6) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("远\u0001"), i4));
        }
        return values()[i4 - 1];
    }
}
