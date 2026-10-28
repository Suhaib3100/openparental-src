package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* compiled from: Month.java */
/* loaded from: classes7.dex */
public enum e0 implements net.time4j.engine.o<net.time4j.base.a>, net.time4j.engine.v<l0> {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final e0[] ENUMS = values();

    /* compiled from: Month.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82704a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82705b;

        static {
            int[] iArr = new int[s0.values().length];
            f82705b = iArr;
            try {
                iArr[s0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82705b[s0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82705b[s0.Q3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e0.values().length];
            f82704a = iArr2;
            try {
                iArr2[e0.JANUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82704a[e0.FEBRUARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82704a[e0.MARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82704a[e0.APRIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82704a[e0.MAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82704a[e0.JUNE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82704a[e0.JULY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82704a[e0.AUGUST.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f82704a[e0.SEPTEMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static e0 atEndOfQuarterYear(s0 s0Var) {
        int i4 = a.f82705b[s0Var.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? DECEMBER : SEPTEMBER : JUNE : MARCH;
    }

    public static e0 atStartOfQuarterYear(s0 s0Var) {
        int i4 = a.f82705b[s0Var.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? OCTOBER : JULY : APRIL : JANUARY;
    }

    public static e0 parse(CharSequence charSequence, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        e0 e0Var = (e0) net.time4j.format.b.f(locale).n(xVar, mVar).c(charSequence, parsePosition, e0.class);
        if (e0Var != null) {
            return e0Var;
        }
        throw new ParseException(ProtectedSandApp.s("鋡\u0001") + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getLength(int i4) {
        return net.time4j.base.b.d(i4, getValue());
    }

    public s0 getQuarterOfYear() {
        switch (a.f82704a[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return s0.Q1;
            case 4:
            case 5:
            case 6:
                return s0.Q2;
            case 7:
            case 8:
            case 9:
                return s0.Q3;
            default:
                return s0.Q4;
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public e0 next() {
        return roll(1);
    }

    public e0 previous() {
        return roll(-1);
    }

    public e0 roll(int i4) {
        return valueOf(((((i4 % 12) + 12) + ordinal()) % 12) + 1);
    }

    public static e0 valueOf(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鋢\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.v
    public l0 apply(l0 l0Var) {
        return (l0) l0Var.M(l0.f83330u, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f(locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(net.time4j.base.a aVar) {
        return aVar.q() == getValue();
    }
}
