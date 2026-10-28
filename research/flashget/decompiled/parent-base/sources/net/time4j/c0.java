package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* compiled from: Meridiem.java */
/* loaded from: classes7.dex */
public enum c0 implements net.time4j.engine.o<net.time4j.base.g> {
    AM,
    PM;

    public static c0 ofHour(int i4) {
        if (i4 < 0 || i4 > 24) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("訔\u0001"), i4));
        }
        return (i4 < 12 || i4 == 24) ? AM : PM;
    }

    public static c0 parse(CharSequence charSequence, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws ParseException {
        char charAt;
        if (charSequence.length() == 2 && ((charAt = charSequence.charAt(1)) == 'M' || charAt == 'm')) {
            char charAt2 = charSequence.charAt(0);
            if (charAt2 == 'A' || charAt2 == 'a') {
                return AM;
            }
            if (charAt2 == 'P' || charAt2 == 'p') {
                return PM;
            }
        }
        ParsePosition parsePosition = new ParsePosition(0);
        c0 c0Var = (c0) net.time4j.format.b.f(locale).j(xVar, mVar).c(charSequence, parsePosition, c0.class);
        if (c0Var != null) {
            return c0Var;
        }
        throw new ParseException(ProtectedSandApp.s("訕\u0001") + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f(locale).j(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(net.time4j.base.g gVar) {
        int u4 = gVar.u();
        if (this == AM) {
            if (u4 < 12 || u4 == 24) {
                return true;
            }
        } else if (u4 >= 12 && u4 < 24) {
            return true;
        }
        return false;
    }
}
