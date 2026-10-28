package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.b0;
import net.time4j.l0;

/* compiled from: Computus.java */
/* loaded from: classes7.dex */
public enum e {
    WESTERN,
    EASTERN;

    public l0 easterSunday(int i4) {
        int i5;
        int marchDay = marchDay(i4);
        if (marchDay > 31) {
            marchDay -= 31;
            i5 = 4;
        } else {
            i5 = 3;
        }
        return (this != WESTERN || i4 <= 1582) ? l0.w1(m.h(i4, i5, marchDay), b0.MODIFIED_JULIAN_DATE) : l0.r1(i4, i5, marchDay);
    }

    int marchDay(int i4) {
        int i5;
        int i6;
        if (i4 < 532) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("陫\u0001"), i4));
        }
        int i7 = i4 / 100;
        if (this != WESTERN || i4 <= 1582) {
            i5 = 15;
            i6 = 0;
        } else {
            int i10 = ((i7 * 3) + 3) / 4;
            i5 = (i10 + 15) - (((i7 * 8) + 13) / 25);
            i6 = 2 - i10;
        }
        int i11 = i4 % 19;
        int i12 = ((i11 * 19) + i5) % 30;
        int i13 = i12 / 29;
        int i14 = (i12 + 21) - (((i11 / 11) * ((i12 / 28) - i13)) + i13);
        return (7 - ((i14 - (7 - ((((i4 / 4) + i4) + i6) % 7))) % 7)) + i14;
    }
}
