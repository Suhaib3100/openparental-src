package net.time4j.calendar.bahai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.format.u;

/* compiled from: BadiMonth.java */
/* loaded from: classes7.dex */
public enum e implements b {
    BAHA,
    JALAL,
    JAMAL,
    AZAMAT,
    NUR,
    RAHMAT,
    KALIMAT,
    KAMAL,
    ASMA,
    IZZAT,
    MASHIYYAT,
    ILM,
    QUDRAT,
    QAWL,
    MASAIL,
    SHARAF,
    SULTAN,
    MULK,
    ALA;

    private static u accessor(Locale locale, f fVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("赝\u0001"), locale).p(ProtectedSandApp.s("赞\u0001"), e.class, fVar.variant());
    }

    public String getDisplayName(Locale locale) {
        return accessor(locale, f.TRANSCRIPTION).g(this);
    }

    public String getMeaning(Locale locale) {
        return accessor(locale, f.MEANING).g(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static e valueOf(int i4) {
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("赟\u0001"), i4));
        }
        return values()[i4 - 1];
    }
}
