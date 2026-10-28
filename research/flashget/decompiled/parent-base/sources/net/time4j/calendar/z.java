package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: HijriMonth.java */
/* loaded from: classes7.dex */
public enum z implements net.time4j.engine.o<HijriCalendar> {
    MUHARRAM,
    SAFAR,
    RABI_I,
    RABI_II,
    JUMADA_I,
    JUMADA_II,
    RAJAB,
    SHABAN,
    RAMADAN,
    SHAWWAL,
    DHU_AL_QIDAH,
    DHU_AL_HIJJAH;

    private static final z[] ENUMS = values();

    /* compiled from: HijriMonth.java */
    static class a implements net.time4j.engine.v<HijriCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82665b;

        a(int i4) {
            this.f82665b = i4;
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HijriCalendar apply(HijriCalendar hijriCalendar) {
            int value = ((hijriCalendar.t0().getValue() + (hijriCalendar.o() * 12)) - 1) + this.f82665b;
            int i4 = value / 12;
            int i5 = (value % 12) + 1;
            return HijriCalendar.E0(hijriCalendar.getVariant(), i4, i5, Math.min(hijriCalendar.t(), hijriCalendar.l0().b(y.ANNO_HEGIRAE, i4, i5)));
        }
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static z valueOf(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("銤\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("銥\u0001"), locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(HijriCalendar hijriCalendar) {
        return hijriCalendar.t0() == this;
    }
}
