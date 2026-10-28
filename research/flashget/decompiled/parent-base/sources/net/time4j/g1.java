package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* compiled from: Weekday.java */
/* loaded from: classes7.dex */
public enum g1 implements net.time4j.engine.o<net.time4j.base.a>, net.time4j.engine.v<l0> {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final g1[] ENUMS = values();

    public static g1 parse(CharSequence charSequence, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        g1 g1Var = (g1) net.time4j.format.b.f(locale).r(xVar, mVar).c(charSequence, parsePosition, g1.class);
        if (g1Var != null) {
            return g1Var;
        }
        throw new ParseException(ProtectedSandApp.s("阊\u0001") + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public g1 next() {
        return roll(1);
    }

    public g1 previous() {
        return roll(-1);
    }

    public g1 roll(int i4) {
        return valueOf(((((i4 % 7) + 7) + ordinal()) % 7) + 1);
    }

    public static g1 valueOf(int i4) {
        if (i4 < 1 || i4 > 7) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("阋\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public static g1[] values(i1 i1Var) {
        g1[] g1VarArr = new g1[7];
        g1 f4 = i1Var.f();
        for (int i4 = 0; i4 < 7; i4++) {
            g1VarArr[i4] = f4;
            f4 = f4.next();
        }
        return g1VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.v
    public l0 apply(l0 l0Var) {
        return (l0) l0Var.M(l0.f83333x, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f(locale).r(xVar, mVar).g(this);
    }

    public int getValue(i1 i1Var) {
        return (((ordinal() + 7) - i1Var.f().ordinal()) % 7) + 1;
    }

    @Override // net.time4j.engine.o
    public boolean test(net.time4j.base.a aVar) {
        return net.time4j.base.b.c(aVar.o(), aVar.q(), aVar.t()) == getValue();
    }

    public static g1 valueOf(int i4, i1 i1Var) {
        if (i4 >= 1 && i4 <= 7) {
            return ENUMS[((i4 - 1) + i1Var.f().ordinal()) % 7];
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("阌\u0001"), i4));
    }

    public static g1 valueOf(int i4, e0 e0Var, int i5) {
        return valueOf(net.time4j.base.b.c(i4, e0Var.getValue(), i5));
    }
}
