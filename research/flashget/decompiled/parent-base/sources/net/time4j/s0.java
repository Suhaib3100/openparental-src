package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* compiled from: Quarter.java */
/* loaded from: classes7.dex */
public enum s0 implements net.time4j.engine.o<net.time4j.base.a>, net.time4j.engine.v<l0> {
    Q1,
    Q2,
    Q3,
    Q4;

    private static final s0[] ENUMS = values();

    public static s0 parse(CharSequence charSequence, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        s0 s0Var = (s0) net.time4j.format.b.f(locale).m(xVar, mVar).c(charSequence, parsePosition, s0.class);
        if (s0Var != null) {
            return s0Var;
        }
        throw new ParseException(ProtectedSandApp.s("顉\u0001") + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public s0 next() {
        return roll(1);
    }

    public s0 previous() {
        return roll(-1);
    }

    public s0 roll(int i4) {
        return valueOf(((((i4 % 4) + 4) + ordinal()) % 4) + 1);
    }

    public static s0 valueOf(int i4) {
        if (i4 < 1 || i4 > 4) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("顊\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.v
    public l0 apply(l0 l0Var) {
        return (l0) l0Var.M(l0.f83329t, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f(locale).m(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(net.time4j.base.a aVar) {
        return getValue() == androidx.appcompat.widget.a.a(aVar.q(), 1, 3, 1);
    }
}
